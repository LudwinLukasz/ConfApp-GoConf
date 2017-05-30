package com.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springboot.web.service.LoginService2;


	@Controller
	@SessionAttributes("name")
	public class LoginController {
		@Autowired
		LoginService2 service2;
		
		@RequestMapping(value="/index", method = RequestMethod.GET)
		public String showMainPage(ModelMap model){
			return "index";
		}
		
		@RequestMapping(value="/login", method = RequestMethod.GET)
		public String showLoginPage(ModelMap model){
			return "login";
		}
		
		@RequestMapping(value="/login", method = RequestMethod.POST)
		public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password){
			boolean isValiduser = service2.validateUser(name, password);
			if(!isValiduser) {
				model.put("errorMessage", "złe hasło");
				return "login";
			}
			model.put("name", name);
			model.put("password", password);
			return "welcome";
		}

	}