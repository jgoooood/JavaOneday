package com.kh.day09.wrapperpkg;

public class Exam_Wrapper {

	public static void main(String[] args) {
		//su = new Integer(0);
		//The constructor Integer(int) has been deprecated since version 9 and marked for removal
		//없어진 기능
		//su = null; null체크 가능
		//Integer는 클래스이지만 new로 생성안하고 static으로 생성됨
		//valueOf <-기울어져 있음(staitc메소드)
		int num = 0;
		Integer su = Integer.valueOf(0);
		//박싱과 언박싱
		su = Integer.valueOf(1026);
		su = 1026; // 오토-박싱
		
		int suNum = su.intValue();
		suNum = su; //오토-언박싱
		
		String openDay = "20230515";
		int openDate = Integer.parseInt(openDay); //문자열을 숫자형으로
		
		System.out.println(Character.toLowerCase('A'));
		//대문자입력->소문자출력
		System.out.println(Character.toUpperCase('a'));
		//소문자입력->대문자출력
		
		char c1 = '4', c2 = 'F';
		if(Character.isDigit(c1)) {
			System.out.println(c1 + "은 숫자");
		}
		if(Character.isAlphabetic(c2)) {
			System.out.println(c2 + "는 영문자");
		}
		
		
	}

}
