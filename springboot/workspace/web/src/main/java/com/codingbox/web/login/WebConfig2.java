package com.codingbox.web.login;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.codingbox.web.interceptor.LogInterceptor;
import com.codingbox.web.interceptor.LoginCheckInterceptor;

@Configuration
public class WebConfig2 implements WebMvcConfigurer {
	
	// https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/util/pattern/PathPattern.html
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LogInterceptor())
				.order(1)
				.addPathPatterns("/**")			// 모든 경로 전체 가능
				.excludePathPatterns("/css/**", "/*.ico", "/error");	// 제외할 경우
		
		registry.addInterceptor(new LoginCheckInterceptor())
				.order(2)
				.addPathPatterns("/**")			// 모든 경로 전체 가능
				.excludePathPatterns("/", "/members/add", "/login", "/logout", "/css/**");	// 제외할 경우
	}
	
}














