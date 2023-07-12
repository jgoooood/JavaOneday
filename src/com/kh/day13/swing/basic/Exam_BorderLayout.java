package com.kh.day13.swing.basic;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_BorderLayout extends JFrame{
	public Exam_BorderLayout() {
		setTitle("BorderLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		// 수평간격(hGap) 30, 수직간격(vGap) 20픽셀로 하는 BorderLayout
		c.setLayout(new BorderLayout(30, 20)); //(30, 20)마진주기
		c.add(new JButton("Calculate"), BorderLayout.CENTER);
		c.add(new JButton("add"), BorderLayout.NORTH);
		c.add(new JButton("sub"), BorderLayout.SOUTH);
		c.add(new JButton("multi"), BorderLayout.EAST);
		c.add(new JButton("div"), BorderLayout.WEST);
		
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Exam_BorderLayout(); //생성자를 통해 객체를 생성
	}
}
