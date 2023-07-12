package com.kh.day13.swing.event;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_IndepClassListener extends JFrame{
	public Exam_IndepClassListener() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener()); 
		//null위치에 동작할 클래스를 만들어 매개변수로 받아야함
		//생성한 클래스를 new를 통해 객체생성해주어야 사용가능
		c.add(btn);
		setSize(350,150);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Exam_IndepClassListener();
	}

}
//동작방법 정의할 클래스->인터페이스ActionListener상속
//인터페이스 상수하고 추상메소드로만 이루어짐, implements 키워드 사용
//추상메소드는 몸체가 없기 때문에 오버라이딩해서 사용함
class MyActionListener implements ActionListener{
	// 상속받은 ActionListener 인터페이스의 actionPerformed()메소드를 오버라이딩(재정의)함 
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource(); // 이벤트가 일어난 객체를 넘어오게 함
		if(btn.getText().equals("Action")) {
			btn.setText("액션");
		} else {
			btn.setText("Action");
		}
	}
}

