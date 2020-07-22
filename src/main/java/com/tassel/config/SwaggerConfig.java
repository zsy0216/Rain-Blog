package com.tassel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author shuaiyin.zhang
 * @description
 * @date 2020/07/22
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.tassel"))
				.paths(PathSelectors.any())
				.build();


	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("Rain_Blog API DOC")
				.description("This is a blog named Rain created by tassel.")
				.version("1.0")
				.build();
	}
}
