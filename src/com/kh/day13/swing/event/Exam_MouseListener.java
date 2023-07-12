package com.kh.day13.swing.event;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam_MouseListener extends JFrame{
	public Exam_MouseListener() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel la = new JLabel("Hello");
		la.setSize(50, 20);
		la.setLocation(30, 30);
		
		Container c = getContentPane();
		c.setLayout(null);
		c.add(la);
		//마우스클릭은 컨테이너->이벤트를 컨테이너에 걸어줌
		c.addMouseListener(new MouseListener() {
			//MouseListener의 추상메소드들->반드시 오버라이딩해서 사용->모두구현해야한다는 단점발생
			//->쓰지않는 메소드를 안쓰기 위해 추상메소드만을 모아놓은 어댑터 클래스 생성
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				//마우스 눌렀을 때 x,y의 좌표를 구해서 setLocation의 매개변수로 전달->위치가 변경됨
				int x = e.getX();
				int y = e.getY();
				la.setLocation(x, y);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		
		
		setVisible(true);
		setSize(250, 250);
		
	}
	public static void main(String[] args) {
		new Exam_MouseListener();
	}
}
