package com.kh.day18.music.view;

import java.util.List;
import java.util.Scanner;

import com.kh.day18.music.controller.MusicController;
import com.kh.day18.music.model.vo.Music;

//view->컨트롤러 호출
public class MusicView {
	//필드 -> stack메모리에 저장
	private MusicController mController; //mController참조변수 선언, 초기화는 생성자에서 진행
	
	//필드초기화 : MusicView생성자에서 MusicController객체 생성->MusicController클래스와 연결
	//->참조변수mController에 MusicController의 주소값이 저장
	public MusicView() {
		mController = new MusicController(); 
		//객체를 생성해야지만 heap메모리에 할당됨
	}
	
	
	//프로그램 시작 메소드
	public void startProgram() {
		Music music = null;
		List<Music> mList = null;
		String singer = "";
		int index = 0;
		end:
		while(true) {
			int choice = printMenu();
			switch(choice) {
				case 1 : 
					music = inputMusic(); //inputMusic메소드로 음악등록->music변수에 저장
					mController.addMusic(music); //변수music을 addMusic에 매개변수로 전달해 저장
					break;
				case 2 : 
					singer = inputSinger();
					index = mController.findIndexBySinger(singer);
				
					if(index != -1) { //인덱스가 -1면 실행
						music = mController.findMusicBySinger(singer);
						music = modifyMusic(music);
						mController.modifyMusic(index, music);		 // 곡 수정				
					}
					break;
				case 3 : 
					singer = inputSinger();
					index = mController.findIndexBySinger(singer); //인덱스 값 가져오는 메소드
					if(index != 1) { //-1이 아니면 삭제 진행
						mController.deleteMusic(index); // 인데스를 매개변수로 전달->삭제하는 메소드						
					}
					break;
				case 4 : 
					singer = inputSinger();
					mList = mController.findListBySinger(singer);
					printAllMusics(mList);
					break;
				case 5 : 
					//컨트롤러에서 데이터를 가져와 뷰에서 출력
					mList = mController.allMusicInfo();
					printAllMusics(mList);
					break;
				case 6 : break end;
			}
		}
	}
	

	private Music modifyMusic(Music music) {
		Scanner sc = new Scanner(System.in);
		System.out.print("곡명 : ");
		String title = sc.nextLine();
		System.out.print("가수명 : ");
		String singer = sc.nextLine();
		music.setTitle(title);
		music.setSinger(singer);
		return music;
	}


	//가수명 입력메소드
	private String inputSinger() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가수명 : ");
		String singer = sc.nextLine();
		return singer;
	}
	


	//전체 정보 출력 메소드 (자동생성함)
	private void printAllMusics(List<Music> mList) {
//		for(Music music : mList) 인덱스 신경안쓰는 포 이치문
		for(int i = 0; i < mList.size(); i++) {
			Music music = mList.get(i);
			System.out.printf("%d번째 곡 -> 가수명 : %s\t곡명 : %s\n"
					,(i+1)
					, music.getSinger()
					, music.getTitle());
		}
	}


	//곡정보 입력메소드
	private Music inputMusic() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======= 음악 정보 등록 =======");
		System.out.print("곡명 : ");
		String title = sc.nextLine();
		System.out.print("가수명 : ");
		String singer = sc.nextLine();
		Music music = new Music(title, singer); //객체생성+값 전달을 동시
		return music;
	}


	//메뉴출력 메소드
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======= 음악 관리 프로그램 =======");
		System.out.println("1. 음악 정보 등록");
		System.out.println("2. 음악 정보 수정");
		System.out.println("3. 음악 정보 삭제");
		System.out.println("4. 음악 정보 출력(가수명)");
		System.out.println("5. 음악 정보 전체 출력");
		System.out.println("6. 프로그램 종료");
		System.out.print("선택 : ");
		int number = sc.nextInt();
		return number;
	}
	
	
	
}
