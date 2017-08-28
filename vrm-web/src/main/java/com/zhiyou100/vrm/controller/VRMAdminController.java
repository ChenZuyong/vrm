package com.zhiyou100.vrm.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhiyou100.vrm.pojo.Admin;
import com.zhiyou100.vrm.service.AdminService;

@Controller
@RequestMapping("admin")
public class VRMAdminController {
	@Autowired
    AdminService as;	
@RequestMapping("/login.action")
public String login(Admin admin,HttpServletRequest request){
	    Admin findAdmin = as.findAdmin(admin);
	    if(findAdmin!=null){
	    	request.getSession().setAttribute("admin", findAdmin);
	    	return"redirect:/admin/showVideoList.action";
	    }else{
	    	request.setAttribute("errorMessage", "用户名或密码错误！");
	    	return "forward:/login.jsp";
	    }
	    
    	
    	
    }
}
