package com.kh.day16.network.exam1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Exam_Server {

	public static void main(String[] args) {
		System.out.println("Server");
		ServerSocket server = null; //ServerSocket : 소켓을 생성하기 위한 클래스
		try {
			System.out.println("연결기다림");
			server = new ServerSocket(4885); //포트번호 : 4885
			while(true) { //클라이언트가 접속할때마다 계속 반복해서 접속됨
				//.accept() : -> Returns:the new Socket 소켓생성
				Socket serverSocket = server.accept();
				System.out.println("클라이언트 접속 완료");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
