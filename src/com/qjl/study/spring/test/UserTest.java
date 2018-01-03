package com.qjl.study.spring.test;

import org.junit.Before;
import org.junit.Test;

import com.qjl.study.spring.dao.IUserDao;
import com.qjl.study.spring.entity.User;
import com.qjl.study.spring.factory.BeanFactory;
import com.qjl.study.spring.factory.impl.ClassPathXmlApplicationContext;

/**
 * 类名称: 用户增删改查测试类
 * 类描述: 用于用户增删改查的测试
 * 全限定性类名: com.qjl.study.spring.test.UserTest
 * @author MrQJL
 * @date 2018年1月3日 下午10:19:37
 * @version V1.0
 */
public class UserTest {

	private BeanFactory applicationContext;
	
	@Before
	public void init() throws Exception {
		String configFile = "applicationContext.xml";
		applicationContext = new ClassPathXmlApplicationContext(configFile);
	}
	
	@Test
	public void testAddUser() throws Exception {
		IUserDao userDao = (IUserDao) applicationContext.getBean("userDao");
		
		userDao.addUser(new User());
	}
}