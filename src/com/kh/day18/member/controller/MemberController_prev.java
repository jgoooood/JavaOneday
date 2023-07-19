package com.kh.day18.member.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.day18.member.model.vo.Member;
import com.kh.day18.member.view.MemberView;
//참고용 파일
//데이터저장소역할 -> 데이터 수정,삭제 등 *구조*를 만듬
//컨트롤러는 뷰와 객체협력함->run은 실행만
public class MemberController_prev {
	//필드
	private MemberView view;
	private List<Member> mList; //리스트타입 변수 선언
	
	//생성자
	public MemberController_prev() {
		view = new MemberView(); //객체생성 -> 멤버초기화
		mList = new ArrayList<Member>(); //ArrayList 객체생성->멤버초기화
	}
	
	//메뉴 출력 메소드
	public void startMemberProgram() {
		Member mOne = null;
		String name = "";
		int index = 0;
		finish:
		while(true) {
			int choice = view.printMenu(); // 뷰.메뉴출력
			switch(choice) {
				case 1 : 
					mOne = view.inputMember();
					addMember(mOne); //데이터추가하는 메소드를 만들어서 호출
					//mList.add(mOne); //데이터추가
					break;
				case 2 : 
					name = view.inputMemberName(); // 수정할 데이터의 이름을 입력 받음
					index = findIndexByName(name); // 수정할 인덱스 찾기
					mOne = findOneByName(name);		// 수정하지 않는 부분은 기존 데이터 유지되도록 원래 정보를 불러옴
					if(index != -1) {
						mOne = view.modifyMember(mOne); // 데이터가 있을 때 수정할 정보 입력 받음 -> 수정할 정보를 입력할 메소드 호출
					}
					modifyMember(index, mOne); //데이터수정
					break;
				case 3 : 
					name = view.inputMemberName(); 	//삭제할 데이터의 이름을 입력받음
					index = findIndexByName(name); // 이름과 일치하는 인덱스 찾아서 index에 저장
					subMember(index); 				// index를 넘겨받아서 subMember호출->해당 인덱스 전달해 삭제
					break;
				case 4 : 
					//검색할 이름입력 메소드 호출 후 name에 그 값을 담기
					name = view.inputMemberName();
					mOne = findOneByName(name);
					//Member member = findOneByName(name); /Member member대신 mOne
					view.printOneMember(mOne); //메소드를 이용해 출력
					break;
				case 5 : 
					// mList를 바로 전달 안하고 메소드로 호출하는 이유
					// 클래스를 하나 더 만들기 위해 구조를 먼저 만듬
					view.printAllMembers(allMemberList()); 
					break;
				case 6 : break finish;
			}
			
		}
	}
	
	/**
	 * 이름으로 인덱스 찾기
	 * @param name
	 * @return
	 */
	public int findIndexByName(String name) {
		for(int i = 0; i < mList.size(); i++) {
			if(mList.get(i).getMemberName().equals(name)) { 
				return i; //검색이름과 일치하는 인덱스 값 리턴 
			}
		}
		return -1; //못찾았을 때 -1 리턴
	}
	/**
	 * 이름으로 회원정보 찾기
	 * @param name
	 * @return
	 */
	public Member findOneByName(String name) {
		for(int i = 0; i < mList.size(); i++) { 
			if(mList.get(i).getMemberName().equals(name)) { //이름과 같은지 확인
				return mList.get(i); //검색이름과 일치하는 멤버 리턴
			}
		}
		return null; //다 돌았는데 없을 때
	}
	
	/**
	 * 회원전체정보 조회
	 * @return
	 */
	public List<Member> allMemberList() {
		return mList;
	}
	//======================= 데이터 등록, 수정, 삭제 메소드 ===================
	/**
	 * 회원 정보 등록 : 데이터를 추가해주는 메소드
	 * @param member
	 */
	public void addMember(Member member) {
		mList.add(member);
	}
	/**
	 * 회원정보 삭제
	 * @param index
	 */
	public void subMember(int index) {
		mList.remove(index);
	}
	
	/**
	 * 회원정보 수정
	 * @param index
	 * @param member
	 */
	public void modifyMember(int index, Member member) {
		mList.set(index, member);
	}
}
