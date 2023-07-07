package com.kh.day10.collection.list;

public class ObjectList {
	//int [] nums;
	Object [] objects;
	int size;
	
	public ObjectList() {
		objects = new Object[3];
		size = 0;
	}

	//다양한 데이터타입을 매개변수로 받기 위해서는 Object 데이터타입으로 받아야함
	public void add(Object input) {
		objects[size] = input;
		size++;
	}

	//데이터를 가져오는 메소드
	public Object get(int index) {
		return objects[index];
	}
	
	public int size() {
		return size;
	}
	
	//배열이 다 차면 clear라는 메소드를 호출해 또다시 객체배열을 생성할 수 있음
	public void clear() {
		objects = new Object[3];
		size = 0;
	}
}
