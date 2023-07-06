package com.kh.day08.oop.interfacepkg.zoo;

public class ZooKeeper {
	
	//feed : 오버로딩/ 데이터 타입이 다 다름
//	public void feed(Bear bear) {
//		System.out.println("feed " + bear.animalFood());
//	}
//	
//	public void feed(Tiger tiger) {
//		System.out.println("feed " + tiger.animalFood());
//	}
//	
//	public void feed(Lion lion) {
//		System.out.println("feed " + lion.animalFood());
//	}
	//코드 한줄로 작성 -> 인터페이스 이용
	//사육사와 동물들을 연결하는 역할을 인터페이스가 함
	public void feed(FoodInterface predator) {
		System.out.println("feed " + predator.animalFood());
	}
	
	public static void main(String[] args) {
		ZooKeeper zk = new ZooKeeper();
		zk.feed(new Bear());
		zk.feed(new Tiger());
		zk.feed(new Lion());
	}
}
