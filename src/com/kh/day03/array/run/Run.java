package com.kh.day03.array.run;

import java.util.Random;
import java.util.Scanner;

import com.kh.day03.array.exercise.Exercise_Array1;
import com.kh.day03.array.exercise.Exercise_For;

public class Run {
	public static void main(String [] args)
	{
		// exArr은 변수
		// Exercise_Array1 cannot be resolved to a type : 임포트해주어야 함
		// Scanner, Random처럼 임포트해서 사용함->자바의 기본 패키지
		// 'new'는 메모리 할당해 주소값이 생성되는 예약어
		Exercise_Array1 exArr = new Exercise_Array1();
		// Arr1클래스를 변수에 저장해 사용하기 위해 마침표표기법으로 접근
		// 해당 프로그램이 있는 클래스명을 입력하고 함수처럼 호출해 사용한다.
		// 보통 main메소드는 프로그램 별로 딱 한번 사용하고 
		// 그 외의 기능들은 메인 메소드 외에 저장해서 메인안에 호출해 쓰는 방식을 사용.
		//exArr.exercise1(); 
		//exArr.exercise2();
		// -> exArr : 프로그램이 저장된 클래스를 변수에 저장했기 때문에 변수명으로 접근
		// -> exercise2() : 접근한 클래스에 저장된 프로그램의 메소드를 호출해 사용
		exArr.lottoExercise();
		
		Exercise_For exFor = new Exercise_For();
		//exFor.forDoubleExercise1();
		//exArr.arryCopyExercise();
		
	}
}
