package com.kh.day06.oop.exercise;

import java.util.Scanner;

//성적관리 프로그램 -> 기능별로 함수로 묶기->함수호출
public class Excercise_ScoreProgram {
	//전역변수로 선언
	static int index = 0;
	//Student객체를 생성해 stdOne변수에 저장
	public static void main (String[] args) 
	{
		//기본객체 생성
		//Student stdOne = new Student();
		//객체를 배열로 생성
		Student [] stds = new Student[3];
		//하나씩 입력받기 위해서는 변수를 따로 사용해야함
		finish : 
		while(true) {
			Scanner sc = new Scanner(System.in);
			printMenu();
			int choice = sc.nextInt();
			switch(choice) {
				case 1: 
					//함수의 매개변수로 객체입력
					//inputScore(stdOne);
					// java.lang.NullPointerException: Cannot assign field "name" because "stds[0]" is null
					// 객체생성안한상태에서 input하려고 하기 때문에 오류발생->for문으로 생성해주어야함.
					inputScore(stds);
					break;
				case 2: 
					//출력할 때 객체의 값을 가져와 출력
					//printScore(stdOne);
					printScore(stds);
					break;
				case 3: 
					showGoodBye();
					break finish; 
				default : printException();
			}
		}
	}
	
	public static void printMenu() {
//		====== 메인 메뉴 ======
//		1. 성적입력
//		2. 성적출력
//		3. 종료
//		선택 : 1
		System.out.println("====== 메인 메뉴 ======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
	}
	
	//inputScore의 함수를 호출할 때 kor, eng, math의 입력값을 stdOne의 매개변수로 전달하도록 함
	//public static void inputScore(Student stdOne) {
	//for문으로입력받을때
	//public static void inputScore(Student [] stds) {
	//한개씩 입력받을 때
	public static void inputScore(Student [] stds) {
//		====== 성적 입력 =======
//		국어 : 100
//		영어 : 90
//		수학 : 80
		Scanner sc = new Scanner(System.in);
// 		index변수를 사용->하나씩 저장함
		stds[index] = new Student();
		System.out.println("====== 이름 입력 ======");
		System.out.print("이름 : ");
		// 문자열 입력받는 메소드 : next(), nextLine()
		// next() : 공백없는 문자열 ex. 이름, ...
		// nextLine() : 공백있는 문자열 ex. 주소, ... : 엔터를 치면 그 엔터를 공백으로 인식
		//				->엔터를 제거해주는 nextLine 개행입력을 다시 한번 더 사용
		stds[index].name = sc.next();
		System.out.println("====== 성적 입력 ======"); 
		System.out.print("국어 : ");
		stds[index].kor = sc.nextInt();
		System.out.print("영어 : ");
		stds[index].eng = sc.nextInt();	
		System.out.print("수학 : ");
		stds[index].math = sc.nextInt();
		sc.nextLine(); //개행입력 받아줌
		//인덱스가 [0][1][2] 이므로 렝스-1로 조건식 변경->index가 0부터 하나씩증가함
		if(index < stds.length-1) index++;



		//for문으로 객체배열 생성 + 배열에 값 입력
		//객체생성 사용하지 않으면 NullPointerException 에러발생 -> 객체를 생성하지 않았기 때문
		//배열의 길이 만큼 꼭 객체를 생성해주고 값을 기입해야 에러발생안함
//		for(int i = 0; i < stds.length; i++) {
//			stds[i] = new Student();
//			System.out.println("====== 이름 입력 ======");
//			System.out.print("이름 : ");
//			stds[i].name = sc.next();
//			System.out.println("====== 성적 입력 ======"); 
//			System.out.print("국어 : ");
//			stds[i].kor = sc.nextInt();
//			System.out.print("영어 : ");
//			stds[i].eng = sc.nextInt();	
//			System.out.print("수학 : ");
//			stds[i].math = sc.nextInt();
//		}
		
		
		
//		System.out.println("====== 이름 입력 ======");
//		System.out.print("이름 : ");
//		stds[0].name = sc.next();
//		System.out.println("====== 성적 입력 ======"); 
//		System.out.print("국어 : ");
//		stds[0].kor = sc.nextInt();		 //stdOne.kor = sc.nextInt();
//		System.out.print("영어 : ");
//		stds[0].eng = sc.nextInt();		//stdOne.eng = sc.nextInt();
//		System.out.print("수학 : ");
//		stds[0].math = sc.nextInt(); 	//stdOne.math = sc.nextInt();
	}
	
	//printScore의 함수를 호출할 때 stdOne의 값을 가져와 출력
	//public static void printScore(Student stdOne) {
	public static void printScore(Student [] stds) {
//		====== 성적 출력 ======
//		국어 : 100
//		영어 : 90
//		수학 : 80
//		총점 : 270
//		평균 : 90.00	
		//위에서 선언한 인덱스로 출력
		for(int i = 0; i <= index; i++) {
			System.out.println("====== 성적 출력 ======"); 
			System.out.printf("이름 : %s\n", stds[i].name);
			System.out.printf("국어 : %d\n", stds[i].kor);
			System.out.printf("영어 : %d\n", stds[i].eng);
			System.out.printf("수학 : %d\n", stds[i].math);
			System.out.printf("총점 : %d\n", stds[i].getTotal());
			System.out.printf("평균 : %.2f\n", stds[i].getAvg());
		}
		
		
		
//		//for문으로 배열출력
//		for(int i = 0; i < stds.length; i++) {
//			System.out.println("====== 성적 출력 ======"); 
//			System.out.printf("이름 : %s\n", stds[i].name);
//			System.out.printf("국어 : %d\n", stds[i].kor);
//			System.out.printf("영어 : %d\n", stds[i].eng);
//			System.out.printf("수학 : %d\n", stds[i].math);
//			System.out.printf("총점 : %d\n", stds[i].getTotal());
//			System.out.printf("평균 : %.2f\n", stds[i].getAvg());
//		}
				
		//기본객체
//		System.out.printf("국어 : %d\n", stdOne.kor);
//		System.out.printf("영어 : %d\n", stdOne.eng);
//		System.out.printf("수학 : %d\n", stdOne.math);
		//배열출력
//		System.out.printf("이름 : %s\n", stds[0].name);
//		System.out.printf("국어 : %d\n", stds[0].kor);
//		System.out.printf("영어 : %d\n", stds[0].eng);
//		System.out.printf("수학 : %d\n", stds[0].math);
		//System.out.printf("총점 : %d\n", kor + eng + math);
		//System.out.printf("평균 : %.2f\n", (double)(kor + eng + math)/3);
	}
	
	public static void showGoodBye() {
		System.out.println("프로그램이 종료되었습니다."); 
	}
	
	public static void printException() {
		System.out.println("잘못입력하셨습니다. 메뉴를 선택해주세요.");
	}
}
