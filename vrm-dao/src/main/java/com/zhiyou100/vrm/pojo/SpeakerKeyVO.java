package com.zhiyou100.vrm.pojo;

public class SpeakerKeyVO {
  private String speakerNameKey;
  private String speakerJobKey;
  private int CurrentStrip;
public String getSpeakerNameKey() {
	return speakerNameKey;
}
public void setSpeakerNameKey(String speakerNameKey) {
	this.speakerNameKey = speakerNameKey;
}
public String getSpeakerJobKey() {
	return speakerJobKey;
}
public void setSpeakerJobKey(String speakerJobKey) {
	this.speakerJobKey = speakerJobKey;
}
public int getCurrentStrip() {
	return CurrentStrip;
}
public void setCurrentStrip(int currentStrip) {
	CurrentStrip = currentStrip;
}
@Override
public String toString() {
	return "SpeakerKeyVO [speakerNameKey=" + speakerNameKey + ", speakerJobKey=" + speakerJobKey + ", CurrentStrip="
			+ CurrentStrip + "]";
}
  
}
