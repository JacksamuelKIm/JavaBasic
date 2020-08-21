package gradeManangementSystem;

import java.util.Scanner;

public class Controller {
	Scanner scan = new Scanner(System.in);
	
	StudentVO[] std = new StudentVO[100];
	int top = 0; // 인덱스 용 
	int seq = 1; // 학생번호? 계속 증가만 해야한다던데
	
	
	StudentVO input() {
		StudentVO s = new StudentVO();
		
		System.out.print("이름을 입력하세요 >>> ");
		s.setName(scan.next());
		System.out.print("국어 성적을 입력하세요 >>> ");
		s.setKor(scan.nextInt());
		System.out.print("영어 성적을 입력하세요 >>> ");
		s.setEng(scan.nextInt());
		System.out.print("수학 성적을 입력하세요 >>> ");
		s.setMath(scan.nextInt());
		
		s.setTotal(s.getKor() + s.getEng() + s.getMath());
		s.setAverage((double)s.getTotal()/3);
				
		return s;
		
	}

	StudentVO output() {
		StudentVO s = new StudentVO();
		
		System.out.println("이름: "+ s.getName());
		System.out.println("국어: "+ s.getKor());
		System.out.println("영어: "+ s.getEng());
		System.out.println("수학: "+ s.getMath());
		System.out.println("총점: "+ s.getTotal());
		System.out.println("평균: "+ s.getAverage());
		
		return s;
	}

	public void search() {
		// TODO Auto-generated method stub
		
	}
	
	public void modify() {
		// TODO Auto-generated method stub
		
	}

	public void delete() {
		// TODO Auto-generated method stub
		
	}
	
	
	public void end() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
		
	}

	

	

}
