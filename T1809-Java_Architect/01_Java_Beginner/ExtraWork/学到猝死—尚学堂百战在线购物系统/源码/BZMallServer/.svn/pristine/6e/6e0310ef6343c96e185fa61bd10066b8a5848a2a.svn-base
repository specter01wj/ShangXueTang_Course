package com.xdcs.vo;

import java.io.Serializable;

/**
 * 用户实体类
 * 
 * @author Administrator
 * 
 */
public class User implements Serializable{
	// 用户的ID，唯一
	private String ID;
	// 用户的姓名，登录用户名
	private String username;
	// 用户的登录密码
	private String password;
	// 用户的性别
	private String sex;
	// 用户的年龄
	private int age;
	// 用户的身份---(普通用户,商家)
	private String type;
	// 用户的联系方式
	private String tel;
	// 用户的地址
	private String address;
	//用户头像地址
	private String IconUrl;

	public User() {
	}

	public User(String iD, String username, String password, String sex,
			int age, String type, String tel, String address, String IconUrl) {
		super();
		ID = iD;
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.age = age;
		this.type = type;
		this.tel = tel;
		this.address = address;
		this.IconUrl = IconUrl;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public String getIconUrl() {
		return IconUrl;
	}

	public void setIconUrl(String iconUrl) {
		IconUrl = iconUrl;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [ID=" + ID + ", username=" + username + ", password="
				+ password + ", sex=" + sex + ", age=" + age + ", type=" + type
				+ ", tel=" + tel + ", address=" + address + "]";
	}

}
