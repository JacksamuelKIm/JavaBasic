package gradeManangementSystem;

import java.util.Scanner;

public class Controller {
	Scanner scan = new Scanner(System.in);
	
	StudentVO[] std = new StudentVO[100];
	int top = 0; // �ε��� �� 
	int seq = 1; // �л���ȣ? ��� ������ �ؾ��Ѵٴ���
	
	
	StudentVO input() {
		StudentVO s = new StudentVO();
		
		System.out.print("�̸��� �Է��ϼ��� >>> ");
		s.setName(scan.next());
		System.out.print("���� ������ �Է��ϼ��� >>> ");
		s.setKor(scan.nextInt());
		System.out.print("���� ������ �Է��ϼ��� >>> ");
		s.setEng(scan.nextInt());
		System.out.print("���� ������ �Է��ϼ��� >>> ");
		s.setMath(scan.nextInt());
		
		s.setTotal(s.getKor() + s.getEng() + s.getMath());
		s.setAverage((double)s.getTotal()/3);
				
		return s;
		
	}

	StudentVO output() {
		StudentVO s = new StudentVO();
		
		System.out.println("�̸�: "+ s.getName());
		System.out.println("����: "+ s.getKor());
		System.out.println("����: "+ s.getEng());
		System.out.println("����: "+ s.getMath());
		System.out.println("����: "+ s.getTotal());
		System.out.println("���: "+ s.getAverage());
		
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
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
		
	}

	

	

}
