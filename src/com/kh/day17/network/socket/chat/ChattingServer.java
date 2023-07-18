package com.kh.day17.network.socket.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChattingServer {

	public static void main(String[] args) {
		// 채팅서버를 구동 중입니다...
		// 채팅서버를 구동하였습니다..
		// 클라이언트의 접속을 기다리고 있습니다.
		// 클라이언트가 접속하였습니다.
		// 채팅이 시작되었습니다.
		// 서버(나) : 하이
		// 클라이언트(상대) : 네네
		ServerSocket serverSocket = null; // 1. ServerSocket 대기
		int port = 8888;
		// 4. 주스트림 초기화
		InputStream is = null;
		OutputStream os = null;
		// 6. 보조스트림 초기화, 기본 데이터타입 입출력
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		try { // 1. 가이드메시지 작성
			System.out.println("채팅서버를 구동 중입니다...");
			// 2. ServerSocket객체생성과 포트번호 부여->포트번호는 위에서 초기화
			serverSocket = new ServerSocket(port);
			System.out.println("채팅서버를 구동하였습니다..");
			System.out.println("클라이언트의 접속을 기다리고 있습니다.");
			// 3. 접속허용 accept() -> Returns:the new Socket
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트가 접속하였습니다.");
			// 5. 주스트림 소켓 연결
			is = socket.getInputStream();
			os = socket.getOutputStream();
			// 7. 보조스트림 객체생성과 동시에 주스트림 연결
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			System.out.println("채팅이 시작되었습니다.");
			while (true) { //무한반복 서버에서 먼저 메시지 전송
				// ================= 서버 구동 완료 =================
				// 8. 보조스트림으로 데이터 보내기 : writeUTF 입력값을 통채로 전송
				System.out.print("서버(나) : ");
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg); // 메시지전송
				dos.flush();
				// 9. 보조스트림으로 데이터 받기
				String recvMsg = dis.readUTF();
				System.out.printf("클라이언트(상대) : %s\n", recvMsg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
