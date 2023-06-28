package com.kh.day02.loop.exercise;

public class Exercise_While2 {
	public static void main (String [] args) 
	{
		// While문을 이용하여 1 ~ 100 사이의 홀수의 합을 출력하시오.
		// i값을 1로 초기화 후 +2씩 더하기 : 1일 때 3, 2일 때 4
		int i = 0;
		int sum = 0;
		while(i < 100) {
			sum += i;
			i += 2;
		}

/*
 		1. i++를 먼저 증가시킨 후 조건을 확인하여 홀수인 경우에만 sum에 더함
 		-> while 루프로 돌아가서 조건을 확인
 		
		int i = 0;
		int sum = 0;
		
		while(i <= 100) {
			i++;
			if(i % 2 == 1) {
				if(i > 100) break;
				sum += i;
			}
		}
		System.out.println(sum);
		
		
		2. 조건을 먼저 확인한 후에 i를 1증가 시킴
		->i가 홀수일 때 sum에 더한 후에 바로 i를 1증가시키고 다음 숫자 확인
		->while 루프로 돌아가서 조건 확인.
		 
		int i = 0;
		int sum = 0;
		
		while(i <= 100) {
			if(i % 2 == 1) {
				if(i > 100) break;
				sum += i;
			}
			i++;
		}
		System.out.println(sum);
		
*/
	}
}
