package com.kh.day11.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadChar {
	public static void main(String[] args) {
		//Cannot instantiate the type Reader -> Reader는 추상클래스라 객체생성불가
		//Reader reader = new Reader();	
		Reader reader = null;
		
		try {
			reader = new FileReader("src/com/kh/day11/iostream/reading.txt");
			int readCharCount;
			char [] cBuf = new char[3]; // 배열->문자를 3개를 읽음
			//int i = 0;
			String result = "";
			while(true) {
				// 읽은 문자를 저장하고 그 수를 리턴
				readCharCount = reader.read(cBuf);
				// System.out.print(readCharCount);
				if(readCharCount == -1) break; //다 읽으면 while종료
				result += new String(cBuf, 0, readCharCount); //읽은 곳 까지 문자열로 변환
//				for(char c : cBuf) {
//					System.out.print(c); //jav 출력
//				}
//				System.out.println();
				//i++;
				//3jav3a/o3rac3le/3jdb1cdb-1cdb-1cdb-1cdb-1cdb 출력
				//3jav -> readCharCount+cBuf값이 합쳐져 출력
				//-1cdb -> readCharCount가 -1이 뜬다는 것은 더이상 출력할게 없다는 의미
				//다 읽게 코드 수정 후 출력 jav
//				a/o
//				rac
//				le/
//				jdb
//				cdb
				// 마지막이 cdb가 나오는 이유 : 3자리 배열의 덮어 씌우는데 마지막 2자리가 덮어씌울 값이 없어 변경안됨
			}
			System.out.println(result); // java/oracle/jdbc 마지막 2문자가 제거된 상태로 나옴
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { //예외발생과 상관없이 무조건 실행됨
			try {
				reader.close(); //협업을 위해 스트림은 항상 닫아줌
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
