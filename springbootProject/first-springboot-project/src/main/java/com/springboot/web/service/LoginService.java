package com.springboot.web.service;

import java.util.HashMap;

import org.springframework.stereotype.Component;

	@Component
	public class LoginService {
		//String password;
		private static HashMap<String, String> hashconfUsers = new HashMap<>();
		static {
	        hashconfUsers.put("profDummy1", "ala");
	        hashconfUsers.put("profDummy2", "ma");
	        hashconfUsers.put("profDummy3", "kota");
		}
		
	    public boolean validateUser(String user, String password) {
	        return password.equals(hashconfUsers.get(user));
	    }
	}
