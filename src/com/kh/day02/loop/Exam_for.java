package com.kh.day02.loop;

public class Exam_for {
	public static void main (String [] args) 
	{
		// 1. For문
//		for ( int i = 0; i < 10; i++) {
//			System.out.print((i+1) + " ");
//		}
		// 2. While문
//		int i = 0;
//		while (i < 10) {
//			System.out.print((i+1) + " ");
//			i++;
//		}
		// 3. do~while문 : 실행 먼저 해야할 일이 있을 때 사용
		int i = 0;
		do {
			System.out.print((i+1) + " ");
			i++;
		} while (i < 10);
	}
}
