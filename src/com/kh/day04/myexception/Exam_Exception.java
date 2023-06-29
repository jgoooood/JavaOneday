package com.kh.day04.myexception;

import java.util.Scanner;

public class Exam_Exception {
	public static void main(String [] args)
	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 하나 입력 : ");
//		int input1 = sc.nextInt();
//		System.out.println("정수 하나 더 입력 : ");
//		int input2 = sc.nextInt();
//		System.out.println("나눠드릴게요. 조금만 기다리세요.");
//		int result = input1 / input2;
//		System.out.printf("몫은 %d입니다", result);
		
		// 나누는 수를 0일 때 예외 발생->try ~ catch구문 사용
		//Exception in thread "main" java.lang.ArithmeticException: / by zero
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("정수 하나 입력 : ");
			int input1 = sc.nextInt();
			System.out.println("정수 하나 더 입력 : ");
			int input2 = sc.nextInt();
			System.out.println("나눠드릴게요. 조금만 기다리세요.");
			int result = input1 / input2;
			System.out.printf("몫은 %d입니다", result);
			//ArithmeticException e에서 e는 참조변수임 꼭 써주어야 오류발생x
		}catch(ArithmeticException e)
		{
			// 자동완성시 e.printStackTrace();가 나오는데 오류메시지가 나오도록 의도함 
			// e.printStackTrace(); -> 오류메시지 출력
			// System.out.println("0으로 나눌 수 없습니다.");
			// e.getMessage() -> / by zero 출력
			System.out.println(e.getMessage());
		}
		
	}
}
