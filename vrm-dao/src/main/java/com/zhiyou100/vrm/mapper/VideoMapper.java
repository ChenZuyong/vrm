package com.zhiyou100.vrm.mapper;


import com.zhiyou100.vrm.pojo.Course;
import com.zhiyou100.vrm.pojo.KeyVO;
import com.zhiyou100.vrm.pojo.Speaker;
import com.zhiyou100.vrm.pojo.Video;
import com.zhiyou100.vrm.pojo.VideoExample;
import com.zhiyou100.vrm.pojo.VideoListVO;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VideoMapper {
    int countByExample(VideoExample example);

    int deleteByExample(VideoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Video record);

    int insertSelective(Video record);

    List<Video> selectByExample(VideoExample example);

    Video selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Video record, @Param("example") VideoExample example);

    int updateByExample(@Param("record") Video record, @Param("example") VideoExample example);

    int updateByPrimaryKeySelective(Video record);

    int updateByPrimaryKey(Video record);
    
    
    List<Video> findAllVideo();
    void deleteVideo(Integer id);
    
    List<Speaker> findAllSpeaker();
    List<Course> findAllCourse();
    int selectByKeyCount(KeyVO keyvo);
    List<Video> selectByKeyUser(KeyVO keyvo);
    List<Video> showDatas();
}