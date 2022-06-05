package org.aiz.debug.service;

import org.springframework.stereotype.Component;

/**
 * @ClassName IndexServer
 * @Description IndexServer
 * @Author ZhangYao
 * @Date Create in 00:03 2022/5/28
 * @Version 1.0
 */
@Component
public class IndexServer {
	public IndexServer() {
		System.out.println("hello IndexServer");
	}

	public void getIndexService(){
		System.out.println("getIndexService ! ! !");
	}
}
