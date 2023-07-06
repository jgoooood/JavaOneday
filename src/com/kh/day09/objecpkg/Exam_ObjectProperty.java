package com.kh.day09.objecpkg;

//파일 하나를 만든 것과 동일함->별개의 파일인데 붙여서 보는 것
//Point 클래스를 추가한 것과 마찬가지임
//위에서 코드 작성할 때는 public 붙이지 않음
//class Point {
//	private int x, y;
//	public Point() {}
//	public Point(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//}


public class Exam_ObjectProperty {

	//Object는 모든 클래스의 부모이기 때문에 모든 메소드를 받을 수 있음
	public static void print(Object obj) {
		System.out.println("클래스 이름 : " + obj.getClass().getName());
		System.out.println("해시 코드 값 : " + obj.hashCode()); //객체의 고유값
		System.out.println("객체를 문자열로 만들어 출력 : " + obj.toString());
		System.out.println("객체 출력 : " + obj);
	}
	public static void main(String[] args) {
//		================== toString()==================
//		Point p = new Point(2, 3);
//		Point p2 = new Point(2, 3);
//		print(p);
//		print(p2);
		
		/*
		한번 객체를 생성하면 고유의 값을 갖게 됨
		클래스 이름 : com.kh.day09.objecpkg.Point
		해시 코드 값 : 1651191114
		객체를 문자열로 만들어 출력 : com.kh.day09.objecpkg.Point@626b2d4a
		객체 출력 : com.kh.day09.objecpkg.Point@626b2d4a
		
		클래스 이름 : com.kh.day09.objecpkg.Point
		해시 코드 값 : 1586600255
		객체를 문자열로 만들어 출력 : com.kh.day09.objecpkg.Point@5e91993f
		객체 출력 : com.kh.day09.objecpkg.Point@5e91993f
		 */
		
		/*
		toString 오버라이딩 후 출력
		클래스 이름 : com.kh.day09.objecpkg.Point
		해시 코드 값 : 1651191114
		객체를 문자열로 만들어 출력 : x : 2, y : 3
		객체 출력 : x : 2, y : 3
		
		클래스 이름 : com.kh.day09.objecpkg.Point
		해시 코드 값 : 1586600255
		객체를 문자열로 만들어 출력 : x : 2, y : 3
		객체 출력 : x : 2, y : 3
		 */
		
		
		//==================equals()==================
		String javaStr = "Java";
//		String javaStr2 = "Java";
		String javaStr3 = new String("Java");
//		if(javaStr == javaStr2) { // 같습니다
//		if(javaStr == javaStr3) { // 다릅니다 : javaStr3은 새 객체가되어 해시코드값이 서로 달라짐
//			System.out.println("같습니다.");
//		} else {
//			System.out.println("다릅니다.");
//		}
		// 결론 : 여태까지 비교는 Java의 내용이 같은지 비교한게 아니라, 주소비교를 했었던 것(String으로 비교)
		// Object 클래스의 equqls() : 주소비교x, 데이터의 내용을 비교함
		
		if(javaStr.equals(javaStr3)) { // 다릅니다 : javaStr3은 새 객체가되어 해시코드값이 서로 달라짐
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
		
//		String [] strArrs = new String[10];
//		strArrs[0] = "Java";
//		strArrs[1] = "Java";
//		if(strArrs[0] == strArrs[1]) {
//			System.out.println("같습니다.");
//		} else {
//			System.out.println("다릅니다.");
//		}
//		//같습니다
		
	}

}
