package com.kh.day08.oop.interfacepkg;

//public class SamsungPhone extends PhoneInterface {
//1. The type PhoneInterface cannot be the superclass of SamsungPhone; a superclass must be a class
// 	 extends사용불가->interface는 implements 사용 
	
public class SamsungPhone implements PhoneInterface {
// 2. The type SamsungPhone must implement the inherited abstract method PhoneInterface.receiveCall()
//	 상속한 인터페이스의 추상메소드를 오버라이딩 해야함

	@Override
	public void receiveCall() {
		System.out.println("여보세요");
	}

	@Override
	public void sendCall() {
		System.out.println("RING");
	}

	@Override
	public void printLogo() {
		System.out.println("===== SAUMSUNG ====");
	}
}
