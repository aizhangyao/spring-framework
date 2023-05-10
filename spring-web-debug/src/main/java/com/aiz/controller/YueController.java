package com.aiz.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ZhangYao
 * @version 1.0
 * @className YueController
 * @description YueController
 * @date Create in 22:24 2023/5/10
 */
@Component
@RequestMapping
public class YueController {
	// http://localhost:8080/spring-web-debug/app/ue
	@GetMapping("/ue")
	@ResponseBody
	public String test() {
		return "yue success";
	}
}
