package com.qjl.study.spring.dao.impl;

import java.util.List;

import com.qjl.study.spring.dao.IUserDao;
import com.qjl.study.spring.entity.User;

/**
 * 类名称: 用户增删改查的dao接口的实现类
 * 类描述: 用于对用户进行增删改查操作
 * 全限定性类名: com.qjl.study.spring.dao.impl.UserDaoImpl
 * @author MrQJL
 * @date 2018年1月1日 上午11:37:47
 * @version V1.0
 */
public class UserDaoImpl implements IUserDao {

	@Override
	public List<User> queryAllUser() {
		System.out.println("查询到所有用户的信息");
		
		return null;
	}

	@Override
	public int addUser(User user) {
		System.out.println("增加用户成功");
		
		return 0;
	}

	@Override
	public int delUser(User user) {
		System.out.println("删除用户成功");
		
		return 0;
	}

	@Override
	public int updateUser(User user) {
		System.out.println("修改用户成功");
		
		return 0;
	}

}
