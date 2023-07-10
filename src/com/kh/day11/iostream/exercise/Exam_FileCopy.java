package com.kh.day11.iostream.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam_FileCopy {

	public static void main(String[] args) {
		// c드라이브의 파일을 e드라이브로 복사
		// 입력 스트림 
		InputStream is = null;
		// 출력 스트림
		OutputStream os = null;
		try {
			//복사할 파일 위치한 경로와 파일명
			is = new FileInputStream("C:\\Users\\user1\\Downloads\\salad.jpg");
			//복사한 파일 저장할 경로와 파일명
			os = new FileOutputStream("C:\\Users\\user1\\Desktop\\교재\\JAVA\\salad.jpg");
			byte [] readBytes = new byte[1024];
			int readByteCount; 
			//파일 복사 -> 읽어 들인 후 원하는 경로에 출력하기
			while((readByteCount = is.read(readBytes)) != -1) {
//				System.out.println(readBytes);
				os.write(readBytes, 0, readByteCount); // 읽은 자리수까지만 복사
				os.flush(); //버퍼비우기
			};
			System.out.println("복사가 완료되었습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try { //자원해제
				is.close();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
