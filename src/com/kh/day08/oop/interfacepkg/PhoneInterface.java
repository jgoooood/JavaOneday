package com.kh.day08.oop.interfacepkg;

public interface PhoneInterface {
	// private String name;
	// 1. Illegal modifier for the interface field PhoneInterface.name; 
	//	  only public, static & final are permitted
	//	  public 접근제어자만 허용
	
	// public String NAME;
	// 2. The blank final field NAME may not have been initialized
	//	  상수는 반드시 초기화를 해주고 사용해야함
	public String NAME = ""; // static final 생략된 것
	public static final int TIME_OUT = 10000;
	
	// public abstract void receiveCall() {}
	// 3. Abstract methods do not specify a body
	// 	 몸체 제거해야함
	public abstract void receiveCall(); //<-몸체제거
	void sendCall();
	abstract void printLogo();
	public default void showLogo() {
		// default메소드 : 하위 호환성을 위해서 작성
		// 하위 호환성을 유지하고 인터페이스의 보완을 위해 작성
		System.out.println("** LG **");
	}
}
