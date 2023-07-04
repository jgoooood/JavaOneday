package com.kh.day07.oop.polymorphism.overriding;

public class Rect extends Shape {
	@Override
	public void draw() {
		System.out.println("Rect");
	}
	//draw메소드를 적고 ctrl+스페이스바를 누르면 자동 오버라이딩코드 완성
	//super.draw() : 부모의 메소드를 재정의 한다는 코드
}
