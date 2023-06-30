package com.kh.day05.oop;

public class Circle {
	//=========================================>필드
	public int radius; // 원의 반지름
	public String name; // 원의 이름
	
	
	//=========================================>생성자
	public Circle() {  //생성자(기본생성자)
		// 초기화
		radius = 1;
		name = "아무개"; // 필드에 값을 넣음 -> 객체초기화
		//생성자는 내가 의도한 값으로 객체를 초기화 할 때 씀
//		1. 입력해서 초기화할 수 있고
//		2. 전달받아서 초기화를 할 수 있다 -> 매개변수
		
		/* 생성자 특징
		1. 생성자는 필드(멤버변수)를 초기화 
		2. 생성자는 void를 안적고 반환값(return)이 없는 유일한 메소드
		3. 생성자 이름은 클래스 이름과 동일해야함
		4. 기본생성자는 생략이 가능함->그래서 여태까지 생성자없이 메소드만 만들어 사용가능했던 것
		5. 매개변수가 있는 생성자는 기본생성자를 생략할 수 없음.
			-> 매개변수가 없다면 기본생성자 생략가능
		 */
		
		
	}
	
	public Circle(int radius, String name) {
		this.radius = radius; //radius는 매개변수 / this.radius는 필드
		this.name = name;
	}
	
	
	
	//==========================================> 메소드
	public double getArea() {    // 원의 넓이를 구해주는 메소드
		return 3.14 * radius * radius;
	}

// 생성한 클래스 객체에도 main 메소드를 사용할 수 있지만 실행클래스는 따로
//	public static void main(String[] args) {
//		Circle pizza;
//		pizza = new Circle();
//		pizza.radius = 10;
//		pizza.name = "청년피자";
//		double area = pizza.getArea();
//		System.out.println(pizza.name + "의 면적은 "+area);
//	}
}



