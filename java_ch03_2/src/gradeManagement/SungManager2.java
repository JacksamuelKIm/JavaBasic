package gradeManagement;

import java.util.Scanner;

public class SungManager2 {
	Scanner scan = new Scanner(System.in);
	StudentGM [] stdArr = new StudentGM [100];
	int top = 0; // as an index for elements of the array stdArr.
	int seq = 1; // to assign student numbers for students. 
	
	public SungManager2() {
		stdArr[top++] = dataInput("a", 90, 90, 90);
		stdArr[top++] = dataInput("b", 100, 100, 95);
		stdArr[top++] = dataInput("c", 100, 100, 95);
		stdArr[top++] = dataInput("a", 70, 94, 82);
		stdArr[top++] = dataInput("e", 97, 74, 40);
		while(true) {
			System.out.println(":::::: ���� ���� ���α׷� :::::: ");
			run();			
		}		
	}	
	
	private void run() {
		System.out.println("1. �Է�	2.���	3.�˻�	4.����	5.����	6.����");
		System.out.print(">>>");
		String input = scan.next(); 
		
		switch (input) {
		case "1" : input(); break;
		case "2" : output(); break;
		case "3" : search("�˻�"); break;
		case "4" : modify(); break;
		case "5" : delete(); break;
		case "6" : exit(); break;
		default : System.out.println("�߸��� �Է��Դϴ�."); break;		
		
		}		
	}

		
	private void input() {
		System.out.println("::::: �Է� ��� :::::");
		stdArr[top++] = dataInput(); 
		System.out.println("::::: �Է� �Ϸ� :::::");
		
	}
	
	private StudentGM dataInput(String name, int kor, int eng, int math) {
		StudentGM s = new StudentGM();	
		s.no = seq++;
		
		s.name = name;
		s.kor = kor; 
		s.eng = eng;
		s.math = math;
		
		s.total = (s.kor + s.eng + s.math);
		s.avg =  s.total / 3.0;
		
		return s;
	}
	
	
	private StudentGM dataInput() {
		StudentGM s = new StudentGM();	
		s.no = seq++;
		
		System.out.print("�л��� �̸��� �Է����ּ���>>");
		s.name = scan.next();
		System.out.print("���������� �Է����ּ���>>");
		s.kor = scan.nextInt(); 
		System.out.print("���������� �Է����ּ���>>");
		s.eng = scan.nextInt();
		System.out.print("���������� �Է����ּ���>>");
		s.math = scan.nextInt();
		
		s.total = (s.kor + s.eng + s.math);
		s.avg =  s.total / 3.0;
		
		return s;
	}


	private void output() {
		System.out.println("::::: ��� ��� :::::");
		for (int i = 0; i<top; i++) {
			System.out.println(stdArr[i]);
		}
		
	}


	private void search(String title) {
		System.out.println(":::::" + title + " ��� :::::");	
		System.out.println(title.equals("�˻�") ? "�˻��ϰ��� �ϴ� �л��� �̸��� �Է����ּ���. \n>>>" :title + "�ϰ��� �ϴ� �л��� ��ȣ�� �Է����ּ���. \n>>>");
		String searchInput = scan.next();
		
		for(int i = 0; i<top ; i++) {
			if(searchInput.equals(stdArr[i].name)) {				
				System.out.println(stdArr[i]);				
			}
		}		
	}

	private void modify() {
		search("����");
		int modifyNum = scan.nextInt();
		int modifyIdx; // ���� �̸��� �� �� �̻��� ��쿡�� ��� �ؾ�����?
		for(int i = 0; i<top ; i++) {
			if(modifyNum == stdArr[i].no) {				
				System.out.println(stdArr[i]);				
			}
		}
		
		System.out.print("�����Ͻ� �л��� ��ȣ�� �Է����ּ���. >>");
		int modifyNum2 = scan.nextInt();
		
		
		
		
		
		
		System.out.println("�����Ͻðڽ��ϱ�?");
		System.out.print("1. ��������	2. ��������");
		int modifyNum3 = scan.nextInt();
		switch(modifyNum3) {
		case 1 : 
			System.out.print("1. �������� ����	2. �������� ����    3. �������� ����");
			int modifySubNum = scan.nextInt();
			switch (modifySubNum) {
			case 1: 
				
				; break;
			case 2: ; break;
			case 3: ; break;
			default : System.out.println("�߸��� �Է��Դϴ�");
				
			}
			
			
			break;
		case 2 : return; // ���⼭ ������ ��������?
		default : System.out.println("�߸��� �Է��Դϴ�"); 
		}
		
		
		
		
		
	}


	private void delete() {
		
	}


	private void exit() {
		System.exit(0);		
	}


	public static void main(String[] args) {
		new SungManager2();

	}

}
