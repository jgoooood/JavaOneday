package com.kh.day08.oop.homework.q5;

public class StarCafe extends Cafe {
	//커피만들기 함수 오버라이딩
	@Override
	public void makeCoffee(int money) {
		if(money == Menu.STAR_AMERICANO) {
			System.out.println("아메리카노 준비해드리겠습니다.");
		} else if (money == Menu.STAR_LATEE) {
			System.out.println("라떼 준비해드리겠습니다.");
		} else {
			System.out.println("금액이 더 필요합니다.");
		}
	}
}
