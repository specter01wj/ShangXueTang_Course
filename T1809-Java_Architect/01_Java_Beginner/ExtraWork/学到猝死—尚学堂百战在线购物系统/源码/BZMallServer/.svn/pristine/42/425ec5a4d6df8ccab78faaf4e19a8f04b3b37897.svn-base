package com.xdcs.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import com.xdcs.vo.Goods;
import com.xdcs.vo.Order;
import com.xdcs.vo.Order.GoodsItem;
import com.xdcs.vo.User;

public class XMLUtil {

	/**
	 * 增加XMl元素
	 * 
	 */
	public static boolean addElement(Object obj) throws DocumentException,

			IOException {
		// 如果是商品类
		if (obj instanceof Goods) {
			Goods goods = (Goods) obj;
			Document doc = getDocument("goods.xml");
			Element root = doc.getRootElement();
			// 增加节点并赋值
			Element good = root.addElement("good");
			good.addAttribute("ID", goods.getID());

			Element goodName = good.addElement("goodName");
			goodName.setText(goods.getGoodName());

			Element goodPrice = good.addElement("goodPrice");
			goodPrice.setText(Double.toString(goods.getGoodPrice()));

			Element goodType = good.addElement("goodType");
			goodType.setText(goods.getGoodType());

			Element goodDesception = good.addElement("goodDesception");
			goodDesception.setText(goods.getGoodDesception());

			Element goodRepertory = good.addElement("goodRepertory");
			goodRepertory.setText(Integer.toString(goods.getGoodRepertory

			()));

			Element merchantID = good.addElement("merchantID");
			merchantID.setText(goods.getMerchantID());

			Element goodBrand = good.addElement("goodBrand");
			goodBrand.setText(goods.getGoodBrand());

			Element goodSellCount = good.addElement("goodSellCount");
			goodSellCount.setText(Integer.toString(goods.getGoodSellCount

			()));

			Element url = good.addElement("url");
			url.setText(goods.getUrl());
			// 重新写入XML
			FileOutputStream file = new FileOutputStream("xml\\goods.xml");
			OutputFormat format = OutputFormat.createPrettyPrint();
			XMLWriter writer = new XMLWriter(file, format);
			writer.write(doc);

			//System.out.println("商品添加成功");
		}
		// 如果是订单类
		else if (obj instanceof Order) {
			Order orders = (Order) obj;
			Document doc = getDocument("order.xml");
			Element root = doc.getRootElement();

			Element order = root.addElement("order");
			order.addAttribute("ID", orders.getID());
			Element goodsMsg = order.addElement("goodsMsg");
			// 获取订单中的商品列表
			List<GoodsItem> goodList = orders.getGoodsList();
			// 添加商品信息到XML中的goodMsg
			for (GoodsItem goodsItem : goodList) {
				Element good = goodsMsg.addElement("good");
				good.addAttribute("goodID", goodsItem.getGoodID());
				Element count = good.addElement("count");
				count.setText(Integer.toString(goodsItem.getCount()));
			}

			Element orderTime = order.addElement("orderTime");
			orderTime.setText(orders.getOrderTime());

			Element consumerID = order.addElement("consumerID");
			consumerID.setText(orders.getConsumerID());

			Element merchantID = order.addElement("merchantID");
			merchantID.setText(orders.getMerchantID());

			Element recvOrder = order.addElement("recvOrder");
			recvOrder.setText(Boolean.toString(orders.isRecvOrder()));

			Element checkPay = order.addElement("checkPay");
			checkPay.setText(Boolean.toString(orders.isCheckPay()));

			Element payTime = order.addElement("payTime");
			payTime.setText(orders.getPayTime());

			Element deliver = order.addElement("deliver");
			deliver.setText(Boolean.toString(orders.isDeliver()));
			// 写出xml
			FileOutputStream file = new FileOutputStream("xml\\order.xml");
			OutputFormat format = OutputFormat.createPrettyPrint();
			XMLWriter writer = new XMLWriter(file, format);
			writer.write(doc);

			//System.out.println("订单添加成功");
		} // 如果是用户类
		else if (obj instanceof User) {
			User users = (User) obj;
			Document doc = getDocument("user.xml");
			Element root = doc.getRootElement();
			// 属性赋值
			Element user = root.addElement("user");
			user.addAttribute("ID", users.getID());

			Element username = user.addElement("username");
			username.setText(users.getUsername());

			Element password = user.addElement("password");
			password.setText(users.getPassword());

			Element sex = user.addElement("sex");
			sex.setText(users.getSex());

			Element age = user.addElement("age");
			age.setText(Integer.toString(users.getAge()));

			Element type = user.addElement("type");
			type.setText(users.getType());

			Element tel = user.addElement("tel");
			tel.setText(users.getTel());

			Element address = user.addElement("address");
			address.setText(users.getAddress());

			Element IconUrl = user.addElement("IconUrl");
			IconUrl.setText(users.getIconUrl());
			// 写入xml
			FileOutputStream file = new FileOutputStream("xml\\user.xml");
			OutputFormat format = OutputFormat.createPrettyPrint();
			XMLWriter writer = new XMLWriter(file, format);
			writer.write(doc);

			//System.out.println("用户添加成功");
		}
		return true;
	}

	/**
	 * 修改XML元素属性
	 * 
	 * @return
	 * @throws DocumentException
	 * @throws IOException
	 */
	public static boolean modifyElement(Object obj) throws DocumentException, IOException {
		if (obj instanceof User) {
			return modifyUser((User) obj);
		}
		if (obj instanceof Goods) {
			return modifyGoods((Goods) obj);
		}
		if (obj instanceof Order) {
			return modifyOrder((Order) obj);
		}

		return false;
	}

	/**
	 * 删除XML元素
	 * 
	 * @return
	 * @throws DocumentException
	 * @throws IOException
	 */
	public static boolean delelteElement(Object obj) throws DocumentException, IOException {
		if (obj instanceof User) {
			return deleteUser((User) obj);
		}
		if (obj instanceof Goods) {
			return deleteGoods((Goods) obj);
		}
		if (obj instanceof Order) {
			return deleteOrder((Order) obj);
		}

		return false;
	}

	/**
	 * 查找XML指定的所有元素信息
	 * 
	 * @return
	 * @throws DocumentException
	 */
	public static List<Object> findElement(Object obj) throws DocumentException {
		if (obj instanceof User) {
			return getUserList();
		}
		if (obj instanceof Goods) {
			return getGoodsList();
		}
		if (obj instanceof Order) {
			return getOrderList();
		}
		return null;
	}

	/**
	 * 获取Document对象
	 * 
	 * @param xml
	 * @return
	 * @throws DocumentException
	 */
	private static Document getDocument(String xml) throws DocumentException {
		SAXReader reader = new SAXReader();
		Document document = reader.read(new File("xml\\" + xml));
		return document;
	}

	/**
	 * 获得根节点的集合
	 */
	private static List<Element> getRootElements(String xml) throws DocumentException {
		SAXReader reader = new SAXReader();
		Document document = reader.read(new File("xml\\" + xml));
		Element rootElement = document.getRootElement();
		List<Element> list = rootElement.elements();
		return list;
	}

	/**
	 * 解析用户xml获取用户信息存放到list中
	 * 
	 * @return
	 * @throws DocumentException
	 */
	private static List<Object> getUserList() throws DocumentException {

		List<Element> list = getRootElements("user.xml");
		List<Object> userList = new ArrayList<>();
		for (Element element : list) {
			String ID = element.attributeValue("ID");
			String username = element.elementText("username");
			String password = element.elementText("password");
			String sex = element.elementText("sex");
			String age = element.elementText("age");
			String type = element.elementText("type");
			String tel = element.elementText("tel");
			String address = element.elementText("address");
			String IconUrl = element.elementText("IconUrl");
			User u = new User(ID, username, password, sex, Integer.parseInt(age), type, tel, address, IconUrl);
			userList.add(u);
		}
		return userList;
	}

	/**
	 * 
	 * @return
	 * @throws DocumentException
	 */
	private static List<Object> getGoodsList() throws DocumentException {
		List<Object> goodList = new ArrayList<>();
		List<Element> list = getRootElements("goods.xml");
		for (Element ele : list) {
			String idValue = ele.attributeValue("ID");
			String goodName = ele.elementText("goodName");
			String goodPrice = ele.elementText("goodPrice");
			String goodType = ele.elementText("goodType");
			String goodDesception = ele.elementText("goodDesception");
			String goodRepertory = ele.elementText("goodRepertory");
			String goodBrand = ele.elementText("goodBrand");
			String merchantID = ele.elementText("merchantID");
			String goodSellCount = ele.elementText("goodSellCount");
			String url = ele.elementText("url");
			Goods g = new Goods(idValue, goodName, Double.parseDouble(goodPrice), goodType, goodDesception,
					Integer.parseInt(goodRepertory), merchantID, goodBrand, Integer.parseInt(goodSellCount), url);
			goodList.add(g);
		}

		return goodList;
	}

	/**
	 * 获取订单信息列表
	 * 
	 * @return
	 * @throws DocumentException
	 */
	private static List<Object> getOrderList() throws DocumentException {
		List<Object> listObj = new ArrayList<>();
		List<Element> list = getRootElements("order.xml");
		for (int i = 0; i < list.size(); i++) {
			Element element = list.get(i);
			String ID = element.attributeValue("ID"); // 订单标号
			String orderTime = element.elementText("orderTime");
			String consumerID = element.elementText("consumerID");
			String merchantID = element.elementText("merchantID");
			String recvOrder = element.elementText("recvOrder");
			String checkPay = element.elementText("checkPay");
			String payTime = element.elementText("payTime");
			String deliver = element.elementText("deliver");

			Element ele = element.element("goodsMsg");
			List<Element> list2 = ele.elements();
			Order o = new Order();
			List<GoodsItem> li = new ArrayList<>();
			for (Element e : list2) {
				String goodID = e.attributeValue("goodID");
				String count = e.elementText("count");
				GoodsItem gi = o.new GoodsItem();
				gi.setGoodID(goodID);
				gi.setCount(Integer.parseInt(count));
				li.add(gi);
			}
			o.setCheckPay(Boolean.parseBoolean(checkPay));
			o.setConsumerID(consumerID);
			o.setDeliver(Boolean.parseBoolean(deliver));
			o.setGoodsList(li);
			o.setID(ID);
			o.setMerchantID(merchantID);
			o.setOrderTime(orderTime);
			o.setPayTime(payTime);
			o.setRecvOrder(Boolean.parseBoolean(recvOrder));
			listObj.add(o);
		}
		return listObj;
	}

	/**
	 * 删除指定的user信息
	 * 
	 * @param obj
	 * @return
	 */
	private static boolean deleteUser(User user) {
		return false;
	}

	/**
	 * 删除指定的Goods信息
	 * 
	 * @param obj
	 * @return
	 * @throws DocumentException
	 * @throws IOException
	 */
	private static boolean deleteGoods(Goods good) throws DocumentException, IOException {
		Document doc = getDocument("goods.xml");
		Element root = doc.getRootElement();
		boolean flag = root.remove(root.elementByID(good.getID()));
		FileOutputStream fis = new FileOutputStream("xml\\goods.xml");
		OutputFormat format = OutputFormat.createPrettyPrint();
		XMLWriter writer = new XMLWriter(fis, format);
		writer.write(doc);
		return flag;
	}

	/**
	 * 删除订单信息
	 * 
	 * @param obj
	 * @return
	 * @throws DocumentException
	 * @throws IOException
	 */
	private static boolean deleteOrder(Order order) throws DocumentException, IOException {
		Document doc = getDocument("order.xml");
		Element root = doc.getRootElement();
		boolean flag = root.remove(root.elementByID(order.getID()));
		FileOutputStream fis = new FileOutputStream("xml\\order.xml");
		OutputFormat format = OutputFormat.createPrettyPrint();
		XMLWriter writer = new XMLWriter(fis, format);
		writer.write(doc);
		return flag;
	}

	/**
	 * 修改用户信息
	 * 
	 * @param obj
	 * @return
	 * @throws DocumentException
	 * @throws IOException
	 */
	private static boolean modifyUser(User obj) throws DocumentException, IOException {
		Document doc = getDocument("user.xml");

		Element root = doc.getRootElement();

		Element user = root.elementByID(obj.getID());

		// Element username = user.element("username");
		// username.setText(obj.getUsername());

		Element password = user.element("password");
		password.setText(obj.getPassword());

		Element sex = user.element("sex");
		sex.setText(obj.getSex());

		Element age = user.element("age");

		age.setText(Integer.toString(obj.getAge()));

		Element type = user.element("type");
		type.setText(obj.getType());

		Element tel = user.element("tel");
		tel.setText(obj.getTel());

		Element address = user.element("address");
		address.setText(obj.getAddress());

		FileOutputStream fis = new FileOutputStream("xml\\user.xml");
		OutputFormat format = OutputFormat.createPrettyPrint();
		XMLWriter writer = new XMLWriter(fis, format);
		writer.write(doc);
		return true;
	}

	/**
	 * 修改订单信息
	 * 
	 * @param obj
	 * @return
	 * @throws DocumentException
	 * @throws IOException
	 */
	private static boolean modifyOrder(Order obj) throws DocumentException, IOException {
		Document doc = getDocument("order.xml");
		// //System.out.println("1111111");
		Element root = doc.getRootElement();
		// //System.out.println("22222");
		Element order = root.elementByID(obj.getID());
		// //System.out.println(order.attributeValue("ID"));

		Element goodsMsg = order.element("goodsMsg");
		List<GoodsItem> goodList = obj.getGoodsList();

		List<GoodsItem> gList = goodsMsg.elements("good");
		for (int i = 0; i < gList.size(); i++) {
			goodsMsg.remove(goodsMsg.element("good"));
		}

		// 添加商品信息到XML中的goodMsg
		for (GoodsItem goodsItem : goodList) {
			Element good = goodsMsg.addElement("good");
			good.addAttribute("goodID", goodsItem.getGoodID());
			Element count = good.addElement("count");
			count.setText(Integer.toString(goodsItem.getCount()));
		}

		Element orderTime = order.element("orderTime");
		orderTime.setText(obj.getOrderTime());

		Element consumerID = order.element("consumerID");
		consumerID.setText(obj.getConsumerID());

		Element merchantID = order.element("merchantID");
		merchantID.setText(obj.getMerchantID());

		Element recvOrder = order.element("recvOrder");
		recvOrder.setText(Boolean.toString(obj.isRecvOrder()));

		Element checkPay = order.element("checkPay");
		checkPay.setText(Boolean.toString(obj.isCheckPay()));

		Element payTime = order.element("payTime");
		payTime.setText(obj.getPayTime());

		Element deliver = order.element("deliver");
		deliver.setText(Boolean.toString(obj.isDeliver()));

		FileOutputStream fis = new FileOutputStream("xml\\order.xml");
		OutputFormat format = OutputFormat.createPrettyPrint();
		XMLWriter writer = new XMLWriter(fis, format);
		writer.write(doc);
		return true;
	}

	/**
	 * 修改商品信息
	 * 
	 * @param obj
	 * @return
	 * @throws IOException
	 * @throws DocumentException
	 */
	private static boolean modifyGoods(Goods obj) throws IOException, DocumentException {

		Document doc = getDocument("goods.xml");

		Element root = doc.getRootElement();

		Element goods = root.elementByID(obj.getID());

		Element goodName = goods.element("goodName");
		goodName.setText(obj.getGoodName());

		Element goodPrice = goods.element("goodPrice");
		goodPrice.setText(Double.toString(obj.getGoodPrice()));

		Element goodType = goods.element("goodType");
		goodType.setText(obj.getGoodType());

		Element goodDesception = goods.element("goodDesception");
		goodDesception.setText(obj.getGoodDesception());

		Element goodRepertory = goods.element("goodRepertory");
		goodRepertory.setText(Integer.toString(obj.getGoodRepertory()));

		Element goodBrand = goods.element("goodBrand");
		goodName.setText(obj.getGoodBrand());

		Element goodSellCount = goods.element("goodSellCount");
		goodSellCount.setText(Integer.toString(obj.getGoodSellCount()));

		FileOutputStream fis = new FileOutputStream("xml\\goods.xml");
		OutputFormat format = OutputFormat.createPrettyPrint();
		XMLWriter writer = new XMLWriter(fis, format);
		writer.write(doc);
		return true;
	}
}
