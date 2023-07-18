package com.kh.day13.student.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.day13.student.model.vo.Student;
//저장하는 부분은 컨트롤러 / 입력은 뷰로
public class StudentController {
	List<Student> stdList;  //List 선언
	
	//생성자
	public StudentController() {
		stdList = new ArrayList<Student>(); //ArrayList객체생성
	}
	
	// 저장메소드
	public void addStudent(Student std) {
		stdList.add(std);
	}
	
	// 출력메소드
	public List<Student> printStdList() {
		return stdList;
	}
}
