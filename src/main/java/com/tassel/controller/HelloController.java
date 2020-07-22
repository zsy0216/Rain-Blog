package com.tassel.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Date: 2019/12/21 21:52
 * @Description: 创建springboot项目后的测试工作
 * @Author Ep流苏
 */
@Controller
@Api(value = "Hello Controller desc")
public class HelloController {
	private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

	@ResponseBody
	@RequestMapping("/hello")
	@ApiOperation(value = "hello request", notes = "hello request notes")
	public String hello() {
		LOGGER.info("正在请求 /hello.");
		return "hello, world.";
	}
}
