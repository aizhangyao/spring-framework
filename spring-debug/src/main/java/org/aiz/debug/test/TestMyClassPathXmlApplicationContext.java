package org.aiz.debug.test;

import org.aiz.debug.entity.Person;
import org.springframework.context.ApplicationContext;

/**
 * @ClassName TestMyClassPathXmlApplicationContext
 * @Description 测试 MyClassPathXmlApplicationContext
 * @Author ZhangYao
 * @Date Create in 16:25 2022/5/29
 * @Version 1.0
 */
public class TestMyClassPathXmlApplicationContext {
	public static void main(String[] args) {
		ApplicationContext ac = new MyClassPathXmlApplicationContext("applicationContext.xml");
		Person bean = ac.getBean(Person.class);
		System.out.println(bean);
	}

	/**
	 * SAX (Simple API for XML)
	 * DOM4J
	 * dtd (Document Type Definition)
	 * xsd (XML Schema Definition)
	 */
	/**
	 * spring-beans/src/main/resources/META-INF/spring.schemas
	 */
}
