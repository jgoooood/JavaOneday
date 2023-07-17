package com.kh.day15.swing.component;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;

public class Exam_JTabbedPane extends JFrame{
	public Exam_JTabbedPane() {
		setTitle("메뉴 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		JTabbedPane pane = new JTabbedPane();
		pane.addTab("superman", new JLabel(new ImageIcon("images/superman.jpg")));
		pane.addTab("wonder woman", new JLabel(new ImageIcon("images/wonderwoman.jpg")));
		c.add(pane, BorderLayout.CENTER);
		setSize(250, 200);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new Exam_JTabbedPane();
	}

}
