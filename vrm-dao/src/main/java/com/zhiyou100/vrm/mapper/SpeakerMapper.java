package com.zhiyou100.vrm.mapper;

import com.zhiyou100.vrm.pojo.KeyVO;
import com.zhiyou100.vrm.pojo.Speaker;
import com.zhiyou100.vrm.pojo.SpeakerExample;
import com.zhiyou100.vrm.pojo.SpeakerKeyVO;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpeakerMapper {
    int countByExample(SpeakerExample example);

    int deleteByExample(SpeakerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Speaker record);

    int insertSelective(Speaker record);

    List<Speaker> selectByExample(SpeakerExample example);

    Speaker selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Speaker record, @Param("example") SpeakerExample example);

    int updateByExample(@Param("record") Speaker record, @Param("example") SpeakerExample example);

    int updateByPrimaryKeySelective(Speaker record);

    int updateByPrimaryKey(Speaker record);
    List<Speaker> findAllSpeakerName();
    int selectByKeyCount(KeyVO keyvo);
    int selectKeyByCount(SpeakerKeyVO speakerKeyVO);
    List<Speaker> selectByCount(SpeakerKeyVO speakerKeyVO);
}