package util;
// Student 클래스를 사용할 때 편한 메소드 모읍집 

import java.util.Scanner;

import day03.Student;

public class StudentUtil {
	//1. 학생의 정보를 입력받아서 객체로 만드는 메소드
	public static Student setInformation (Scanner scanner) {
		Student s = new Student();
		
		System.out.print("이름: ");
		scanner.nextLine(); // 안닫아줘도 되나? 아예 객체로 scanner 한거 없어서? 아니면 Parameter에 있어서? => 그렇다. 불러올 객체가 이미 닫고 있을테니 
		s.setName(scanner.nextLine()); 
		
		System.out.print("나이: ");
		s.setAge(scanner.nextInt());
		
		System.out.print("국어: ");
		s.setKorean(scanner.nextInt());
		
		System.out.print("영어: ");
		s.setEnglish(scanner.nextInt());
		
		System.out.print("수학: ");
		s.setMath(scanner.nextInt());
		
		scanner.nextLine();
		System.out.print("주민등록번호: ");
		s.setJumin(scanner.nextLine());
		
		return s;
	} // SetInformation method end
	
	//2. 파라미터로 넘어온 배열의 내용을 출력하는 메소드
	public static void printArray(Student[] studentArray) {
		// 향상된 for 문(forEach구조)
		// 배열과 같이 똑같은 데이터타입이 모여있는 경우
		// 0번부터 불러와서 임시로 하나의 객체처럼 다룰 수 있다.
		// 이러한 구조를 향상된 for문 (for Each구조)라고 한다.
		for(Student s :studentArray) {
			System.out.println("-------------------------------------------------");
			print(s);  //메소드 단독 실행이 되나부지?
			System.out.println("-------------------------------------------------");
		} //for each end
	}
	
	//3. 파라미터로 넘어온 Student 객체를 출력하는 메소드
	public static void print(Student s) {
		System.out.printf("이름 : %s\t나이: %03d세 \n", s.getName(), s.getAge());
		System.out.printf("국어 : %03d점 영어: %03d점 수학: %03d점\n", s.getKorean(), s.getEnglish(), s.getMath() );
		System.out.printf("총점 : %03d점\t평균: %.2f점\n", s.calculateSum(), s.calculateAverage() );		
	}
	
	
} // class end
