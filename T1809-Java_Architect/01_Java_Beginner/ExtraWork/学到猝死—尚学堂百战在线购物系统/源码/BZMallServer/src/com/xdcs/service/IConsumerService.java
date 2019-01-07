package com.xdcs.service;

import java.util.List;

import com.xdcs.vo.Goods;
import com.xdcs.vo.Order;

/**
 * 买家业务逻辑接口
 * 
 * @author Administrator
 * 
 */
public interface IConsumerService {
	/**
	 * 增加订单
	 * 
	 * @return
	 */
	public abstract boolean addToOrder(Goods goods);

	/**
	 * 支付订单
	 * 
	 * @return
	 */
	public abstract boolean payOrder(String orderId);

	/**
	 * 模糊查询
	 * 
	 * @return
	 */
	public abstract List<Goods> findGoodsByName(String name);

	/**
	 * 查询所有订单
	 * 
	 * @return
	 */
	public abstract List<Order> findAllOrder(String username);

}
