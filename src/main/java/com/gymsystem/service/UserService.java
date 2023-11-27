package com.gymsystem.service;

import java.util.List;

import com.gymsystem.models.User;

public interface UserService {
	
	public User createUser(User user);
	
	public User updateUser(User user);
	
	public void deleteUser(Long id);
	
	public User getUserById(Long id);
	
	public List<User> getAllUsers();
}
