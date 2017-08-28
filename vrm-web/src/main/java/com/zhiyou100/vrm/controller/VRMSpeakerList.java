package com.zhiyou100.vrm.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zhiyou100.vrm.pojo.Speaker;
import com.zhiyou100.vrm.service.SpeakerListService;
import com.zhiyou100.vrm.util.Page;

@Controller
@RequestMapping("speaker")
public class VRMSpeakerList {
	@Autowired
	SpeakerListService ss;

public String showSpeakerList(HttpServletRequest request){
	List<Speaker> speaker = ss.findAllSpeaker();
	request.setAttribute("speaker", speaker);
	return "/teacher/teacherList";
}
@RequestMapping("/teacherList.action")
public String showSpeakerInfo(String speakerNameKey,String speakerJobKey,Model m,HttpServletRequest request){
	if(speakerNameKey == null ){
		speakerNameKey ="";
	}
	if(speakerJobKey == null){
		speakerJobKey = "";
	}
	
	int currentPage = request.getParameter("page") == null ? 1 : Integer.parseInt(request.getParameter("page"));
	Page page = ss.loadPage(speakerNameKey, speakerJobKey, currentPage);
	m.addAttribute("speakerNameKey", speakerNameKey);
	m.addAttribute("speakerJobKey", speakerJobKey);
	//System.out.println(page+"==============");
	m.addAttribute("page", page);
	return "/teacher/teacherList";
}
@RequestMapping(value = "/addSpeaker.action", method = RequestMethod.GET)
public String addSpeaker(){
	
	return "/teacher/addTeacher";
}
@RequestMapping(value = "/addSpeaker.action",method = RequestMethod.POST)
public String addSpeaker(Speaker speaker){
	/*speaker.setInsertTime(new Date(System.currentTimeMillis()));
	speaker.setUpdateTime(new Date(System.currentTimeMillis()));*/
	ss.insertSpeaker(speaker);
	return "redirect:/speaker/teacherList.action";
}
@RequestMapping("/deleteSpeaker.action")
public String deleteSpeaker( Integer id){
	/*System.out.println("id is :"+ id);*/
	ss.deleteTeacher(id);
	return "redirect:/speaker/teacherList.action";
}
@RequestMapping(value = "/editSpeaker.action",method = RequestMethod.GET)
public String editSpeaker(Integer id,HttpServletRequest request){
	/*System.out.println(id);*/
	Speaker findSpeakerById = ss.findSpeakerById(id);
	System.out.println(findSpeakerById);
	request.setAttribute("speaker", findSpeakerById);
	return "/teacher/updateTeacher";
}
@RequestMapping(value = "/editSpeaker.action",method = RequestMethod.POST)
public String editSpeaker(Speaker speaker){
	ss.updateSpeaker(speaker);
	return "redirect:/speaker/teacherList.action";
}
@RequestMapping("/deleteTeachers.action")
public String  deleteTeachers(Integer id){
	
	//System.out.println(id);
	ss.deleteTeacher(id);
	return "redirect:/speaker/teacherList.action";
}
}
