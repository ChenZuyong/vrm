package com.zhiyou100.vrm.pojo;

public class VideoListVO {
	private  Video  video;
    private Speaker speaker ;
    private Course  course;
	public Video getVideo() {
		return video;
	}
	public void setVideo(Video video) {
		this.video = video;
	}
	public Speaker getSpeaker() {
		return speaker;
	}
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "VideoListVO [video=" + video + ", speaker=" + speaker + ", course=" + course + "]";
	}
    
}
