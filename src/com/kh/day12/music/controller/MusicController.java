package com.kh.day12.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.day12.music.model.vo.Music;


public class MusicController {
	List<Music> mList;
	
	public MusicController() {
		mList = new ArrayList<Music>();
	}
	//자바독 주석 : 문서로 만들 수 있는 주석
	//->메소드를 다 작성후 주석을 달 경우 매개변수가 무엇인지 자동설명됨
	
	/**
	 * 마지막 위치에 곡 추가
	 * @param music
	 */
	public void addAtLast(Music music) {
		mList.add(music);
		/*
		public void inputMusicInfo() {
			Scanner sc = new Scanner(System.in);
			System.out.println("마지막 위치에 곡 추가");
			System.out.print("곡명 : ");
			String title = sc.next();
			System.out.print("가수명 : ");
			String singer = sc.next();
			Music music = new Music(title, singer);
			==============================MusicView코드이동
			mList.add(music);
			==============================MusicFuction코드이동
			System.out.println("[서비스 성공] : 추가 성공!");
		}	
		 */
	}
	/**
	 * 첫 위치에 곡 추가
	 * @param music
	 */
	public void addAtZero(Music music) {
		mList.add(0, music);
	}
	
	/**
	 * 곡 수정하기
	 * @param index
	 * @param music
	 */
	public void updateMusic(int index, Music music) {
		mList.set(index, music);
	}
	
	/**
	 * 곡 삭제하기
	 * @param i
	 */
	// mList에서 삭제
	public void removeMusic(int i) {
		mList.remove(i);
	}
	
	
	/**
	 * 음악전체정보출력
	 * @return mList
	 */
	public List<Music> printMusicList() {
		return mList;
	}
	public List<Music> searchMusicsByName(String title) {
		//찾은 것들을 담을 List를 하나 생성해주어야함
		List<Music> findList = new ArrayList<Music>();
		// 기존 음악이 있는 mList에서 찾기
		for(Music mOne : mList) {
			//입력한 이름이 같으면
			if(mOne.getTitle().equals(title)) {
				//findList에 추가하기
				findList.add(mOne);
			}
		}
		//다 찾으면 찾은 리스트를 리턴
		return findList;
	}
	
	/**
	 * 이름으로 곡 검색하기
	 * @param title
	 * @return
	 */
	// 이름검색 + 삭제를 한번에->추후 재사용성을 위해 다시 나눔
	//	public void removeMusic(String title) {
	//	for(int i = 0; i < mList.size(); i++) {
	//		Music music = mList.get(i);
	//		if(music.getTitle().equals(title)) {
	//			mList.remove(i);
	//			break;
	//		}
	//	}
	//}
	//검색
	public int searchOneByTitle(String title) {
		for(int i = 0; i < mList.size(); i++) {
			Music music = mList.get(i);
			if(music.getTitle().equals(title)) {
				return i;
			}
		}
		return -1;
	}
	
	//오름차순 정렬
	public void bubbleSortByTitleASC() {
		// int [] nums; -> mList로변경필요
		//버블정렬
		for(int i = 0; i < mList.size()-1; i++) {
			for(int j = 0; j < (mList.size()-1)-i; j++) {
				Music mOne = mList.get(j);
				Music mTwo = mList.get(j+1);
				//The operator > is undefined for the argument type(s) java.lang.String, java.lang.String
				//String끼리의 비교에 > 연산자 사용 불가 : compareTo()메소드 사용
				//결과값이 0이면 동일, 
				// 양수값이면 왼쪽이 순서가 더 큼
				// 음수값이면 왼쪽이 순서가 작음
				if(mOne.getTitle().compareTo(mTwo.getTitle()) > 0) {
					Music temp = mOne;
					mList.set(j, mTwo);
					mList.set(j+1, temp);
				}
			}
		}
	}
	public void insertionSortByTitleASC() {
		//삽입정렬
		//String끼리의 비교에 > 연산자 사용 불가 : compareTo()메소드 사용
		//결과값이 0이면 동일, 
		// 양수값이면 왼쪽이 순서가 더 큼
		// 음수값이면 왼쪽이 순서가 작음
		for(int i = 1; i < mList.size(); i++) {
			for(int j = 1; j > 0; j--) {
				Music mOne = mList.get(j-1);
				Music mTwo = mList.get(j);
				if(mOne.getTitle().compareTo(mTwo.getTitle()) > 0) {
					Music temp = mTwo;
					mList.set(j-1, mOne);
					mList.set(j, temp);
				}
			}		
		}
		
		
	}
	
	public void SelectionSortByTitle() {
		
	}
	
	//곡명 내림차순
	public void bubbleSortByTitleDESC() {
		//버블정렬
		for(int i = 0; i < mList.size()-1; i++) {
			for(int j = 0; j < (mList.size()-1)-i; j++) {
				Music mOne = mList.get(j);
				Music mTwo = mList.get(j+1);
				//음수가 되었을 때 정렬
				if(mOne.getTitle().compareTo(mTwo.getTitle()) < 0) {
					Music temp = mOne;
					mList.set(j, mTwo);
					mList.set(j+1, temp);
				}
			}
		}
	}
	
	//가수명 오름차순
	public void bubbleSortBySingerASC() {
		//버블정렬
		for(int i = 0; i < mList.size()-1; i++) {
			for(int j = 0; j < (mList.size()-1)-i; j++) {
				Music mOne = mList.get(j);
				Music mTwo = mList.get(j+1);
				//음수가 되었을 때 정렬
				if(mOne.getTitle().compareTo(mTwo.getTitle()) > 0) {
					Music temp = mOne;
					mList.set(j, mTwo);
					mList.set(j+1, temp);
				}
			}
		}
	}
	
	//가수명 내림차순
		public void bubbleSortBySingerDESC() {
			//버블정렬
			for(int i = 0; i < mList.size()-1; i++) {
				for(int j = 0; j < (mList.size()-1)-i; j++) {
					Music mOne = mList.get(j);
					Music mTwo = mList.get(j+1);
					//음수가 되었을 때 정렬
					if(mOne.getTitle().compareTo(mTwo.getTitle()) < 0) {
						Music temp = mOne;
						mList.set(j, mTwo);
						mList.set(j+1, temp);
					}
				}
			}
		}
}

	
	
	
	

