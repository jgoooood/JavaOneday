package com.kh.day08.oop.abstractpkg.exercise;

public class CalcRun {

	public static void main(String[] args) {
		//추상클래스는 객체 생성이 안됨(인스턴스화x)
		//Cannot instantiate the type Calculator
		//Calculator calc = new Calculator();
		Calculator calc = new GoodCalc(); //업캐스팅
		//배열선언 후 값을 전달
		int [] a = {1, 2, 3, 4, 5};
		System.out.printf("평균 : %.2f\n", calc.average(a));
		System.out.printf("합 : %d\n", calc.add(1, 2));
		System.out.printf("차 : %d\n", calc.substract(20, 10));
	}

}
