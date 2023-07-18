package com.kh.day17.network.socket.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChattingClient {

	public static void main(String[] args) {
		// 서버에 연결중입니다.
		// 채팅서버에 접속하였습니다.
		// 서버와의 채팅을 시작합니다.
		// 서버(상대) : 하이
		// 클라이언트(나) : 네네
		// 3. ip주소, port번호 초기화
		String address = "127.0.0.1";
		// 4. 주스트림 초기화
		InputStream is = null;
		OutputStream os = null;
		// 6. 보조스트림 초기화, 기본 데이터타입 입출력
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		int port = 8888;
		try { // 1. 가이드메시지 작성
			System.out.println("서버에 연결중입니다.");
			// 2. socket 객체생성->서버연결 생성자에 ip, port주소 매개변수로 전달
			Socket socket = new Socket(address, port);
			System.out.println("채팅서버에 접속하였습니다.");
			// 5. 주스트림 소켓 연결
			is = socket.getInputStream();
			os = socket.getOutputStream();
			// 7. 보조스트림 객체생성과 동시에 주스트림 연결
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			// ================= 채팅준비완료 =================
			// 8. 보조스트림으로 데이터 받기 : readUTF로 데이터 한번에 받기
			while (true) { // 보내고 받기 무한반복
				System.out.println("서버와의 채팅을 시작합니다.");
				String recvMsg = dis.readUTF(); // 메시지 받기
				System.out.printf("서버(상대) : %s\n", recvMsg);
				// 9. 보조스트림으로 데이터보내기
				System.out.print("클라이언트(나) : ");
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);
				dos.flush();
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
