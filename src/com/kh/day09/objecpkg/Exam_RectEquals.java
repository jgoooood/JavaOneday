package com.kh.day09.objecpkg;

class Rect {
	int width, height;
	public Rect() {}
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	// 2. equals()의 내용을 다시 생성 -> 오버라이딩
	public boolean equals(Object obj) {
		Rect r = (Rect)obj; 
		//다운캐스팅 : obj는 부모객체인데 이를 자식객체로 다운캐스팅
		//조건문에서 r에 담긴 width, height를 곱한 값과 비교
		if(width*height == r.width*r.height) {
			return true;
		} else {
			return false;
		}
	}
}
public class Exam_RectEquals {
	public static void main(String[] args) {
		//각각 다른 객체 2개를 생성
		Rect rect1 = new Rect(2, 3);
		Rect rect2 = new Rect(2, 3);
		//주소값이 다르기 때문에 else문 실행됨
//		if (rect1 == rect2) {
//			System.out.println("a is equal to b");
//		}else {
//			System.out.println("a is not equal to b");
//		}
		
		// 1. equals 메소드 사용
//		if (rect1.equals(rect2)) {
//			System.out.println("a is equal to b");
//		}else {
//			System.out.println("a is not equal to b");
//		}
		//a is not equal to b 출력
		
		// 2. equals 다시 정의 후 실행
		//이때 사용한 equals는 내가 다시 정의한 메소드를 사용한것
		if (rect1.equals(rect2)) {
			System.out.println("a is equal to b");
		}else {
			System.out.println("a is not equal to b");
		}
		//equals 메소드 다시 정의하면 a is equal to b 출력
		
	}
}
