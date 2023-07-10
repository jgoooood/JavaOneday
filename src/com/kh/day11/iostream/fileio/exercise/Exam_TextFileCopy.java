package com.kh.day11.iostream.fileio.exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Exam_TextFileCopy {

	public static void main(String[] args) {
		//문자 스트림 FileReader와 FileWriter를 이용하여 
		// C:\Windows\System.ini를 c:\Temp\system.txt파일로 복사하는 프로그램을 작성
		Reader reader = null;
		Writer writer = null;
		//File 객체를 만들어 사용하는것이 일반적
		File src = new File("C:\\Windows\\System.ini"); //원본파일 경로명
		File dest = new File("c:\\Temp\\system.txt");  // 복사 파일 경로명
		try {
			//파일 읽기
			reader = new FileReader(src); // 넘겨줄때 객체로 넘겨줌
			//Temp폴더 없으면 폴더생성
			File folderMake = new File("c:\\Temp");
			if(!folderMake.exists()) {
				folderMake.mkdir();
			}
			
			writer = new FileWriter(dest); //넘겨줄때 객체로 넘겨줌

			char [] cBuf = new char[100];
			int readCharCount;
			String result = "";
			while(true) {
				readCharCount = reader.read(cBuf, 0, 100);
				if(readCharCount == -1) break;
				result += new String(cBuf, 0, readCharCount);
				//write메소드 자리->읽은 값을 써서 파일에 저장해야하기 때문
				writer.write(result);
			}

			//파일 쓰기
			writer.flush();
			System.out.println("파일 복사완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
