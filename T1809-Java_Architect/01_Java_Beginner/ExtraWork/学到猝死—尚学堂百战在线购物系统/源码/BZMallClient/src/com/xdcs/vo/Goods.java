package com.xdcs.vo;

import java.io.Serializable;

/**
 * 
 * 商品实体类
 * 
 * @author Administrator
 * 
 */

public class Goods implements Serializable {
	// 商品的编号
	private String ID;
	// 商品的名称
	private String goodName;
	// 商品的价格
	private double goodPrice;
	// 商品的类型
	private String goodType;
	// 商品的描述
	private String goodDesception;
	// 商品的库存
	private int goodRepertory;
	// 商品卖家
	private String merchantID;
	// 商品的品牌
	private String goodBrand;
	// 商品的销售量
	private int goodSellCount;
	// 商品的图片地址
	private String url;

	public Goods() {
	}

	/**
	 * 重写构造方法
	 * 
	 * @param ID
	 * @param goodName
	 * @param goodPrice
	 * @param goodType
	 * @param goodDesception
	 * @param goodRepertory
	 * @param merchantID
	 * @param goodBrand
	 * @param goodSellCount
	 * @param url
	 */
	public Goods(String ID, String goodName, double goodPrice, String goodType, String goodDesception,
			int goodRepertory, String merchantID, String goodBrand, int goodSellCount, String url) {
		super();
		this.ID = ID;
		this.goodName = goodName;
		this.goodPrice = goodPrice;
		this.goodType = goodType;
		this.goodDesception = goodDesception;
		this.goodRepertory = goodRepertory;
		this.merchantID = merchantID;
		this.goodBrand = goodBrand;
		this.goodSellCount = goodSellCount;
		this.url = url;
	}

	public String getID() {
		return ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public String getGoodName() {
		return goodName;
	}

	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}

	public double getGoodPrice() {
		return goodPrice;
	}

	public void setGoodPrice(double goodPrice) {
		this.goodPrice = goodPrice;
	}

	public String getGoodType() {
		return goodType;
	}

	public void setGoodType(String goodType) {
		this.goodType = goodType;
	}

	public String getGoodDesception() {
		return goodDesception;
	}

	public void setGoodDesception(String goodDesception) {
		this.goodDesception = goodDesception;
	}

	public int getGoodRepertory() {
		return goodRepertory;
	}

	public void setGoodRepertory(int goodRepertory) {
		this.goodRepertory = goodRepertory;
	}

	public String getMerchantID() {
		return merchantID;
	}

	public void setMerchantID(String merchantID) {
		this.merchantID = merchantID;
	}

	public String getGoodBrand() {
		return goodBrand;
	}

	public void setGoodBrand(String goodBrand) {
		this.goodBrand = goodBrand;
	}

	public int getGoodSellCount() {
		return goodSellCount;
	}

	public void setGoodSellCount(int goodSellCount) {
		this.goodSellCount = goodSellCount;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder("商品名:" + goodName);
		for (int i = goodName.length() * 3; i < 24; i++) {
			str.append(" ");
		}
		str.append("单价：" + goodPrice);
		for (int i = Double.toString(goodPrice).length(); i < 16; i++) {
			str.append(" ");
		}
		str.append("商品类型" + goodType);
		for (int i = goodType.length() * 3; i < 16; i++) {
			str.append(" ");
		}
		str.append("月销：" + goodSellCount);

		return str.toString();
	}

}
