package com.tassel.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Ep流苏
 * @Date: 2019/12/22 10:44
 * @Description: spring-mvc的扩展配置类
 */
@Configuration
public class BlogMvcConfig implements WebMvcConfigurer {

	/**
	 * 视图控制
	 *
	 * @param registry
	 */
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		/**
		 * 后台视图页面跳转
		 */
		registry.addViewController("/").setViewName("admin/index");
		registry.addViewController("/index").setViewName("admin/index");
		registry.addViewController("/404").setViewName("error/404");
	}
}
