package com.kh.day07.oop.polymorphism.exercise;

class SuperClass {
	void paint() {
		draw();
	}
	void draw() {
		System.out.println("Super Object");
	}
}

class SubClass extends SuperClass {
	void paint() {
		super.paint();
		super.draw();
	}
	void draw() {
		System.out.println("Sub Object");
	}
}
public class SampleProgram {

	public static void main(String[] args) {
		SuperClass ex = new SubClass();
		ex.paint();
		//출력결과
		// Sub Object
		// Super Object
		
		// 1. 메인 ex.paint(); -> SuperClass paint메소드 실행
		// 2. super.paint/ 호출
		// 3. 부모의 paint 실행->draw실행
		// 4. draw는 동적바인딩 됨
		// 5. System.out.println("Sub Object"); 출력
		// 6. super.draw는 호출
		// 7. 부모클래스의 draw호출
		//    ->자식클래스의 draw를 호출하는 것이 아니기 때문에 Super Object출력됨
		// 8. System.out.println("Super Object"); 출력
		//
	}

}
