package com.kh.day04.exercaise;

import java.util.Scanner;

public class Excercise_ScoreProgram {
	public static void main (String[] args) 
	{
		int kor = 0;
		int eng = 0;
		int math = 0;
		finish : 
		while(true) {
			Scanner sc = new Scanner(System.in);
//			====== 메인 메뉴 ======
//					1. 성적입력
//					2. 성적출력
//					3. 종료
//					선택 : 1
			System.out.println("====== 메인 메뉴 ======");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.print("선택 : ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1: 
//				====== 성적 입력 =======
//				국어 : 100
//				영어 : 90
//				수학 : 80
				System.out.println("====== 성적 입력 ======"); 
				System.out.print("국어 : ");
				kor = sc.nextInt();
				System.out.print("영어 : ");
				eng = sc.nextInt();
				System.out.print("수학 : ");
				math = sc.nextInt();
				break;
			case 2: 
//				====== 성적 출력 ======
//				국어 : 100
//				영어 : 90
//				수학 : 80
//				총점 : 270
//				평균 : 90.00		
				System.out.println("====== 성적 출력 ======"); 
				System.out.printf("국어 : %d\n", kor);
				System.out.printf("영어 : %d\n", eng);
				System.out.printf("수학 : %d\n", math);
				System.out.printf("총점 : %d\n", kor + eng + math);
				System.out.println("평균 : %.2f\n" + (double)(kor + eng + math)/3);
				break;
			
			case 3: 
				System.out.println("프로그램이 종료되었습니다."); 
				break finish; //break가 스위치문이 아닌 while문을 타겟으로 break함
				// break finish; 를 쓰고 나올 반복문위에 finish : 를 써줌
			default : System.out.print("잘못입력하셨습니다. 메뉴를 선택해주세요.");
			}
		}
	}
}
