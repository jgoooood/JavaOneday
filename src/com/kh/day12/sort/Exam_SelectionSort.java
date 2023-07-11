package com.kh.day12.sort;

public class Exam_SelectionSort {

	public static void main(String[] args) {
		//선택정렬 : 최소값을 선택해서 교환
		//복잡하지만 빠름
		int [] nums = {5, 7, 2, 1, 4};
		int min; //인덱스값비교할 변수
		for(int i = 0; i < nums.length; i++) {
			min = i;
			for(int j = i+1; j < nums.length; j++) {
				if (nums[min] > nums[j]) {
					// 작은 값 있으면 그 인덱스값을 min 변수에 저장
					min = j;
				}
			}
			int temp = nums[min];
			nums[min] = nums[i];
			nums[i] = temp;
		}
		for(int i : nums) {
			System.out.print(i + " ");
		}
		// 첫번째 값, 오른쪽값 비교
		// 5, 7, 2, 1, 4 
		
		// 1, 7, 2, 5, 4 // 첫번째결과
		
		// 1, 2, 7, 5, 4 // 두번째 결과
		
		// 1, 2, 4, 5, 7 // 세번째 결과
		
		// 1, 2, 4, 5, 7 // 네번째 결과(더이상 정렬할 것이 없음)
	}

}
