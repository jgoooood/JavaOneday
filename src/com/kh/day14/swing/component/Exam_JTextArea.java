package com.kh.day14.swing.component;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Exam_JTextArea extends JFrame{
	private JLabel textLabel;
	private JTextField fieldLabel;
	private JTextArea areaLabel;
	private JScrollPane scrollPane; //스크롤팬 필드추가
	
	public Exam_JTextArea() {
		setTitle("텍스트영역 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		textLabel = new JLabel("입력 후 <Enter> 키를 입력하세요.");
		fieldLabel = new JTextField(20);
		areaLabel = new JTextArea(7, 20); //현재 스크롤을 적용되지 않은 상태->JScrollPane 사용
		scrollPane = new JScrollPane(areaLabel); //텍스트영역 객체 전달하면서 스크롤팬 객체 생성
		c.add(textLabel);
		c.add(fieldLabel);
		c.add(scrollPane);						//컨텐츠팬에 스크롤팬 추가
		//엔터치면 동작되도록 Action 이벤트걸기->익명클래스
		fieldLabel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField jt = (JTextField)e.getSource();
				areaLabel.append(jt.getText()+"\n"); //입력값 갖고와서 넣어주기
				jt.setText("");
			}
		});
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Exam_JTextArea();
	}

}
