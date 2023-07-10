package com.kh.day11.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_Read {

	public static void main(String[] args) {
		// Reader reader = new Reader();
		// Cannot instantiate the type Reader
		// 추상클래스이기 때문에 객체생성불가
		
		Reader reader = null;
		try {
			// 로드할 파일의 경로 지정
			// Unhandled exception type FileNotFoundException
			// FileNotFoundException -> try-catch구문강제
			// 이런 강제된 예외들을 Checked Exception이라고 함
			reader = new FileReader("src/com/kh/day11/iostream/reading.txt");
			// 파일 읽는 메소드 호출
			// Unhandled exception type IOException 
			// -> IOException도 catch구문에 추가
			while(true) {
				int readData = reader.read();
				if(readData == -1) break;
				System.out.print((char)readData); //문자타입으로 강제형변환			
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//Unhandled exception type IOException -> try-catch구문사용
			try {
				//항상 스트림은 자원을 꼭 해제해 주어야  함
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
