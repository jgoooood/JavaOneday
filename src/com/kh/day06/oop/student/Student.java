package com.kh.day06.oop.student;

public class Student {
	// 이름
	// 첫번째 성적
	// 두번째 성적 입력
	// 평균 출력
	//오픈된 변수인 상태->public
	//	String name;
	//	int firstScore;
	//	int secondScore;
	//private일 경우 다른 클래스에서 사용불가
	//->메소드 getter, setter를 통해 접근 가능하게 할 수 있음.
	private String name;
	private int firstScore;
	private int secondScore;
	
	
	public Student() {
		name = "";
		firstScore = 0;
		secondScore = 0;

	}
	public Student(String name) {
		this.name = name;
	}
	public Student(String name, int firstScore) {
		this.name = name;
		this.firstScore = firstScore;
	}
	public Student(String name, int firstScore, int secondScore) {
		this.name = name;
		this.firstScore = firstScore;
		this.secondScore = secondScore;
	}
	public double getAvg() {
		double avg = (double)(this.firstScore + this.secondScore) / 2;
		return avg;
	}
	
	
	//private변수 메소드로 사용->캡슐화 getter, setter메소드를 활용한다.
	//getter 메소드 -> 리턴만하면됨
	public String getName() {
		return this.name;
	}
	public int getFirstScore() {
		return this.firstScore;
	}
	public int getSecondScore() {
		return this.secondScore;
	}
	
	//setter 메소드 : 값에 접근
	public void setName(String name) {
		this.name = name;
	}
	public void setFirstScore(int firstScore) {
		this.firstScore = firstScore;
	}
	public void setSecondScore(int SecondScore) {
		this.secondScore = SecondScore;
	}
	
}
