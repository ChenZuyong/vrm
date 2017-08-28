package com.zhiyou100.vrm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.vrm.mapper.AdminMapper;
import com.zhiyou100.vrm.pojo.Admin;
import com.zhiyou100.vrm.pojo.AdminExample;
import com.zhiyou100.vrm.pojo.AdminExample.Criteria;
import com.zhiyou100.vrm.service.AdminService;
@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
    AdminMapper am;
	@Override
	public Admin findAdmin(Admin admin) {
		AdminExample example = new AdminExample();
		Criteria criteria = example.createCriteria();
		criteria.andLoginNameEqualTo(admin.getLoginName()).andLoginPwdEqualTo(admin.getLoginPwd());
		List<Admin> list = am.selectByExample(example);
		for (Admin admin2 : list) {
			return admin2 ;
		}
		return null;
	}

}
