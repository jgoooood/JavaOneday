package com.kh.day03.array;

public class Exam_ArraySort {
	public static void main(String [] args) 
	{
		// {1, 3, 6, 10, 4, 7, 5, 2, 9, 8} 뒤죽박죽 배열 
		// 순서대로 정렬하는 프로그래밍 : 정렬 알고리즘
		// 정렬 알고리즘의 종류
		// 1. 삽입정렬
		// 2. 선택정렬
		// 3. 버블정렬
		// 4. 퀵정렬
		// 5. ...
		
		int num1 = 5;
		int num2 = 15;
		
		System.out.printf("num1 : %d, num2 : %d\n", num1, num2);
		int temp = num1; // 임시변수 temp : 5
		num1 = num2; // num1 : 5에서 15로 바뀜
		num2 = temp; // num2 : 5
		System.out.printf("num1 : %d, num2 : %d\n", num1, num2);
		// 두 개의 자리를 바꿀 때에는 임시변수가 꼭 필요함
		
		int [] nums = {2, 1, 3};
		temp = nums[0]; //temp에 nums[0]의 값을 대체하기 전 2 저장
		nums[0] = nums[2]; //2번자리에 3을 대입
		nums[2] = temp; // 3의 자리에 temp 대입 -> 3, 1, 2

		temp = nums[1]; //temp에 nums[1]의 값을 대체하기 전 1 저장 
		nums[1] = nums[2]; //1번자리에 2를 대입 
		nums[2] = temp; // 2번자리에 temp 대입 -> 3, 2, 1
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);			
		}
		
		
	}
}
