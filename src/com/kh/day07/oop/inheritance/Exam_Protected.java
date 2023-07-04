package com.kh.day07.oop.inheritance;

import com.kh.day07.oop.point.Point;

class Parent {
	public int pub;
	int def;
	protected int pro;
	private int pri;
	
	public Parent() {}
	
}

class Child extends Parent {
	private int childMoney;
	public Child() {}
	void set() {
		//super. 부모의 값을 가져옴
		super.pub = 1;
		super.def = 2;
		super.pro = 3;
		//super.pri = 4; 
		//private으로 된 메소드는 접근 불가 : The field Parent.pri is not visible
	}
}

//다른패키지에 있는 Point클래스를 상속
class ShapePoint extends Point {
	private String shape;
	public ShapePoint() {}
	void set() {
		super.pub = 1; //pub은 public->다른패키지 변수이지만 접근가능
		//super.def = 2; //def은 default->다른패키지로 접근불가 : The field Point.def is not visible
		super.pro = 3; //protected->다른패키지임에도 상속받았기 때문에 접근가능
		//super.pri = 4; //private->상속을 받았어도 private은 접근 불가 : The field Point.pri is not visible
	}
	
}

public class Exam_Protected {
	public static void main(String[] args) {
		
	}
}
