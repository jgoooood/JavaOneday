package com.kh.day12.sort;

public class Exam_InsertionSort {
	public static void main(String[] args) {
		
	
	//삽입정렬
	int [] nums = {5, 7, 2, 1, 4};
	for(int i = 1; i < nums.length; i++) {
		for(int j = 1; j > 0; j--) {
			if(nums[j-1] > nums[j]) { //0과 1 비교
				int temp = nums[j-1];
				nums[j-1] = nums[j];
				nums[j] = temp;
			}
		}		
	}
	
	for(int i : nums) {
		System.out.print(i + "");
	}
	// 5, 7, 2, 1, 4 //첫번째 결과 : 7부터 시작해 작으면 왼쪽으로 이동->5<7=이동없음
	
	// 5, 2, 7, 1, 4 // 7 > 2 : 자리이동
	// 2, 5, 7, 1, 4 // 5 > 2 : 자리이동 두번째결과
	
	// 2, 5, 1, 7, 4 // 7 > 1 : 자리이동
	// 2, 1, 5, 7, 4 // 5 > 1 : 자리이동
	// 1, 2, 5, 7, 4 // 2 > 1 : 자리이동 세번째 결과
	
	// 1, 2, 5, 4, 7
	// 1, 2, 4, 5, 7 네번째 결과
	// 1, 2, 4, 5, 7 네번째 결과
	// 1, 2, 4, 5, 7 네번째 결과
	}
}
	

