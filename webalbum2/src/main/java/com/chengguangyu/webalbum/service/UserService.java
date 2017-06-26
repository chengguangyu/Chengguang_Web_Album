package com.chengguangyu.webalbum.service;

import java.util.List;

import com.chengguangyu.webalbum.model.User;

public interface UserService {

	List<User> findAllUsers();
	
	User findByUserName(String userName);
	
	User save(User user);
}
