package com.kh.day04.myexception.exercise;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception {
	public void exercise1() {
		// 정수를 0으로 나누는 경우에 "0으로 나눌 수 없습니다!"를 출력하고
		// 다시 입력받는 프로그램을 작성하여라.
		//1. 두 개를 입력받음
//		Scanner sc = new Scanner(System.in);
//		//무한반복문 for(;;){} / while(true){}
//		for(;;) {
//			System.out.println("정수 하나 입력");
//			int num1 = sc.nextInt();
//			System.out.println("정수 하나 더 입력");
//			int num2 = sc.nextInt();
//			try {
//				int result = num1 / num2;
//				System.out.printf("%d를 %d로 나누면 몫은 %d 입니다.", num1, num2, result);			
//			} catch (ArithmeticException e) {
//				System.out.println("0으로 나눌 수 없습니다.");
//			}			
//		}
		
////		2. 정수를 입력받음
//		Scanner sc = new Scanner(System.in);
//		//무한반복문 for(;;){} / while(true){}
//		while(true) {
//			// 1. num1 cannot be resolved to a variable
			// 두개의 try를 썼기 때문에 전역변수로 선언해주어야함.
//			int num1, num2;
//			// 2. The local variable num1 may not have been initialized
//			num1 = 0;
//			num2 = 0;
//			try {
//				System.out.println("정수 하나 입력");
//				num1 = sc.nextInt();
//				System.out.println("정수 하나 더 입력");
//				num2 = sc.nextInt();
//			} catch (InputMismatchException e) {
//				System.out.println("숫자만 입력해주세요.");
//				sc.next(); // <-입력안하면 무한 반복함 
//			}			
//			try {
//				int result = num1 / num2;
//				System.out.printf("%d를 %d로 나누면 몫은 %d 입니다.", num1, num2, result);
//			}catch (ArithmeticException e) {
//				System.out.println("0으로 나눌 수 없습니다.");
//			}	
//		}
		
		
//		3. 코드수정 : 멀티캐치절로 변경 try는 한번만 씀
//		Scanner sc = new Scanner(System.in);
//		//무한반복문 for(;;){} / while(true){}
//		while(true) {
//			try {
//				System.out.println("정수 하나 입력");
//				int num1 = sc.nextInt();
//				System.out.println("정수 하나 더 입력");
//				int num2 = sc.nextInt();
//				int result = num1 / num2;
//				System.out.printf("%d를 %d로 나누면 몫은 %d 입니다.", num1, num2, result);
//			} catch (ArithmeticException e) {
//				System.out.println("0으로 나눌 수 없습니다.");
//			} catch (InputMismatchException e) {
//				System.out.println("숫자만 입력해주세요.");
//				sc.next(); // <-입력안하면 무한 반복함 
//			}	
//		}
	}
	
	public void pratice2() {
		//3개의 정수를 입력받아 합을 구하는 프로그램을 작성하여라.
		//사용자가 정수가 아닌 문자를 입력할 때 발생하는 InputMismatchException예외를
		//처리하여 다시 입력받도록 하여라
		for(;;) {
			Scanner sc = new Scanner(System.in);
			try {
			System.out.println("정수1 입력 : ");
			int num1 = sc.nextInt();
			System.out.println("정수2 입력 : ");
			int num2 = sc.nextInt();
			System.out.println("정수3 입력 : ");
			int num3 = sc.nextInt();
				int sum = num1 + num2 + num3;
				System.out.println("3개 숫자의 합은 " + sum + "입니다.");			
			} catch(InputMismatchException e) {
				System.out.println("다시 입력해주세요.");
				sc.next();
			}
		}
	}
}
