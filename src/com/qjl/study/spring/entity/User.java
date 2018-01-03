package com.qjl.study.spring.entity;

import java.io.Serializable;

/**
 * 类名称: 用户实体类
 * 类描述: 用于存储用户的相关信息
 * 全限定性类名: com.qjl.study.spring.entity.User
 * @author MrQJL
 * @date 2018年1月1日 上午11:25:00
 * @version V1.0
 */
public class User implements Serializable {

	private static final long serialVersionUID = 1995835221016018916L;
	
	private String userName;
	private String password;
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + "]";
	}
	
}
