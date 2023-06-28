package com.kh.day02.loop.exercise;

import java.util.Scanner;

public class Exercise_Calculator {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//무한반복
		//for(;;) {} 
		// while(true){}
		int count = 0; //count변수 선언
		for(;;) {
			System.out.print("정수 하나 입력 : ");
			int num1 = sc.nextInt();
			
			System.out.print("정수 하나 더 입력 : ");
			int num2 = sc.nextInt();
			
			System.out.print("연산자 입력(+,-,*,/,%) : ");
			char operator = sc.next().charAt(0);
			int result = 0;
			switch (operator) {
			case '+' : result = num1 + num2; break;
			case '-' : result = num1 - num2; break;
			case '*' : result = num1 * num2; break;
			case '/' : result = num1 / num2; break;
			case '%' : result = num1 % num2; break;
			}
			System.out.println(num1 + " "+operator + " "+num2+" = "+result);
			count++;
			if(count == 3) break; 
			// 무한반복 for문으로 시작했지만 break조건으로 3일때 반복문을 종료하도록 함.
			// break;를 더블클릭하면 대상이 되는 for문이 선택됨.
		}
	}
}
	
	
//연산		
//		System.out.print("정수 하나 입력 : ");
//		Scanner sc1 = new Scanner(System.in);
//		int input1 = sc1.nextInt();
//		
//		System.out.print("정수 하나 더 입력 : ");
//		Scanner sc2 = new Scanner(System.in);
//		int input2 = sc2.nextInt();
//		
//		System.out.print("연산자 입력(+,-,*,/,%) : ");
//		Scanner sc3 = new Scanner(System.in);
//		String input3 = sc2.next();
//		int result = 0;
//		switch (input3) {
//		case "+" : result = input1 + input2; break;
//		case "-" : result = input1 - input2; break;
//		case "*" : result = input1 * input2; break;
//		case "/" : result = input1 / input2; break;
//		case "%" : result = input1 % input2; break;
//		}
//		
//		System.out.println(input1 + " "+input3 + " "+input2+" = "+result);
//	}

