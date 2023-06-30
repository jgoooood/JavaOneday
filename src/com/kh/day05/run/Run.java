package com.kh.day05.run;

import java.util.Scanner;

import com.kh.day05.oop.Circle;
import com.kh.day05.oop.Book;
import com.kh.day05.oop.exercise.Rectangle;

public class Run {
	public static void main (String[] args)
	{
		//==============================================book 클래스
//		Book littlePrince = new Book();
//		littlePrince.title ="어린왕자";
//		littlePrince.author = "생택쥐페리";
		Book littlePrince = new Book("어린왕자", "생택쥐페리");
		Book loveStory = new Book("춘향뎐");
		System.out.println(littlePrince.title + ", " + littlePrince.author);
		System.out.println(loveStory.title + ", " + loveStory.author);
		
		
		//==============================================Rectangle 클래스
		Rectangle rect = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.print("너비를 입력해주세요 : ");
		rect.width = sc.nextInt();
		System.out.print("높이를 입력해주세요 : ");
		rect.height = sc.nextInt();
		int result = rect.getArea();
		System.out.printf("사각형의 면적은 %d 입니다.", result);
				
				
		//==============================================Circle 클래스
		// new를 사용해서 메모리상에 올라가게 됨->객체Circle생성->참조변수에 저장해서 재사용
		Circle circle = new Circle(); 
		Circle circle2 = new Circle(); // 모두 다른 객체
		Circle circle3 = new Circle();
		Circle circle4 = new Circle();
		
		circle.radius = 100;
		circle2.radius = 1000;
		circle3.radius = 10000;
		
		System.out.println(circle.getArea()); //Circle클래스의 getArea()메소드 호출
		System.out.println(circle2.getArea());
		System.out.println(circle3.getArea());
		
//		Circle pizza; //객체 피자 선언
//		pizza = new Circle(); //메모리상에 저장
//		pizza.radius = 10;
//		pizza.name = "청년피자";
//		double area = pizza.getArea();
//		System.out.println(pizza.name + "의 면적은 "+area);
		
//		Circle donut = new Circle(); //객체 도넛의 선언과 메모리저장(인스턴스) 동시
//		donut.radius = 2;
//		donut.name = "청년도넛";
//		area = donut.getArea();
//		System.out.printf("%s의 면적은 %.2f\n", donut.name, area);
		
		//매개변수가 있는 생성자 활용
		// 객체를 생성할 때 매개변수로 넣어서 코드를 줄일 수 있음.
		Circle pizza = new Circle(10, "청년피자");
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 "+area);
		
		Circle donut = new Circle(2, "청년도넛");
		area = donut.getArea();
		System.out.printf("%s의 면적은 %.2f\n", donut.name, area);
	}
}
