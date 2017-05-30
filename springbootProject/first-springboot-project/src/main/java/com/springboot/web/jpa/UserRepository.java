package com.springboot.web.jpa;

	import org.springframework.data.repository.CrudRepository;

	public interface UserRepository extends CrudRepository<User, Long> {
		User findByPassword(String password);
		User findByName(String name);
	}
