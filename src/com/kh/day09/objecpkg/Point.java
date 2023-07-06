package com.kh.day09.objecpkg;

public class Point {
	private int x, y;
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//toString메소드를 오버라이딩해서 x, y가 나오도록 함
//	@Override
//	public String toString() {
//		return "x : " + this.x + ", y : " + this.y;
//	}
	
public boolean equals (Object obj) {
		Point p = (Point)obj;
		if(x == p.x && y == p.y) {
			return true;			
		} else {
			return false;
		}
	}
}
