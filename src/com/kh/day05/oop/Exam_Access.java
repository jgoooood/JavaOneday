package com.kh.day05.oop;

//**접근 지정자, 접근 제한자 : public, private, default, protected
class Sample {
	public int a; // 접근권한이 가장 넓음-> 모든 곳에서 접근 가능
	private int b; // 접근권한이 가장 좁음->같은 클래스 내에서만 접근
	int c; // default, 같은 패키지 내에서만 접근 가능
}
public class Exam_Access {

	public static void main(String[] args) 
	{
		Sample sample = new Sample();
		sample.a = 5;
		//sample.b = 15; // 멤버변수 b는 private이기 때문에 보이지 않아 접근불가
		//The field Sample.b is not visible  
		sample.c = 10; // default는 접근가능 -> 같은 패키지이기 때문
	}

}
