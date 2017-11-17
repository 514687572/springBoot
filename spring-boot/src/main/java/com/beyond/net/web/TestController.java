package com.beyond.net.web;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.beyond.net.service.TestService;

@Scope("request")
@RestController
public class TestController {
	@Resource
	private TestService testService;
	
	@RequestMapping("/")
	public String hello(){
		return "helloworld";
	}
	
	@RequestMapping("/1")
	public String hello1(){
		System.out.println(testService.selectUsers());
		return "helloworld";
	}
}
