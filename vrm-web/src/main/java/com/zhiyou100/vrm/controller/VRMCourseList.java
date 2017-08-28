package com.zhiyou100.vrm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zhiyou100.vrm.pojo.Course;
import com.zhiyou100.vrm.pojo.Subject;
import com.zhiyou100.vrm.service.CourseListService;
@RequestMapping("course")
@Controller
public class VRMCourseList {
	@Autowired
	CourseListService cs;
@RequestMapping("/courseList.action")  
public String showCourseList(HttpServletRequest request){
	List<Course> findAllCourse = cs.findAllCourse();
	
	
	request.setAttribute("course", findAllCourse);
	return "/course/courseList";
}
public String showCourse(){
	
	return null;
}
@RequestMapping("/deleteCourse.action")
public String deleteCourse(Integer id){
//	cs.deleteCourse(id);
	System.out.println(2);
	return "forward:/course/courseList.action";
	
}
@RequestMapping(value = "/addCourse.action",method = RequestMethod.GET)
public String addCourse(ModelMap mm){
	List<Subject> findAllSubject = cs.findAllSubject();
	/*for (Subject subject : findAllSubject) {
		System.out.println(subject.getSubjectName());
	}*/
	mm.addAttribute("subject", findAllSubject);
	return "/course/addCourse";
	
	
}
@RequestMapping(value = "/addCourse.action",method = RequestMethod.POST)
public String addCourse(Course course){
	
	/*cs.insertCourse(course);*/
	return "redirect:/course/courseList.action";	
}
@RequestMapping(value ="/editCourse.action",method = RequestMethod.GET)
public String editCourse(Integer id,ModelMap mm){
	List<Subject> findAllSubject = cs.findAllSubject();
	mm.addAttribute("subject", findAllSubject);
	Course findCourseById = cs.findCourseById(id);
	System.out.println(findCourseById);
	mm.addAttribute("course", findCourseById);
	return "/course/updateCourse";
}
@RequestMapping(value ="/editCourse.action",method = RequestMethod.POST)
public String editCourse(Course course){
	cs.updateCourse(course);
	return "redirect:/course/courseList.action";
}
}
