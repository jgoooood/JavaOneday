package com.kh.day13.swing.basic;

import javax.swing.JFrame;

//JFrame 상속을 받아 GUI를 사용할 수 있음
public class Exam_MyFrame extends JFrame{
	//생성자이름+ctrl+스페이스바->자동생성
	public Exam_MyFrame() {
		//setVisible : JFrame을 보여주는 메소드, 상속을 받음으로써 사용가능해짐
		// 크기조절, 닫기버튼 사용가능
		setVisible(true);
		setTitle("300x300 스윙 프레임 만들기"); //setTitle : 창 이름 설정
		setSize(300, 300); //setSize : 창 크기 설정
	}

	public static void main(String[] args) {
		//main메소드에 객체생성 후 같은 파일내에 실행하는 것을 권장
		// 왼쪽은 참조변수 저장 = 오른쪽은 객체생성해서 메모리에 올라가 주소값 할당
		// ** JFrame을 상속받은 클래스를 객체생성해주어야 JFrame 메소드를 사용할 수 있음 **
		// Exam_MyFrame exFrame = new Exam_MyFrame();
		new Exam_MyFrame(); // JFrame은 객체 생성만 해도 됨
	}

}
