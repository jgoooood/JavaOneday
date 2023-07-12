package com.kh.day13.swing.basic;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_ContentPane extends JFrame {
	public Exam_ContentPane() {
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		//이벤트 분배 스레드를 종료시킴으로 실제 종료되도록 함
		//->이 코드가 없으면 닫기버튼 눌렀을 때 안보이게만 해줌
		
		
		//컨테이너 요소 만들기
		//Container javax.swing.JFrame.getContentPane() <- 부모클래스의 메소드
		//Container 타입의 참조변수 contentPane에 객체저장
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.PINK); //<-ORANGE는 대문자+기울임->static
		contentPane.add(new JButton("OK")); //버튼 추가->컨테이너 전체 차지
		contentPane.add(new JButton("Cancel")); //ok버튼 위에 캔슬이 덮어짐->순차적 배치를 위해 레이아웃세팅
		contentPane.add(new JButton("Ignore")); 
		contentPane.setLayout(new FlowLayout()); // 차례대로 버튼을 만들어줌
		
		setSize(300, 150);
		setVisible(true);
	}
	
	//클래스내에 메인메소드를 멤버로 포함시키는 것을 권장함
	public static void main(String[] args) {
		new Exam_ContentPane(); 
	}

}
