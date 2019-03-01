package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	@GetMapping("/")
	public String welcome() {
		return "welcome";
	}
	@GetMapping("/loginpage")
	public String loginPage() {
		return  "loginPage";
	}
}
