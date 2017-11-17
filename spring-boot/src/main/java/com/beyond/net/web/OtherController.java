package com.beyond.net.web;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Scope("request")
@Controller
public class OtherController {
	@RequestMapping("/getView")
	public ModelAndView getView(){
		ModelAndView mv=new ModelAndView("index");
		return mv;
	}
}
