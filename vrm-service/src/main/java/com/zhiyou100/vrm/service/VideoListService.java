package com.zhiyou100.vrm.service;

import java.util.List;

import com.zhiyou100.vrm.pojo.Course;
import com.zhiyou100.vrm.pojo.Speaker;
import com.zhiyou100.vrm.pojo.Subject;
import com.zhiyou100.vrm.pojo.Video;
import com.zhiyou100.vrm.util.Page;



public interface VideoListService {
   List<Video> findAllVideo();
   void deleteVideo(Integer id);
   void insertVideo(Video video);
   Video selectVideoById(Integer id);
   void  updateVideoById(Video video);
   List<Speaker> findAllSpeakerName();
   List<Course> findAllCourse();
   Page loadPage(String KeyWord,String SearchSpeakerField,String SearchCourseField,int currentPage);
   List<Video> showDatas();
   List<Subject> findAllSubject();
   void multiDelete(Integer []choose);
   List<Video> findVideosBySpeakerId(Integer id);
}
