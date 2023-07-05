package com.kh.day08.oop.homework.q6;

public class Card {
	// 소유자 이름
	// 카드번호
	// 유효기간
	// cvc
	// 비밀번호
	int cardNumber;
	//int serialNum = 10000; -> 디폴트 변수이기 때문에 다른 클래스에서 new Card할때마다 10000로 초기화가 됨
	//->serial++ 적용x -> serial++이 적용되기 위해서는 증가값이 공유될 수 있도록 전역변수로 선언해주어야함.
	//모든 곳에 접근가능한 static으로 선언
	static int serialNum = 10000;
	/*
	new Card할 때마다 아래의 박스 형태로 생성됨
	 ------------------------
	ㅣstack메모리 : mycard  ㅣ
	ㅣheap메모리 : new Card ㅣ
	 ------------------------
	static : 별도의 공간에 저장해서 값을 공유함
	*/
	public Card() {
		cardNumber = serialNum;
		serialNum++;
	}
	
	public void printCardInfo() {
		System.out.println(this.cardNumber+"입니다.");
	}
}
