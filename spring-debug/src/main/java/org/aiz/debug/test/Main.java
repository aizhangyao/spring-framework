package org.aiz.debug.test;

import org.aiz.debug.app.AppConfig;
import org.aiz.debug.service.IndexServer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName Main
 * @Description AnnotationConfigApplicationContext测试类
 * @Author ZhangYao
 * @Date Create in 00:05 2022/5/28
 * @Version 1.0
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		ac.getBean(IndexServer.class).getIndexService();
	}
}
