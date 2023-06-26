package com.kh.day01.typetrans;

public class Exam_typeTrans1 {
	public static void main(String[] args) 
	{
		//int + int 처럼 같은 데이터타입끼리만 연산처리가 가능함
		//int * double은 원래 계산 안되지만 자동형변환이 됨
		int iNum = 10;
		double dNum = 3.14;
		double result = dNum * iNum; //iNum의 10 -> 10.0 자동형변환
		System.out.println("result : " + result);
		//강제형변환은 의도치 않게 혹은 의도해서 데이터손실을 일으킬 수 있음
		System.out.println("강제 형 변환 : " + (int)result); //정수로
		System.out.println("강제 형 변환2 : " + (char)65); //문자로
		
	}
}
