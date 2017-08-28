package com.zhiyou100.vrm;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhiyou100.vrm.mapper.SpeakerMapper;
import com.zhiyou100.vrm.mapper.SubjectMapper;
import com.zhiyou100.vrm.mapper.VideoMapper;
import com.zhiyou100.vrm.pojo.Speaker;
import com.zhiyou100.vrm.pojo.SpeakerKeyVO;
import com.zhiyou100.vrm.pojo.Subject;
import com.zhiyou100.vrm.pojo.Video;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class TestDemo {

@Autowired
VideoMapper vm;
	
@Autowired
SpeakerMapper sm;
@Autowired
SubjectMapper subm;
	@Test
   public void  tet01(){
		/*KeyVO keyvo = new KeyVO();
		
		/*List<Video> video = vm.findAllVideo();
		System.out.println(video);
		for (Video video2 : video) {
			System.out.println(video2);
		}
		int selectByKeyCount = vm.selectByKeyCount(keyvo);
		System.out.println(selectByKeyCount);*/
		
		/*List<Video> list = vm.showDatas();
		for (Video video : list) {
			System.out.println(video.getCourseName()+"-------" + video.getAverage());
		}*/
		/*List<Subject> li = subm.findAllSubject();
		for (Subject subject : li) {
			System.out.println(subject.getSubjectName()+"============="+subject.getId());
		}
		System.out.println(li+"=========");*/
		/*SpeakerKeyVO speakerKeyVO = new SpeakerKeyVO();
		List<Speaker> selectByCount = sm.selectByCount(speakerKeyVO);
		for (Speaker  speaker : selectByCount) {
			System.out.println(speaker.getSpeakerName()+"==========="+speaker.getSpeakerJob());
		}
		int selectKeyByCount = sm.selectKeyByCount(speakerKeyVO);
		System.out.println(selectKeyByCount+"=====================");*/
	}
}
