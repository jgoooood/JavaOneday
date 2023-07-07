package com.kh.day10.collection.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentFucntion {
//	Student [] students;
//	int index;
//	ArrayList사용 : 배열처럼 인덱스를 상관없이 데이터삽입
	List<Student> stdList;

	public StudentFucntion() {
		//학생들의 정보를 담을 배열 생성
//		students = new Student[100];
//		index = 0;
		stdList = new ArrayList<Student>();
	}
	public int printMenu() { 
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 성적관리 프로그램");
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 학생 정보 이름 검색 ");
		System.out.println("3. 학생 정보 출력");
		System.out.println("4. 재평가 대상 여부 확인");
		System.out.println("5. 프로그램 종료");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		//입력받은 값을 choice변수에 저장 후 그 값을 리턴
		//실행클래스에서 똑같이 받아 스위치문과 연결
		return choice; 
	}
	
	public void inputInfo () {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 정보 입력");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("1차 점수 : ");
		int score1 = sc.nextInt();
		System.out.print("2차 점수 : ");
		int score2 = sc.nextInt();
		Student std = new Student(name, score1, score2);
		stdList.add(std);
//		students[index] = std;
//		index++;
	}
	
	public void serchInfoByName() {
		System.out.println("학생 정보 이름 검색");
		Scanner sc = new Scanner(System.in);
		//검색할 이름 입력받아서 값 찾기
		System.out.println("검색할 이름 : ");
		String searchName = sc.next();
		for(Student std : stdList) {
			if(std.getName().equals(searchName)) {
				System.out.println(std.toString());
				break;
			}
		}
	}
	
	public void printInfo () {
		//인덱스를 신경쓰는 for문
//		for(int i = 0; i < index; i++) {
//			System.out.println(students[i].getName()+ "/ ");
//		}
//		for(int i = 0; i < stdList.size(); i++) {
//			//System.out.println(stdList.get[i].getName()+ "/ ");
//			System.out.println(stdList.get[i].toString());
//		}
		
		//인덱스 x for each : stdList의 값들을 변수 student에 모두 넣어줌
		System.out.println("학생 정보 전체 출력");
		for(Student student : stdList) {
			System.out.println(student.toString()); //toString은 출력용이 아닌 확인용
		}
		
	}
	public void checkPass () {
		for(Student student : stdList) {
			int score1 = student.getScore1();
			int score2 = student.getScore2();
			
		}
	}
}
