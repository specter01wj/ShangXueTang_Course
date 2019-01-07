package com.xdcs.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.xdcs.dao.GoodDao;
import com.xdcs.dao.OrderDao;
import com.xdcs.vo.Goods;
import com.xdcs.vo.Order;
import com.xdcs.vo.Order.GoodsItem;
import com.xdcs.vo.User;

/**
 * 买家业务逻辑
 * 
 * @author Administrator
 *
 */
public class ConsumerService implements IConsumerService {
	private List<Goods> goodList;
	private List<Order> orderList;
	private Order order;

	public ConsumerService() {
		GoodDao g = new GoodDao();
		goodList = g.findAll();
		OrderDao od = new OrderDao();
		orderList = od.findAllOrder();
	}

	/**
	 * 添加到订单
	 */
	public boolean addToOrder(Goods goods, int count, User user) {
		OrderDao od = new OrderDao();
		Date date = new Date();
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		if (order == null) {
			order = new Order("xdcs" + date.getTime(), new ArrayList<GoodsItem>(), sdf.format(date), user.getID(),
					goods.getMerchantID(), false, false, "未支付", false);
			order.getGoodsList().add(order.new GoodsItem(goods.getID(), count));
			//System.out.println(order);
			//System.out.println(goods);
			od.addOrder(order);
		} else {
			boolean flag = false;
			List<GoodsItem> gList = order.getGoodsList();
			int i = 0;
			for (i = 0; i < gList.size(); i++) {
				if (gList.get(i).getGoodID().equals(goods.getID())) {
					flag = true;
					break;
				}
			}
			if (flag) {
				gList.get(i).setCount(gList.get(i).getCount() + count);
			} else {
				order.getGoodsList().add(order.new GoodsItem(goods.getID(), count));
			}
			od.modifyOrder(order);
		}
		return true;
	}

	/**
	 * 支付订单
	 */
	public boolean payOrder(String orderId) {
		OrderDao od = new OrderDao();
		orderList = od.findAllOrder();
		Order o;
		for (int i = 0; i < orderList.size(); i++) {
			if (orderList.get(i).getID().equals(orderId)) {
				o = orderList.get(i);
				//System.out.println(o);
				o.setCheckPay(true);
				//System.out.println(o);
				//System.out.println("kaishi ");
				return od.modifyOrder(o);
			}
		}

		return false;
	}

	/**
	 * 模糊查询商品
	 */
	public List<Goods> findGoodsByName(String name) {
		List<Goods> list = new ArrayList<>();
		for (int i = 0; i < goodList.size(); i++) {
			if (goodList.get(i).getGoodName().contains(name)) {
				list.add(goodList.get(i));
			}
		}
		//System.out.println(list);
		return list;
	}

	/**
	 * 查找用户的所有的订单
	 */
	public List<Order> findAllOrder(String userId) {
		OrderDao od = new OrderDao();
		orderList = od.findAllOrder();
		List<Order> list = new ArrayList<>();
		for (int i = 0; i < orderList.size(); i++) {
			if (orderList.get(i).getConsumerID().equals(userId)) {
				list.add(orderList.get(i));

			}
		}
		// //System.out.println(list);
		return list;
	}

	/**
	 * 修改商品信息
	 * 
	 * @param goods
	 * @return
	 */
	public boolean modifyGoods(Goods goods) {

		return new GoodDao().modifyGoods(goods);

	}

	@Override
	public boolean addToOrder(Goods goods) {
		return false;
	}

}
