package com.kh.day16.network.exam1;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Exam_Client {

	public static void main(String[] args) {
		System.out.println("Client");
		Socket socket = null;
		try {
			System.out.println("연결요청중");
			//연결할 서버의 아이피와 포트번호를 입력해줘야 함
			socket = new Socket("127.0.0.1", 4885);
			System.out.println("연결 수락됨");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
