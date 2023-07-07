package com.kh.day10.collection.student;

public class StudentRun {
	public static void main(String[] args) {
		StudentFucntion sFunc = new StudentFucntion();
		end :
			while(true) {
				//메뉴출력
				//메뉴선택
				int choice = sFunc.printMenu();
				//메뉴에 따라 기능 구현
				switch(choice) {
				case 1: sFunc.inputInfo(); break;
				case 2: sFunc.serchInfoByName(); break;
				case 3: sFunc.printInfo(); break;
				case 4: sFunc.checkPass(); break;
				case 5: System.out.println("프로그램이 종료되었습니다."); break end;
				}
			}
	}
}
