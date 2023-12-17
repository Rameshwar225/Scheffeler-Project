package com.controller;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
	 User findByUsernameAndPassword(String username, String password);

}