package com.kh.day16.network.exercise1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientServer {

	public static void main(String[] args) {
		String address = "192.168.60.209";
		InputStream is = null;
		OutputStream os = null;
		Scanner sc = new Scanner(System.in);
		int port = 7777;
		try {
			System.out.println("연결요청 중...");
			Socket socket = new Socket(address, port);
			System.out.println("연결 성공");
			
			os = socket.getOutputStream();
			is = socket.getInputStream();
			while (true) {
				// 1. 데이터보내기
				System.out.println("클라이언트(나) : ");
				String message = sc.nextLine();
				byte[] bytes = message.getBytes();
				os.write(bytes);
				os.flush();
				// ==================== 보내기 완료 ====================
				// 4. 데이터받기
				bytes = new byte[1024];
				int readByteNo = is.read(bytes);
				message = new String(bytes, 0, readByteNo);
				System.out.printf("서버(상대) : %s\n", message);
				// ==================== 받기 완료 ====================
			}

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
