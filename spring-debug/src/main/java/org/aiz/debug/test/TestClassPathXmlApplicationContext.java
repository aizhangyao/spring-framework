package org.aiz.debug.test;

import org.aiz.debug.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName Test
 * @Description ClassPathXmlApplicationContext 测试类 applicationContext
 * @Author ZhangYao
 * @Date Create in 15:02 2022/5/28
 * @Version 1.0
 */
public class TestClassPathXmlApplicationContext {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person bean = ac.getBean(Person.class);
		System.out.println(bean);
	}
}
