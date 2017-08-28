package com.zhiyou100.vrm.service;

import java.util.List;

import com.zhiyou100.vrm.pojo.Course;
import com.zhiyou100.vrm.pojo.Subject;
import com.zhiyou100.vrm.util.Page;

public interface CourseListService {
      List<Course> findAllCourse();
      void deleteCourse(Integer id);
      List<Subject> findAllSubject();
      void insertCourse(Course course);
      Course findCourseById(Integer id);
      void updateCourse(Course course);
      Page loadPage(String speakerNameKey,String speakerJobKey,int currentPage);
}
