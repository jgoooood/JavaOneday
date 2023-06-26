package com.kh.day01.basic;

public class Exam_Constant {
	public static void main(String [] args) 
	{
		//final이 없으면 변수, final을 붙여서 상수가 된 것
		final double PI = 3.14; 
		
		double radius = 10.0;
		double circleArea = radius * radius * PI; //원 넓이
		
		System.out.println("원의 면적 : " + circleArea);
		
		
		
		char a = 'A';
		char b = 'B';
		System.out.println(a+b); 
		// 출력값 : 131 -> 문자 A(65)와 B(66)를 아스키코드로 바꾸어 연산처리함
		
		
	}
}
