package com.kh.day17.network.socket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class CalculatorServer {

	public static void main(String[] args) {
//		서버 구동중입니다.
//		클라이언트의 연결을 기다리고 있습니다..
//		클라이언트와 연결되었씁니다.
//		받은 메시지 : 23
//		받은 메시지 : 24 + 42
//		클라이언트가 종료하였습니다.

		int port = 7777;
		OutputStream os = null;
		InputStream is = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);

		try {
//			System.out.println(".");
//			Thread.sleep(1000); // 1초 대기후 가이드 메시지 출력, 대기중 효과
//			System.out.println(".");
//			Thread.sleep(1000); 
//			System.out.println(".");
//			Thread.sleep(1000);
			// 쓰레드 이용
			System.out.println("서버 구동중입니다.");
			for (int i = 1; i <= 50; i++) {
				System.out.print("=");
				Thread.sleep(10); // 로딩효과
			}
			System.out.println("100%");
			System.out.println();
			ServerSocket serverSocket = new ServerSocket(port);
			System.out.println("클라이언트의 연결을 기다리고 있습니다.");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트와 연결되었습니다.");
			// 데이터받을 준비
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			// 데이터받기
			while (true) {
				String recvMsg = dis.readUTF();
				// 종료하면 양쪽에 모두 종료될 코드추가를 해주어야 함
				if (recvMsg.equalsIgnoreCase("exit")) {
					System.out.println("클라이언트가 종료하였습니다.");
					break;
				}
				System.out.printf("받은 메시지 : %s\n", recvMsg);
				// 24 + 42 -> 데이터 자르기 띄어쓰기 기준으로 문자열 배열을 만듬
				String [] msgArrs = recvMsg.split(" ");
				if(msgArrs.length != 3) { // 배열길이가 3이 아니면 에러메시지 출력
					String errMsg = "end"; //에러 : 엔드표식 보내기
					dos.writeUTF(errMsg); //에러표식 보내기
					continue; // 다시 while문으로 넘어가게 함
				}
				// 24 / + / 42 : 각각 변수에 넣기
				int num1 = Integer.parseInt(msgArrs[0]);
				int num2 = Integer.parseInt(msgArrs[2]);
				String operator = msgArrs[1];
				String result = "";
				switch(operator) {
				case "+" : result = String.valueOf(num1 + num2); break;
				case "-" : result = num1 - num2 + ""; break; //문자열 만들기
				case "*" : result = num1 * num2 + ""; break;
				case "/" : result = num1 / num2 + ""; break;
				case "%" : result = num1 % num2 + ""; break;
				}
				dos.writeUTF(result);
				dos.flush();
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
