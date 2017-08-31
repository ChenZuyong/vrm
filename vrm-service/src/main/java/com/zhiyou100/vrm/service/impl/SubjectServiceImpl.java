package com.zhiyou100.vrm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.vrm.mapper.SubjectMapper;
import com.zhiyou100.vrm.pojo.Subject;
import com.zhiyou100.vrm.service.SubjectService;
@Service
public class SubjectServiceImpl implements SubjectService {
	@Autowired
    SubjectMapper subm;
	@Override
	public Subject findSubjectName(Integer subjectId) {
		
		return subm.selectByPrimaryKey(subjectId);
	}

}
