package com.xdcs.service;

import java.util.List;

import com.xdcs.vo.Goods;
import com.xdcs.vo.Order;

/**
 * 卖家业务处理逻辑接口
 * 
 * @author Administrator
 * 
 */
public interface IMerchantService {
	/**
	 * 接受订单
	 * 
	 * @return
	 */
	public abstract boolean recvOrder(String orderId);

	/**
	 * 派送订单
	 * 
	 * @return
	 */
	public abstract boolean deliveryOrder(String orderID);

	/**
	 * 删除订单
	 * 
	 * @return
	 */
	public abstract boolean deleteOrder(String orderId);

	/**
	 * 添加商品
	 * 
	 * @return
	 */
	public abstract boolean addGoods(Goods goods);

	/**
	 * 删除商品
	 * 
	 * @param goodId
	 * @return
	 */
	public abstract boolean deleteGoods(String goodId);

	/**
	 * 根据名字查看所有的订单
	 * 
	 * @param username
	 * @return
	 */
	public abstract List<Order> findAllOrder(String username);
}
