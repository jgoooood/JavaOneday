package com.kh.day01.basic;

public class Exam_DataType {
	public static void main (String[] args) 
	{
		// 기본형
		// boolean 불린 1byte // char 문자 2byte // byte 1byte, short 2byte, int 4byte, long 8byte 정수 
		// float 4byte, double 8byte 실수
		// 참조형
		// String
		
		boolean result = true;
		
		char fChar = 'a';
		
		String sStr = "Hello Java";
		
		// ---------------------------------정수part---------------------------------
		//(최대값, 128 기입하면 빨간줄 Type mismatch: cannot convert from int to byte)
		byte bNum = 127;
		short sNum = 32767;
		int iNum = 2147483647;
		long lNum = 2147483648L; //long타입은 접미사 l을 붙여야함, 대소문자 구분x
		
		
		// ---------------------------------실수part---------------------------------
		float fNum = 23.0626f; //접미사 f를 붙여야함 
		double dNum = 23.1026;
		
		
	}
}
