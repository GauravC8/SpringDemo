package com.niit.myproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public ModelAndView hello() {
		String welcomeMessage = "Hello controller Welcome Message";
		return new ModelAndView("hello", "welcomeMessage", welcomeMessage);
	}

	@RequestMapping("/admin")
	public ModelAndView admin() {
		String welcomeMessage = "Welcome to Admin Page !!";
		return new ModelAndView("admin", "welcomeMessage", welcomeMessage);
	}

	@RequestMapping("/error")
	public String error(ModelMap model) {
		model.addAttribute("error", "true");
		return "login";

	}

	@RequestMapping("/login")
	public String login() {
		System.out.println("Inside login");
		return "login";
	}

	@RequestMapping("/logout")
	public String logout() {
		return "logout";
	}
}