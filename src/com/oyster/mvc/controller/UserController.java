package com.oyster.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@RequestMapping("/reg.do")
	public String regit() {
		System.out.println("LogController");
		return "Regit";
	}
	
	@RequestMapping("/log.do")
	public String login() {
		System.out.println("LogController");
		return "Log";
	}
}
