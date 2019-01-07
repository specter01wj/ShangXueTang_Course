package com.xdcs.service;

import java.util.ArrayList;
import java.util.List;

import com.xdcs.dao.GoodDao;
import com.xdcs.dao.OrderDao;
import com.xdcs.vo.Goods;
import com.xdcs.vo.Order;

/**
 * 卖家业务逻辑
 * 
 * @author Administrator
 *
 */
public class MerchantService implements IMerchantService {
	// 装信息的集合
	private List<Order> list;
	private List<Goods> glist;

	public MerchantService() {
		list = new OrderDao().findAllOrder();
		glist = new GoodDao().findAll();

	}

	/**
	 * 接收订单
	 */

	@Override
	public boolean recvOrder(String orderId) {
		for (int i = 0; i < list.size(); i++) {
			//System.out.println("这是service类的-订单信息-");
			if (orderId.equals(list.get(i).getID())) {
				list.get(i).setRecvOrder(true);
				OrderDao od = new OrderDao();
				return od.modifyOrder(list.get(i));
			}
		}
		return false;
	}

	/**
	 * 派送订单
	 */
	@Override
	public boolean deliveryOrder(String orderID) {
		for (int i = 0; i < list.size(); i++) {
			if (orderID.equals(list.get(i).getID())) {
				list.get(i).setDeliver(true);
				OrderDao od = new OrderDao();
				return od.modifyOrder(list.get(i));
			}
		}
		return false;
	}

	/**
	 * 删除订单
	 */
	@Override
	public boolean deleteOrder(String orderId) {
		for (int i = 0; i < list.size(); i++) {
			if (orderId.equals(list.get(i).getID())) {
				return new OrderDao().deleteOrderById((list.get(i).getID()));
			}
		}
		return false;
	}

	/**
	 * 添加商品
	 */
	@Override
	public boolean addGoods(Goods goods) {
		boolean flag = false;
		for (int i = 0; i < glist.size(); i++) {
			if (goods.getID().equals(glist.get(i).getID())) {
				flag = true;
			}

		}
		if (!flag) {
			return new GoodDao().addGoods(goods);
		}

		return false;
	}

	/**
	 * 删除商品
	 */
	@Override
	public boolean deleteGoods(String goodId) {
		for (int i = 0; i < glist.size(); i++) {
			if (goodId.equals(glist.get(i).getID())) {
				return new GoodDao().deleteGoods(glist.get(i));
			}
		}
		return false;
	}

	/**
	 * 根据商家名 查找订单
	 */
	@Override
	public List<Order> findAllOrder(String ID) {
		list = new OrderDao().findAllOrder();
		List<Order> newlist = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (ID.equals(list.get(i).getMerchantID())) {
				newlist.add(list.get(i));
			}
		}
		return newlist;
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
}
