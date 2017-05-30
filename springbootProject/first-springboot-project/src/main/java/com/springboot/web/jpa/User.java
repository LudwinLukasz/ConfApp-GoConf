package com.springboot.web.jpa;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
	@Entity
	public class User {

	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;

	    private String name;
	    private String password;

	    protected User() {
	    }

	    public User(String name, String password) {
	        super();
	        this.name = name;
	        this.password = password;
	    }

	    public Long getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getPassword() {
	        return password;
	    }

		@Override
		public String toString() {
			return "User [id=" + id + ", name=" + name + ", password="
					+ password + "]";
		}

	    

	}

