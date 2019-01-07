package com.xdcs.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import com.xdcs.dao.GoodDao;
import com.xdcs.dao.UserDao;
import com.xdcs.vo.Goods;
import com.xdcs.vo.Order;
import com.xdcs.vo.Order.GoodsItem;
import com.xdcs.vo.User;

/**
 * 协议类
 * 
 * @author ZYxiao
 *
 */
public class Protocol implements Runnable {
	private Socket socket;
	private ConsumerService consumerService = new ConsumerService();
	private MerchantService merchantService = new MerchantService();
	private UserService userservice = new UserService();
	private BufferedReader br;
	private PrintWriter pw;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	private Map<String, Socket> socketMap;
	private User user;

	public Protocol(Socket socket, Map<String, Socket> socketMap) {
		// System.out.println("构造1");
		this.socket = socket;

		this.socketMap = socketMap;
		// System.out.println("构造2");
		try {
			// br = new BufferedReader(new
			// InputStreamReader(socket.getInputStream()));
			// pw = new PrintWriter(socket.getOutputStream());
			// System.out.println("构造3");
			ois = new ObjectInputStream(socket.getInputStream());
			// System.out.println("构造4");
			oos = new ObjectOutputStream(socket.getOutputStream());
			// System.out.println("构造5");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 商家买家业务逻辑判断
	 * 
	 * @throws IOException
	 */
	public void chooseConsumerOperation() throws IOException {

		// System.out.println("pw-这是协议类的操作第一句");
		List<Object> list = null;
		String str = "";
		try {
			// System.out.println("----readObj---");
			list = (List<Object>) ois.readObject();
			// System.out.println("--end--readObj---");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		str = (String) list.get(0);
		// 获取头像
		if ("getIcon".equals(str)) {
			User user = (User) list.get(1);
			User target = userservice.getUserByName(user);

			list.clear();
			if (target == null) {
				list.add("false");
			} else {
				list.add("true");
				list.add(target.getIconUrl());
			}
			oos.writeObject(list);
			oos.flush();
		}
		// 修改密码
		if ("modifyPwd".equals(str)) {
			User user = (User) list.get(1);
			// System.out.println("这里是服务器的user修改密码的输出语句看好了-密码-" +
			// user.getPassword());
			userservice.modifyPwd(user);
			list.clear();
			list.add(true);
			oos.writeObject(list);
			oos.flush();
		}
		// 注册
		if ("regist".equals(str)) {
			// System.out.println("这是添加");
			User user = (User) list.get(1);
			Date date = new Date();
			user.setID("user" + date.getTime());
			// System.out.println(user);
			boolean bool = userservice.addUser(user);

			list = new ArrayList<>();
			list.add(bool);
			oos.writeObject(list);
			oos.flush();
		}
		// 登录
		if ("login".equals(str)) {
			// System.out.println("可以转述句了");
			user = new User();
			User u = (User) list.get(1);
			user.setUsername(u.getUsername());
			user.setPassword(u.getPassword());
			// System.out.println("user----" + user);
			boolean bool = userservice.checkUser(user);
			list = new ArrayList<>();

			// System.out.println("userttttttt" +
			// userservice.getUserByUP(user));

			Set<String> key = socketMap.keySet();
			if (key.contains(user.getUsername())) {
				bool = false;
			}

			list.add(bool);
			list.add(userservice.getUserByUP(user));
			list.add(new GoodDao().findAll());
			if (bool) {
				socketMap.put(user.getUsername(), socket);
			}
			key = socketMap.keySet();
			for (String string : key) {
				// System.out.println("===============" + string);
			}
			oos.writeObject(list);
			oos.flush();
		}
		// 添加到购物车
		if ("addToOrder".equals(str)) {
			// System.out.println("这是添加购物车");
			int count = (int) list.get(1);
			Goods good = (Goods) list.get(2);
			User user = (User) list.get(3);
			consumerService.addToOrder(good, count, user);
		}
		// 模糊查询
		if ("findGoodsByName".equals(str)) {
			// System.out.println("这是模糊查询");
			String name = (String) list.get(1);
			List<Goods> goodsList = consumerService.findGoodsByName(name);
			oos.writeObject(goodsList);
			oos.flush();
		}
		// 查看所有订单
		if ("findAllOrder".equals(str)) {
			String userId = (String) list.get(1);
			// System.out.println("step000-----");
			List<Order> orderList = consumerService.findAllOrder(userId);
			// System.out.println("step1-----");
			oos.writeObject(orderList);
			oos.flush();
			// System.out.println("step2-----");
		}
		// 购买商品
		if ("buyGoods".equals(str)) {
			Object obj = list.get(1);
			List<Order> orders = (List<Order>) obj;
			List<GoodsItem> goodList = new ArrayList<>();
			List<Goods> newList = new ArrayList<>();
			GoodDao gd = new GoodDao();
			for (int i = 0; i < orders.size(); i++) {
				consumerService.payOrder(orders.get(i).getID());
				goodList = orders.get(i).getGoodsList();
				for (GoodsItem goodsItem : goodList) {
					Goods good = gd.findGoodById(goodsItem.getGoodID());
					good.setGoodSellCount(good.getGoodSellCount() + goodsItem.getCount());
					consumerService.modifyGoods(good);
				}
			}
			// List<Goods> gs = (List<Goods>) list.get(1);
			// for (int i = 0; i < gs.size(); i++) {
			// consumerService.modifyGoods(gs.get(i));
			// }
			list.clear();
			list.add(true);
			newList = gd.findAll();
			list.add(newList);
			oos.writeObject(list);
			oos.flush();
		}
		// 接单
		if ("recvOrder".equals(str)) {
			Order o = (Order) list.get(1);
			boolean bool = merchantService.recvOrder(o.getID());
			list.clear();
			list.add(bool);
			oos.writeObject(list);
		}
		// 派送订单
		if ("deliveryOrder".equals(str)) {
			Order o = (Order) list.get(1);
			boolean bool = merchantService.deliveryOrder(o.getID());
			list.clear();
			list.add(bool);
			oos.writeObject(list);
		}
		// 删除订单
		if ("deleteOrder".equals(str)) {
			Order o = (Order) list.get(1);
			// System.out.println("deleteOrderdeleteOrder=====" + o);
			boolean bool = merchantService.deleteOrder(o.getID());
			list.clear();
			list.add(bool);
			oos.writeObject(list);
		}
		// 根据用户id查找订单
		if ("findAllOrderByID".equals(str)) {
			User u = (User) list.get(1);
			List<Order> list1 = new ArrayList<>();
			list1 = merchantService.findAllOrder(u.getID());
			// System.out.println(list1);
			oos.writeObject(list1);
			oos.flush();
		}
		// 增加商品
		if ("addGoods".equals(str)) {
			Goods goods = (Goods) list.get(1);
			boolean bool = merchantService.addGoods(goods);
			list.clear();
			list.add(bool);
			oos.writeObject(list);
			oos.flush();
		}
		// 删除商品
		if ("deleteGoods".equals(str)) {
			String goodId = ((Goods) list.get(1)).getID();
			boolean bool = merchantService.deleteGoods(goodId);
			list.clear();
			list.add(bool);
			oos.writeObject(list);
			oos.flush();
		}
		// 修改商品
		if ("modifyGoods".equals(str)) {
			Goods goods = ((Goods) list.get(1));
			boolean bool = merchantService.modifyGoods(goods);
			list.clear();
			list.add(bool);
			oos.writeObject(list);
			oos.flush();
		}
		// 查看所有用户
		if ("findAllUser".equals(str)) {
			List<User> uu = new ArrayList<>();
			uu = new UserDao().findAllUser();
			oos.writeObject(uu);
			oos.flush();
		}
		// 关闭socket
		if ("closeSocket".equals(str)) {
			// System.out.println("----"+user.getUsername());
			socketMap.remove(user.getUsername());
			oos.close();
			ois.close();
			socket.close();
			return;
		}
	}

	public void run() {
		while (true) {
			if (socket == null && socket.isClosed()) {
				// System.out.println("-----"+user.getUsername());
				return;
			}
			try {
				socket.sendUrgentData(0);
			} catch (IOException e) {
				// socketMap.remove(user.getUsername());
				return; // 如果抛出了异常，那么就是断开连接了 跳出无限循环
			}
			try {
				chooseConsumerOperation();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
