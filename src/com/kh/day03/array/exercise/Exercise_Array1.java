package com.kh.day03.array.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Array1 {
	
	public void exercise1() {
		/*
		// 양수 5개를 입력받아 배열에 저장하고, 제일 큰수를 출력하는 프로그램을 작성하라.
		Scanner sc = new Scanner(System.in);
		//배열의 선언을 먼저하고 입력받은 값을 배열에 넣어주어야 함.
		int nums[] = new int[5];
		//반복문으로 입력값을 배열에 순차적으로 넣기
		// for(int i = 0; i < nums.length; i++) {
		// 	nums[i] = sc.nextInt();
		// }
		// 최대값을 비교해 넣을 변수하나 선언 : max->값을 비교해서 가장 큰수를 담음
		int max = 0;
		for(int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
			if(nums[i] > max) {  //조건문으로 max(현재값0)보다 크면
				max = nums[i];	// 배열의 값을 max에 저장		 
			}
		}
		System.out.println("가장 큰 수는 " + max + "입니다.");
		
		// 아래의 코드를 반복문으로 변경
		// nums[0] = sc.nextInt();
		// nums[1] = sc.nextInt();
		// nums[2] = sc.nextInt();
		// nums[3] = sc.nextInt();
		// nums[4] = sc.nextInt();
		 
		 */
	}
	
	public void exercise2() {
		/*
		// 배열의 length 필드를 이용하여 배열 크기만큼 정수를 입력 받고 
		// 평균을 구하는 프로그램을 작성하라. (단, 배열의 크기는 5이다.)
		
		int [] arrs = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		for(int i = 0; i < arrs.length; i++) {
			arrs[i] = sc.nextInt();
		}
		
		// 배열에 저장된 값을 이용하여 평균구하기
		// for arrs.length. typeTrans, 누적합
		int sum = 0; //누적할 변수 선언
		for(int j = 0; j < arrs.length; j++) {
			sum += arrs[j];
		}
		System.out.println("평균 : " + (double)sum/arrs.length);
		//2,3,4,5,9 입력시 평균 4가 나옴
		//->int형으로 나오기때문에 소수점까지 확인하려면 형변환해줌
		*/
	}
	
	public void arryCopyExercise() {
		// 사용자에게 주민번호를 입력 받은 후
		// 성별자리 이후부터 *로 저장되어 출력되도록 프로그램을 작성하시오
		// 230515-1231514 -> 230515-1******
		// 231026-1231515 -> 231026-1******
		// 배열의 크기는 14개
		char [] origin = new char[14];
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호 입력 : ");
		//문자열로 입력받아 하나씩 origin배열에 넣음
		String memberNum = sc.next();
		for(int i = 0; i < origin.length; i++) {
			//하나씩 찢어서 문자배열로 넣어줌
			origin[i] = memberNum.charAt(i);
		}
		// 깊은 복사->새로 배열을 생성해서 할당함
		char [] copy = new char[14];
		for(int i = 0; i < origin.length; i++) {
			if(i < 8) {
				copy[i] = origin[i];	//성별자리까지는 그대로 복사해서 차례대로 갑을 대입
			} else {
				copy[i] = '*'; 			//성별자리 이후부터는 마스킹처리해 복사되도록 조건식추가
			}
		}
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i]);
		}
		
		//기존방식은 문자하나하나가 잘려서 입력되기때문에 총 14번 입력해야함->불편
		// origin[i] = sc.next().charAt(0);
		// 문자열로 입력받아서 문자하나씩을 배열에 넣어주는 방식을 사용
	}
	
	//**가장 어려움**
	public void lottoExercise() {
		// 로또 번호 자동 생성기 프로그램, 중복 없이 추출하기
		// 단, 결과는 오름차순으로 정렬
		// 로또 번호는 6개. 로또 번호의 범위는 1 ~ 45
		int [] lottoNums = new int[6];
		Random rand = new Random();
		//로또번호 6개 추출
		// 22 16 22 45 6 29  <-로또번호
		// 22 1 39 14 14 19  <-
		// 0 1 2 3 4 5 <-인덱스

		//for문으로 랜덤수 중복없이 넣기
		for(int i = 0; i < 6; i++) {
			lottoNums[i] = rand.nextInt(45)+1;
			for(int e = 0; e < i; e++) {
				if(lottoNums[i] == lottoNums[e]) {	
					//다시 뽑기
					i--; //이전 i 값으로 돌아가게 함
					break; 
				}
			}
		}
		
		//버블정렬
		for(int i = 0; i < lottoNums.length-1; i++) {
			for(int j = 0; j < (lottoNums.length-1)-i; j++) {
				if(lottoNums[j] > lottoNums[j+1]) {
					int tmp = lottoNums[j];
					lottoNums[j] = lottoNums[j+1];
					lottoNums[j+1] = tmp;
				}
			}
		}
	
// 1. 로또 번호 6개 추출 (중복은 있음)
//		lottoNums[0] = rand.nextInt(45)+1;
//		lottoNums[1] = rand.nextInt(45)+1;
//		lottoNums[2] = rand.nextInt(45)+1;
//		lottoNums[3] = rand.nextInt(45)+1;
//		lottoNums[4] = rand.nextInt(45)+1;
//		lottoNums[5] = rand.nextInt(45)+1;
//	->반복문으로
// for(int j = 0; j < lottoNums.length; j++) {
//		lottoNums[j] = rand.nextInt(45)+1;
//	}
//		2. 중복없애기 -> if문으로 작성해보고 for문으로 바꿔보기
//		for(int j = 0; j < lottoNums.length; j++) {
//			lottoNums[j] = rand.nextInt(45)+1;
//			//=======첫번째 비교
//			if(lottoNums[1]==lottoNums[0]) {
//				//먼저 뽑은 인덱스[0]번값과 인덱스[1]이 같으면 다시 뽑기
//			}
//			//=======두번째 비교
//			if(lottoNums[2]==lottoNums[1]) {
//				//먼저 뽑은 인덱스[1]번값과 인덱스[2] 같으면 다시 뽑기
//			}
//			if(lottoNums[2]==lottoNums[0]) {
//				//먼저 뽑은 인덱스[0]번값과 인덱스[2]이 같으면 다시 뽑기
//			}
//			//=======세번째 비교
//			if(lottoNums[3]==lottoNums[2]) {
//				//먼저 뽑은 인덱스[2]번값과 인덱스[3] 같으면 다시 뽑기
//			}
//			if(lottoNums[3]==lottoNums[1]) {
//				//먼저 뽑은 인덱스[1]번값과 인덱스[3]이 같으면 다시 뽑기
//			}
//			if(lottoNums[3]==lottoNums[0]) {
//				//먼저 뽑은 인덱스[0]번값과 인덱스[3]이 같으면 다시 뽑기
//			}
//			//=======네번째 비교
//			if(lottoNums[4]==lottoNums[3]) {
//				//먼저 뽑은 인덱스[2]번값과 인덱스[3] 같으면 다시 뽑기
//			}
//			if(lottoNums[4]==lottoNums[2]) {
//				//먼저 뽑은 인덱스[2]번값과 인덱스[3] 같으면 다시 뽑기
//			}
//			if(lottoNums[4]==lottoNums[1]) {
//				//먼저 뽑은 인덱스[1]번값과 인덱스[3]이 같으면 다시 뽑기
//			}
//			if(lottoNums[4]==lottoNums[0]) {
//				//먼저 뽑은 인덱스[0]번값과 인덱스[3]이 같으면 다시 뽑기
//			}
//			//=======다섯번째 비교
//			if(lottoNums[5]==lottoNums[4]) {
//				//먼저 뽑은 인덱스[2]번값과 인덱스[4] 같으면 다시 뽑기
//			}
//			if(lottoNums[5]==lottoNums[3]) {
//				//먼저 뽑은 인덱스[2]번값과 인덱스[4] 같으면 다시 뽑기
//			}
//			if(lottoNums[5]==lottoNums[2]) {
//				//먼저 뽑은 인덱스[2]번값과 인덱스[4] 같으면 다시 뽑기
//			}
//			if(lottoNums[5]==lottoNums[1]) {
//				//먼저 뽑은 인덱스[1]번값과 인덱스[3]이 같으면 다시 뽑기
//			}
//			if(lottoNums[5]==lottoNums[0]) {
//				//먼저 뽑은 인덱스[0]번값과 인덱스[3]이 같으면 다시 뽑기
//			}
//		}
//		->중복없이 1~45 사이의 랜덤한 수를 6개 뽑는 for문
//		for(int i = 0; i < 6; i++) {
//			lottoNums[i] = rand.nextInt(45)+1;
//			for(int e = 0; e < i; e++) {
//				if(lottoNums[i] == lottoNums[e]) {	
//					//다시 뽑기
//					i--; //이전 i 값으로 돌아가게 함
//					break; 
//				}
//			}
//		}
		
//		3. 버블정렬로 오름차순 정렬
//		for의 변수가 증가하기만 하면되기 때문에 쉬움
//		단, 안에 있는 for문의 조건식의 최대값은 감소(-i)해야함
//		for(int i = 0; i < lottoNums.length-1; i++) {
//			for(int j = 0; j < (lottoNums.length-1)-i; j++) {
//				//왼쪽이 크면 자리 바꾸기
//				if(lottoNums[j] > lottoNums[j+1]) {
//					//왼쪽에 있는 값이 지워지기 전에 킵
//					int tmp = lottoNums[j];
//					//오른쪽에 있는 값을 왼쪽에 대입
//					lottoNums[j] = lottoNums[j+1];
//					//킵해놓은 것을 오른쪽에 대입
//					lottoNums[j+1] = tmp;
//				}
//			}
//		}
	
		
		for(int i = 0; i < lottoNums.length; i++) {
			System.out.print(lottoNums[i]+" ");
		}
	}
	
	
	public static void main (String[] args) 
	{
	}
}
