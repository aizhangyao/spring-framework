package org.aiz.debug.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName MyClassPathXmlApplicationContext
 * @Description TODO
 * @Author ZhangYao
 * @Date Create in 16:20 2022/5/29
 * @Version 1.0
 */
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

	public MyClassPathXmlApplicationContext(String... configResources) {
		super(configResources);
	}

	@Override
	protected void initPropertySources() {
		System.out.println("扩展initPropertySources");
		getEnvironment().setRequiredProperties("user");
	}

	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		// super.setAllowBeanDefinitionOverriding(false);
		super.setAllowCircularReferences(false);
		super.customizeBeanFactory(beanFactory);
	}

}
