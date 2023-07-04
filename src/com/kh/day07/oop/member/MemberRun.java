package com.kh.day07.oop.member;

import java.util.Scanner;

public class MemberRun {
	//전역변수 index를 사용해 한개씩 입력받을 수 있음
	//for문을 사용하면 한번에 입력
	
	public static void main(String[] args) {
		MemberFunction mFunc = new MemberFunction();
		finish:
		while(true) {
			int choice = mFunc.printMenu();
			switch(choice) {
			case 1:
				mFunc.inputInfo(); 
				break;
			case 2:
				mFunc.printInfo();
				break;

			case 3:
				System.out.println("프로그램이 종료되었습니다.");
				break finish;
				
			default :
				System.out.println("해당 메뉴는 존재하지 않습니다.");
				break;
			}
	
			// Member : 생성자, 필드에 관한 정의 클래스
			// MemberRun : main메소드의 실행 클래스->정의된 메소드를 호출
			// MemberFunction : 메소드 정의 클래스
			// 세가지의 클래스파일을 나눠서 기능을 따로하게 함.
		}
	}

	
	
	
	
	
	



}
