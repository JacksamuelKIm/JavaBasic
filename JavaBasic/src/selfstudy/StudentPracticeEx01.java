package selfstudy;

public class StudentPracticeEx01 {
	public static void main(String[] args) {
		//학생 객체를 선언해보자
		StudentPractice student = new StudentPractice();
		System.out.println(student.name);	
				
		//학생 개체의 필드에 값을 저장해보자
		
		student.name = "잭";
		student.age = 15;
		student.korean = 80;
		student.english = 79;
		student.math = 80;
		
		// 학생 객체의 메소드를 실행해보자
		System.out.println("학생의 총점: " + student.calculateSum());
		
		
		//학생 객체를 출력해보자
		System.out.println(student); // println이 student를 실행면서 toString()도 같이 한 것임
		
		
		//만약 스태틱 키워드가 붙여졌을 경우. 객체.메소드가 아닌
		//클래스.메소드()로 실행하면 된다.
		StudentPractice.goSchool();
		
		StudentPractice student2 = new StudentPractice();
		student2.name = "김철수";
		student2.age = 15;
		student2.korean = 90;
		student2.english = 91;
		student2.math = 91;
		student2.jumin = "990101-1111111";
		
		StudentPractice student3 = new StudentPractice();
		student3.name = "김철수";
		student3.age = 15;
		student3.korean = 90;
		student3.english = 91;
		student3.math = 91;
		student3.jumin = "990101-1111111";
		
		// student2와 student3은 다른 학생일까요?
		System.out.println(student2 == student3);
		System.out.println(student2.equals(student3)); //이거 true 나와야 하는데....
		System.out.println(student2.equals("abc"));
		
		
		// Student test01 = new Student(String jack, int 32); 이렇게 하면 안되는 이유가 this때문???
		
		
	}

}
