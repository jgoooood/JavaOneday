package com.kh.day11.iostream.fileio.exercise;

import java.io.File;

public class Exam_ShowFileList {

	public static void main(String[] args) {
		System.out.println("C:\\windows, C:\\, windows");
		System.out.println("-----C:\\windows의 서브 리스트 입니다.-----");
		File file = new File("C:\\windows");


		//file.listFiles 타입 : 배열
		File[] subFiles = file.listFiles();
		for(int i = 0; i < subFiles.length; i++) {
			File fOne = subFiles[i];
			long time = fOne.lastModified();
			System.out.printf("%-35s",fOne.getName());
			System.out.print("파일 크기 : " + fOne.length() + "\t");
			// %tb : 현재의 날짜를 영문 약자(월) 형식으로 출력(한글은 숫자+월 출력)
			// %td : 현재의 날짜를 01~31(일) 형식으로 출력
			// %ta : 현재의 날짜를 요일 영문 약자 형식으로 출력(한글 월/화/수 ... 출력)
			// %tT : 현재의 시간을 몇시:몇분:몇초 형식으로 출력
			System.out.printf("\t 수정한 시간 : %tb %td %ta %tT \n"
					, time
					, time
					, time
					, time);
		}
		
	}

}
