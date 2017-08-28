package com.zhiyou100.vrm.service;

import java.util.List;

import com.zhiyou100.vrm.pojo.Speaker;
import com.zhiyou100.vrm.util.Page;

public interface SpeakerListService {
	 List<Speaker>findAllSpeakerName();
	 List<Speaker>findAllSpeaker();
	 void insertSpeaker(Speaker speaker);
	 void deleteTeacher(Integer id);
	 Speaker findSpeakerById(Integer id);
	 void updateSpeaker(Speaker speaker);
	 Page loadPage(String speakerNameKey,String speakerJobKey,int currentPage);
	 void deleteTeachers(Integer id);
}
