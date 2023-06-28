package com.kh.day02.loop.exercise;

public class Exercise_ForDouble1 {
	public static void main(String [] args) 
	{
		
		//구구단 출력
		// System.out.println("2단");
		// for(int h = 1; h < 10; h++) {
		//	System.out.println("2 * " + h + " = " + 2*h);
		// }
		//		
		// System.out.println("3단");
		// for(int h = 1; h < 10; h++) {
		// 	System.out.println("3 * " + h + " = " + 3*h);
		// }
		//		
		// System.out.println("4단");
		// for(int h = 1; h < 10; h++) {
		// 	System.out.println("4 * " + h + " = " + 4*h);
		// }
		
		
		//		반복문
//		for(int k = 2; k < 10; k++) {
//			System.out.println(k + "단"); 
//			for(int h = 1; h < 10; h++) {
//				System.out.println(k + " * " + h + " = " + k*h);
//			}	
//		}
		
		//중첩for문 1. 띄어쓰기 되게 출력
//		System.out.print("2 * 1 = 2\t");
//		System.out.print("3 * 1 = 3\t");
//		System.out.print("4 * 1 = 4\t");
//		System.out.print("5 * 1 = 5\t");
//		System.out.print("6 * 1 = 6\t");
//		System.out.print("7 * 1 = 7\t");
//		System.out.print("8 * 1 = 8\t");
//		System.out.print("9 * 1 = 9\t");
//		System.out.println();
//		System.out.print("2 * 2 = 4\t");
//		System.out.print("3 * 2 = 6\t");
//		System.out.print("4 * 2 = 8\t");
//		System.out.print("5 * 2 = 10\t");
//		System.out.print("6 * 2 = 12\t");
//		System.out.print("7 * 2 = 14\t");
//		System.out.print("8 * 2 = 16\t");
//		System.out.print("9 * 2 = 18\t");
		
		//중첩for문 2. 규칙찾아서 for문으로
		// \t 자리수 맞춰줌
		for(int k =1; k < 10; k++) {
			for(int h = 2; h < 10; h++) {
				System.out.print(h + " * " + k + " = " + h*k + "\t");
			}
			System.out.println();
		}
		
		
	}
}
