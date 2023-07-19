package com.kh.day18.music.model.vo;
// db설계와 연관
public class Music {
	//필드
	private String title;
	private String singer;
	
	//생성자

	public Music() {
		super();
	}
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}


	//getter, setter
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		return "음악 [제목=" + title + ", 가수명=" + singer + "]";
	}
	
	
}
