package com.kh.day12.music.model.vo;

public class Music {
	// 필드
	private String title;
	private String singer;
	// 생성자, getter/setter/toString() 자동완성 가능
	// alt+shift+s or Source -> Generate constructor using Field
	
	// 생성자
	public Music() {
		super();
	}
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}
	//getter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	//setter
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	//toString 오버라이딩
	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}
	
}
