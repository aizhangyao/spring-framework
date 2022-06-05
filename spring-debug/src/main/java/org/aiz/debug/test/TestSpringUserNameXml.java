package org.aiz.debug.test;

import org.aiz.debug.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName TestSpringUserNameXML
 * @Description ClassPathXmlApplicationContext 测试类 spring-${username}.xml
 * @Author ZhangYao
 * @Date Create in 18:28 2022/5/28
 * @Version 1.0
 */
public class TestSpringUserNameXml {
	public static void main(String[] args) {
		// spring-zhangyao.xml
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-${user}.xml");
		Person bean = ac.getBean(Person.class);
		System.out.println(bean);
	}
}
