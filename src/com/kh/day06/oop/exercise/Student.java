package com.kh.day06.oop.exercise;

public class Student {
	//==================================필드 : 원칙은 변수 선언만
	//default로 사용하기위해 static키워드는 제외 : static int kor = 0;-> int kor = 0;
	String name;
	int kor;
	int eng;
	int math;
	
	//==================================생성자 : 원칙은 생성자에서 변수 초기화
	//기본생성자 : 매개변수 없음, 필드 초기화만
	public Student() {
		name = "";
		kor = 0;
		eng = 0;
		math = 0;
	}
	//매개변수 생성자 : 매개변수를 내가 원하는데로 받을 수 있음
	//->원하는 변수를 받을 수 있도록 자유롭게 코드를 작성할 수 있음.
	//1.이름만 받고싶을 때 생성자
	public Student(String name) {
		this.name = name;
	}
	//2.과목점수만 받고싶을 때 생성자
	public Student(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	//3.이름, 과목점수를 모두 받고싶을 때 생성자
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	//==================================메소드
	//void는 리턴값이 없는 메소드, 자료형을 입력하면 리턴을 사용해주어야함.
	// 합계 메소드
	public int getTotal() {
		int total = this.kor + this.eng + this.math;
		return total;
	}
	// 평균 메소드
	public double getAvg() {
		double avg = (double)this.getTotal() / 3;
		return avg;
	}
}
