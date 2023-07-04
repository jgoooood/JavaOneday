package com.kh.day07.oop.inheritance;

//임포트 한번에 : ctrl+shift+o
import com.kh.day07.oop.point.ColorPoint;
import com.kh.day07.oop.point.Point;



public class Exam_Inheritance {
	public static void main(String[] args) {
		//(x, y)의 한점을 표현하는 Point클래스와 이를 상속받아 색을 가진 점을 표현하는
		//ColorPoint클래스를 만들고 활용
		//set메소드를 사용할 때
		//Point p = new Point();
		// p.set(1, 2); set메소드를 사용할 때
		
		//Point클래스의 생성자를 사용해 매개변수로 값 전달
		Point p = new Point(1, 2);
		p.showPoint();

		//set메소드를 사용할 때
		//ColorPoint cp = new ColorPoint();
		// cp.set(3, 4); 
		// cp.setColor("red");
		
		//생성자를 사용할 때->매개변수로 값 전달
		ColorPoint cp = new ColorPoint(3, 4, "red");
		cp.showColorPoint();
		
		ColorPoint cp2 = new ColorPoint(5, 6, "blue");
		cp2.showColorPoint();
	}
}


