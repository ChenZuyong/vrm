package com.zhiyou100.vrm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.vrm.mapper.SpeakerMapper;

import com.zhiyou100.vrm.pojo.Speaker;
import com.zhiyou100.vrm.pojo.SpeakerKeyVO;
import com.zhiyou100.vrm.service.SpeakerListService;
import com.zhiyou100.vrm.util.Page;
@Service
public class SpeakerListServiceImpl implements SpeakerListService{
	@Autowired
    SpeakerMapper sm;
	@Override
	public List<Speaker> findAllSpeakerName() {
		
		return sm.findAllSpeakerName();
	}
	@Override
	public List<Speaker> findAllSpeaker() {
		
		return sm.selectByExample(null);
	}
	@Override
	public void insertSpeaker(Speaker speaker) {
		sm.insertSelective(speaker);
		
	}
	@Override
	public void deleteTeacher(Integer id) {
		sm.deleteByPrimaryKey(id);
		
	}
	@Override
	public Speaker findSpeakerById(Integer id) {
		
		return sm.selectByPrimaryKey(id);
	}
	@Override
	public void updateSpeaker(Speaker speaker) {
		sm.updateByPrimaryKeySelective(speaker);
		
	}
	@Override
	public Page loadPage(String speakerNameKey, String speakerJobKey, int currentPage) {
		Page<Speaker> page = new Page<>();
		SpeakerKeyVO speakerKeyVO = new SpeakerKeyVO();
		speakerKeyVO.setSpeakerNameKey(speakerNameKey);
		speakerKeyVO.setSpeakerJobKey(speakerJobKey);
		speakerKeyVO.setCurrentStrip((currentPage-1)*10);
		
		int total = sm.selectKeyByCount(speakerKeyVO);
		
		List<Speaker> rows = sm.selectByCount(speakerKeyVO);
		/*System.out.println(rows);*/
		page.setTotal(total);
		
		page.setSize(10);
		page.setRows(rows);
		//System.out.println(rows.toString()+"======== ==="+total);
		
		return page;
	}
	@Override
	public void deleteTeachers(Integer id) {
		sm.deleteByPrimaryKey(id);
		
	}

}
