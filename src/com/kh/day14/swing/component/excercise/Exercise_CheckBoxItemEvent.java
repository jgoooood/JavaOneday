package com.kh.day14.swing.component.excercise;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exercise_CheckBoxItemEvent extends JFrame{
	private JLabel sumLabel; //가격을 나타내는 필드
	private int sum; 		//합계를 저장할 변수
	private JCheckBox [] fruits; // 객체배열 선언
	private String [] names = {"사과", "배", "체리"}; //체크박스 이름 배열
	
	public Exercise_CheckBoxItemEvent() {
		setTitle("JCheckBox 이미지 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		sum = 0; //처음 로딩됐을 때의 값을 0으로 초기화
		sumLabel = new JLabel("사과 100원, 배 500원, 체리 2000원"); //처음 텍스트
		fruits = new JCheckBox[3]; // 배열할당(생성
		for(int i = 0; i < fruits.length; i++) { 		//반복문을 이용하여
			fruits[i] = new JCheckBox(names[i]);		//배열에 체크박스 생성해서 넣어줌
			fruits[i].setBorderPainted(true);			//테두리나오게함
			c.add(fruits[i]);							//컨텐츠팬에 체크박스 추가
			fruits[i].addItemListener(new ItemListener() {  //아이템리스너 핸들러 등록
				@Override
				public void itemStateChanged(ItemEvent e) { //아이템이 선택될 때
					//체크가되면 + 해제되면 - 되도록 if문 추가 : 체크박스는 모두 이런 작업을 해주어야 함
					if(e.getStateChange() == ItemEvent.SELECTED) { //선택이 됐으면
						if(e.getItem().equals(fruits[0])) { 		// 이름이 사과?
							sum += 100; 							// 사과가격이 더함
						} else if(e.getItem().equals(fruits[1])) {	//이름이 배?
							sum += 500; 							//배 가격 더함
						} else if(e.getItem().equals(fruits[2])) { //이름이 체리?
							sum += 2000; 							//체리 가격 더함
						}
					} else { // 아이템체크해제
						if(e.getItem().equals(fruits[0])) { // 사과 가격 빼기
							sum -= 100; 
						} else if(e.getItem().equals(fruits[1])) { //배 가격빼기
							sum -= 500; 
						} else if(e.getItem().equals(fruits[2])) { //체리 가격빼기
							sum -= 2000; 
						}
					}
					sumLabel.setText("현재 " + sum + "원 입니다."); //눌릴 때마다 set해주어야 함					
				}
				
			});
		}
		

		c.add(sumLabel); //사과 100원, 배 500원, 체리 200원
		sumLabel = new JLabel("현재"+sum+"원 입니다."); //재할당 : 현재 0원 입니다. 
		c.add(sumLabel);
		setSize(250, 150);
		setVisible(true);
		/* 반복문으로 변경
		fruits[0] = new JCheckBox("사과"); //<-배열변경JCheckBox apple = new JCheckBox("사과"); 
		fruits[1] = new JCheckBox("배"); //<-배열변경JCheckBox pear = new JCheckBox("배");
		fruits[2] = new JCheckBox("체리"); //<-배열변경JCheckBox cherry = new JCheckBox("체리");  
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		//체크박스에 이벤트걸기 -> addItemListener메소드 사용 : 메소드 한개이기 때문에 어댑터없음
		
		/* 반복문으로 변경
		apple.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				//체크가되면 + 해제되면 - 되도록 if문 추가 : 체크박스는 모두 이런 작업을 해주어야 함
				if(e.getStateChange() == ItemEvent.SELECTED) { //선택된 값이면 +
					sum += 100; //apple버튼 클릭하면 합계에 사과가격이 누적
				} else { //아니면 - 
					sum -= 100;
				}
				sumLabel.setText("현재 " + sum + "원 입니다."); //눌릴 때마다 set해주어야 함					
			}
			
		});
		pear.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) { //선택된 값이면 +
					sum += 500; //apple버튼 클릭하면 합계에 사과가격이 누적
				} else { //아니면 - 
					sum -= 500;
				}
				sumLabel.setText("현재 " + sum + "원 입니다."); //눌릴 때마다 set해주어야 함					
			}
		});
		cherry.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) { //선택된 값이면 +
					sum += 2000; //apple버튼 클릭하면 합계에 사과가격이 누적
				} else { //아니면 - 
					sum -= 2000;
				}
				sumLabel.setText("현재 " + sum + "원 입니다."); //눌릴 때마다 set해주어야 함					
			}
		}); */
	}
	public static void main(String[] args) {
		new Exercise_CheckBoxItemEvent();
	}

}
