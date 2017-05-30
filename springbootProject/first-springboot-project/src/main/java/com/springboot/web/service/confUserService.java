//package com.springboot.web.service;
//
//	import java.util.ArrayList;
//	import java.util.Date;
//	import java.util.Iterator;
//	import java.util.List;
//
//	import org.springframework.stereotype.Service;
//
//	import com.springboot.web.model.confUser;
//
//	@Service
//	public class confUserService {
//	    private static List<confUser> confUsers = new ArrayList<confUser>();
//	    private static int confUserCount = 3;
//
//	    static {
//	        confUsers.add(new confUser(1, "profDummy1", "Learn Spring MVC", new Date(),
//	                false, "ala"));
//	        confUsers.add(new confUser(2, "profDummy2", "Learn Struts", new Date(), false, "ma"));
//	        confUsers.add(new confUser(3, "profDummy3", "Learn Hibernate", new Date(),
//	                false, "kota"));
//	    }
//
//	    public List<confUser> retrieveconfUsers(String user) {
//	        List<confUser> filteredconfUsers = new ArrayList<confUser>();
//	        for (confUser confUser : confUsers) {
//	            if (confUser.getUser().equals(user)) {
//	                filteredconfUsers.add(confUser);
//	            }
//	        }
//	        return filteredconfUsers;
//	    }
//
//	    public void addconfUser(String name, String desc, Date targetDate,
//	            boolean isDone, String password) {
//	        confUsers.add(new confUser(++confUserCount, name, desc, targetDate, isDone, password));
//	    }
//
//	    public void deleteconfUser(int id) {
//	        Iterator<confUser> iterator = confUsers.iterator();
//	        while (iterator.hasNext()) {
//	            confUser confUser = iterator.next();
//	            if (confUser.getId() == id) {
//	                iterator.remove();
//	            }
//	        }
//	    }
//	}
//
//
