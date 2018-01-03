package com.qjl.study.spring.factory;

/**
 * 类名称: bean工厂
 * 类描述: 实例化各种bean
 * 全限定性类名: com.qjl.study.spring.factory.BeanFactory
 * @author MrQJL
 * @date 2018年1月3日 下午9:46:30
 * @version V1.0
 */
public interface BeanFactory {
	
	/**
	 * 通过bean的id获取实例化的bean对象
	 * 获取bean的时候，该bean可能不存在，所以要抛出异常
	 * @param bean的名称
	 * @return 实例化的bean对象
	 */
	Object getBean(String name) throws Exception;
	
}
