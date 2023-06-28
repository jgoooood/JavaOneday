package com.kh.day02.operator.exercise;

import java.util.Scanner;

public class Exercise_Logical2 {
	public static void main (String [] args)
	{
		// 입력받은 문자가 대문자인지 소문자인지 확인하세요!
		// 변수word에 초기화
		// 영어 대문자 확인 : true
		System.out.println("문자를 입력해 주세요 : ");
		Scanner sc = new Scanner(System.in);
		
		//String words = sc.next();
		//System.out.println("문자열 확인 : " + words);
		
		// 문자열에서 charAt(0) 첫번째 인덱스를 잘라 넣음->문자가 됨
		char word = sc.next().charAt(0);
		System.out.println("문자출력 : " + word);
		//대문자인지 확인
		//문자를 비교연산자에 넣게되면 숫자가 됨->아스키코드
		boolean result = (word >= 'A') && (word <= 'Z');
		System.out.println("영어 대문자 확인 : " + result);
	}
}
