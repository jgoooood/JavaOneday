package com.kh.day07.oop.polymorphism.overriding;

public class Exam_Overriding {
	static void paint (Shape shape) {
		//1. 오버라이딩은 상속관계에서 사용가능
		//2. 오버라이딩은 다 똑같고 실행문만 다르게
		//3. 오버라이딩이 되면 동적바인딩 되어 다형성을 이용할 수 있음
		shape.draw(); 
		//draw가 오버라이딩(재정의)가 되어있어서 자식들의 오버라이딩된 메소드를 각각 따로 출력됨
		//오버라이딩이 안됐으면 부모의 draw에 정의된 Shape이 출력됐어야함.
		//업캐스팅에 의해 슈퍼클래스 레퍼런스로 오버라이딩된 메소드가 호출됨->"동적 바인딩"이라 함
	}
// ↑Shape을 상속받을 Line, Circle, Rect를 공통으로 부모타입으로 변경
//	static void paint(Line line) {
//		line.draw();
//	}
//	static void paint(Circle circle) {
//		circle.draw();
//	}
//	static void paint(Rect rect) {
//		rect.draw();
//	}
	public static void main(String[] args) {
		//메소드를 호출하면서 객체를 생성
		paint(new Line());
		paint(new Circle());
		paint(new Rect());
		
//		Line line = new Line();
//		line.draw();
//		//line.draw(); 메소드를 호출하는데 Line으로 재정의
//		Circle circle = new Circle();
//		circle.draw();
		
		
	}

}
