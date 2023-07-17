package com.kh.day15.swing.component;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

//외부클래스
class MyDialog extends JDialog {
	private JButton btn;
	public MyDialog() {	} //기본생성자
	public MyDialog(JFrame frame, String title) { //매개변수있는생성자
		super(frame, title);
		setLayout(new FlowLayout()); 	//다이얼로그의 레이아웃설정
		add(new JTextField(10));		//텍스트필드 추가
		btn = new JButton("OK");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false); //ok버튼 누르면 닫히게 함
			}
		});
		add(btn); //버튼 추가
		setSize(200, 100);				//다이얼로크 크기 세팅
		//================다이알로그 세팅완료
		
	}
	
}

public class Exam_JDialog extends JFrame{
	private MyDialog dialog; //외부클래스 사용
	public Exam_JDialog() {
//		setTitle("Dialog 만들기 예제");
		super("Dialog 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn = new JButton("Show Dialog");   //버튼 생성(누르면 다이얼로그 보임)
		dialog = new MyDialog(this, "Test Dialog"); //JDialog상속받은 MyDialog객체생성 : 다이얼로그 생성
													//생성자에 매개변수로 전달 -> setTitle도 한번에 설정
		//btn에 이벤트걸기
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true); //이미 생성된 다이얼로그를 버튼누르면 보이게 해줌
			}
		});
		Container c = getContentPane();
		c.add(btn);									//콘텐트팬에 버튼추가
		setSize(250, 200);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new Exam_JDialog();
	}

}
