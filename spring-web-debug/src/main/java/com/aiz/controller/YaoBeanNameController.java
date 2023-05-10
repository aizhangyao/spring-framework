package com.aiz.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ZhangYao
 * @version 1.0
 * @className YaoBeanNameController
 * @description YaoBeanNameController
 * @date Create in 23:01 2023/5/10
 */
@Component("/test")
public class YaoBeanNameController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("test zhangyao");
		return null;
	}
}