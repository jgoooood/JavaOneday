package com.kh.day10.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListRun {
	public static void main(String[] args) {
		List<Student> sList = new ArrayList<Student>();
		sList.add(new Student());
		sList.add(new Student());
		sList.add(new Student());
		sList.add(new Student());
		sList.add(new Student());
		
		for (int i = 0; i < sList.size(); i++) {
			System.out.println(sList.get(i).toString());
		}
		/* 주소값이 할당된 것을 확인
		com.kh.day10.collection.list.Student@6f2b958e
		com.kh.day10.collection.list.Student@5e91993f
		com.kh.day10.collection.list.Student@1c4af82c
		com.kh.day10.collection.list.Student@379619aa
		com.kh.day10.collection.list.Student@cac736f
		 */
	}
	public void sListExample() {
		//배열은 length를 사용, List는 size를 사용
		List<String> strList = new ArrayList<String>();
		strList.add("딸기");
		strList.add("복숭아");
		strList.add("바나나");
		strList.add("포도");
		
		System.out.println("첫번째 : " + strList.get(0));
		for(int i = 0; i < strList.size(); i++) {
			System.out.println((i+1)+"번째 값 : " + strList.get(i));
		}
		System.out.println("==============================");
		//장점 1. list는 중간에 값을 넣을 수 있음
		strList.add(2, "체리");
		for(int i = 0; i < strList.size(); i++) {
			System.out.println((i+1)+"번째 값 : " + strList.get(i));
		}
		//장점 2. 데이터를 쉽게 수정할 수 있음 set(); //ArrayList의 기본메소드
		strList.set(2, "파인애플");
		System.out.println("==============================");
		for(int i = 0; i < strList.size(); i++) {
			System.out.println((i+1)+"번째 값 : " + strList.get(i));
		}
		// 장점 3. 제거도 쉽게 가능 remove(); //ArrayList의 기본메소드
		strList.remove(2);
		System.out.println("==============================");
		for(int i = 0; i < strList.size(); i++) {
			System.out.println((i+1)+"번째 값 : " + strList.get(i));
		}

//		ArrayList<String> aList = new ArrayList<String>();
	}
	
	public void genericExample() {
		RList<Integer> list = new RList<Integer>();
		list.add(10);
		list.add(26);
		list.add(923);
		
		int num = list.get(0);
		
		System.out.println("num : " + num);
	}
	
	
	//Object를 이용하면 여러 타입의 데이터를 입력할 수 있음
	//그러나 모든 값을 받기 때문에 사용시 타입에 맞는 강제형변환필수
	public void objectExample() {
		ObjectList objList = new ObjectList();
		objList.add(10); //int
		objList.add("월"); //문자열
		objList.add('A'); //문자
		
		//obj의 데이터타입은 Object로 설정해주어야 모든 데이터타입을 받을 수 있음
		Object obj = objList.get(0);
		
		int num = (int)obj;//다운캐스팅:obj는 Object타입임
//		int num = obj; 에러발생->강제형변환해주어야함
//		Type mismatch: cannot convert from Object to int
		
		Object obj2 = objList.get(1);
		String str = (String)obj2;
		//Type mismatch: cannot convert from Object to String
		
		char cOne = (char)objList.get(2);
		//Object는 모든 객체의 부모이기 때문에 사용할 때마다 다운캐스팅으로 강제형변환을
		//해주어야 해서 사용의 불편함이 생김->제네릭
		}
	
	
	//일반적인 배열은 같은 타입만 사용함
	public void intExmaple() {
		// int [] nums = new int[3];
		IntList nums = new IntList();
		//num[0] = 1; //인덱스를 신경써서 데이터를 넣어야함
		nums.add(1); //add메소드를 사용해서 인덱스신경안쓰고 값을 입력
		nums.add(2);
		nums.add(3);
		
//		int result = num[0];
		int result1 = nums.get(0);
		System.out.println("result1 : " + result1);
		
//		int size = nums.length;
		int size = nums.size();
		System.out.println("size : " + size);
		
//		num = {};, nums = new int[3];
		nums.clear();
	}

}
