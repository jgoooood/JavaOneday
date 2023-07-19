package com.kh.day18.music.controller;

import java.util.List;

import com.kh.day18.music.model.dao.MusicDAO;
import com.kh.day18.music.model.vo.Music;

//컨트롤러는 DAO호출 : view와 DAO사이의 중간자 역할
public class MusicController {
	//필드
	private MusicDAO musicDao;
	
	//생성자
	public MusicController() {
		musicDao = new MusicDAO();
	}
	

	/**
	 * 곡 정보 등록
	 * @param music 입력받은 곡명, 가수명
	 */
	public void addMusic(Music music) {
		musicDao.addMusic(music);
	}
	
	/**
	 * 전체 정보 출력
	 * @return List 전체 정보인 List 출력
	 */
	//전체정보 리턴하는 메소드
	public List<Music> allMusicInfo() {
		List<Music> mList = musicDao.allMusicInfo();
		return mList;
	}

	//가수명으로 곡 리스트 리턴
	public List<Music> findListBySinger(String singer) {
		List<Music> mList = musicDao.findListBySinger(singer);
		return mList;
	}

	//인덱스 찾는 메소드 호출
	public int findIndexBySinger(String singer) {
		int index = musicDao.findIndexBySinger(singer);
		return index;
	}

	//인덱스로 해당 데이터 삭제
	public void deleteMusic(int index) {
		musicDao.deleteMusic(index);
	}


	public Music findMusicBySinger(String singer) {
		Music music = musicDao.findMusicBySinger(singer);
		return music;
	}


	public void modifyMusic(int index, Music music) {
		musicDao.updateMusic(index, music);
	}




}
