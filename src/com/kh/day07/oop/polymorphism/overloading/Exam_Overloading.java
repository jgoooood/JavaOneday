package com.kh.day07.oop.polymorphism.overloading;

class Weapon {
	//같은 Weapon메소드에 매개변수 개수다름, 매개변수 타입다름
	public Weapon() {}
	public Weapon(int value) {
		System.out.println(value);
	}
	public Weapon(int value, String name) {
		System.out.println(value + " : " + name);
	}
}
public class Exam_Overloading {

	public static void main(String[] args) {
		//println메소드를 데이터타입만 다르게해서 사용->오버로딩 사용
		System.out.println(1);
		System.out.println(1.1);
		System.out.println('A');
		System.out.println("Hello Java");
		System.out.println(true);
	}

}
