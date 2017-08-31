package com.zhiyou100.vrm.service.impl;

import javax.xml.ws.WebServiceClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.vrm.mapper.SpeakerMapper;
import com.zhiyou100.vrm.mapper.VideoMapper;
import com.zhiyou100.vrm.pojo.Speaker;
import com.zhiyou100.vrm.pojo.Video;
import com.zhiyou100.vrm.service.UserVideoService;
@Service
public class UserVideoServiceImpl implements UserVideoService {
	@Autowired
   VideoMapper vm;
	@Autowired
	SpeakerMapper sm;
	@Override
	public Video findVideoInfoById(Integer videoId) {
		
		return vm.selectByPrimaryKey(videoId);
	}
	@Override
	public Speaker findSpeakerNameByVid(Integer videoId) {
		
		return null;
	}

}
