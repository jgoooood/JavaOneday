package com.kh.day09.javaapi;

public class Exam_String {

	public static void main(String[] args) {
		String msg = "Hello Java";
		//내용은 같으나 주소가 달라짐(new를 통해 객체를 생성했기 때문)
		msg = new String("Hello Java");
		//내용비교 equals를 이용하여 값을 비교해야 함
		
		
		// 문자열 메소드
		// 문자열 길이 : length()
		String data1 = new String(" C#");
		String data2 = new String(",C++ ");
//		String에서의 데이터 길이를 구할때는 length() 소괄호가 붙음
		System.out.println(data1 + "의 길이는 "+data1.length());
		System.out.println(data2 + "의 길이는 "+data2.length());
		// 공백도 카운트 됨
		
		// 문자열 포함 : contatins() 해당 문자열이 있는지 검색
		System.out.println("#이 있는가? : " + data1.contains("#"));
		
		// 문자열 연결 : concat()
		data1 = data1.concat(data2); // C#,C++
		System.out.println("연결된 문자열 : " + data1);
		
		// 공백제거 : trim() 공백을 제거해 문자열 자체만 비교할 때 자주 쓰임
		data1 = data1.trim();
		System.out.println("공백 제거 확인 : " + data1);
		
		// 문자열 교체 : replace
		data1 = data1.replace("C#", "JAVA");
		System.out.println("문자열 교체 : " + data1);
		
		// 문자열 분리 : split(); 리턴값이 배열임
		// 원하는 기호를 구분으로 데이터를 나눠서 배열에 순차적으로 집어 넣음
		System.out.println("문자열 분리");
		String [] words = data1.split(",");
		// 인덱스를 알고 있을 때
//		System.out.println(words[0]);
//		System.out.println(words[1]);
		// 인덱스를 모를 때 for문으로 접근
		for(int i = 0; i < words.length; i++) {
			System.out.print(words[i] + " / ");
		}
		
		// 문자열 자르기 substring()
		// JAVA, C++
		System.out.println();
//		data1 = data1.substring(5);
//		System.out.println("문자열 자르기 " + data1);
		// 문자열 범위 자르기
		data1 = data1.substring(0, 4);
		System.out.println("범위 자르기 : " + data1);
		
		// 문자 자르기 (from String) : charAt()
		char word = data1.charAt(0);
		System.out.println("문자 자르기 : " + word);
	}

}
