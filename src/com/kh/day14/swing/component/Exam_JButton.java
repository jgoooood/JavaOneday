package com.kh.day14.swing.component;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

public class Exam_JButton extends JFrame {
	public Exam_JButton() {
		setTitle("JLabel 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout()); //->무조건 가운데정렬
		//버튼에 이미지 추가 
		//1. 이미지아이콘객체 추가 후 경로입력해 가져오기
		//2. 버튼에 이미지 적용하기
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
		ImageIcon pressedIcon = new ImageIcon("images/pressedIcon.gif");
		ImageIcon rolloverIcon = new ImageIcon("images/rolloverIcon.gif");
		JButton btn = new JButton("Call", normalIcon);
		btn.setPressedIcon(pressedIcon); //눌렀을 때
		btn.setRolloverIcon(rolloverIcon); //마우스갖다댈때
		//버튼안에 텍스트 및 이미지의 수평, 수직 위치 조정
		//btn.setHorizontalAlignment(SwingConstants.LEFT); //가로 정렬 CENTER, LEFT, RIGHT
		//btn.setVerticalAlignment(SwingConstants.BOTTOM); //세로 정렬 CENTER, TOP, BOTTOM
		c.add(btn);
		setSize(250, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Exam_JButton();
	}
}
