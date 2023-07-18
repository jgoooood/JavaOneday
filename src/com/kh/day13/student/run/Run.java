package com.kh.day13.student.run;

import java.util.List;
import java.util.Scanner;

import com.kh.day13.student.controller.StudentController;
import com.kh.day13.student.model.vo.Student;
import com.kh.day13.student.view.Studentview;


public class Run {
	public static void main(String[] args) {
		Studentview sView = new Studentview();
		StudentController sCont = new StudentController();
		Student student = new Student();
		Scanner sc = new Scanner(System.in);
		end:
		while(true) {
			int choice = sView.printMenu();	
			switch(choice) {
			case 1: //정보입력
				student = sView.inputInfo(); //학생정보입력받는 값을 매개변수에 저장해야함
				sCont.addStudent(student); //추가할 메소드에 입력받은 값을 매개변수로 전달
				break;
			case 2: //이름검색
				break;
			case 3: //정보수정
				
				break;
			case 4: //정보삭제(이름)
				break;
			case 5: //전체삭제(전체)
				break;
			case 6: //전체출력
				List<Student> stdList = sCont.printStdList(); //저장된 리스트를 변수에 담아주기
				sView.printInfo(stdList);
				break;
			case 7: //재평가대상여부확인
				break;
			case 8: //프로그램종료
				System.out.println("프로그램을 종료합니다.");
				break end;
			}
		}
	}
}
