package com.kh.day02.loop.exercise;

public class Exercise_ForDouble3 {
	public static void main(String [] args)
	{
//		int count = 0;
//		for (int i = 0; i < 10; i++) {
//			for (int j = 1; j <= count; j++) {
//				System.out.print("*");
//			}
//			count++;
//			System.out.println(" ");
//		} 
		
		// 1. 별 10개가 나란히 출력됨.
//		for (int a = 1; a <= 10; a++) {
//			System.out.print("*");
//		}
		
		// 2. 별 10개가 10번 출력되도록 함.
//		for (int b = 1; b <= 10; b++) {
//			for (int a = 1; a <= 10; a++) {
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}
		
		// 3. 10번을 변수로
		for (int b = 1; b <= 10; b++) {
			for (int a = 1; a <= 10; a++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
				
	}
}
