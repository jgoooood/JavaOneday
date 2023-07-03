package com.kh.day02.condition.excercise;

import java.util.Scanner;

public class Exercise_if1 {
	public static void main(String [] args)
	{
//		//점수와 학년을 입력 받아 60점 이상이면 합격, 
//		//미만이면 불합격을 출력한다. 4학년의 경우 70점 이상이어야 합격이다.
//		System.out.println ("학년을 입력하세요 : ");
//		Scanner sc1 = new Scanner(System.in);
//		int grade = sc1.nextInt();
//		
//		System.out.println("점수를 입력하세요 : ");
//		Scanner sc2 = new Scanner(System.in);
//		int score = sc1.nextInt();
//		
// 내가 작성한 코드		
//		if (grade == 4) {
//			if (score >= 70) {
//				System.out.println ("합격입니다");
//			} else {
//				System.out.println ("불합격입니다");
//			}
//		}  else {
//			if (score >= 60) {
//				System.out.println ("합격입니다");
//			} else {
//				System.out.println ("불합격입니다");
//			}
//		}
//		
//		//다른 조건식2
		if(score >= 60) {
			if(grade != 4) {
				System.out.println ("합격입니다");
			} else if (score >= 70 ) {
				System.out.println ("합격입니다");
			}
		} else {
			System.out.println ("불합격입니다");
		}
		
		//다른 조건식1
		if(score >= 60 && grade < 4) {
			System.out.println ("합격입니다");
		} else if(score >= 70 && grade == 4) {
			System.out.println ("합격입니다");
		} else {
			System.out.println ("불합격입니다");
		}	
	}
}
