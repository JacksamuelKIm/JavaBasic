package org.comstudy21.ch03.weekend;
import java.util.Scanner;

class Student {
	int no;
	String name;
	
	int kor;
	int eng;
	int math;
	
	int total;
	double avg;
	String grade;
	
	int rank;

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", total="
				+ total + ", avg=" + avg + ", grade=" + grade + ", rank=" + rank + "]";
	}	
} // end of Student

public class SungManager{
	Scanner scan = new Scanner(System.in);
	Student[] stdArr = new Student[100];
	int top = 0;
	int seq = 1; // no를 만들기 위한 변수로서 증가만 하는 역할
	
	
	public SungManager() {
		System.out.println("::: 성적 출력 프로그램 :::");
		while(true) {
		play();
		System.out.println("----------------------------------------------");
		}
	}
	
	private int menu() {
		System.out.println("1.input 2.output 3.search 4.modify 5.delete 6.end");
		System.out.print("Choice>>> ");
		int no = scan.nextInt();
		return no;
		
	}
	
	Student makeStudent() {
		Student s = new Student();
		
		s.no = seq++;
		System.out.print("성명입력>>> "); s.name = scan.next();
		System.out.print("국어점수>>> "); s.kor = scan.nextInt();
		System.out.print("영어점수>>> "); s.eng = scan.nextInt();
		System.out.print("수학점수>>> "); s.math = scan.nextInt();		
		return s;
	}
	
	private void input() {
		System.out.println("::: 입력 기능 :::");
		stdArr[top++] = makeStudent();
		System.out.println("++++ 입력 완료 ++++");
		
	}

	

	private void output() {
		System.out.println("::: 출력 기능 :::");
		for (int i = 0; i<top; i++) {
			System.out.println(stdArr[i]);
		}
		
	}

	private void search() {
		// TODO Auto-generated method stub
		
	}

	private void modify() {
		// TODO Auto-generated method stub
		
	}

	private void delete() {
		// TODO Auto-generated method stub
		
	}

	private void end() {
		// TODO Auto-generated method stub
		
	}
	
	
	private void play() {
		switch(menu()) {
		case 1: input(); break;
		case 2: output(); break;
		case 3: search(); break;
		case 4: modify(); break;
		case 5: delete(); break;
		case 6: end(); break;		
		default : System.out.println("해당 사항 없습니다!");
		}
		// 재귀호출
		//play();
		
		
	}




	




	

	public static void main(String[] args) {
		new SungManager();
	}
	
	
	
} // end of SungManager 