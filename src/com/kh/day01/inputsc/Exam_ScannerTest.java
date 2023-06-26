package com.kh.day01.inputsc;

import java.io.IOException;
import java.util.Scanner;

public class Exam_ScannerTest {
	public static void main (String [] args) throws Exception
	{
		//System.out.println("가이드메시지");
		//System.out.println(System.in.read());
		//System.in.read() : 입력을 받음
		// a 입력 -> 97 출력 / A 입력 -> 65출력

		//---------------입력받기 시작(1)---------------
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요.");
		//sc는 변수명이기 때문에 내가 원하는 것으로 설정하면 됨.
		Scanner sc = new Scanner(System.in);
		
		//System.out.print("이름을 입력하세요 : ");
		String name = sc.next(); //문자열 읽기
		
		//System.out.print("도시를 입력하세요 : ");
		String city = sc.next();
		
		//System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		//System.out.print("체중을 입력하세요 : ");
		double weight = sc.nextDouble();
		
		//System.out.print("싱글입니까? : ");
		boolean singleYN = sc.nextBoolean();
		//---------------여기까지 입력받기 완료---------------
		
		//---------------입력받은 값 출력하기---------------
		//변수로 하나하나 값 저장해서 한줄한줄 출력
//		System.out.println("이름 : " + name);
//		System.out.println("도시 : " + city);
//		System.out.println("나이 : " + age);
//		System.out.println("체중 : " + weight);
//		System.out.println("싱글여부 : " + singleYN);
		//---------------문장처럼 한줄로 출력하기---------------
		//한번에 띄어쓰기로 입력받아 한줄로 출력
		System.out.println("이름은 " + name +", 도시는 " + city + ", 나이는 " + age + "살, 체중은 " + weight + "kg, 싱글여부는 " + singleYN + "입니다.");
		
		
	
		
		
		
		
		
	}
}
