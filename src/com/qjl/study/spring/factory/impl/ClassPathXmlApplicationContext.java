package com.qjl.study.spring.factory.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

import com.qjl.study.spring.factory.BeanFactory;

/**
 * 类名称: 编译路径下的上下文
 * 类描述: 用于获取编译路径下xml文件所对应的bean的IOC容器
 * 全限定性类名: com.qjl.study.spring.factory.impl.ClassPathXmlApplicationContext
 * @author MrQJL
 * @date 2018年1月3日 下午10:04:50
 * @version V1.0
 */
public class ClassPathXmlApplicationContext implements BeanFactory {

	/**
	 * 这就是那个IOC容器
	 */
	private Map<String, Object> beans = new HashMap<String, Object>();
	
	public ClassPathXmlApplicationContext() {
		
	}
	
	public ClassPathXmlApplicationContext(String configLocation) throws Exception {
		// 使用jdom的SAXBuilder读取xml文件
		SAXBuilder sb = new SAXBuilder();
		// 加载xml文档进内存
		Document doc = sb.build(this.getClass().getClassLoader()
			.getResourceAsStream(configLocation));
		
		// 获取根节点--也就是beans
		Element root = doc.getRootElement();
		// 获取根节点的孩子节点--也就是bean
		@SuppressWarnings("unchecked")
		List<Object> childList = root.getChildren("bean");
		// 循环取出每一个bean节点以及他们的id和class属性，利用反射创建一个对象
		for (int i = 0; i < childList.size(); i++) {
			Element child = (Element) childList.get(i);
			// 获取id属性
			String id = child.getAttributeValue("id");
			// 获取class属性
			String clazz = child.getAttributeValue("class");
			// 通过反射加载类，实例化bean对象
			Object obj = Class.forName(clazz).newInstance();
			// 将实例化的对象放入IOC容器(map)中
			beans.put(id, obj);
		}
	}
	
	@Override
	public Object getBean(String name) {
		return beans.get(name);
	}

}
