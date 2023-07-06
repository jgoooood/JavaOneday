package com.kh.day08.oop.interfacepkg.zoo;

public interface FoodInterface {
	String animalFood();
	String makeSound();
	//새로운 메소드를 추가하면 FoodInterface를 구현하고 있는 모든
	//클래스들에서 다시 오류발생->새롭게 추가된 메소드를 오버라이딩하라는 오류
}
