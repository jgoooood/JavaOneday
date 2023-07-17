package com.kh.day14.swing.component.excercise;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Exercise_RadioButtonItemEvent extends JFrame{
	
	private JRadioButton [] fruits; //라디오버튼 객체배열
	private String [] names = {"사과", "배", "체리"}; //라디오버튼 이름배열
	private ImageIcon [] images =  //이미지라벨에 들어갈 이미지아이콘 배열
		{
				new ImageIcon("images/apple.jpg"),
				new ImageIcon("images/pear.jpg"),
				new ImageIcon("images/cherry.jpg")
		};
	private JLabel imageLabel;		//이미지라벨선언
	public Exercise_RadioButtonItemEvent() {
		setTitle("JCheckBox 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		JPanel radioPanel = new JPanel(); 			//라디오 버튼을 추가할 팬을 만듬
		c.setLayout(new BorderLayout());			//BorderLayout 사용
		radioPanel.setBackground(Color.LIGHT_GRAY); //새로만든 팬의 배경색 바꿈
		fruits = new JRadioButton[3]; 				// 라디오 버튼 객체 배열생성
		imageLabel = new JLabel(); 					//라벨 객체 생성
		ButtonGroup btnG = new ButtonGroup(); 		//하나만 눌리도록 버튼그룹 생성
		
		for(int i = 0; i < fruits.length; i++) {
			fruits[i] = new JRadioButton(names[i]); //반복문으로 라디오 버튼 객체 생성해서 배열에 넣고
			btnG.add(fruits[i]); 					//라디오 버튼 중 1개만 선택되도록 버튼 그룹 설정
			radioPanel.add(fruits[i]); 				//새로 만든 라디오팬에 추가
			fruits[i].addItemListener(new ItemListener() {
				@Override
				public void itemStateChanged(ItemEvent e) {
//					if(e.getStateChange() == ItemEvent.DESELECTED) { //DESELECTED 해제
//						return;
//					}
					if(fruits[0].isSelected()) {
						imageLabel.setIcon(images[0]); //setIcon : Label이미지를 set해주는 메소드
					}else if(fruits[1].isSelected()) {
						imageLabel.setIcon(images[1]);
					}else if(fruits[2].isSelected()) {
						imageLabel.setIcon(images[2]);
					}
				}
			});
		}
		
		c.add(radioPanel, BorderLayout.NORTH); 						//라디오팬을 컨텐트팬에 추가함->탑으로 붙여서 보임
		c.add(imageLabel, BorderLayout.CENTER); 					//이미지라벨을 센터에 위치
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER); 	//이미지라벨안에 이미지도 가운데로 정렬
		
		setSize(250, 200);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Exercise_RadioButtonItemEvent();
	}

}
