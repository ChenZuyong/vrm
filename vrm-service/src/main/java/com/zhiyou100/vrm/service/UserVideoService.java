package com.zhiyou100.vrm.service;

import com.zhiyou100.vrm.pojo.Speaker;
import com.zhiyou100.vrm.pojo.Video;

public interface UserVideoService {
  Video findVideoInfoById(Integer videoId);
  Speaker findSpeakerNameByVid(Integer videoId);
}
