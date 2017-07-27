package com.beyond.net.web;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Scope("request")
@RestController
public class TestController {
	
	@RequestMapping("/helloworld")
	public String hello(){
		return "helloworld";
	}
}
