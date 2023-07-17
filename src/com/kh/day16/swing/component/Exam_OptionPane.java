package com.kh.day16.swing.component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Exam_OptionPane extends JFrame{
	public Exam_OptionPane() {
		setTitle("옵션 팬 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new Mypane(), BorderLayout.NORTH);
		c.add(new JButton("OK"));
		
		setSize(500, 200);
		setVisible(true);
	}
	
	private class Mypane extends Panel {
		private JButton inputBtn;
		private JButton confirmBtn;
		private JButton msgBtn;
		private JTextField tf;
		
		public Mypane() {
			setBackground(Color.LIGHT_GRAY);
			inputBtn = new JButton("Input Name");
			confirmBtn = new JButton("Confirm");
			msgBtn = new JButton("Message");
			tf = new JTextField(10);
			
			inputBtn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String name = JOptionPane.showInputDialog("이름을 입력하세요."); //showInputDialog = JS의 컨펌창
					if(name != null) { //입력값이 null이 아니면
						tf.setText(name); //텍스트필드에 입력값을 출력
					}
				}
			}); // input버튼 눌리면 동작 : 익명클래스가 가장 간단
			
			confirmBtn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int choice = JOptionPane.showConfirmDialog(null, "계속할 것입니까?", "confirm", JOptionPane.YES_NO_OPTION);
					//Yes에 대한 정수값, No에 대한 정수값이 반환 -> 변수타입도 int로 선언
//					if(choice == JOptionPane.CLOSED_OPTION) //x표시 누르면
					if(choice == JOptionPane.YES_OPTION) { //yes옵션 선택시
						tf.setText("Yes");
					}else if(choice == JOptionPane.NO_OPTION) { // no옵션 선택시
						tf.setText("No");
					}
				}
			}); // confirm버튼 눌리면 동작
			
			msgBtn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "조심하세요", "message", JOptionPane.ERROR_MESSAGE);
				}
			});
			add(inputBtn);
			add(confirmBtn);
			add(msgBtn);
			add(tf);
		}
		
	}
	
	
	public static void main(String[] args) {
		new Exam_OptionPane();
	}

}


