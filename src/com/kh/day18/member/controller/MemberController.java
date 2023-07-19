package com.kh.day18.member.controller;

import java.util.List;

import com.kh.day18.member.model.dao.MemberDAO;
import com.kh.day18.member.model.vo.Member;

//컨트롤러->DAO호출
public class MemberController {
	//필드
	//private MemberView view;
	//private List<Member> mList; //리스트타입 변수 선언
	private MemberDAO memberDao;
	
	//생성자
	public MemberController() {
		//view = new MemberView(); //객체생성 -> 멤버초기화
		//mList = new ArrayList<Member>(); //ArrayList 객체생성->멤버초기화
		memberDao = new MemberDAO();
	}

	
	/**
	 * 이름으로 인덱스 찾기
	 * @param name String으로 입력받은 값
	 * @return int값 없으면 -1 리턴
	 */
	public int findIndexByName(String name) {
		int index = memberDao.findIndexByName(name);
		return index;
	}
	/**
	 * 이름으로 회원정보 찾기
	 * @param name String으로 입력받은 값
	 * @return Member 객체 리턴, 없으면 null 리턴
	 */
	public Member findOneByName(String name) {
		return memberDao.findOneByName(name);
	}
	
	/**
	 * 회원전체정보 조회
	 * @return
	 */
	public List<Member> allMemberList() {
		return memberDao.allMemberList();
	}
	//======================= 데이터 등록, 수정, 삭제 메소드 ===================
	/**
	 * 회원 정보 등록 : 데이터를 추가해주는 메소드
	 * @param member
	 */
	public void addMember(Member member) {
		memberDao.addMember(member);
	}
	/**
	 * 회원정보 삭제
	 * @param index
	 */
	public void subMember(int index) {
		memberDao.subMember(index);
	}
	/**
	 * 회원정보 수정
	 * @param index
	 * @param member
	 */
	public void modifyMember(int index, Member mOne) {
		memberDao.modifyMember(index, mOne);
	}
	
}
