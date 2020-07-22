package com.tassel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Date: 2019/12/21 21:52
 * @Description: 创建springboot项目后的测试工作
 * @Author Ep流苏
 */
@Controller
public class HelloController {

	@ResponseBody
	@RequestMapping("/hello")
	public String hello() {
		return "hello, world.";
	}
}
