package com.kh.day18.member.run;

import com.kh.day18.member.view.MemberView;

//실제 실행 클래스->VIEW 호출
public class Run {

	public static void main(String[] args) {
		MemberView view = new MemberView();
		// 메뉴출력 메소드 호출
		view.startMemberProgram(); 
	}

}
