package com.kh.day08.oop.homework.q5;

public class Person {
	String name;
	int money;
	
	public Person() {}
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	//커피구매 메소드
	public void buyCoffe(Cafe cafe, int money) {
		// 돈을 가지고 커피가 나와야 함
		cafe.makeCoffee(money);
		// 사용한 돈을 차감
		this.money -= money;
	}
	
	//잔액을 출력하는 메소드
	public void printInfo() {
		System.out.println(this.name+"님의 잔액은 "+this.money+"원 입니다.");
	}
	

}
