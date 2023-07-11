package com.kh.day12.music.view;

import java.util.List;
import java.util.Scanner;

import com.kh.day12.music.model.vo.Music;

//출력하는 용도로 사용
public class MusicView {
	
	public int musicMenu() {
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
	//반환타입을 Music으로 설정해 객체를 리턴함
	public Music inputMusicInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("곡명 : ");
		String title = sc.nextLine();
		System.out.print("가수명 : ");
		String singer = sc.nextLine();
		Music music = new Music(title, singer);
		return music;
	/*
	public void inputMusicInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("마지막 위치에 곡 추가");
		System.out.print("곡명 : ");
		String title = sc.next();
		System.out.print("가수명 : ");
		String singer = sc.next();
		Music music = new Music(title, singer);
		==============================MusicView
		mList.add(music);
		==============================MusicFuction
		System.out.println("[서비스 성공] : 추가 성공!");
	}	
	 */
	}
	
	//검색, 삭제할 곡 입력받기
	public String inputMusicName(String category) {
		Scanner sc = new Scanner(System.in);
		System.out.print(category+"검색할 곡 입력 : ");
		String title = sc.nextLine();
		return title;
	}

	
	//수정할 곡 입력받기
	public Music modifyMusicInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("곡명 : ");
		String title = sc.nextLine();
		System.out.print("가수명 : ");
		String singer = sc.nextLine();
		Music music = new Music(title, singer);
		return music;
	}
	
	//전체목록출력
	public void showAllMusicList(List<Music> allList) {
		System.out.println("======= 전체 곡 목록 출력 =======");
		int count = 1;
		// for(int i = 0; i < allList.size(); i++) {
		// for each문 사용
		for(Music music : allList) {
			System.out.printf("%d번째 노래 - 곡명 : %s, 가수명 : %s\n"
					, count++
					, music.getTitle()
					, music.getSinger());
		}
	}
	
	//결과메시지
	//매개변수로 문자열을 받아 하나의 메소드로 여러 메시지 출력->위치, 조회내용 등을 매개변수로
	public void displaySuccess(String msg) {
		System.out.println("[서비스 성공] " + msg);
	}
	public void displayError(String msg) {
		System.out.println("[서비스 실패] " + msg);
	}
	public void printMessage (String message) {
		System.out.println(message);
	}

}
