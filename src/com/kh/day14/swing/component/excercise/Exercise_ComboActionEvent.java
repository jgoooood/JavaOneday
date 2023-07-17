package com.kh.day14.swing.component.excercise;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exercise_ComboActionEvent extends JFrame{
	private String [] fruits = {"apple", "banana", "kiwi", "mango"};
	private ImageIcon [] images = {
			new ImageIcon("images/apple.jpg"),
			new ImageIcon("images/banana.jpg"),
			new ImageIcon("images/kiwi.jpg"),
			new ImageIcon("images/mango.jpg")
	};
	private JLabel imgLabel;  			//JLabel 선언
	private JComboBox<String> strCombo; //JComboBox 선언
	
	
	public Exercise_ComboActionEvent() {
		setTitle("JComboBox 활용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		imgLabel = new JLabel(images[0]); //*객체생성필수* 첫 이미지세팅
		strCombo = new JComboBox<String>(fruits); //*객체생성필수* 문자열배열 콤보박스에 세팅
		c.add(strCombo); // *추가필수* -> 이벤트 동작 걸어줘야하는 태그(이벤트발생한요소)
		c.add(imgLabel); // *추가필수*
		strCombo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> strCb = (JComboBox<String>)e.getSource(); //e.getSource() 이벤트가 발생한 컴포넌트를 가져옴(this와 비슷)
				int index = strCb.getSelectedIndex(); //선택된요소의 인덱스를 가져오는 메소드 JS DOM에도 있음
				imgLabel.setIcon(images[index]); // 그 인덱스를 이미지배열에 적용
			}
		});
		setSize(300, 250);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Exercise_ComboActionEvent();
	}

}
