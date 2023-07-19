package com.kh.day18.member.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.kh.day18.member.model.vo.Member;

//DB에 해당하는 부분
//최종 호출되는 메소드들(RUN->VIEW->CONTROLLER->DAO) 총 3단계로 진행됨
public class MemberDAO {
	private List<Member>mList;
	
	public MemberDAO() {
		mList = new ArrayList<Member>();
	}
	/**
	 * 이름으로 인덱스 찾기
	 * @param name String으로 입력받은 값
	 * @return int값 없으면 -1 리턴
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
	 * @param name String으로 입력받은 값
	 * @return Member 객체 리턴, 없으면 null 리턴
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
	public void modifyMember(int index, Member mOne) {
		mList.set(index, mOne);
	}
}
