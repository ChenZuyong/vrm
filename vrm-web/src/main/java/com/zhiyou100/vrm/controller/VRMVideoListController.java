package com.zhiyou100.vrm.controller;



import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.zhiyou100.vrm.pojo.Course;
import com.zhiyou100.vrm.pojo.Speaker;
import com.zhiyou100.vrm.pojo.Video;
import com.zhiyou100.vrm.service.VideoListService;
import com.zhiyou100.vrm.util.Page;

@Controller
@RequestMapping("/admin")
public class VRMVideoListController {
    @Autowired
	VideoListService vs;
@RequestMapping("/showVideoList.action")
public String showVideoList(HttpServletRequest request,String KeyWord,
		String SearchSpeakerField,String SearchCourseField,Model m){
	
	  /* List<Video> list = vs.findAllVideo();
	   request.setAttribute("list", list);*/
	
	   List<Speaker> speaker = vs.findAllSpeakerName();
	   List<Course> course = vs.findAllCourse();
	   request.setAttribute("speaker", speaker);
	   request.setAttribute("course", course);
	   
	   if(KeyWord == null){
			KeyWord = "";
		}
	  int currentPage = request.getParameter("page") == null ? 1 : Integer.parseInt(request.getParameter("page"));
	  Page page = vs.loadPage(KeyWord, SearchSpeakerField, SearchCourseField, currentPage);
	  m.addAttribute("page", page);
	  /*System.out.println("查询page数据： "+page);*/
	  
	  m.addAttribute("KeyWord", KeyWord);
	  m.addAttribute("SearchSpeakerField", SearchSpeakerField);
	  m.addAttribute("SearchCourseField",SearchCourseField);
	  m.addAttribute("page", page);
	  
	  return "/vedio/vedioList";
   }
@RequestMapping("/multiDelete.action")
public String multiDelete(Integer []choose){
	/*System.out.println(choose[2]+"============");*/
	return "/vedio/addVedio";
}
@RequestMapping(value = "/deleteVideo.action",method = RequestMethod.GET)
public String deleteVideo(Integer id){
	//System.out.println(id);
	 vs.deleteVideo(id);
	 return "forward:/admin/showVideoList.action";
	
}
@RequestMapping(value = "/addVideo.action",method = RequestMethod.GET)
  public String addVideo(Model m, HttpServletRequest request){
	List<Course> course = vs.findAllCourse();
	List<Speaker> speaker = vs.findAllSpeakerName();
	/*System.out.println(course+"-------"+speaker);*/
	request.setAttribute("speaker", speaker);
	 request.setAttribute("course", course);
	 return "forward:/WEB-INF/view/vedio/addVedio.jsp";
  }
@RequestMapping(value = "/addVideo.action",method = RequestMethod.POST)
public String addVideo(Video video){
	/* Video video = new Video();
	 video.setSpeakerName(chooseSpeaker);
	 video.setCourseName(chooseCoursr);
	 video.setVideoLength(courseTime);
	 video.setVideoImageUrl(picture);
	 video.setVideoUrl(vedioHttp);
	 video.setVideoDescr(vedioIntroduce);
	 return ":/showVideoList.action";*/
	
	vs.insertVideo(video);
	//System.out.println(video);
	
	return "redirect:/admin/showVideoList.action";
	
}
@RequestMapping( value = "/editVideo.action",method = RequestMethod.GET)
public String editVideo(Integer id, Model m){
	List<Speaker> speaker = vs.findAllSpeakerName();
	 List<Course> course = vs.findAllCourse();
	 m.addAttribute("speaker", speaker);
	 m.addAttribute("course", course);
	Video v = vs.selectVideoById(id);
	//System.out.println(v);
	m.addAttribute("video", v);
	//System.out.println(id);
	
	return"forward:/WEB-INF/view/vedio/updateVedio.jsp";
}
 
@RequestMapping( value = "/editVideo.action",method = RequestMethod.POST)
public String editVideo(Video video){
	vs.updateVideoById(video);
	
	return"forward:/admin/showVideoList.action";
}
@RequestMapping("/showDatas.action")
public String showDatas(Model model){
	List<Video> showDatas = vs.showDatas();
	StringBuilder x = new StringBuilder();
	StringBuilder y = new StringBuilder();
	for (Video video : showDatas) {
		x.append("'"+video.getCourseName()+"',");
		y.append("'"+video.getAverage()+"',");
	}
	
	model.addAttribute("x", x.deleteCharAt(x.length()-1));
	model.addAttribute("y", y.deleteCharAt(y.length()-1));
	/*System.out.println(x);*/
   return "forward:/WEB-INF/view/showDatas/showDatas.jsp";
}
}
