package com.kh.day06.oop.objectarray;

public class Exam_ObjectArray {
	public static void main(String [] args)
	{
//		Circle c = new Circle();
//		c.radius = 10;
//		double result = c.getArea();
//		System.out.println(result);
		
		Circle [] cArray;
		cArray = new Circle[5]; //Circle을 다섯개를 담을 수 있는 배열
		Circle c = cArray[0]; //현재는 객체를 담을 수 있는 공간, 객체가 아님
		System.out.println(c); //null : 객체가 들어가 있지 않음
		System.out.println(cArray[0]); //null : 객체가 들어가 있지 않음
		//c.radius = 10; // 객체가 아닌 상태에서 접근하려고 하면 에러발생(NullPointerException)
		cArray[0] = new Circle(); // 공간을 new Circle을 통해 이때 객체가 됨
		System.out.println(cArray[0]); //com.kh.day06.oop.objectarray.Circle@626b2d4a 고유값(주소값)
		cArray[0].radius = 10;
		
		//for문이용 객체생성
//		for(int i = 0; i < cArray.length; i++) {
//			cArray[i] = new Circle(); // for문으로 객체생성->이때 화살표가 생성
//		}
		cArray[0].radius = 1; //cArray[0] new Circle로 객체생성됨
		//**객체생성을 하지 않았기 때문에 NullPointerException 오류 발생
		cArray[1].radius = 2; //cArray[1]부터는 객체생성안되서 오류발생됨
		cArray[2].radius = 3;
		cArray[3].radius = 4;
		cArray[4].radius = 5;
		
		System.out.println(cArray[0].getArea());
		System.out.println(cArray[1].getArea());
		System.out.println(cArray[2].getArea());
		System.out.println(cArray[3].getArea());
		System.out.println(cArray[4].getArea());
		
	}
}
