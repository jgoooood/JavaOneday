package com.kh.day08.oop.abstractpkg;

class Line extends Shape {
	// 4. The type Line must implement the inherited abstract method Shape.draw()
	//    상속받은 추상 메소드는 반드시 오버라이딩 해야함->안한다면 class에 abstract 붙여야 함
	//	  오버라이딩하면 추상클래스로 안해도되고, 오버라이딩 안하면 추상클래스로 변경해야 함
	@Override
	public void draw() {
		
	}
}


public abstract class Shape {
	public Shape() {}
	
	public void paint() {
		
	}
	abstract public void draw(); 
	// 1. Abstract methods do not specify a body 
	// 	  {몸체}를 없애주어야 함	 
	// 2. The abstract method draw in type Shape can only be defined by an abstract class
	//	  추상메소드는 추상클래스 안에서만 정의될 수 있음->
	//	  추상메소드를 사용하면 클래스를 추상클래스로 변경해주어야 함.
	// 3. The type Shape must be an abstract class to define abstract methods
	//	  추상메소드를 포함하고 있기 때문에 추상클래스abstract로 변경	  
}
