package com.kh.day03.array;

public class Exam_BubbleSort {
	public static void main(String[] args)
	{
		// 버블정렬이란?
		// 인접한 두개의 원소를 검사하여 정렬하는 방법
		// 구현이 쉽다는 장점이 있고, 이미 정렬된 데이터를 정렬할때 가장 빠름
		// 기본적으로 다른 정렬에 비해서는 속도가 느린편이며 역순으로 정렬할 때 가장 느림
		// {2, 5, 4, 1, 3}
		// 1. 인덱스[0], [1] 비교
		// 2. 인덱스[1], [2] 비교
		// 3. 인덱스[2], [3] 비교
		// 4. 인덱스[3], [4] 비교
		// 결론 : 가장 큰 수가 오른쪽으로 이동함.

		int [] arrs = {2, 5, 4, 1, 3};
		//안쪽 for문부터 볼 것.
		//for문 i를 한번 더 감싼 이유는 비교턴을 누적할 수록 인덱스값을 줄어드는데,
		//이 줄어드는 값을 i로 증가시켜 빼주기 위함
		//ex) 비교턴은 총 4번진행-> 첫번째 턴에서 j값이 3까지 나옴
		//	 두번째 턴에서 j값이 2까지 나옴
		// 	 세번째 턴에서 j값이 1까지 나옴
		//   마지막 네번째 턴에서 j값이 0까지 나옴
		//위 과정을 반복문에 반영시키기 위해서 중첩for문을 사용한 것.
		// (arrs.length-1)-i <-이 조건식으로 인해 i가 증가할수록 j인덱스 값은 줄어듬
		for (int i = 0; i < arrs.length-1; i++) {
			//j = 0 ~ 3 : 비교턴을 돌면서 j가 1씩 줄어듬
			//(arrs.length-1) : j는 비교턴을 총 4번을 돌기 때문에 총 인덱스 길이에서 -1한 값까지만 반복
			// (arrs.length-1)-i; : -i를 한 이유는 총 4번째 턴을 돌면서 1씩감소하는데,
			// 반복할 수록 감소하는 값이 누적되어 커지기 때문
			//->누적되어 커지는 수를 반영하기 위해 중첩반복문으로 다시 한번 겉을 감싸줌
			for(int j = 0; j < (arrs.length-1)-i; j++) {
				if(arrs[j] > arrs[j+1]) {
					int temp = arrs[j];
					arrs[j] = arrs[j+1];
					arrs[j+1] = temp;
				}			
			}			
		}
		
		
		//배열출력
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
		
		
/*============================================================================
 조건문의 과정을 살펴보면 인덱스최대값이 첫번째 턴은 3까지 증가,
 두번째 턴은 1감소해서 2까지,
 세번째 턴은 1감소해서 1까지,
 마지막 턴은 1감소해서 0이 된다.
 이를 변수로 잡고 반복문으로 대체할 수 있음.
 
 
		// {2, 5, 4, 1, 3}
		int [] arrs = {2, 5, 4, 1, 3};
		//arrs[0]이 대체되기 전 temp에 저장
		//if문으로 비교
		// 첫번째 비교 : 2하고 5 비교
		// j = 3;
		if(arrs[0] > arrs[1]) {
			int temp = arrs[0];
			arrs[0] = arrs[1];
			arrs[1] = temp; // 킵해놓은 것을 대입			
		}
		//-> 변화 없음
		//{2, 5, 4, 1, 3}
		
		// 두번째 비교 : 5하고 4 비교
		if(arrs[1] > arrs[2]) {
			int temp = arrs[1];
			arrs[1] = arrs[2];
			arrs[2] = temp; // 킵해놓은 것을 대입			
		}
		// -> 4와 5 비교해서 5가 오른쪽 이동 
		//{2, 4, 5, 1, 3}
		
		// 세번째 비교 : 5하고 1 비교
		if(arrs[2] > arrs[3]) {
			int temp = arrs[2];
			arrs[2] = arrs[3];
			arrs[3] = temp; // 킵해놓은 것을 대입			
		}
		// -> 5와 1 비교해서 5가 오른쪽 이동
		//{2, 4, 1, 5, 3}
		
		// 네번째 비교 : 5하고 3 비교
		if(arrs[3] > arrs[4]) {
			int temp = arrs[3];
			arrs[3] = arrs[4];
			arrs[4] = temp; 
		}
		// -> 5와 3 비교해서 5가 오른쪽 이동
		// {2, 4, 1, 3, 5}
		// 첫번째 턴 종료 : 가장 큰수가 제일 오른쪽으로 이동함
		//=============================================================
		// {2, 4, 1, 3, 5}
		//두번째턴 첫번째 비교 : 2와 4비교
		// j = 2; 
		if(arrs[0] > arrs[1]) {
			int temp = arrs[0];
			arrs[0] = arrs[1];
			arrs[1] = temp; 
		}
		// -> 변화없음
		// {2, 4, 1, 3, 5}
		
		//두번째턴 두번째 비교 : 4와 1비교
		if(arrs[1] > arrs[2]) {
			int temp = arrs[1];
			arrs[1] = arrs[2];
			arrs[2] = temp; 
		}
		// -> 4와 1 비교해서 4가 오른쪽이동
		// {2, 1, 4, 3, 5}
		
		//두번째 턴 세번째 비교 : 4와 3비교
		if(arrs[2] > arrs[3]) {
			int temp = arrs[2];
			arrs[2] = arrs[4];
			arrs[3] = temp; 
		}
		// -> 4와 3 비교해서 4가 오른쪽이동
		//{2, 1, 3, 4, 5}
		// 두번째 턴 종료 : 두번째로 큰수가 오른쪽에서 두번째로 이동함
		//=============================================================
		//{2, 1, 3, 4, 5}
		// 세번째 턴 첫번째 비교 : 2와 1 비교
		// j = 1
		if(arrs[0] > arrs[1]) {
			int temp = arrs[0];
			arrs[0] = arrs[1];
			arrs[1] = temp; 
		}
		//-> 2와 1비교해서 2가 오른쪽 이동
		//{1, 2, 3, 4, 5}
		
		// 세번째 턴 두번째 비교 : 2와 3 비교
		if(arrs[1] > arrs[2]) {
			int temp = arrs[1];
			arrs[1] = arrs[2];
			arrs[2] = temp; 
		}
		// 변화없음.
		//{1, 2, 3, 4, 5}
		// 세번째 턴 종료 : 두번째로 큰수가 오른쪽에서 두번째로 이동함
		//=============================================================
		//{1, 2, 3, 4, 5}
		//네번째 턴 첫번째 비교 : 1과 2 비교
		// j = 0;
		if(arrs[0] > arrs[1]) {
			int temp = arrs[0];
			arrs[0] = arrs[1];
			arrs[1] = temp; 
		}
		// 변화없음.
		//{1, 2, 3, 4, 5}
		// 모든 비교 종료-> 총 4번 돌면서 비교함
		*/
	}
}