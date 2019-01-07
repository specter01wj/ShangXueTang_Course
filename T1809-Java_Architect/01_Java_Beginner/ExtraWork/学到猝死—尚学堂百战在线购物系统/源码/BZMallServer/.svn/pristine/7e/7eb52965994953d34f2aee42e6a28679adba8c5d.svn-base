package com.xdcs.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.DocumentException;
import org.junit.Test;

import com.xdcs.util.XMLUtil;
import com.xdcs.vo.User;

public class UserDao {
	/**
	 * 查询所有的用户信息
	 * 
	 * @return
	 * @throws DocumentException 
	 */
	public List<User> findAllUser(){    //测试成功
		List<Object> list;
		ArrayList<User> list2=new ArrayList<User>();
		try {
			list = XMLUtil.findElement(new User());
			for(Object obj:list){
				User user=(User)obj;
				list2.add(user);
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		
		return list2;	    		
	}

	/**
	 * 修改用户信息
	 * 
	 * @return
	 * @throws IOException 
	 * @throws DocumentException 
	 */
	public boolean modifyUser(User user){
		try {
			return XMLUtil.modifyElement(user);
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}    

		return false;
	}

	/**
	 * 增加用户信息
	 * 
	 * @return
	 * @throws IOException 
	 * @throws DocumentException 
	 */
	public boolean addUser(User user){
		 try {
			return XMLUtil.addElement(user);
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}      
		return false;
	}
}
