package com.xdcs.service;

import java.io.IOException;
import java.util.List;

import org.dom4j.DocumentException;

import com.xdcs.dao.UserDao;
import com.xdcs.util.XMLUtil;
import com.xdcs.vo.User;

/**
 * 用户逻辑
 * 
 * @author Administrator
 *
 */
public class UserService implements IUserService {

	private User user;

	public UserService() {

	}

	// public UserService(User user) {
	// this.user = user;
	// }

	/**
	 * 判断用户是否存在(根据用户名确定用户是否存在)
	 * 
	 * @return
	 */
	public boolean checkUser(User user) { // 测试成功
		boolean flag = false;
		try {
			List<Object> list = XMLUtil.findElement(user);
			for (Object obj : list) {
				User user2 = (User) obj;
				if (user2.getUsername().equals(user.getUsername()) && user2.getPassword().equals(user.getPassword())) {
					flag = true;
					break;
				}
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		return flag;
	}

	/**
	 * 修改用户密码(pwd代表密码)
	 * 
	 * @return
	 */

	public boolean modifyPwd(User user) {
		new UserDao().modifyUser(user);
		return false;
	}

	/**
	 * 增加用户信息(同时修改xml的信息)
	 * 
	 * @return
	 */
	public boolean addUser(User user) { // 测试成功
		try {
			//System.out.println("开始测试");
			List<Object> list = XMLUtil.findElement(user);
			for (Object object : list) {
				User u = (User) (object);
				//System.out.println("addUser------" + u);
				if (u.getUsername().equals(user.getUsername())) {
					return false;
				}
			}
			XMLUtil.addElement(user);
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}

	/**
	 * 根据用户名和密码查询
	 * 
	 * @param user
	 * @return
	 */
	public User getUserByUP(User user) {
		UserDao ud = new UserDao();
		List<User> list = ud.findAllUser();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getUsername().equals(user.getUsername())
					&& list.get(i).getPassword().equals(user.getPassword())) {
				return list.get(i);
			}
		}
		return null;
	}

	/**
	 * 根据姓名查询
	 * 
	 * @param user
	 * @return
	 */
	public User getUserByName(User user) {
		UserDao ud = new UserDao();
		List<User> list = ud.findAllUser();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getUsername().equals(user.getUsername())) {
				return list.get(i);
			}
		}
		return null;
	}

}
