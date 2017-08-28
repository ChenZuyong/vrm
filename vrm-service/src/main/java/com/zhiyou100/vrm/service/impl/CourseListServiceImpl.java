package com.zhiyou100.vrm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.vrm.mapper.CourseMapper;
import com.zhiyou100.vrm.mapper.SubjectMapper;
import com.zhiyou100.vrm.pojo.Course;
import com.zhiyou100.vrm.pojo.SpeakerKeyVO;
import com.zhiyou100.vrm.pojo.Subject;
import com.zhiyou100.vrm.service.CourseListService;
import com.zhiyou100.vrm.util.Page;
@Service
public class CourseListServiceImpl implements CourseListService {
	@Autowired
    CourseMapper cm;
	@Autowired
	SubjectMapper subm;
@Override
public List<Course> findAllCourse() {
	  	
		return cm.selectByExample(null);
	}
@Override
public void deleteCourse(Integer id) {
	cm.deleteCourse(id);
	
}
@Override
public List<Subject> findAllSubject() {
	
	return subm.findAllSubject();
}
@Override
public void insertCourse(Course course) {
	cm.insertSelective(course);
	
}
@Override
public Course findCourseById(Integer id) {
	
	return cm.selectByPrimaryKey(id);
}
@Override
public void updateCourse(Course course) {
	cm.updateByPrimaryKeySelective(course);
	
}
@Override
public Page loadPage(String speakerNameKey, String speakerJobKey, int currentPage) {
	Page<Course> page = new Page<>();
	SpeakerKeyVO speakerKeyVO = new SpeakerKeyVO();
	speakerKeyVO.setSpeakerNameKey(speakerNameKey);
	speakerKeyVO.setSpeakerJobKey(speakerJobKey);
	speakerKeyVO.setCurrentStrip(currentPage);
	int toata ;
	return null;
}

}
