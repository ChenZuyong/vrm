package com.zhiyou100.vrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhiyou100.vrm.pojo.Speaker;
import com.zhiyou100.vrm.service.SpeakerListService;
@RequestMapping("speaker")
@Controller
public class VRMSpeakerListController {
   @Autowired
   SpeakerListService ss;
@RequestMapping("")	
public String findAllSpeakerName(){
    	List<Speaker> speakerName = ss.findAllSpeakerName();
    	System.out.println(speakerName);
    	 return null;
     }
}
