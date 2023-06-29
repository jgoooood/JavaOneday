package com.kh.day04.dimarray;

public class Exam_DimArray {
	public static void main (String [] args) 
	{
		//2차원배열은 영화관 관련 등 자리를 설정할 때 많이 쓰임
		int num = 0;
		int [] nums = new int[10]; 
		//배열의 선언 = 배열의 할당
		int [][] dimNums = new int[2][5];
		//2개 배열 1개에 또 다른 배열 5개가 들어가 있음
		//->총2*5 = 10개의 데이터가 들어감(2행5열테이블)
		System.out.println("앞의 크기 : "+dimNums.length);
		System.out.println("뒤의 크기 : "+dimNums[0].length);
		System.out.println("뒤의 크기 : "+dimNums[1].length);
		
	
		int [][] arrs = new int[4][4];
		//입력
		int k = 1;
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				arrs[i][j] = k;
				k++;
			}			
		}
//		arrs[0][0] = 1; 	//1행1열
//		arrs[0][1] = 2;
//		arrs[0][2] = 3;
//		arrs[0][3] = 4;
//		
//		arrs[1][0] = 5; 	//2행1열
//		arrs[1][1] = 6;
//		arrs[1][2] = 7;
//		arrs[1][3] = 8;
//		
//		arrs[2][0] = 9; 	//3행1열
//		arrs[2][1] = 10;
//		arrs[2][2] = 11;
//		arrs[2][3] = 12;
//		
//		arrs[3][0] = 13; 	//3행1열
//		arrs[3][1] = 14;
//		arrs[3][2] = 15;
//		arrs[3][3] = 16;
		
		//출력
//		System.out.print(arrs[0][0] + " ");
//		System.out.print(arrs[0][1] + " ");
//		System.out.print(arrs[0][2] + " ");
//		System.out.print(arrs[0][3] + " ");
//		System.out.println();
//		System.out.print(arrs[1][0] + " ");
//		System.out.print(arrs[1][1] + " ");
//		System.out.print(arrs[1][2] + " ");
//		System.out.print(arrs[1][3] + " ");
		
		//2차원배열 출력
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				System.out.print(arrs[i][j] + " ");
			}
			System.out.println();
		}
	}
}
