package com.practice.webapp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	//ApplicationContext context =  new ClassPathXmlApplicationContext("spring-module.xml");
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ModelAndView getHello(String name) {
		ModelAndView model = new ModelAndView("hello");
		// = model.setViewName("hello");
		String message = "Hello!"+name;
		model.addObject("message", message);
		return model;
	}
}
