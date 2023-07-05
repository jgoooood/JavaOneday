package com.kh.day08.oop.homework.q5;

//추상메소드를 사용했기 때문에 class도 추상클래스로 변경
public abstract class Cafe {
	String name;
	
	public Cafe() {}
	public Cafe(String name) {
		this.name = name;
	}
	
	
	//커피만들기
	//가격은 카페 평균인 것처럼
//	public void makeCoffee(int money) {
//		if(money == 4000) {
//			System.out.println("주문하신 아이스 아메리카노 한잔 나왔습니다.");
//		}else if (money == 4500) {
//			System.out.println("주문하신 라테 한잔 나왔습니다.");
//		}
//	}
	//StarCafe, CongCafe처럼 카페별로 메뉴,가격이 다르기 때문에 잘 안쓰게 됨
	// 이를 해결할 수 있는 것이 추상메소드임
	abstract public  void makeCoffee(int money);
	
}
