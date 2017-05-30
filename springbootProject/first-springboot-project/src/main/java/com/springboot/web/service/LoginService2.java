package com.springboot.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.web.jpa.UserRepository;

	@Component
	public class LoginService2 {
		@Autowired
		private UserRepository repository;
		//String password;
//		private static HashMap<String, String> hashconfUsers = new HashMap<>();
//		static {
//	        hashconfUsers.put("profDummy1", "ala");
//	        hashconfUsers.put("profDummy2", "ma");
//	        hashconfUsers.put("profDummy3", "kota");
//		}
		 
	    public boolean validateUser(String user, String password) {
	        if (repository.findByName(user) != null) {
	    	return password.equals(repository.findByName(user).getPassword());
	    } else return false;
	    }
	}
