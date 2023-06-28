package com.kh.day02.loop.exercise;

public class Exercise_ForDouble2 {
	public static void main (String[] args) 
	{
		System.out.println("0시 0분부터 23시 59분까지 출력하기");
		for(int i = 0; i < 24; i++) {
			for(int j = 0; j < 60; j++) {
				System.out.printf("%2d시 %2d분\n", i, j);
				//println : 개행 여부차이
				//printf : 자리수 맞춰서 출력 (다른방식->형식문자)
				//%자릿수d : digital의 d , 자릿수에 맞춰서 출력됨.
				// \n : 개행
			}
		}
	}
}
