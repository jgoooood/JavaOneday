package com.kh.day07.oop.polymorphism.instnceof;

public class Exam_InstanceOf {
	//print메소드를 한번에 쓰면서 오버로딩을 한것
	//	static void print(Student student) {
	//		System.out.println("Student입니다.");
	//	}
	//	static void print(Researcher researcher) {
	//		System.out.println("Researcher입니다.");
	//	}
	//	static void print(StudentWorker studentworker) {
	//		System.out.println("Studentworker 입니다.");
	//	}
	//	static void print(Professor professor) {
	//		System.out.println("professor 입니다.");
	//	}
	//부모타입의 변수 person을 매개변수로
	static void print(Person person) {
		//person변수에 Person클래스를 상속받은 모든 객체(인스턴스)를 저장할 수 있음.
		//즉 부모타입의 변수를 자식객체로 다룰 수 있다->상속받았기에 가능
		//person = new Student();
		//person = new Researcher();
		//person = new StudentWorker();
		//person = new Professor();
		
		//인스턴스 오브 : 부모타입 변수 person에 어떤 자식클래스가 들어갔는지 체크해주는 연산자
//		if(person instanceof Student) {
//			System.out.println("Student입니다.");			
//		}
//		if (person instanceof Researcher){
//			System.out.println("Researcher 입니다.");
//		}

		/* 출력결과 : 어떤 클래스가 상속받고 있는지 인스턴스오브가 체크해서 아래처럼 출력함
		 Student입니다. 	-> Student student = new Student();
								print(student);
		 Researcher 입니다. -> Researcher researcher = new Researcher();
								print(researcher);
		 Student입니다.		-> print(new StudentWorker());
		 Researcher 입니다. -> print(new Professor());
		*/
		
		
		if(person instanceof Student) {
			System.out.println("Student입니다.");			
		}
		if(person instanceof StudentWorker) {
			System.out.println("StudentWorker입니다.");			
		}
		if (person instanceof Researcher){
			System.out.println("Researcher 입니다.");
		}
		if (person instanceof Professor){
			System.out.println("Professor 입니다.");
		}
		
		/*출력결과
		 Student입니다.
		 Student입니다.
		 StudentWorker입니다.
		 Researcher 입니다.
		 Researcher 입니다.
		 Professor 입니다.
		 상속받고 있는 것들도 모두 출력되기 때문에 총6개가 출력됨.
		 Student : Student
		 StudentWorker : Student + StudentWorker 
		 Researcher : Researcher
		 Professor : Researcher + Professor
		 */
		
	}

	
	public static void main(String[] args) {
		//변수를 사용해 객체생성
//		Student student = new Student();
//		print(student);
//		Researcher researcher = new Researcher();
//		print(researcher);
		
		//변수사용없이 객체생성
		print(new Student());
		print(new StudentWorker());
		print(new Researcher());
		print(new Professor());
	}

}
