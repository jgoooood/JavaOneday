package com.kh.day08.oop.interfacepkg.music;

public class Stage {

	public static void main(String[] args) {
		//뮤지션을 스테이지로
		Musician musician = new Musician();
		musician.play(new Drum());
		musician.play(new Guitar());
		musician.play(new Piano());
	}

}
