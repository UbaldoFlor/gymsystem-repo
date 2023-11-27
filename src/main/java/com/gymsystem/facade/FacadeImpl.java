package com.gymsystem.facade;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gymsystem.dao.FileStorage;
import com.gymsystem.dao.impl.UserDaoImpl;
import com.gymsystem.models.User;
import com.gymsystem.service.impl.UserServiceImpl;

@Component
public class FacadeImpl {

    private final UserServiceImpl userService;
    @Autowired
    private UserDaoImpl userDao;
    private FileStorage storage;


    @Autowired
    public FacadeImpl(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Autowired
    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    @Autowired
    public void setStorage(FileStorage storage) {
        this.storage = storage;
    }

    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    public void storeAllModels() {
		try {
			List<User> users = userDao.getAllUsers();
			storage.storeData(users.stream()
	                .collect(Collectors.toList()));
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

    public User createUser(User user) {
        return userService.createUser(user);
    }

    public User getUserById(Long id) {
        return userService.getUserById(id);
    }

    public User updateUser(User user) {
        return userService.updateUser(user);
    }

    public void deleteUser(Long id) {
        userService.deleteUser(id);
    }
}