package com.zhiyou100.vrm.controller;

import java.util.List;
import java.util.Random;
import java.util.UUID;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.zhiyou100.vrm.pojo.Result;
import com.zhiyou100.vrm.pojo.User;
import com.zhiyou100.vrm.service.UserService;
import com.zhiyou100.vrm.util.MailUtil;
@RequestMapping("/front")
@Controller
public class UserController {
	@Autowired
	UserService us;
@RequestMapping("/userIndex.action")
 public String transfer(){
	 return "forward:/WEB-INF/front/index.jsp";
 }
@RequestMapping(value = "/user/regist.action",method = RequestMethod.POST)
@ResponseBody
public Result userRegister(User user,Model m){
	Result res = new Result();
	//System.out.println(user);
	List<User> findUserByMail = us.findUserByMail(user);
	m.addAttribute("user", findUserByMail);
	//System.out.println(findUserByMail);
	if(findUserByMail.isEmpty()){
		us.insertUser(user);
		res.setMessage("注册成功");
	     res.setSuccess(true);
	}else{
		res.setMessage("用户已存在");
	     res.setSuccess(false);
	     
	}
	
	return res;
}

@RequestMapping(value = "/user/login.action",method = RequestMethod.POST)
@ResponseBody
public Result  userLogin(User user,HttpSession session){
	Result res = new Result();
	List<User> findUserByMailAndPwd = us.findUserByMailAndPwd(user);
	User user2 = findUserByMailAndPwd.get(0);
	//System.out.println(findUserByMailAndPwd+"============");
	if(findUserByMailAndPwd.isEmpty()){
		
		res.setSuccess(false);
		res.setMessage("用户名密码不匹配");
	}else{
		res.setSuccess(true);
		
		session.setAttribute("user", user2);
	}
	 return res;
	 
}
@RequestMapping("/user/logout.action")
public String exit(HttpSession session){
	session.invalidate();
	return "forward:/WEB-INF/front/index.jsp";
}
@RequestMapping("/forgetpwd.action")
public String  forgetPassword(){
	return "forward:/WEB-INF/front/user/forget_pwd.jsp";
}
@RequestMapping(value = "/forgetpwd.action",method = RequestMethod.POST )
public  String  forgetPassword(User user){
	
	//Result res = new Result();
	/*List<User> findUserByMail = us.findUserByMail(user);
	String rand = findUserByMail.get(0).getCaptcha();*/
	
	
	
	List<User> findUserByMailAndRand = us.findUserByMailAndRand(user);
	if(findUserByMailAndRand.isEmpty()){
		return "forward:/WEB-INF/front/user/forget_pwd.jsp";
	}
	 return "forward:/WEB-INF/front/user/reset_pwd.jsp";	
}
@RequestMapping("/sendemail.action")
@ResponseBody
public Result sendEmail(User user){
	
	Result res = new Result();
	List<User> findUserByMail = us.findUserByMail(user);
	if(findUserByMail.isEmpty()){
		res.setSuccess(false);
		res.setMessage("请检查信息重新输入");
	}else{
	   
		Random ran = new Random();
		Integer random =  ran.nextInt(89999)+10000;
		String captcha = random +"";
		//System.out.println(captcha+"===============");
		findUserByMail.get(0).setCaptcha(captcha);
		us.insertRandomByMail(findUserByMail.get(0));
		
		try {
		   MailUtil.send("649189615@qq.com", "请张帆接收来自沉默的验证码",captcha);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		res.setSuccess(true);
		res.setMessage("验证码已发送");
	}
	  return res;
	
}
@RequestMapping("/index.action")
public String transferIndex(){
	return "forward:/WEB-INF/front/index.jsp";
}

//重置密码模块
@RequestMapping("/resetpwd.action")
public String  resetPwd(User user){
	
	us.updatePwd(user);
	return "forward:/WEB-INF/front/index.jsp";
}
@RequestMapping("/user/index.action")
public String properFile(){
	return "forward:/WEB-INF/front/user/profile.jsp";
}
@RequestMapping(value = "/user/profile.action",method = RequestMethod.POST)
public String storageProperFile(User user,HttpSession session){
	//us.insertProFile(user);
	
	//session.setAttribute("user", session.getAttribute("_front_user")); 
	return "forward:/WEB-INF/front/user/profile.jsp";
}
@RequestMapping(value = "/user/profile.action",method = RequestMethod.GET)
public String storageProperFile(){
	//us.insertProFile(user);
	
	//session.setAttribute("user", session.getAttribute("_front_user")); 
	return "forward:/WEB-INF/front/user/profile.jsp";
}

//profiles模块
@RequestMapping("/user/indivadualindex.action")
public String transferproFile(){
	
	return "forward:/WEB-INF/front/user/index.jsp";
	
}
public String updateFigureHeader(User user,MultipartFile pic,Model m){
	 String str = UUID.randomUUID().toString().replaceAll("-", "");
	 String ext = FilenameUtils.getExtension(pic.getOriginalFilename());
	 String fileName = str+"."+ext;
	 user.setHeadUrl(fileName);
	return "forward:/WEB-INF/front/user/profile.jsp";
}
@RequestMapping(value ="/user/password.action",method = RequestMethod.GET)
public String securityPassword(){
	return "forward:/WEB-INF/front/user/password.jsp";
}
@RequestMapping(value ="/user/password.action",method = RequestMethod.POST)
public String securityPassword(User user){
	return "forward:/WEB-INF/front/user/password.jsp";
}
@RequestMapping(value ="/user/avatar.action",method = RequestMethod.GET)
public String editPicture(){
	
	return "forward:/WEB-INF/front/user/avatar.jsp";
}
@RequestMapping(value ="/user/avatar.action",method = RequestMethod.POST)
public String editPicture(User user){
	
	return "forward:/WEB-INF/front/user/avatar.jsp";
}
}
