package com.qjl.study.spring.sereice.impl;

import java.util.List;

import com.qjl.study.spring.dao.IUserDao;
import com.qjl.study.spring.entity.User;
import com.qjl.study.spring.sereice.IUserService;

/**
 * 类名称: 用户服务层接口的实现类
 * 类描述: 对用户进行相关操作的服务层接口的实现类
 * 全限定性类名: com.qjl.study.spring.sereice.impl.UserService
 * @author MrQJL
 * @date 2018年1月1日 上午11:40:08
 * @version V1.0
 */
public class UserService implements IUserService {

	private IUserDao userDao;
	
	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public List<User> queryAllUser() {
		List<User> userList = userDao.queryAllUser();
		
		return userList;
	}

	@Override
	public int addUser(User user) {
		int rows = userDao.addUser(user);
		
		return rows;
	}

	@Override
	public int delUser(User user) {
		int rows = userDao.delUser(user);
		
		return rows;
	}

	@Override
	public int updateUser(User user) {
		int rows = userDao.updateUser(user);
		
		return rows;
	}

}
