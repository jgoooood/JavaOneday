package com.kh.day06.oop.objectarray;

import java.util.Scanner;

public class Exam_ObjectArray2 {
	public static void main(String[] args) {
		Book [] books = new Book[2];
		Scanner sc = new Scanner(System.in);
		
//		//books[0]에 데이터넣기
//		System.out.print("제목 >> ");
//		String title = sc.nextLine();
//		System.out.print("저자 >> ");
//		String author = sc.nextLine();
//		
//		//원래 사용법
//		//Book book = new Book(title, author);
//		//객체배열사용법
//		books[0] = new Book(title, author); 
//		//The constructor Book() is undefined 기본생성자 없음 
//		//->매개변수 없으면 생략가능, 매개변수 있으면 반드시 생성자 사용 
//		//books[0].title = title;
//		//books[0].author = title;
//		
//		//출력->기본생성자 사용x/**매개변수가 있을때만 생성자사용
//		System.out.println("(" + books[0].title + ", "+books[0].author + ")");
//		
//		//books[1]에 데이터 넣기
//		System.out.print("제목 >> ");
//		title = sc.nextLine(); //재할당
//		System.out.print("저자 >> ");
//		author = sc.nextLine(); //재할당
//		books[1] = new Book(title, author); 
//		System.out.println("(" + books[1].title + ", "+books[1].author + ")");
//		
		//**for문으로 데이터넣기
		for(int i = 0; i < books.length; i++) {
			System.out.print("제목 >> ");
			String title = sc.nextLine(); //재할당
			System.out.print("저자 >> ");
			String author = sc.nextLine(); //재할당
			books[i] = new Book(title, author); 
//			원래 이렇게 3줄로 작성했었음 -> books[i] = new Book(title, author); 한줄로 변경가능
//			books[i] = new Book();
//			books[i].title = title;
//			books[i].author = author;
			System.out.println("(" + books[i].title + ", "+books[i].author + ")");
		}
	}
}
