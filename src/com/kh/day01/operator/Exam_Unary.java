package com.kh.day01.operator;

public class Exam_Unary {
	public static void main(String [] args) 
	{
		//단항 연산자
		int v = 1;
		// 후위연산 : 나중연산 / v를 먼저 출력하고 다음에 더함 1출력
		System.out.println(v++); 
		// <------이 부분에서는 v가 2인 상태-------->
		System.out.println(v);
		// 전위연산 : 먼저연산 / v가 2인 상태에서 먼저 더하고 출력 3출력
		System.out.println(++v); 
		// <------이 부분에서는 v가 3인 상태-------->
		System.out.println(v);
		
		//----------------------------문제1----------------------------
		int a = 10;
		int b = 20;
		int c = 30;
		
		a++; // a : 11, b : 20, c : 30;
		b = (--a) + b; // a : 10, b : 30, c : 30;
		c = (a++) + (--b); // a : 11 , b : 29, c : 39
		System.out.println("a : " + a + ", b : " + b + ", c : " + c);
		
		
		//----------------------------문제2----------------------------
		boolean falg = true;
		System.out.println(!!!!falg); // true 출력
		
		
		
		//----------------------------문제3----------------------------
		int x = 100;
		int y = 33;
		int z = 0;
		
		x--; // x : 99, y : 33, z : 0;
		z = x-- + --y; // 99 + 32 = 131
					   // x : 98, y : 32, z : 131;
		x = 99 + x++ + x; // 99 + 98 + 99
						  // x : 296, y : 32, z : 131
		y = y-- + y + ++y; // 32 + 31 + 32 
						   // x : 296, y : 95, z : 131
		
		System.out.println("x : " + x + ", y : " + y + ", z : "+z);

	}
}
