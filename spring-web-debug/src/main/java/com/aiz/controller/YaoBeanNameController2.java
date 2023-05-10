package com.aiz.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ZhangYao
 * @version 1.0
 * @className YaoBeanNameController2
 * @description YaoBeanNameController2
 * @date Create in 23:10 2023/5/10
 */
@Component("/test2")
public class YaoBeanNameController2 implements HttpRequestHandler {
	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("test2 zhangyao");
	}
}
