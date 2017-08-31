package com.zhiyou100.vrm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhiyou100.vrm.pojo.Course;
import com.zhiyou100.vrm.pojo.Subject;
import com.zhiyou100.vrm.service.SubjectService;
import com.zhiyou100.vrm.service.UserCourseListServcie;

@Controller
@RequestMapping("front")
public class UserCourseList {
	@Autowired
	UserCourseListServcie ucs;
	@Autowired
	SubjectService ss;
@RequestMapping("/course/index.action")
public String  transferCourseList(Integer subjectId,ModelMap mm){
	  
	  mm.addAttribute("subjectId", subjectId);
	  List<Course> findVideoAndCourseBySubId = ucs.findVideoAndCourseBySubId(subjectId);
	  /*if(findVideoAndCourseBySubId != null){
		  for (Course course : findVideoAndCourseBySubId) {
			  System.out.println(course.getCourseName()+"=============");
		}
		  
	  }*/
	  mm.addAttribute("courses", findVideoAndCourseBySubId);
	  Subject findSubjectName = ss.findSubjectName(subjectId);
	  mm.addAttribute("subject", findSubjectName);
    return "forward:/WEB-INF/front/course/index.jsp";	
    }
}
