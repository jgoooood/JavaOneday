package com.kh.day14.swing.component;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Exam_JCheckBox extends JFrame{
	public Exam_JCheckBox() {
		setTitle("JCheckBox 이미지 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
		ImageIcon selectedCherry = new ImageIcon("images/selectedCherry.jpg");
		
		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배");
		JCheckBox cherry = new JCheckBox("체리",cherryIcon); //체크박스에 이미지넣기
		cherry.setSelectedIcon(selectedCherry); //체리가 선택되면 이미지 바뀜
		cherry.setBorderPainted(true); // 선택된 것을 입체적으로 나타내는 메소드->음각양각
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		setSize(250, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Exam_JCheckBox();
	}

}
