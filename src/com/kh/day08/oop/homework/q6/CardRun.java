package com.kh.day08.oop.homework.q6;

public class CardRun {

	public static void main(String[] args) {
		//new Card 객체가 생성될 때마다 SerialNum++
		Card myCard = new Card();
		myCard.printCardInfo();
		Card myCard2 = new Card();
		myCard2.printCardInfo();
		Card myCard3 = new Card();
		myCard3.printCardInfo();
	}

}
