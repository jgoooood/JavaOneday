package com.kh.day16.network.exam3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Exam_ChattingServer {

	public static void main(String[] args) {
		//대기할 소켓 생성
		ServerSocket serverSocket = null;
		OutputStream os = null;
		InputStream is = null;
		Scanner sc = new Scanner(System.in);
		try {
			serverSocket = new ServerSocket(7777); //포트번호 설정 후 연결 대기
			System.out.println("서버 소켓 생성");
			System.out.println("클라이언트 접속 대기중...");
			Socket socket = serverSocket.accept();
			//연결 된 후에는 소켓 객체 생성
			System.out.println("클라이언트 접속 완료");
			// 2. 데이터받기
			// 프로그램 기준 들어오니까 InputStream
			is = socket.getInputStream();
			byte [] bytes = new byte[1024];
			// 읽을 때에는 read() 메소드 사용
			int readByteNo = is.read(bytes);
			//bytes에 읽은 데이터, readByteNo은 읽은 개수
			//byte로 출력할 수 없어서 문자열로 만들어줌
			String message = new String(bytes, 0, readByteNo);
			System.out.printf("클라이언트(상대) : %s\n", message);
			//==================== 받기 완료 ====================
			// 3. 데이터 보내기
			os = socket.getOutputStream();
			System.out.println("서버(나) : ");
			message = sc.nextLine(); //message 재할당
			bytes = message.getBytes(); //bytes배열 재할당
			os.write(bytes);
			os.flush();
			System.out.println("데이터 전송 성공");
			//==================== 보내기 완료 ====================

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
