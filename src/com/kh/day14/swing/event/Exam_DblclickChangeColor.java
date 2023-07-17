package com.kh.day14.swing.event;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class Exam_DblclickChangeColor extends JFrame {
	public Exam_DblclickChangeColor() {
		setTitle("Click and Dbl Click Change BackgroundColor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane(); 
		c.setBackground(Color.black); //실행하자마자 적용됨
		//이벤트가 포함되어있는 클래스를 객체생성해야 사용가능
		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener);
		setVisible(true);
		setSize(300, 200);
		
	}
	/* 이렇게 MouseListener를 상속하면 모든 메소드를 구현해야함 -> MousieAdapter사용 
	private class MyMouseListener implements MouseListener {
		@Override
		public void mouseClicked(MouseEvent e) {
			// getClickCount : 클릭 카운트 수를 이용해 2면 더블클릭구현
			if(e.getClickCount() == 2) {
				Component c = (Component)e.getSource();
				c.setBackground(new Color(255,255,255));
			}
		}
		@Override
		public void mousePressed(MouseEvent e) {}

		@Override
		public void mouseReleased(MouseEvent e) {}

		@Override
		public void mouseEntered(MouseEvent e) {}

		@Override
		public void mouseExited(MouseEvent e) {}
	}
	*/
	private class MyMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			// getClickCount : 클릭 카운트 수를 이용해 2면 더블클릭구현
			if(e.getClickCount() == 2) {
				//random값구하기 : (int)Math.random * (최대값-최소값+1)+최소값 : 내가 원하는 범위구하기
				// 256 : 0~255범위의 랜덤한 수를 출력함
				int red = (int)(Math.random()*256);
				int green = (int)(Math.random()*256);
				int blue = (int)(Math.random()*256);
				Component c = (Component)e.getSource();
				c.setBackground(new Color(red,green,blue));
			}
		}
	}
	public static void main(String[] args) {
		new Exam_DblclickChangeColor();
	}

}
