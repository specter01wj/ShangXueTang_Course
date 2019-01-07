package com.xdcs.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.DocumentException;

import com.xdcs.util.XMLUtil;
import com.xdcs.vo.Goods;

/**
 * 商品的操作类
 * 
 * @author Administrator
 *
 */
public class GoodDao implements IGoodDao {
	/**
	 * 查找所有的商品
	 */
	public List<Goods> findAll() {
		List<Goods> list1 = null;
		try {
			List<Object> list = XMLUtil.findElement(new Goods());
			list1 = new ArrayList<>();

			for (int i = 0; i < list.size(); i++) {
				list1.add((Goods) (list.get(i)));
			}

		} catch (DocumentException e) {
			System.err.println("查找所有的商品发生错误");
		}

		return list1;
	}

	/**
	 * 添加商品到xml
	 */
	public boolean addGoods(Goods goods) {
		try {
			return XMLUtil.addElement(goods);
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return false;
	}

	/**
	 * 从xml删除商品
	 */
	public boolean deleteGoods(Goods goods) {
		try {
			return XMLUtil.delelteElement(goods);
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * 修改商品信息
	 * 
	 * @param goods
	 * @return
	 */
	public boolean modifyGoods(Goods goods) {
		try {
			return XMLUtil.modifyElement(goods);
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	/**
	 * 根据商品的id进行商品查询
	 * @param id
	 * @return
	 */
	public Goods findGoodById(String id) {
		List<Goods> goodList = this.findAll();
		for (Goods goods : goodList) {
			if(id.equals(goods.getID()))
				return goods;
		}
		return null;
	}
}
