package com.shiyanlou.service.impl;

import java.util.List;

import com.shiyanlou.mapper.UserMapper;
import com.shiyanlou.model.User;
import com.shiyanlou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor=Exception.class)
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	
	public User login(User user) {
		return userMapper.selectLogin(user);
	}

	public List<User> selectAllUser() {
		return userMapper.selectAllUser();
	}

	public void addUser(User user) {
		userMapper.addUser(user);
		
	}

	public void updateUser(User user) {
		userMapper.updateUser(user);
		
	}

	public void deleteUser(Integer id) {
		userMapper.deleteUser(id);
		
	}

	@Override
	public User selectUserById(Integer id) {
		return userMapper.selectUserById(id);
	}

	

}
