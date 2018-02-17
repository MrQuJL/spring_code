# 简单的分析了一下springbean的加载过程：

### 执行语句：
```java
// 初始化Spring的IOC容器(map集合)
BeanFactory applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
// 获取bean对象
applicationContext.getBean("userDao")
```

### 执行流程：

1. 初始化Spring的IOC容器(map集合)
	> * 读取xml文档进内存(读取xml文件的方式:dom4j, SAX, jdom)
	* 获取每一个bean节点对象
	* 获取class属性(全限定性类名),并通过反射加载类进内存,然后实例化对象
	* 将实例化的对象放入IOC容器中,通过put(key, value)的方式,key是bean标签的id,value是实例化的对象的引用
	
2. 获取bean对象

	> 实质上是将传进来的字符串作为key,到IOC容器(map集合)中获取value(对象)

