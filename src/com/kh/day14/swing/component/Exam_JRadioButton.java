package com.kh.day14.swing.component;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Exam_JRadioButton extends JFrame{
	public Exam_JRadioButton() {
		setTitle("JRadioButton 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
		ImageIcon selectedCherry = new ImageIcon("images/selectedCherry.jpg");
		
		JRadioButton apple = new JRadioButton("사과",true); //true : 기본값으로 선택된상태로 시작
		JRadioButton pear = new JRadioButton("배");
		JRadioButton cherry = new JRadioButton("체리");
		cherry.setBorderPainted(true); //음각양각
		cherry.setSelectedIcon(selectedCherry); //선택되면 음각으로 표시
		// 라디오버튼이 한가지만 선택되도록 해주는 버튼 그룹
		// 라디오 버튼을 만드는 input태그의 name을 맞춰주는 것과 같음 input[type=radio]
		ButtonGroup g = new ButtonGroup();
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		
		setSize(250, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Exam_JRadioButton();
	}

}
