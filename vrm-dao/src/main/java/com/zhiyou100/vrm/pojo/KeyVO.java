package com.zhiyou100.vrm.pojo;

public class KeyVO {
    private String KeyWord;
    private String SearchSpeakerField;
    private String SearchCourseField;
    private int CurrentStrip;
    
    
	@Override
	public String toString() {
		return "KeyVO [KeyWord=" + KeyWord + ", SearchSpeakerField=" + SearchSpeakerField + ", SearchCourseField="
				+ SearchCourseField + ", CurrentStrip=" + CurrentStrip + "]";
	}
	public String getKeyWord() {
		return KeyWord;
	}
	public void setKeyWord(String keyWord) {
		KeyWord = keyWord;
	}
	public String getSearchSpeakerField() {
		return SearchSpeakerField;
	}
	public void setSearchSpeakerField(String searchSpeakerField) {
		SearchSpeakerField = searchSpeakerField;
	}
	public String getSearchCourseField() {
		return SearchCourseField;
	}
	public void setSearchCourseField(String searchCourseField) {
		SearchCourseField = searchCourseField;
	}
	public int getCurrentStrip() {
		return CurrentStrip;
	}
	public void setCurrentStrip(int currentStrip) {
		CurrentStrip = currentStrip;
	}
    
}
