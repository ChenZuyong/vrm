package com.zhiyou100.vrm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.vrm.mapper.CourseMapper;
import com.zhiyou100.vrm.mapper.SubjectMapper;
import com.zhiyou100.vrm.mapper.VideoMapper;
import com.zhiyou100.vrm.pojo.Course;
import com.zhiyou100.vrm.service.UserCourseListServcie;
@Service
public class UserCourseListServiceImpl implements UserCourseListServcie {
    @Autowired
    CourseMapper cm;
    SubjectMapper sm;
    VideoMapper vm;
	@Override
	public List<Course> findVideoAndCourseBySubId(Integer subjectId) {
		
		return cm.findVideoAndCourseBySubId(subjectId);
	}

}
