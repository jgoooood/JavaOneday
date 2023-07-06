package com.kh.day09.javaapi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Exam_Date {

	public static void main(String[] args) {
		//Date패키지는 java.sql(JDBC할 때 사용할 것 지금사용X) / java.util 두 개가 있음
		//Date는 오라클의 sysdate와 똑같음 실행 당시 시간 출력 Thu Jul 06 15:19:08 KST 2023	
		Date date = new Date(); 
		System.out.println(date); 
		SimpleDateFormat trans = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		SimpleDateFormat trans2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SS");
		//String으로 일 때만 내가 원하는 형태로 바꿀 수 있음
		String transDate1 = trans.format(date);
		String transDate2 = trans2.format(date);
		System.out.println("형식 변환1 : " + transDate1);
		System.out.println("형식 변환2 : " + transDate2);
		
		// =========================== 권장사항 ===========================
		//Calandar클래는 추상클래스임 -> 나라마다 달력이 다르기 때문에 각자에 맞게 오버라이딩해서 사용하게 함
		Calendar calendar = new GregorianCalendar();
//		부모타입의 변수로 자식 객체를 다룸->업캐스팅
		System.out.println(calendar.getTime());
		String changed = trans2.format(calendar.getTime());
		System.out.println("그레고리안 달력 날짜 변환 : " + changed);
	}

}
