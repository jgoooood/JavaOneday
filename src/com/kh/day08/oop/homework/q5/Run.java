package com.kh.day08.oop.homework.q5;

public class Run {

	public static void main(String[] args) {
		//kim이라는 변수에 Person 객체 생성
		//Person kim = new Person();
		//만들어진 객체에 실제 값을 넣어주어야 실체가 됨
		Person kim = new Person("김씨", 10000);
		//kim.buyCoffe(new Cafe(), 4000);
		//starCafe 방문
		kim.buyCoffe(new StarCafe(), 5500);
		kim.printInfo(); // 잔액확인
		
		Person lee = new Person("이씨", 20000);
		//lee.buyCoffe(new Cafe(), 4500);
		lee.buyCoffe(new CongCafe(), 4500);
		//CongCafe는 상속받기만 하고 오버라이딩 사용x
		//Cafe에 정의된 내용으로 출력됨
		lee.printInfo(); //잔액확인
	}

}
