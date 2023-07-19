package com.kh.day18.member.model.vo;
//멤버클래스 -> getter, setter, 변수
//Member는 db설계와 연관되어 있음
public class Member {
	//필드
	private String memberId;
	private String memberPw;
	private String memberName;
	private String memberEmail;
	private String memberPhone;
	
	//생성자
	public Member() { } //기본생성자
	
	public Member(String memberId, String memberPw) {
		super();
		this.memberId = memberId;
		this.memberPw = memberPw;
	}
	public Member(String memberPw, String memberEmail, String memberPhone) {
		this.memberPw = memberPw;
		this.memberEmail = memberEmail;
		this.memberPhone = memberPhone;
	}
	public Member(String memberId, String memberPw, String memberName, String memberEmail, String memberPhone) {
		super();
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberEmail = memberEmail;
		this.memberPhone = memberPhone;
	}	

	// getter, setter 메소드
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	//toString 보통 해쉬코드로 나오는데 보기 쉽게 오버라이딩->보통 한글로 오버라이딩 많이함
	@Override
	public String toString() {
		return "회원[아이디=" + memberId + ", 비밀번호=" + memberPw + ", 이름=" + memberName
				+ ", 이메일=" + memberEmail + ", 전화번호=" + memberPhone + "]";
	}
	
}
