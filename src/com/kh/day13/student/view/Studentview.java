package com.kh.day13.student.view;

import java.util.List;
import java.util.Scanner;

import com.kh.day13.student.model.vo.Student;
//저장하는 부분은 컨트롤러 / 입력은 뷰로
public class Studentview {
	//메뉴출력 메소드
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 성적관리 프로그램");
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 학생 정보 이름 검색 ");
		System.out.println("3. 학생 정보 수정 ");
		System.out.println("4. 학생 정보 삭제(이름) ");
		System.out.println("5. 학생 전체 삭제(전체) ");
		System.out.println("6. 학생 정보 전체 출력");
		System.out.println("7. 재평가 대상 여부 확인");
		System.out.println("8. 프로그램 종료");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		return choice;
	}
	//학생정보입력 메소드
	public Student inputInfo () {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 정보 입력");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("1차 점수 : ");
		int score1 = sc.nextInt();
		System.out.print("2차 점수 : ");
		int score2 = sc.nextInt();
		Student std = new Student(name, score1, score2);
		return std;
	}
	
	//저장된 변수받아서 for문으로 출력->List컬렉션<Student>타입에 저장된 allList를 매개변수로
	public void printInfo(List<Student> stdList) {
		System.out.println("학생 정보 전체 출력");
		for(Student student : stdList) {
			System.out.printf("name : " + student.getName() + ", score1 : "+student.getScore1()+", score2 : "+student.getScore2()+"%n");
		}
	}
}
