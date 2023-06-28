package com.kh.day02.random;

import java.util.Random;

public class Exam_Random {
	public static void main(String[] args) 
	{
		//js : Math.random()
		//스캐너처럼 랜덤도 임포트 해주어야함.
		Random rand = new Random();
		for(int i = 0; i < 10; i++) {
			// nextInt(n) -> 0부터 n-1까지 랜덤한 수 리턴
			//System.out.println(rand.nextInt(10));
			// 1부터 10까지의 수 중 랜덤한 값을 출력하고 싶으면?
			// 0 부터 9까지 -> nextInt(10)
			// 1 부터 10까지 -> nextInt(10)+1;
			// 0부터 10사이 ->  nextInt(11)
			// 25부터 35사이 -> nextInt(11)+25;
			System.out.println(rand.nextInt(11)+25);
		}
		
	}
}
