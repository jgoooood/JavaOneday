package com.kh.day02.operator.exercise;

import java.util.Scanner;

public class Exercise_Logical1 {
	public static void main(String [] args)
	{
		//입력한 정수가 1~100사이의 숫자인지 확인하세요
		//변수 num에 초기화
		//1부터 100사이의 숫자인가 ? true
		System.out.print("숫자를 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		boolean result = (num >= 1 && num <= 100);
		System.out.println("1부터 100사이의 숫자인가? : " + result);
	}
}
