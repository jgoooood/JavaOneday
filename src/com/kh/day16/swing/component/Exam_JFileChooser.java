package com.kh.day16.swing.component;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Exam_JFileChooser extends JFrame{
	//출력될 이미지를 받을 곳을 JLabel로 받음
	private JLabel imgLabel;
	
	public Exam_JFileChooser() {
		setTitle("메뉴와 파일 Chooser 활용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		imgLabel = new JLabel();
		c.add(imgLabel); //컨테이너에 JLabel의 imgLabel 추가해서 이미지표시 
		createMenu();
		setSize(350, 200);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar bar = new JMenuBar(); //메뉴바 생성
		JMenu menu = new JMenu("File"); //메뉴바에 메뉴 생성
		JMenuItem item = new JMenuItem("Open"); //File메뉴 안에 Open 메뉴 추가
		//Open이 클릭되었을 때 동작이벤트 걸기
		item.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser(); //JFileChooser객체생성
				int chosen = chooser.showOpenDialog(null); //실행시 파일 선택창 오픈됨
				//JFileChooser동작시 비정상적인 선택시(APPROVE_OPTION은 정상선택시 나오는 리턴값임)
				if(chosen != JFileChooser.APPROVE_OPTION) {
					//메시지 출력, 파일 선택 경고창 -> WARNING_MESSAGE(아이콘모양이 다름)
					JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다.", "경고", JOptionPane.WARNING_MESSAGE);
					//선택을 하지 않았을 때 밑에있는 코드가 실행되면 NullPointerException->return 사용
					return; 
				}
				String filePath = chooser.getSelectedFile().getPath();
				imgLabel.setIcon(new ImageIcon(filePath)); //JLabel의 변수 imgLabel에 Image표시하기
			}
		}); 
		menu.add(item); //메뉴안에 메뉴아이템 생성
		bar.add(menu); //메뉴바에 메뉴생성
		setJMenuBar(bar); //메뉴바 세팅
	}
	
	
	public static void main(String[] args) {
		new Exam_JFileChooser();
	}

}
