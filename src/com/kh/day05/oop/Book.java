package com.kh.day05.oop;

public class Book {
	//제목과 저자를 나타내는 필드를 가진 Book클래스를 작성하고
	//생성자를 작성하여 필드를 초기화 하여라
	//클래스 바로 밑에 선언하는 변수 = 필드 = 멤버변수
	//============================================> 필드
	public String title;
	public String author;
	
	//============================================> 생성자
	//생성자는 종류별로 설정할 수 있고 자신이 원하는 형식으로 생서자를 만들 수 있음.
	//1. 생성자 1 : 모두 빈 값으로 초기화->객체생성할 때마다 지정할 수 있음
	public Book() {
		//초기화 : 필드에 값을 넣어줌
		title = "";
		author = "";
		//객체초기화 끝
	}
	//매개변수 생성자만들기
	// 2. 생성자 2 : 객체생성할 때 멤버변수 값을 먼저 설정하기 어렵다면 일부만 객체초기화 가능
	public Book(String title) {
		this.title = title; // this.title은 멤버변수 / title은 매개변수로 전달될 값
	}
	
	// 3. 생성자 3 : 객체생성할 때 멤버변수의 값을 모두 전달받을 수 있음
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	//여러 생성자들 중 자신이 원하는 형식의 생성자를 선택해 사용가능
	//============================================> 메소드
}
