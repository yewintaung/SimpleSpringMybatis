package com.ywa.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ywa.domain.User;
import com.ywa.mappers.UserMapper;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	UserMapper userMapper;

	public void insertUser(User user) {
		userMapper.insertUser(user);
	}

	public User getUserById(Integer userId) {
		return userMapper.getUserById(userId);
	}

	public List<User> getAllUsers() {
		return userMapper.getAllUsers();
	}

	public void updateUser(User user) {
		userMapper.updateUser(user);
	}

	public void deleteUser(Integer userId) {
		userMapper.deleteUser(userId);
	}

}
