package com.xdcs.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * 订单实体类
 * 
 * @author Administrator
 * 
 */
public class Order implements Serializable{
	// 订单编号
	private String ID;
	private List<GoodsItem> goodsList;
	// 产生订单时间
	private String orderTime;
	// 买家的id
	private String consumerID;
	// 商家的id
	private String merchantID;
	// 检查是否 接受订单
	private boolean recvOrder;
	// 检查是否 买家支付
	private boolean checkPay;
	// 买家支付订单时间
	private String payTime;
	// 买家是否将货物派送出去
	private boolean deliver;

	public Order(String iD, List<GoodsItem> goodsList, String orderTime, String consumerID, String merchantID,
			boolean recvOrder, boolean checkPay, String payTime, boolean deliver) {
		super();
		ID = iD;
		this.goodsList = goodsList;
		this.orderTime = orderTime;
		this.consumerID = consumerID;
		this.merchantID = merchantID;
		this.recvOrder = recvOrder;
		this.checkPay = checkPay;
		this.payTime = payTime;
		this.deliver = deliver;
	}

	/**
	 * 订单商品信息
	 *
	 */
	public class GoodsItem implements Serializable{
		// 商品名称
		private String goodID;
		// 商品数量
		private int count;

		public GoodsItem() {
		}
		
		public GoodsItem(String goodID, int count) {
			super();
			this.goodID = goodID;
			this.count = count;
		}

		public String getGoodID() {
			return goodID;
		}

		public void setGoodID(String goodID) {
			this.goodID = goodID;
		}

		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		}

		@Override
		public String toString() {
			return "GoodsItem [goodID=" + goodID + ", count=" + count + "]";
		}

	}

	public Order() {
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public String getConsumerID() {
		return consumerID;
	}

	public void setConsumerID(String consumerID) {
		this.consumerID = consumerID;
	}

	public String getMerchantID() {
		return merchantID;
	}

	public void setMerchantID(String merchantID) {
		this.merchantID = merchantID;
	}

	public boolean isRecvOrder() {
		return recvOrder;
	}

	public void setRecvOrder(boolean recvOrder) {
		this.recvOrder = recvOrder;
	}

	public boolean isCheckPay() {
		return checkPay;
	}

	public void setCheckPay(boolean checkPay) {
		this.checkPay = checkPay;
	}

	public String getPayTime() {
		return payTime;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public boolean isDeliver() {
		return deliver;
	}

	public void setDeliver(boolean deliver) {
		this.deliver = deliver;
	}

	public List<GoodsItem> getGoodsList() {
		return goodsList;
	}

	public void setGoodsList(List<GoodsItem> goodsList) {
		this.goodsList = goodsList;
	}

	@Override
	public String toString() {
		return "Order [ID=" + ID + ", goodsList=" + goodsList + ", orderTime=" + orderTime + ", consumerID="
				+ consumerID + ", merchantID=" + merchantID + ", recvOrder=" + recvOrder + ", checkPay=" + checkPay
				+ ", payTime=" + payTime + ", deliver=" + deliver + "]";
	}

}
