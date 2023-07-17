package com.kh.day14.swing.event;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam_MouseListenerAll extends JFrame {
	private JLabel la; // 1. 생성자말고도 필드 밖에서도 선언가능
	
	public Exam_MouseListenerAll() {
		setTitle("MouseListener와 MouseMotion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		la = new JLabel("No Mouse Event"); // 2. 필드밖에서 선언, 필드안에서 요소추가
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(la);
		//기본세팅완료->이벤트 걸기
		MyMouseListener listener = new MyMouseListener();
		//컨텐트에 이벤트등록를 해주어야 이벤트를 찾아서 동작가능 함
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);
		setSize(300, 200);
		setVisible(true);
	}
	//이너클래스로 이벤트걸기->외부외서 사용못하도록 **private**
	private class MyMouseListener implements MouseListener, MouseMotionListener{
		//MouseListener메소드 : 5개
		@Override
		public void mouseClicked(MouseEvent e) {
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			//Component를 임포트해서 컨텐트의 배경바꾸기
			Component c = (Component)e.getSource();
			c.setBackground(Color.LIGHT_GRAY);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.RED);
		}
		//MouseMotionListener : 2개
		@Override
		public void mouseDragged(MouseEvent e) {
			la.setText("MouseDragged("+e.getX()+", "+e.getY()+")");
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			//마우스를 움직이면 좌표저장
			la.setText("MouseMoved("+e.getX()+", "+e.getY()+")");
		}
	}
	
	public static void main(String[] args) {
		new Exam_MouseListenerAll();
	}
}
//이벤트 외부방식으로 선언->이벤트 인터페이스 구현(인터페이스는 다중상속가능)
//상속받은 인터페이스의 모든 메소드 구현해야함->너무 많은 구현을 진행해야함
/*
class MyMouseListener implements MouseListener, MouseMotionListener{
	//MouseListener메소드 : 5개
	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}
	
	//MouseMotionListener : 2개
	@Override
	public void mouseDragged(MouseEvent e) {}

	@Override
	public void mouseMoved(MouseEvent e) {}
}
*/
