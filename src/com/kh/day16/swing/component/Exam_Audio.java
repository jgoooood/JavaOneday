package com.kh.day16.swing.component;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_Audio extends JFrame{
	String [] names = {"play", "stop", "play again"};
	private Clip clip;
	
	public Exam_Audio() {
		setTitle("오디오 제어 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		for(int i =0; i < names.length; i++) {
			JButton btn = new JButton(names[i]);
			btn.addActionListener(new MyActionListener()); //외부클래스이기 때문에 new를 통해 객체생성
			c.add(btn);
		}
		
		setSize(300, 200);
		setVisible(true);
		loadAudio("audio/애국가1절.wav");
	}
	
	
	private class MyActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand(); //눌렸을 때의 값 가져오기
			switch(cmd) {
				case "play" : 
					clip.start(); //멈춤->시작시 멈춘부분부터 재시작
					break;
				case "stop" : 
					clip.stop();
					break;
				case "play again" : 
					clip.setFramePosition(0);//재생포지션을 처음으로 세팅
					clip.start();
					break;
			}
		}
	}
	
	private void loadAudio(String audioPath) {
		//비어있는 오디오클립생성->메소드의 매개변수가 경로가 되어 들어감
		try {
			//클립은 도구, 도구가 Stream사용
			clip = AudioSystem.getClip();
			File audioFile = new File(audioPath);
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
			clip.open(audioStream);
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	} 

	public static void main(String[] args) {
		new Exam_Audio();
	}

}
