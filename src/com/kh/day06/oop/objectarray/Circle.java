package com.kh.day06.oop.objectarray;

public class Circle {
	//============================필드
	int radius;
	
	//============================생성자
	//기본생성자
	public Circle() {
		
	}
	//매개변수 생성자
	public Circle(int radius) {
		this.radius = radius;
	}
	
	//============================메소드(메소드 변수 소문자로시작)
	//메소드는 반환형을 기재->return해주어야함.
	public double getArea() {
		double area = 3.14 * radius * radius;
		return area;
	}
}
