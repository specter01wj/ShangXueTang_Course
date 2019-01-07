package com.xdcs.dao;

import java.util.List;

import com.xdcs.vo.Order;

/**
 * 订单操作接口
 * 
 * @author Administrator
 * 
 */
public interface IOrderDao {
	/**
	 * 查询所有的订单
	 * 
	 * @return
	 */
	public abstract List<Order> findAllOrder();

	/**
	 * 修改订单信息
	 * 
	 * @return
	 */
	public abstract boolean modifyOrder(Order order);

	/**
	 * 增加订单信息
	 * 
	 * @return
	 */
	public abstract boolean addOrder(Order order);

	/**
	 * 根据ID删除订单信息
	 * 
	 * @return
	 */
	public abstract boolean deleteOrderById(String id);
}
