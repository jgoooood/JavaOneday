package com.kh.day01;

public class Hello {
	public static int sum(int num1, int num2) {
		//This method must return a result of type int -> return사용해야함 
		//혹은 public static void sum(int num1, int num2) 으로 명령어 작성
		return num1+num2;
	}
	
	public static void main(String [] args)
	{
		//노란줄은 실행에 영향없음->선언한 변수가 아직 사용되지 않아서 노란줄 생김
		int i = 20;  
		int s;
		char a;
		
		//a = "?";  <- 변수 a는 char(문자)타입으로 선언되었기 때문에 문자열인""를 쓰면 오류
		a = '?';
		s = sum(i, 10); //그냥 호출하면 사라지니 변수에 담아줌
		System.out.println(s); // 변수s를 결과값이 나옴.
		System.out.println(a);
		System.out.println("Hello");
		
		// 단축키
		// 주석 단축키 : ctrl+shift+c
		// 줄삭제 ctrl+d
		// ctrl+z : 되돌리기 / ctrl+y : 앞돌리기
	}
}
