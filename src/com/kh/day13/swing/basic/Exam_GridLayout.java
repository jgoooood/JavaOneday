package com.kh.day13.swing.basic;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Exam_GridLayout extends JFrame{

	public Exam_GridLayout() {
		setTitle("Exam_GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(5, 2);
		grid.setVgap(5);
		Container c = getContentPane();
		//마진주기 수평0, 수직5
		//c.setLayout(new GridLayout(4, 2, 0, 5));
		c.setLayout(grid); //객체생성시 바로 행과 열을 넣어 사용가능
		
		c.add(new JLabel(" 이름"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학번"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학과"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 과목"));
		c.add(new JTextField(""));
		c.add(new JButton("입력"));
		c.add(new JButton("취소"));
		
		setVisible(true);
		setSize(300, 200);
	}
	public static void main(String[] args) {
		//4행2열 300 200
		new Exam_GridLayout();
	}

}
