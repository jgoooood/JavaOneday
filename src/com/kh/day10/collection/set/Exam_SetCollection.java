package com.kh.day10.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.kh.day10.collection.student.Student;


public class Exam_SetCollection {

	public static void main(String[] args) {
		Set<Student> stdSet = new HashSet<Student>();
		
		stdSet.add(new Student("강동원", 35, 100));
		stdSet.add(new Student("소지섭", 35, 90));
		stdSet.add(new Student("정우성", 35, 70));
		printSize(stdSet); // 데이터크기 3
		stdSet.add(new Student("강동원", 35, 100));
		printSize(stdSet); // 데이터크기 4 -> 해시코드,이퀄스 오버라이딩 후에는 데이터크기3 중복 인식
		
		Iterator<Student> it = stdSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}
	public static void printSize(Set<Student> set) {
		System.out.println("데이터의 크기 : " + set.size());
	}
	
	public void strSetExample() {
		// Collection의 List, Set, Map -> 저장소의 역할
		// 자료구조의 특성에 따라서 List, Set, Map 선택하여 사용해야함.
		// 기본적으로 List를 많이 사용-> 게시판
		Set<String> strSet = new HashSet<String>();
		
		strSet.add("복숭아");
		strSet.add("딸기");
		strSet.add("체리");
		strSet.add("참외");
		strSet.add("딸기");
		strSet.add("체리");
		//중복된 값을 넣어도 됨
		
		//ArrayList는 순서를 가지고 값을 출력 -> stdList.get(0) 
		//Set은 인덱스가 없음->순서가 없기 때문에 값이 있으면 출력 -> Iterator
		Iterator<String> it = strSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
		//중복으로 넣는건 가능, 출력은 중복이 제거됨->있으면 출력되는데 순서는 없음
	}

}
