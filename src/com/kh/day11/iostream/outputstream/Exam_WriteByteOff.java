package com.kh.day11.iostream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_WriteByteOff {

	public static void main(String[] args) {
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("src/com/kh/day11/iostream/outputting3.txt");
			byte [] data = "레알 입출력".getBytes();
			os.write(data, 0, 16); //시작위치, 문자개수를 지정해 파일 작성->Real
			//os.write(data, 0, 5); 
			//한글은 2바이트이기 때문에 출력할 개수가 2바이트의 배수가 아니면 한글깨짐
			//->한글 이용시 바이트스트림보다는 문자스트림으로 쓰는 것이 좋음
			//->바이트스트림은 바이트기준으로, 문자스트림은 문자기준으로 데이터를 처리하기 때문
			os.flush(); //버퍼지우기
			System.out.println("쓰기 완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
