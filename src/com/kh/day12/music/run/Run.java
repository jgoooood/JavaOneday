package com.kh.day12.music.run;

import java.util.List;
import java.util.Scanner;

import com.kh.day12.music.controller.MusicController;
import com.kh.day12.music.model.vo.Music;
import com.kh.day12.music.view.MusicView;

public class Run {
	public static void main(String[] args) {
		// 기존 MusicFunction의 클래스를 MusicView/MusicController로 나눔
		// 따라서 객체생성도 두번 해주어야 함.
		// MVC 패턴 -> 여러 객체로 나누어 협업
		MusicView view = new MusicView();
		MusicController mController = new MusicController();
		//동작, 구조
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		Music music = null;
		String title = "";
		int index = 0;
		do {
			// 메뉴
			// 두개로 나뉘어진 클래스들의 메소드를 *매개변수*로 연결하여 두 객체가 협업하는 것
			choice = view.musicMenu();
			switch(choice) {
			case 1: 
				music = view.inputMusicInfo(); //입력 메소드로 music변수에 값을 저장
				mController.addAtLast(music);  //추가 메소드
				view.displaySuccess("마지막위치에 추가 성공"); //성공메시지
				break;
			case 2: 
				music = view.inputMusicInfo(); //입력메소드는 똑같으니 새로 만들 필요 없음
				mController.addAtZero(music);
				view.displaySuccess("첫 위치에 추가 성공");
				break;
			case 3: 
				List<Music> allList = mController.printMusicList();
				view.showAllMusicList(allList);
				view.displaySuccess("전체 정보 조회 성공");
				break;
			case 4: 
				title = view.inputMusicName("검색");
				//중복되는 값을 찾기 위해 매개변수는 하나가 아닌 리스트로 받아야함.
				//전체 목록 출력처럼 여러개의 값을 출력할때는 List사용
				List<Music> searchList = mController.searchMusicsByName(title);
				//검색한 결과를 모두 출력->기존에 작성한 메소드를 재사용
				view.showAllMusicList(searchList);
				view.displaySuccess("검색한 '"+title+"' 조회 성공");
				break;
			case 5: 
				//1. 입력받는 메소드 실행 ->검색,삭제 모두 재사용
				//	메소드의 결과값을 변수 title에 저장
				title = view.inputMusicName("삭제");
				//2. 입력받은 값을 매개변수로 전달해 검색 메소드 실행 
				//	 -> 검색결과가 일치하면 인데스값 리턴 / 없으면 -1 리턴
				index = mController.searchOneByTitle(title);
				//3. 인덱스 값 -1이 리턴되면 검색내용이 없기 때문에 오류메시지 출력됨
				if(index == -1) {
					view.displayError("존재하지 않습니다.");
					break;
				}
				//4. 제거메소드 실행 -> 인덱스 값을 매개변수로 전달함
				//	mController.removeMusic(title); 제목보단 인덱스를 매개변수로 전달
				// 한 메소드에 검색,제거를 하기보다는 검색메소드, 제거메소드를 나눠 재사용성을 높이는 것이 좋음
				mController.removeMusic(index);  
				//5. 메시지 출력 메소드 실행
				view.displaySuccess("곡 삭제 성공" );
				break;
			case 6: 
				//수정할 곡 입력 받기
				title = view.inputMusicName("수정");
				//존재여부확인
				index = mController.searchOneByTitle(title);
				if(index == -1) {
					view.displayError("존재하지 않습니다.");
					break;
				}
				//이후 수정하기
				//(1) 수정할 정보 입력받기
				music = view.modifyMusicInfo();
				//(2) 수정하기
				mController.updateMusic(index, music);
				break;
			case 7: 
				view.printMessage("============= 곡명 오름차순 정렬 =============");
				mController.bubbleSortByTitleASC();
				view.displaySuccess("정렬 성공 : 3번을 눌러출력해주세요");
				break;
			case 8: 
				view.printMessage("============= 곡명 내림차순 정렬 =============");
				mController.bubbleSortByTitleDESC();
				view.displaySuccess("정렬 성공 : 3번을 눌러출력해주세요");
				break;
			case 9: 
				view.printMessage("============= 가수명 오름차순 정렬 =============");
				mController.bubbleSortBySingerASC();
				view.displaySuccess("정렬 성공 : 3번을 눌러출력해주세요");
				break;
			case 10: 
				view.printMessage("============= 가수명 내림차순 정렬 =============");
				mController.bubbleSortBySingerDESC();
				view.displaySuccess("정렬 성공 : 3번을 눌러출력해주세요");
				break;
			case 0: view.printMessage("프로그램을 종료합니다."); 
				break;
			default : 
				view.printMessage("잘못 입력하셨습니다.");
				break;
			}
		}while(choice != 0);
	}
}
