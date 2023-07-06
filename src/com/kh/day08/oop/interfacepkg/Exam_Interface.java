package com.kh.day08.oop.interfacepkg;

public class Exam_Interface {
	public static void main(String[] args) {
		//PhoneInterface phone = new PhoneInterface();
		//1. Cannot instantiate the type PhoneInterface
		// 	 추상클래스와 마찬가지로 인터페이스는 객체 생성 불가
		PhoneInterface phone = new SamsungPhone();
		//상속받은 클래스를 객체타입으로 만들어줌 <- 업캐스팅
		phone.sendCall();
		phone.receiveCall();
		phone.printLogo();
	}
}
