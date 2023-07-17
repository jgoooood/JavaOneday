package com.kh.day16.swing.component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

public class Exam_JColorChooser extends JFrame{
	private JLabel label;
	public Exam_JColorChooser() {
		label = new JLabel("Hello");
		setTitle("JColorChooser 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Ravie", Font.ITALIC, 30));
		c.add(label, BorderLayout.CENTER);
		createMenu();
		setVisible(true);
		setSize(250, 200);
	}
	
	private void createMenu() {
		JMenuBar bar = new JMenuBar();
		JMenu menu = new JMenu("Text"); //Text
		JMenuItem item = new JMenuItem("Color"); // ㄴColor
		item.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//Type mismatch: cannot convert from Color to int : 리턴값을 color로
				//int color x / 선택된 색이 Color type으로 리턴됨
				Color chosenColor =	JColorChooser.showDialog(null, "ColorPicker", Color.YELLOW); //선택한 색으로 글씨색 설정
				if(chosenColor != null) {
					label.setForeground(chosenColor);
				}
			}
		});
		menu.add(item);
		bar.add(menu);
		setJMenuBar(bar);
		
	}
	public static void main(String[] args) {
		new Exam_JColorChooser();
	}

}
