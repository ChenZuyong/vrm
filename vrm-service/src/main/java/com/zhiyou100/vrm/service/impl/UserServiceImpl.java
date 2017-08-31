package com.zhiyou100.vrm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.vrm.mapper.UserMapper;
import com.zhiyou100.vrm.pojo.User;
import com.zhiyou100.vrm.pojo.UserExample;
import com.zhiyou100.vrm.pojo.UserExample.Criteria;
import com.zhiyou100.vrm.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
   UserMapper um;
	@Override
	public void insertUser(User user) {
		
		um.insertSelective(user);
	}
	@Override
	public List<User> findUserByMail(User user) {
		UserExample ue = new UserExample();
		ue.createCriteria().andEmailEqualTo(user.getEmail());
		return um.selectByExample(ue);
	}
	@Override
	public List<User> findUserByMailAndPwd(User user) {
		UserExample ue = new UserExample();
		ue.createCriteria().andEmailEqualTo(user.getEmail()).andPasswordEqualTo(user.getPassword());
		return um.selectByExample(ue);
	}
	@Override
	public void insertRandomByMail(User user) {
		UserExample ue = new UserExample();
		ue.createCriteria().andEmailEqualTo(user.getEmail());
	um.updateByExampleSelective(user, ue);
	
		
		
	}
	@Override
	public List<User> findUserByMailAndRand(User user) {
		UserExample ue = new UserExample();
		ue.createCriteria().andEmailEqualTo(user.getEmail()).andCaptchaEqualTo(user.getCaptcha());
		
		return um.selectByExample(ue);
	}
	@Override
	public void updatePwd(User user) {
		UserExample ue = new UserExample();
		ue.createCriteria().andEmailEqualTo(user.getEmail()).andCaptchaEqualTo(user.getCaptcha());
		um.updateByExampleSelective(user, ue);
		
		
	}
	@Override
	public void insertProFile(User user) {
		um.insertSelective(user);
		
	}
	
 
}
