package com.kh.day10.collection.music;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.kh.day10.collection.student.Student;


public class MusicFucntion {
	List<Music> mList;
	
	public MusicFucntion () {
		mList = new ArrayList<Music>(); 
	}
	
	//메뉴출력
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== === 메인 메뉴 === ===");
		System.out.println("1. 마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 삭제");
		System.out.println("6. 특정 곡 정보수정");
		System.out.println("7. 곡명 오름차순 정렬");
		System.out.println("8. 곡명 내림차순 정렬");
		System.out.println("9. 가수명 오름차순 정렬");
		System.out.println("10. 가수명 내림차순 정렬");
		System.out.println("0. 종료");
		System.out.print("메뉴 선택 >> ");
		int value = sc.nextInt();
		return value;
	}
	
	//마지막 곡 추가
	public void inputMusicInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("마지막 위치에 곡 추가");
		System.out.print("곡명 : ");
		String title = sc.next();
		System.out.print("가수명 : ");
		String singer = sc.next();
		Music music = new Music(title, singer);
		mList.add(music);
		System.out.println("[서비스 성공] : 추가 성공!");
	}
	
	//첫번째 곡 추가
	public void inputMusicAtFirst() {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 위치에 곡 추가");
		System.out.print("곡명 : ");
		String title = sc.next();
		System.out.print("가수명 : ");
		String singer = sc.next();
		Music music = new Music(title, singer);
		mList.add(0, music); //첫번째 값에 넣겠다는 의미
		System.out.println("[서비스 성공] : 추가 성공!");
	}

	//곡 목록 출력
	public void printAllMusics() {
		System.out.println("====== 전체 곡 목록 출력 ======");

		for(int i = 0; i < mList.size(); i++) {
			Music music = mList.get(i);
			System.out.printf("%d번째 노래 - > 곡명 : %s, 가수명 : %s%n", (i+1),  music.getTitle(), music.getSinger());
		}
		System.out.println("[서비스 성공] : 조회 성공");
		
	}

	//곡 검색
	public void printOneByTitle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 곡 입력 : ");
		String title = sc.nextLine();
		System.out.println("====== 검색 결과 출력 ======");
		for(Music music : mList) {
			if(music.getTitle().equals(title)) {
				System.out.println("검색결과 : " + music.toString());
				break;
			}
		}
		System.out.println("[서비스 성공] : 조회 성공");
	}

	//곡 제거
	public void removeMusicByTitle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 곡 입력 : ");
		String title = sc.nextLine();
		//인덱스로 접근할 때는 for each사용 불가->일반 for문으로
		for(int i = 0; i < mList.size(); i++) {
			Music music = mList.get(i);
			if(music.getTitle().equals(title)) {
				//mList삭제
				mList.remove(i);
				break;
			}
		}
		System.out.println("[서비스 성공] : 삭제 성공!");
	}
	
	
	//곡 수정
	public void modifyMusicInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 곡 입력 : ");
		String title = sc.nextLine();
		System.out.print("수정할 정보 입력(곡명) : ");
		String modTitle = sc.nextLine();
		System.out.print("수정할 정보 입력(가수명) : ");
		String modSinger = sc.nextLine();
		Music modMusic = new Music(modTitle, modSinger);
		for(int i = 0; i < mList.size(); i++) {
			Music music = mList.get(i);
			if(music.getTitle().equals(title)) {
				mList.set(i, modMusic);
			}
		}
		
		
		
	}
}
