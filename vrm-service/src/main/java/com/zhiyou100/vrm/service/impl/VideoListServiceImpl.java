package com.zhiyou100.vrm.service.impl;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhiyou100.vrm.mapper.CourseMapper;
import com.zhiyou100.vrm.mapper.SpeakerMapper;
import com.zhiyou100.vrm.mapper.VideoMapper;
import com.zhiyou100.vrm.pojo.Course;
import com.zhiyou100.vrm.pojo.KeyVO;
import com.zhiyou100.vrm.pojo.Speaker;
import com.zhiyou100.vrm.pojo.Subject;
import com.zhiyou100.vrm.pojo.Video;
import com.zhiyou100.vrm.pojo.VideoExample;
import com.zhiyou100.vrm.service.VideoListService;
import com.zhiyou100.vrm.util.Page;

@Service
public class VideoListServiceImpl implements VideoListService{
	@Autowired
    VideoMapper vm;
	@Autowired
	SpeakerMapper sm;
	@Autowired
	CourseMapper cm;
@Override
public List<Video> findAllVideo() {
		
		
	return vm.findAllVideo();
	}
@Override
public void deleteVideo(Integer id) {
	
	vm.deleteVideo(id);
}
@Override
public void insertVideo(Video video) {
	vm.insertSelective(video);
	
}
@Override
public Video selectVideoById(Integer id) {
	Video video = vm.selectByPrimaryKey(id);
	return video;
}
@Override
public void updateVideoById(Video video) {
	vm.updateByPrimaryKeySelective(video);
	
	
}
@Override
public List<Speaker> findAllSpeakerName() {

	
	/*System.out.println("vm.findAllSpeaker() : " + vm.findAllSpeaker());
	return vm.findAllSpeaker();*/
	return sm.selectByExample(null);
}
@Override
public List<Course> findAllCourse() {
	
	return cm.selectByExample(null);
}
@Override
public Page loadPage(String KeyWord, String SearchSpeakerField, String SearchCourseField, int currentPage) {
	Page<Video> page = new Page<>();
	
	KeyVO keyvo = new KeyVO();
	keyvo.setKeyWord(KeyWord);
	keyvo.setSearchCourseField(SearchCourseField);
	keyvo.setSearchSpeakerField(SearchSpeakerField);
	keyvo.setCurrentStrip((currentPage-1)*10);
	/*System.out.println("SearchCourseField : "+SearchCourseField);
	System.out.println("SearchCourseField : "+SearchCourseField);*/
	int total = vm.selectByKeyCount(keyvo);
//	System.out.println("total总条数 : " + total);
	List<Video> rows = vm.selectByKeyUser(keyvo);
//	System.out.println("rows 查询集合: " + rows);
	page.setTotal(total);
	page.setRows(rows);
	page.setSize(10);
	page.setPage(currentPage);
	return page;

}
@Override
public List<Video> showDatas() {
	
	return vm.showDatas();
}
@Override
public List<Subject> findAllSubject() {

	return null;
}
@Override
public void multiDelete(Integer[] choose) {
	VideoExample ve = new VideoExample();
	ve.createCriteria().andIdIn(Arrays.asList(choose));
     vm.deleteByExample(ve);
 
	
	
}
@Override
public List<Video> findVideosBySpeakerId(Integer id) {
	
	return null;
}
   

}
