package com.kh.day05.oop;

public class Exam_ThisConstructor {

	public static void main(String[] args) {
		Book2 book = new Book2(); //Book2로 만든 객체->인스턴스
		Book2 loveStory = new Book2("춘향뎐");
		//title만 선언된 생성자를 통해 title, author 둘다 선언된 생성자를 호출하고자함
		System.out.println(loveStory.title + ", " + loveStory.author);
//		Circle2 circle = new Circle2();
//		circle.radius = 10;
//		System.out.println("원의 넓이는 " + circle.getArea());

	}

}

class Book2 {
	public String title;
	public String author;
	
	//객체가 생성될 때 무조건 한번 호출됨->"Book2 생성자 호출됨"출력
	public Book2() {
		System.out.println("Book2 생성자 호출됨");
	}
	public Book2(String title) {
		//this.title = title;
		this(title, "작자미상");
	}
	public Book2(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	
}
//The type Circle is already defined : 클래스 중복일 때 발생
//클래스파일 안에 여러 클래스를 만들 수 있음->중첩클래스는 아님
class Circle2 {
	public int radius;
	public String name;
	
	public Circle2() {
		
	}
	
	public double getArea() {
		return 3.14 * radius * radius;
	}
}