package com.zhiyou100.vrm;

import java.util.List;
import java.util.Random;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhiyou100.vrm.mapper.VideoMapper;
import com.zhiyou100.vrm.pojo.Video;
import com.zhiyou100.vrm.service.VideoListService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/applicationContext-dao.xml","classpath:spring/applicationContext-service.xml"})
public class TestService {
	@Autowired
	VideoListService vs;
 @Test
public void test01(){
	 /*List<Video> video = vm.findAllVideo();
		System.out.println(video);
		for (Video video2 : video) {
			System.out.println(video2);
	}*/	
	/* List<Video> showDatas = vs.showDatas();
	 for (Video video : showDatas) {
		System.out.println(video.getAverage()+"--------"+video.getCourseName());
	}*/
	 /*Random ran = new Random();
	Integer i = ran.nextInt(89999)+10000;
	String str = i + "";
	System.out.println(str);*/
}
}

