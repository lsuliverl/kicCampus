package com.codingbox.springshop.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class HomeController {

//	Logger log = LoggerFactory.getLogger(getClass());
	
	@RequestMapping("/")
	public String home() {
//		System.out.println("home controller");
		log.info("home Controller");
		return "home";	// home.html 로 찾아간다.
	}
	
	
	
}







