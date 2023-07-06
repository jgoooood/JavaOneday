package com.kh.day09.javaapi;

import java.util.StringTokenizer;

public class Exam_StringTokenizer {
	public static void main(String[] args) {
		String query = "name=kite&addr=seoul&age=21";
		//&기준으로 자름->배열이기때문에 인덱스로 접근
//		String [] words = query.split("&");
		
		// StringTokenizer 클래스를 생성해 문자열 자름
		// 인덱스를 신경안쓰고 해당 문자열이 있는지 확인하고 있다면 모두 자름
		StringTokenizer st = new StringTokenizer(query, "&=");
		while(st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
		
	}
}
