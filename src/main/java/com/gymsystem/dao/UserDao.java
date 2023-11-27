package com.gymsystem.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gymsystem.models.User;

@Repository
public interface UserDao extends JpaRepository<User, Long>{
	User findByUsername(String username);

	List<User> getAllUsers();

	User getUserById(long id);

	void createUser(User user);

	void updateUser(User user);

	void deleteUser(long id);
}
