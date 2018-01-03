package com.qjl.study.spring.sereice;

import java.util.List;

import com.qjl.study.spring.entity.User;

/**
 * 类名称: 用户服务层接口
 * 类描述: 对用户进行相关操作的服务层接口
 * 全限定性类名: com.qjl.study.spring.sereice.IUserService
 * @author MrQJL
 * @date 2018年1月1日 上午11:37:07
 * @version V1.0
 */
public interface IUserService {
	
	/**
	 * 查询所有的用户并返回用户集合
	 * @param null
	 * @return 用户集合
	 */
	List<User> queryAllUser();
	
	/**
	 * 增加用户并返回受影响的行数
	 * @param 要添加的用户对象
	 * @return 添加用户后受影响的行数
	 */
	int addUser(User user);
	
	/**
	 * 根据用户的相关信(id,name,...)息删除用户并返回受影响的行数
	 * @param 要删除的用户对象
	 * @return 删除用户后受影响的行数
	 */
	int delUser(User user);
	
	/**
	 * 根据用户的有关信息(id,name,...)修改用户对象并返回受影响的行数
	 * @param 要修改的用户对象
	 * @return 修改用户后受影响的行数
	 */
	int updateUser(User user);
	
}
