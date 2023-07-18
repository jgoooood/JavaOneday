package com.kh.day17.network.socket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class CalculatorClient {

	public static void main(String[] args) {
//		서버와 연결되었습니다.
//		계산식(빈칸으로 띄어 입력, 예 24 + 42) >> 23
//		잘못 입력하셨습니다. 형식에 맞기 입력해주세요.
//		계산식(빈칸으로 띄어 입력, 예 24 + 42) >> 24 + 42
//		계산결과 : 66
//		계산식(빈칸으로 띄어 입력, 예 24 + 42) >> exit

		String address = "127.0.0.1";
		int port = 7777;
		OutputStream os = null;
		InputStream is = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		try {
			Socket socket = new Socket(address, port);
			System.out.println("서버와 연결되었습니다.");
			// 데이터보낼준비
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			for (;;) {
				// 데이터보내기 : 계산식 입력하기
				System.out.print("계산식(빈칸으로 띄어 입력, 예 24 + 42) >> ");
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);
				// 종료하면 양쪽에 모두 종료될 코드추가를 해주어야 함
				if(sendMsg.equalsIgnoreCase("exit")) {
					System.out.println("종료하였습니다");
					break;
				}
				dos.flush();
				// 데이터 받기
				String recvMsg = dis.readUTF();
				if(recvMsg.equalsIgnoreCase("end")) {
					System.out.println("잘못 입력하셨습니다. 형식에 맞기 입력해주세요.");
					continue; //end표시을 받아서 에러 메시지 출력
				}
				System.out.printf("계산결과 : %s\n", recvMsg);
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
