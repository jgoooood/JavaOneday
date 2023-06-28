package com.kh.day03.array.exercise;

import java.util.Scanner;

public class Exercise_While {
	public void whileExercise1() {
		// while문을 이용하여 -1이 입력될 때까지 정수를 입력받고 -1이 입력되면 
				// 입력한 수의 합을 출력하시오.
				// 정수 하나 입력 : 3
				// 정수 하나 입력 : 4
				// 정수 하나 입력 : 7
				// 정수 하나 입력 : -1
				// 입력하신 수의 합은 14 입니다.
				int input = 0;
				int sum = 0;
				Scanner sc = new Scanner(System.in);
				//for문 무한반복 : for(;;) {}
				while(true) {
					System.out.print("정수 하나 입력 : ");			
					input = sc.nextInt();
					if(input != -1) {
						sum += input;
					}else {
						break;
					}
				} 
				System.out.println("입력하신 수의 합은 : " + sum);

//				방법 2		
//				System.out.println("정수 하나 입력 : ");
//				input = sc.nextInt();
//				while(input != -1) {
//					//더하기
//					System.out.println("정수 하나 입력 : ");
//					input = sc.nextInt();
//				}
//				System.out.println("입력하신 수의 합은 : " + (sum+1));
				
////				방법3 : 가장 직관적임
//				System.out.print("정수 하나 입력 : ");	
//				input = sc.nextInt();
//				while(input != -1) {
//					sum += input;
//					System.out.print("정수 하나 입력 : ");
//					input = sc.nextInt();
//				}
//				System.out.print("입력하신 수의 합은 : " + sum);
//				
	}
	
	public void whileExercise2() {
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
