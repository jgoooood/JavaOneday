package com.kh.day18.member.view;

import java.util.List;
import java.util.Scanner;

import com.kh.day18.member.controller.MemberController;
import com.kh.day18.member.model.vo.Member;

//뷰 -> 컨트롤러호출
public class MemberView {
	private MemberController controller;
	
	public MemberView() {
		controller = new MemberController();
	}
	
	//메뉴 출력 메소드
	public void startMemberProgram() {
		Member mOne = null;
		String name = "";
		int index = 0;
		finish:
		while(true) {
			int choice = this.printMenu(); // 뷰.메뉴출력
			switch(choice) {
				case 1 : 
					mOne = this.inputMember();
					controller.addMember(mOne); //데이터추가하는 메소드를 만들어서 호출
					//mList.add(mOne); //데이터추가
					break;
				case 2 : 
					name = this.inputMemberName(); // 수정할 데이터의 이름을 입력 받음
					index = controller.findIndexByName(name); // 수정할 인덱스 찾기
					mOne = controller.findOneByName(name);	//원래 저장된 데이터(mOne)
					// 수정하지 않는 부분은 기존 데이터 유지되도록 원래 정보를 불러옴
					if(index != -1) {
						// 데이터가 있을 때 수정할 정보 입력 받음 -> 수정할 정보를 입력할 메소드 호출
						mOne = this.modifyMember(mOne);  //수정된 데이터(mOne)
					}
					controller.modifyMember(index, mOne); //데이터수정
					break;
				case 3 : 
					name = this.inputMemberName(); 	//삭제할 데이터의 이름을 입력받음
					index = controller.findIndexByName(name); // 이름과 일치하는 인덱스 찾아서 index에 저장
					controller.subMember(index); 				// index를 넘겨받아서 subMember호출->해당 인덱스 전달해 삭제
					break;
				case 4 : 
					//검색할 이름입력 메소드 호출 후 name에 그 값을 담기
					name = this.inputMemberName();
					mOne = controller.findOneByName(name); 
					//Member member = findOneByName(name); /Member member대신 mOne
					this.printOneMember(mOne); //메소드를 이용해 출력
					break;
				case 5 : 
					// mList를 바로 전달 안하고 메소드로 호출하는 이유
					// 클래스를 하나 더 만들기 위해 구조를 먼저 만듬
					this.printAllMembers(controller.allMemberList()); 
					break;
				case 6 : break finish;
			}
		}
	}
	
	Member member = new Member();
	//메뉴출력
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======= 회원 관리 프로그램 =======");
		System.out.println("1. 회원 정보 등록");
		System.out.println("2. 회원 정보 수정");
		System.out.println("3. 회원 정보 삭제");
		System.out.println("4. 회원 정보 출력(이름)");
		System.out.println("5. 회원 전체 정보 출력");
		System.out.println("6. 프로그램 종료");
		System.out.print("선택  : ");
		int input = sc.nextInt();
		return input;
	}

	//정보입력받기
	//public void inputMember() {
	public Member inputMember() { // Member타입으로 변경
		Scanner sc = new Scanner(System.in);
		System.out.println("======= 회원 정보 입력 =======");
		System.out.print("아이디 : ");
		String memberId = sc.next();
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		System.out.print("이름 : ");
		String memberName = sc.next();
		System.out.print("이메일 : ");
		String memberEmail = sc.next();
		System.out.print("전화번호 : ");
		String memberPhone = sc.next();
		Member member = new Member(memberId, memberPw, memberName, memberEmail, memberPhone);
		// setter메소드를 쓰지 않고 생성자를 통해 데이터를 전달함 
		// -> 매개변수 생성자를 정의해놓음
		return member; // 저장해놓은 데이터를 리턴
	}
	
	//이름을 입력받는 메소드
	public String inputMemberName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해주세요 : ");
		String memberName = sc.next();
		return memberName;
	}
	
	// 수정할 정보를 입력받는 메소드
	public Member modifyMember(Member member) {
		Scanner sc = new Scanner(System.in);
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		System.out.print("이메일 : ");
		String memberEmail = sc.next();
		System.out.print("전화번호 : ");
		String memberPhone = sc.next();
		//Member member = new Member(memberPw, memberEmail, memberPhone);
		//기존데이터유지, set을 통해 덮어쓰기
		member.setMemberPw(memberPw);
		member.setMemberEmail(memberEmail);
		member.setMemberPhone(memberPhone);
		return member;
	}
	
	//멤버 한명 출력하는 메소드->매개변수로
	public void printOneMember(Member member) {
		System.out.println("======= 회원 정보 출력(이름) =======");
		System.out.printf("아이디 : %s, 이름 : %s, 이메일 : %s, 폰번호 : %s\n"
				, member.getMemberId()
				, member.getMemberName()
				, member.getMemberEmail()
				, member.getMemberPhone());
	}
	//정보출력하기->리스트를 매개변수로 전달(view에는 list가 없기 때문에 전달받아야함)
	public void printAllMembers(List<Member> mList) {
		System.out.println("======= 회원 전체 정보 출력 =======");
		for(Member member : mList) { //member는 mList를 담을 변수
			System.out.printf("아이디 : %s, 이름 : %s, 이메일 : %s, 폰번호 : %s\n"
					, member.getMemberId()
					, member.getMemberName()
					, member.getMemberEmail()
					, member.getMemberPhone());
		}
	}

}


