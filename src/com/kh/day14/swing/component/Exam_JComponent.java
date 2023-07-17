package com.kh.day14.swing.component;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_JComponent extends JFrame{
	public Exam_JComponent() {
		//setTitle("JComponent의 공통 메소드 예제");
		//setTitle("")과 super("")는 동일하게 사용가능
		super("JComponent의 공통 메소드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn1 = new JButton("Magenta/Yellow Button");
		JButton btn2 = new JButton("Disabled Button");
		JButton btn3 = new JButton("getX(), getY()");
		
		btn1.setBackground(Color.YELLOW);	//배경색
		btn1.setForeground(Color.MAGENTA); //글자색
		btn1.setFont(new Font("Arial", Font.ITALIC, 20)); //폰트적용
		btn2.setEnabled(false); //setEnabled : btn2버튼을 표시되지만 눌리지 않음
		//클릭됐을 때 동작->익명클래스로추가
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//e.getSource이벤트가 발생한 요소(영역) 가져오는 메소드=JButton
				//getTopLevelAncestor 조상가져오기
				//버튼눌렀을 때 좌표가져오기->형변환도 진행
				//버튼이 위치한 좌표가 setTitle로 변경됨->창크기에 따라 좌표는 계속 변경됨
				JButton jb = (JButton)e.getSource();
				Exam_JComponent frame = (Exam_JComponent)jb.getTopLevelAncestor();
				frame.setTitle(jb.getX()+", "+jb.getY());
			}
		});
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		
		setVisible(true);
		setSize(300, 200);
	}
	public static void main(String[] args) {
		new Exam_JComponent();
	}

}
