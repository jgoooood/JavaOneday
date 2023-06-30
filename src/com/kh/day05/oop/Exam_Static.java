package com.kh.day05.oop;

class StaticSample {
	public int num;
	//원래 메인메소드에서 new StaticSample();를 통해 인스턴스를 생성하고 변수를 사용해야만함.
	//static 변수는 static 메모리상에 저장된 변수이기 때문에 new 없어도 사용가능
	public static int input; 
	
	public void sampleMethod() {
		
	}
	public void goodMethod() {
		
	}
	public static void originMethod() {
		input = 1225;
	}
}
public class Exam_Static {
	public static void main (String[] args) 
	{
		StaticSample.input = 10;
		StaticSample.originMethod();
		System.out.println(StaticSample.input);
		StaticSample sample = new StaticSample();
		sample.num = 26;
	}
}
