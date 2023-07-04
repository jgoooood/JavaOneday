package com.kh.day07.oop.point;


public class ColorPoint extends Point{
	//자식클래스만의 멤버변수 선언 -> 확장
	private String color;
	
	//자식클래스의 기본생성자는 기본적으로 부모생성자를 호출하는 키워드가 생략되어있음
	//이유 : 상속을 받으면 부모생성자가 먼저 실행되기 때문.
	//	public ColorPoint() {
	//		super(); <- super가 부모생성자를 호출하는데 생략됨
	//	} 
	public ColorPoint() {} //기본생성자<-super();가 생략되어있다. 
	public ColorPoint(int x, int y, String color) {
		//x, y는 private이라 접근불가->매개변수의 값을 전달할 수 없음->메소드나 생성자를 사용
		//super.x = x;
		//super.y = y;
		
		//부모클래스의 생성자를 사용해 매개변수로 전달->부모클래스의 생성자가 호출됨
		super(x, y); //Point(x,y); 대신 super키워드를 사용해 부모클래스를 명시
		//부모클래스에는 없는 ColorPoint의 클래스의 멤버변수를 초기화
		//매개변수가 있는 생성자를 초기화 할 때 this사용
		this.color = color;
	}
	
	//자식클래스의 메소드
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(color);
		super.showPoint(); 
		//부모클래스로부터 상속받은 메소드
		//super. <-부모클래스를 나타냄
	}
}