package com.kh.day16.network.exam2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Exam_DataServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		InputStream is =null;
		OutputStream os = null;
		try {//포트는 실행중인 프로그램과 구분해주는 도구
			serverSocket = new ServerSocket(4885);
			System.out.println("서버 소켓 생성완료");
			System.out.println("클라이언트 연결 대기중...");
			Socket socket = serverSocket.accept(); //대기중
			System.out.println("연결수락됨");
			//========================== 데이터 받기 ==========================
			is = socket.getInputStream();
			byte [] bytes = new byte[1024];
			int readByteNo = is.read(bytes);
			String message = new String(bytes, 0, readByteNo); //배열을 스트링으로 변경해줌
			System.out.printf("데이터 받기 성공 : %s\n", message);
			//=================================================================
			//========================== 데이터 보내기==========================
			os = socket.getOutputStream();
			message = "Hello Client";
			byte [] buf = message.getBytes();
			os.write(buf);
			os.flush();
			System.out.println("데이터전송 완료");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
