package com.xdcs.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.DocumentException;

import com.xdcs.util.XMLUtil;
import com.xdcs.vo.Order;

public class OrderDao implements IOrderDao {
	/**
	 * 查询所有的订单
	 */
	public List<Order> findAllOrder() {
		List<Order> list = new ArrayList<>();
		try {
			List<Object> li = XMLUtil.findElement(new Order());
			for (int i = 0; i < li.size(); i++) {
				list.add(((Order)li.get(i)));
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		//System.out.println("-------shuchuORDER");
		//System.out.println(list);
		return list;
	}

	/**
	 * 修改订单信息（修改派送，是否支付，是否接单）
	 */
	public boolean modifyOrder(Order order) {
		try {
			//System.out.println("dao---");
			return XMLUtil.modifyElement(order);
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * 添加到订单
	 */
	public boolean addOrder(Order order) {
		try {
			return XMLUtil.addElement(order);
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * 删除订单信息
	 */
	public boolean deleteOrderById(String id) {
		Order o = new Order();
		o.setID(id);
		try {
			return XMLUtil.delelteElement(o);
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

}
