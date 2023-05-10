package com.aiz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ZhangYao
 * @version 1.0
 * @className YaoControllerV2
 * @description YaoControllerV2
 * @date Create in 23:37 2023/5/10
 */
@Controller
public class YaoControllerV2 {
	// http://localhost:8080/spring-web-debug/app/ao
	@GetMapping("/ao")
	@ResponseBody
	public String test() {
		return "zhangyao success v2";
	}
}
