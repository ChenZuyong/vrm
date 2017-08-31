package com.zhiyou100.vrm.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhiyou100.vrm.mapper.CourseMapper;
import com.zhiyou100.vrm.pojo.Course;
import com.zhiyou100.vrm.pojo.Speaker;
import com.zhiyou100.vrm.pojo.Subject;
import com.zhiyou100.vrm.pojo.Video;
import com.zhiyou100.vrm.service.CourseListService;
import com.zhiyou100.vrm.service.SpeakerListService;
import com.zhiyou100.vrm.service.SubjectService;
import com.zhiyou100.vrm.service.UserCourseListServcie;
import com.zhiyou100.vrm.service.VideoListService;

@RequestMapping("/front")
@Controller
public class UserVideoController {
	@Autowired
	SubjectService ss;
	@Autowired
	UserCourseListServcie ucs;
	@Autowired
	VideoListService vs;
	@Autowired
	SpeakerListService sls;
	@Autowired
	CourseListService cs;
@RequestMapping("/video/index.action")
 public String showUserVideo(Integer videoId,Integer subjectId,Model m){
	
	  //System.out.println(videoId+"===================");
	  Subject findSubjectName = ss.findSubjectName(subjectId);
	  m.addAttribute("subject", findSubjectName);
	  m.addAttribute("videoId", videoId);
	  
	  
	  
	  return "forward:/WEB-INF/front/video/index.jsp";
	  
  }
@RequestMapping("/video/videoData.action")
public String showContent(Integer videoId,ModelMap mm){
	//System.out.println(videoId+"===============");
   Video selectVideoById = vs.selectVideoById(videoId);
   Speaker findSpeakerById = sls.findSpeakerById(videoId);
   Course findCourseById = cs.findCourseById(videoId);
    
    mm.addAttribute("course", findCourseById);
    mm.addAttribute("video", selectVideoById);
    mm.addAttribute("speaker", findSpeakerById);
    
	return  "forward:/WEB-INF/front/video/content.jsp";
}
}
