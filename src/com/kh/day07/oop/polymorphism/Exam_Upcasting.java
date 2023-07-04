package com.kh.day07.oop.polymorphism;

public class Exam_Upcasting {
	public static void main(String[] args) {
		Student std = new Student(); //Student 객체생성
		Person P = new Person(); //Person 객체생성
		
		//부모타입의 참조변수 parent는 자식class인 Student에 접근 가능
		//상속받았기 때문에 접근이 가능한데 이때 변수는 자식에만 있는 변수에는 접근할 수 없음
		//->강제형변환으로 사용(다운캐스팅)
		//업캐스팅
		Person parent = new Student("일용자");
		System.out.println(parent.name); 
		//오류안남->부모클래스에 정의된 멤버변수이기 때문
		//System.out.println(parent.grade);
		//오류남->부모클래스에 정의안된 자식클래스의 멤버변수이기 때문
		//다운캐스팅
		System.out.println(((Student)parent).grade); 
		
	}
}
