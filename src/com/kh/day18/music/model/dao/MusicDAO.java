package com.kh.day18.music.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.kh.day18.music.model.vo.Music;

//MusicDAO는 데이터 저장소
public class MusicDAO {
	//필드
	private List<Music> musicList; 
	//생성자
	public MusicDAO() {
		musicList = new ArrayList<Music>();
	}
	
	/**
	 * 곡 정보 등록
	 * @param music 입력받은 곡명, 가수명
	 */
	public void addMusic(Music music) {
		musicList.add(music);
	}
	
	/**
	 * 전체 정보 출력
	 * @return List 전체 정보인 List 출력
	 */
	public List<Music> allMusicInfo() {
		return musicList;
	}

	/**
	 * 검색어와 일치하는 가수명의 음악리스트를 저장하여 반환
	 * @param singer
	 * @return
	 */
	public List<Music> findListBySinger(String singer) {
		List<Music> findList = new ArrayList<Music>(); //리턴용 리스트
		for(Music music : musicList) {
			if(music.getSinger().equals(singer)) {
				findList.add(music);
			}
		}
		return findList;
	}

	/**
	 * 이름검색하여 인덱스 리턴
	 * @param singer
	 * @return
	 */
	public int findIndexBySinger(String singer) {
//		for(int i = 0; i < musicList.size(); i++) {
//			Music music = musicList.get(i);
//			if(music.getTitle().equals(singer)) {
//				return i;
//			}
//		}
		int count = 0;
		for(Music music : musicList) {
			if(music.getTitle().equals(singer)) {
				return count;
			}
			count += 1;
		}
		return -1;
	}
	
	/**
	 * 받은 인덱스로 해당 데이터 삭제
	 * @param index
	 */
	public void deleteMusic(int index) {
		musicList.remove(index);
	}


	public Music findMusicBySinger(String singer) {
		for(Music music : musicList) {
			if(music.getSinger().equals(singer)) {
				return music;
			}
		}
		return null; //못찾으면 null;
	}

	// 음악수정
	public void updateMusic(int index, Music music) {
		musicList.set(index, music);
	}

}
