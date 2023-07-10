package com.kh.day11.iostream.fileio;

import java.io.File;
import java.io.IOException;

public class Exam_File {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\user1\\Downloads\\salad.jpg");
		String fileName = file.getName(); 	//파일명가져옴
		String path 	= file.getPath(); 	//파일경로가져옴
		String parent 	= file.getParent(); //파일의 부모폴더 경로를 가져옴
		System.out.printf("파일 이름 : %s \n파일 경로 : %s \n부모 폴더 : %s \n"
				, fileName
				, path
				, parent);
		
		System.out.printf("파일이 존재하는가 ? : %b\n파일이 맞는가? : %b\n폴더가 맞는가? : %b"
				, file.exists() //파일이 존재하는지 확인->boolean
				, file.isFile() //파일이 맞는지 확인->boolean
				, file.isDirectory()); //폴더가 맞는지 확인->boolean

	}
	
	//폴더생성메소드
	public void folderMake() {
		File folderMake = new File("src/com/kh/day11/iostream/fileio/newfolder");
		// mkdirs() 메소드는 폴더를 만드는 메소드인데 계층형 폴더를 한번에 만들어줌
		folderMake.mkdir(); 
		System.out.println("폴더가 만들어졌습니다.");
	}
	
	//파일생성메소드 -> 내용은 넣을 수 없음
	public void fileMake() {
		try {
			File fileMake = new File("src/com/kh/day11/iostream/fileio/file1.txt"); //파일을 생성시켜주는 메소드
			fileMake.createNewFile();
			System.out.println("파일이 만들어졌습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}

}
