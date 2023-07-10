package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {

	public static void main(String[] args) {
		InputStream is = null;
		//Unhandled exception type FileNotFoundException -> Checked Exception
		try {
			is = new FileInputStream("src/com/kh/day11/iostream/reading.txt");
			int readByte; // 읽은 바이트를 리턴함
//			while(true) {
//				readByte = is.read();
//				//if(readByte == -1) break;
//				System.out.print((char)readByte);
//			}
			//do~while문으로도 작성가능
			do {
				readByte = is.read();
				System.out.print((char)readByte);
			} while(readByte != -1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
