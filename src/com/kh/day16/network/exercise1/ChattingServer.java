package com.kh.day16.network.exercise1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChattingServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		OutputStream os = null;
		InputStream is = null;
		Scanner sc = new Scanner(System.in);
		try {
			serverSocket = new ServerSocket(8888); 
			System.out.println("서버 소켓 생성");
			System.out.println("클라이언트 접속 대기중...");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트 접속 완료");
			
			is = socket.getInputStream();
			os = socket.getOutputStream();

			while(true) {
				// 2. 데이터 받기
				byte [] bytes = new byte[1024];
				int readBytesNo = is.read(bytes);
				String message = new String(bytes, 0, readBytesNo);
				System.out.printf("클라이언트(상대) : %s\n", message);
				// ==================== 받기 완료 ====================
				// 3. 데이터보내기
				System.out.println("서버(나) : ");
				message = sc.nextLine();
				bytes = message.getBytes();
				os.write(bytes);
				os.flush();
				// ==================== 보내기 완료 ====================
			}
			

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
