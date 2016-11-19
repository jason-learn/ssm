package com.cn.blog.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.blog.dao.IUserDao;
import com.cn.blog.pojo.User;
import com.cn.blog.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService{
	@Resource
	private IUserDao userDao;
	
	public User getUserById(int userId){
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

}
