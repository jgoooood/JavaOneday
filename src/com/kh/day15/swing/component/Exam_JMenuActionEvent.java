package com.kh.day15.swing.component;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Exam_JMenuActionEvent extends JFrame{
	private JLabel imgLabel;
	public Exam_JMenuActionEvent() {
		setTitle("메뉴에 리스너 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu(); //메뉴바만들기
		
		Container c = getContentPane();			//컨텐트팬
		imgLabel = new JLabel();				//이미지들어갈 라벨
		c.setLayout(new BorderLayout()); 		//BorderLayout사용 : TOP, BOTTOM, LEFT, RIGHT, CENTER 레이아웃
		c.add(imgLabel, BorderLayout.CENTER); 	//이미지라벨을 센터에 위치하도록 함
												//이미지는 Load버튼을 눌렀을 때 나옴
		setSize(250, 220);				
		setVisible(true);
	}
	//메뉴만들어주는 메소드
	private void createMenu() {
		JMenuBar bar = new JMenuBar(); //메뉴바 (최상위)
		JMenu screenMenu = new JMenu("screen"); //메뉴
		String [] itemTitle = {"Load", "Hide", "ReShow", "Exit"}; //메뉴아이템(메뉴의 종류)
		//반복문으로 이미지아이템 추가 및 각 메뉴별로 이벤트 걸기
		for(int i = 0; i < 4; i++) {
			JMenuItem menuItem = new JMenuItem(itemTitle[i]); //아이템(메뉴 밑에 들어감)
			menuItem.addActionListener(new ActionListener() { //아이템이 선택되었을 때
				@Override
				public void actionPerformed(ActionEvent e) {
					String cmd = e.getActionCommand();
					switch(cmd) { //else if보다 빠른 switch case
						case "Load" : 
							if(imgLabel.getIcon() != null) return; //이미지 재로딩시 리턴
							imgLabel.setIcon(new ImageIcon("images/img.jpg"));
							break;
						case "Hide" : 
							//imgLabel.setIcon(null); //이미지없애기
							imgLabel.setVisible(false); //이미지숨기기
							break;
						case "ReShow" : 
							imgLabel.setVisible(true); //이미지 다시 보이기
							break;
						case "Exit" : 
							System.exit(0);
							break;
					}
//					if(cmd.equals("Load")) {
//						//이미지 로드
//					} else if (cmd.equals("Hide")) {
//						//이미지숨기고
//					} else if (cmd.equals("ReShow")) {
//						//이미지 다시 보여줌
//					} else if (cmd.equals("Exit")) {
//						//프로그램종료
//					} ->스위치문으로
				}
			});
			screenMenu.add(menuItem);
		}
//		반복문으로 변경
//		screenMenu.add(new JMenuItem("Load"));
//		screenMenu.add(new JMenuItem("Hide"));
//		screenMenu.add(new JMenuItem("ReShow"));
//		screenMenu.add(new JMenuItem("Exit"));
		bar.add(screenMenu);
		setJMenuBar(bar);
	}
	public static void main(String[] args) {
		new Exam_JMenuActionEvent();
	}

}
