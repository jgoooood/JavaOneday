package com.kh.day09.javaapi;

public class Exam_StringBuffer {
	public static void main(String[] args) {
		// StringBuffer : 문자열을 연결해주는 클래스
		// 문자열을 연결해주는 메소드 concat과 같은 역할을 함
		String data1 = "Hello";
		String data2 = " ";
		String data3 = "JAVA";
		// 메소드 체이닝
		// data1 = data1.concat(data2).concat(data3);
		System.out.println("concat 연결 : " + data1);
		
		String result = data1 + data2 + data3;
		System.out.println("+ 연결 : " + result);
		
		//아래와 같은 방식은 메모리 낭비가 덜함
		StringBuffer stb = new StringBuffer();
		//메소드 체이닝
		stb.append(data1).append(data2).append(data3);
		System.out.println("연결된 문자열 : " + stb.toString());
	}
}
