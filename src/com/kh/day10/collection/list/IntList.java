package com.kh.day10.collection.list;

public class IntList {
	//필드
	int [] nums; //배열의 생성
	int size;
	
	//기본생성자
	public IntList() {
		nums = new int[3]; //배열의 할당(new해야만 메모리에 할당->주소값저장)
		size = 0;
	}

	public void add(int num) {
		nums[size] = num;
		size++;
	}

	public int get(int index) {
		return nums[index];
	}

	public int size() {
		return size;
	}

	public void clear() {
		nums = new int[3];
		size = 0;
	}
}
