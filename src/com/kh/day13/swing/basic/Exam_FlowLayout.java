package com.kh.day13.swing.basic;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//JFrame상속 후 임포트
public class Exam_FlowLayout extends JFrame{
	public Exam_FlowLayout () {
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane(); //컨테이너 객체생성
		//add전 레이아웃 세팅해주어야 함
		//현재상태 고정x->창크기변동시 같이 변동됨
		//수평간격(hGap) 30, 수직간격(vGap) 40 LEFT로 정렬배치
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40)); 
		c.add(new JButton("add")); //컨테이너에 버튼추가
		c.add(new JButton("sub"));
		c.add(new JButton("multi"));
		c.add(new JButton("dib"));
		c.add(new JButton("Calculates"));
		
		setSize(300, 200);
		setVisible(true); // 상속받은 JFrame클래스의 메소드
	}
	public static void main(String[] args) {
		new Exam_FlowLayout(); //JFame 객체 생성
	}

}
