package com.kh.day11.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadCharOff {

	public static void main(String[] args) {
		Reader reader = null;
		try {
			reader = new FileReader("src/com/kh/day11/iostream/reading.txt");
			char [] cBuf = new char[3];
			int readCharCount;
			String result = "";
			while(true) {
				// reader.read(cBuf, 0, 3); 읽고 저장할 데이터 순서를 지정가능
				readCharCount = reader.read(cBuf, 0, 3);
				if(readCharCount == -1) break; 
				result += new String(cBuf, 0, readCharCount);
			}
			System.out.println(result);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
