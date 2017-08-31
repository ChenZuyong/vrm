package com.zhiyou100.vrm.service;

import java.util.List;

import com.zhiyou100.vrm.pojo.Course;

public interface UserCourseListServcie {
  List<Course> findVideoAndCourseBySubId(Integer subjectId);
 
}
