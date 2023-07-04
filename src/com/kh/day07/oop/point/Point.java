package com.kh.day07.oop.point;

public class Point {
	public int pub;
	int def;
	protected int pro;
	private int pri;
	
	private int x, y;
	
	//부모클래스-> 기본생성자
	public Point() {}
	//부모클래스-> 필드를 초기화하는 매개변수생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() {
		System.out.printf("%d, %d\n", x, y);
	}
}