package com.kh.day03.array.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_For {
	public void exercise1() {

		// 1부터 10까지의 덧셈을 표시하고 합도 구하시오.
		// 1+2+3+4+5+6+7+8+9+10=55
		//		int sum = 0;
		//		for(int i = 1; i <= 10; i++) {
		//			sum += i;
		//			if(i < 10) {
		//				System.out.print(i + "+");				
		//			} else {
		//				System.out.print(i + "=");
		//			}
		//		}
		//		System.out.println(sum);

		
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i; 
			if(i <= 9) {
				System.out.print(i + "+");
			} else {
				System.out.print(i);
			}
		}
		System.out.println("=" + sum);
	}
	
	public void exercise2() {
		// 정수를 하나 입력받아서 그 수가 1 ~ 9 사이의 수일 때만
		// 그 수의 구구단을 출력하세요.
		// 단, 조건이 맞지 않으면 "1 ~ 9사이의 양수를 입력하여야 합니다"를 출력하세요.
		System.out.println("정수를 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		
		if(dan > 0 && dan < 10) {
			for(int i = 1; i < 10; i++) {
				System.out.println(dan + "단");
				for(int j = 1; j < 10; j++) {
					System.out.println(dan + " * " + j + " = " + dan*j);
				}
			}
		} else {
			System.out.println("1~9사이의 숫자를 입력해주세요.");
		}
	}
	
	public void forDoubleExercise1() {
		//구구단 출력
		// System.out.println("2단");
		// for(int h = 1; h < 10; h++) {
		//	System.out.println("2 * " + h + " = " + 2*h);
		// }
		//		
		// System.out.println("3단");
		// for(int h = 1; h < 10; h++) {
		// 	System.out.println("3 * " + h + " = " + 3*h);
		// }
		//		
		// System.out.println("4단");
		// for(int h = 1; h < 10; h++) {
		// 	System.out.println("4 * " + h + " = " + 4*h);
		// }
		
		
		//		반복문
		//for(int k = 2; k < 10; k++) {
		//	System.out.println(k + "단"); 
		//	for(int h = 1; h < 10; h++) {
		//		System.out.println(k + " * " + h + " = " + k*h);
		//	}	
		//}
		
		//중첩for문 1. 띄어쓰기 되게 출력
		//System.out.print("2 * 1 = 2\t");
		//System.out.print("3 * 1 = 3\t");
		//System.out.print("4 * 1 = 4\t");
		//System.out.print("5 * 1 = 5\t");
		//System.out.print("6 * 1 = 6\t");
		//System.out.print("7 * 1 = 7\t");
		//System.out.print("8 * 1 = 8\t");
		//System.out.print("9 * 1 = 9\t");
		//System.out.println();
		//System.out.print("2 * 2 = 4\t");
		//System.out.print("3 * 2 = 6\t");
		//System.out.print("4 * 2 = 8\t");
		//System.out.print("5 * 2 = 10\t");
		//System.out.print("6 * 2 = 12\t");
		//System.out.print("7 * 2 = 14\t");
		//System.out.print("8 * 2 = 16\t");
		//System.out.print("9 * 2 = 18\t");
		
		//중첩for문 2. 규칙찾아서 for문으로
		// \t 자리수 맞춰줌
		for(int k =1; k < 10; k++) {
			for(int h = 2; h < 10; h++) {
				System.out.print(h + " * " + k + " = " + h*k + "\t");
			}
			System.out.println();
		}		
	}
	
	public void forDoubleExercise2() {
		System.out.println("0시 0분부터 23시 59분까지 출력하기");
		for(int i = 0; i < 24; i++) {
			for(int j = 0; j < 60; j++) {
				System.out.printf("%2d시 %2d분\n", i, j);
				//println : 개행 여부차이
				//printf : 자리수 맞춰서 출력 (다른방식->형식문자)
				//%자릿수d : digital의 d , 자릿수에 맞춰서 출력됨.
				// \n : 개행
			}
		}
	}
	
	public void forDoubleExercise3() {
		int count = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 1; j <= count; j++) {
				System.out.print("*");
			}
			count++;
			System.out.println(" ");
		} 

		// 1. 별 10개가 나란히 출력됨.
		//for (int a = 1; a <= 10; a++) {
		//	System.out.print("*");
		//}

		// 2. 별 10개가 10번 출력되도록 함.
		//for (int b = 1; b <= 10; b++) {
		//	for (int a = 1; a <= 10; a++) {
		//		System.out.print("*");
		//	}
		//	System.out.println(" ");
		//}

		// 3. 10번을 변수로
		//for (int b = 1; b <= 10; b++) {
		//	for (int a = 1; a <= 10; a++) {
		//		System.out.print("*");
		//	}
		//	System.out.println(" ");
		//}
	}
	public void loopExercise() {
		// 반복문_실습문제_01
		
		//1번
		//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		//단, 입력한 수는 1보다 크거나 같아야 합니다.
		//만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int input = sc.nextInt();
		int numbers = 0;
		
		if(input < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for(int i = 1; i <= input; i++) {
				numbers = i;
				System.out.println(numbers);
			}			
		}
		//2번
		//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		//단, 입력한 수는 1보다 크거나 같아야 합니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int input = sc.nextInt();
		int numbers = 0;
		if(input < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for(int i = input; i >= 1; i--) {
				numbers = i;
				System.out.println(numbers);
			}			
		}
		//3번
		//1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.    
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int input = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= input; i++) {
			sum += i;
			if (i != input) {
				System.out.print(i + " + ");					
			} else {
				System.out.print(i + " = ");
			}
		}
		System.out.println(sum);
		
		//4번  
		//사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		//만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 두 개를 입력하세요.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum = 0;
		if (num1 >= 1 && num2 >= 1) {
			if (num1 < num2) {
				for(int i = num1; i <= num2; i++) {
					sum = i;
					System.out.println(sum);
				}							
			} else if (num1 > num2) {
				for(int i = num2; i <= num1; i++) {
					sum = i;
					System.out.println(sum);
				}	
			} else {
				System.out.println(num1);
				System.out.println("동일한 숫자 2개를 입력하셨습니다.");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		//5번
		// 사용자로부터 입력 받은 숫자의 단을 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int dan = sc.nextInt();
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + dan*i);
		}
		//6번  
		//사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		//단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요 : ");
		int dan = sc.nextInt();
		int dans = dan;
		if(dan > 9) {
			System.out.println("9 이하의 숫자만 입력해주세요.");
		} else {
			for(int i = dan; i <= 9; i++) {
				for(int j = 1; j <=9; j++) {
					System.out.println(dans + " * " + j + " = " + dans*j);
				}
				dans++;
				System.out.println(" ");
			}			
		}
	}
	

	public static void main (String[] args) {
		//가위바위보 게임
		Random rand = new Random();
		int computer = rand.nextInt(3)+1;
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 가위 바위 보 게임 ====");
		System.out.print("숫자를 선택하세요(1.가위 / 2.바위 / 3. 보) : ");
		int choice = sc.nextInt();
		System.out.println("======== 결과 ========");
		if(choice == 1) {
			System.out.println("당신은 가위를 냈습니다.");
		} else if (choice == 2) {
			System.out.println("당신은 바위를 냈습니다.");
		} else if (choice == 3) {
			System.out.println("당신은 보를 냈습니다.");
		} else {
			System.out.println("1~3 사이의 숫자를 선택하세요.");
		}
		
		if(computer == 1) {
			System.out.println("컴퓨터는 가위를 냈습니다.");
		} else if (computer == 2) {
			System.out.println("컴퓨터는 바위를 냈습니다.");
		} else {
			System.out.println("컴퓨터는 보를 냈습니다.");
		}

		System.out.println("======================");
		
		if (choice < computer) {
			System.out.println("당신은 졌습니다.");
		} else if (choice > computer) {
			System.out.println("당신은 이겼습니다.");
		} else {
			System.out.println("당신은 비겼습니다.");
		}

	}
}
	
