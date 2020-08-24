package gradeManagementBackup;


import java.util.Scanner;




public class GradeManagement {
	
	Scanner scan = new Scanner(System.in);
	Student2 [] stdArr = new Student2[100];
	int top = 0;
	int seq = 1; // no�� ����� ���� �����ν� ������ �ϴ� ����
	
	public GradeManagement() {
		System.out.println("::::::::::::::: ���� ��� ���α׷� :::::::::::::::");
		
		
		while(true) {
			play();
			System.out.println("--------------------------------------------");
		}
	}
	
	
	private String menu() {
		System.out.println("1.�Է� 	2.���	 3.�˻� 	4.���� 	5.���� 	6.����");
		System.out.print("Choice>>> ");
		String no = scan.next();
		return no;
	}
	
	
	private void input() {
		System.out.println("::::: �Է� ��� :::::");
		
		stdArr[top] = makeStudent();  // �� top�� ��Ȯ�� ���� ++�Ǵ°�? makeStudent()�� ���� ����? �� �޼ҵ� ��������?
		//��!! makeStudent()�� ������ ����Ǿ�� avg�� ���� �Ҵ��� ����!!!!!
		
//		stdArr[top].rank =  rankCal(); //rank�� �ٸ� ���� ������ �Էµ� ���Ŀ� �ؾ� �����ϰ� ������ ����
		top++;
		stdArr[top-1].rank = setRank();
		System.out.print("+++++ �Է� �Ϸ� +++++");
		
		
	}


	Student2 makeStudent() {
		Student2 s = new Student2();
		
		s.no = seq++;
		System.out.println("�����Է�>>>");s.name= scan.next();
		System.out.println("��������>>>");s.kor= scan.nextInt();
		System.out.println("��������>>>");s.eng= scan.nextInt();
		System.out.println("��������>>>");s.math= scan.nextInt();
		
		s.total = s.kor + s.eng + s.math;
		s.avg = (double) s.total / s.subNums;
		s.grade = (s.avg>=90 ? "A" : s.avg>=80 ? "B" : s.avg>=70 ? "C" : s.avg>=60 ? "D" : "F")  ;
		
		
		return s;
	}
	 
	
	private int setRank() {
		// ���� ����� ����� 1������ �Ǳ�ȭ�ϰ� ��� ���Ѵ�
		// �� ū ������ ���� ��Ұ� �ִٸ� 1��� 2������ �����Ѵ�.
		
		for (int i = 0; i < top  ; i++) {  	
			stdArr[i].rank = 1;
			for (int j = i; j < top ; j++) {
				if (stdArr[i].avg < stdArr[j].avg) {  // ���� ���� ��� �Ҳ���?
					stdArr[i].rank += 1;		
				} 
			}				
		}
		return stdArr[top-1].rank;	
		
		
	}
	
	
	
	
	private int rankCal() {
		
		//������ top���� rank�� 12345 ~ �̷������� �̸� �س��� �����Ϸ� �ߴµ� �� ���������� ��ġ�� �κ��� �ִ� �� �ϴ�
		//�ϴ� ���� �� 0���� �� ���� ���⼭ ��հ� ���ϸ鼭 ���� ��������
		Student2 [] stdArrRank = new Student2[100];
		for (int i = 0; i<top; i++) {
			stdArrRank[i] = stdArr[i];
		}
		
		
		// stdArr�� �������� �ʵ��� �迭 �ϳ� �� ����� �ű�� �����ϰ�
		// ��� ���� ������ �迭�� ������ ���ʷ� ��ũ �־��ֱ�
		for (int i = 0; i < top-1  ; i++) {  				
			for (int j = i + 1; j < top ; j++) {
				if (stdArrRank[i].avg < stdArrRank[j].avg) {  // ���� ���� ��� �Ҳ���?
					Student2 temp = stdArrRank[i];
					stdArrRank[i] = stdArrRank[j];
					stdArrRank[j] = temp;					
				} else if (stdArrRank[i].avg == stdArrRank[j].avg) {  // ���� ���� ��� �Ҳ���?
					Student2 temp = stdArrRank[i+1]; 
					stdArrRank[i+1] = stdArrRank[j];
					stdArrRank[j] = temp;
				}
			}				
		}			
			
		
		for (int i = 0; i < top-1  ; i++) {
			for (int j = i+1; j < top  ; j++) {
				if(stdArrRank[i].avg == stdArrRank[j].avg) {
					stdArrRank[i].rank = i+1;
					stdArrRank[j].rank = stdArrRank[i].rank; 
					
				} else {
					stdArrRank[i].rank = i+1; //���⼭ ���������� �ְ�, �� 1���� �θ��̸� ��� �Ǵ°ǵ�?
				}					
			}
		}					
			return stdArrRank[top-1].rank; //??	
	}


	private void output() { // �� �̰� �� �����ִ°ǰ�?
		System.out.println(":::: ��� ��� ::::");
		for(int i =0; i<top; i++) {
			System.out.println(stdArr[i]);
		}		
	}

	private void search() {
		System.out.println("::: �˻� ��� ::: "); // �˻��� ����� ���� ���̰� �ֳ�? �˻��ϰ� ��� ����? �ƴѰ�;	
		System.out.print("�˻��ϰ��� �ϴ� �л��� �̸��� �Է����ּ���>>>>");
		String nameInput = scan.next();
		for(int i = 0; i<top; i++) {			
			if(nameInput.equals(stdArr[i].name)) {
				System.out.println("�ش� �л��� ����� ������ �����ϴ�.");
//				System.out.print(" �ش��л��� ����� 	1. ���		2.  ����		3 ���� >>"); �̰� �ð� �� ������ ����
				System.out.println(stdArr[i]);
				break;
			} 
//				else if (){
//				System.out.println("�ش� �л��� �����ͺ��̽��� �������� �ʰų� �߸� �Է��ϼ̽��ϴ�."); 
//			}
			
			// �̰͵� �����ؾ� �ϴµ�!!!
			
		}
		
	}

	private void modify() {
		System.out.println("::: ���� ��� ::: ");// no�� �ȹٲٴ� �ɷ� �ұ�?
		System.out.print("�����ϰ��� �ϴ� �л��� �̸��� �Է����ּ���>>>>");
		String nameInput = scan.next();
		
		for(int i = 0; i<stdArr.length; i++) {
			
			if(nameInput.equals(stdArr[i].name)) {
				System.out.println("�ش� �л��� ����� ������ �����ϴ�.");				
				System.out.println(stdArr[i]);
				
				while(true) { //�ϳ� �Է��ϰ� �ٽ� ������ �������ϱ�
					System.out.println("������ �׸��� ��ȣ�� �Է����ּ���");
					System.out.print("1. �̸�\t2. ����\t3.����\t4.����\t5. �������� >>>>");
					int modInput = scan.nextInt();
						switch (modInput) {
						case 1 : System.out.print("���� �Է��� �̸�>>> "); stdArr[i].name = scan.next();break;
						case 2 : System.out.print("���� �Է��� ��������>>> "); stdArr[i].kor = scan.nextInt();break;
						case 3 : System.out.print("���� �Է��� ��������>>> "); stdArr[i].eng = scan.nextInt();break;
						case 4 : System.out.print("���� �Է��� ��������>>> "); stdArr[i].math = scan.nextInt();break;
						case 5 : return; // �� �̰ɷ� ����ұ�? no!
						default : System.out.println("�߸��Է��ϼ̽��ϴ�");
						}
				}
			} 
//			else if (!nameInput.equals(stdArr[i].name)){
//				System.out.println("�ش� �л��� �����ͺ��̽��� �������� �ʰų� �߸� �Է��ϼ̽��ϴ�.");
//			}
		}
		
	}
	
	private void delete() {
		System.out.println("::: ���� ��� ::: ");
		System.out.print("�����ϰ��� �ϴ� �л��� �̸��� �Է����ּ���>>>>");
		String nameInput = scan.next();
		
		for(int i = 0; i<top; i++) {					
			if(nameInput.equals(stdArr[i].name)) {
				System.out.println("�ش� �л��� ����� ������ �����ϴ�.");				
				System.out.println(stdArr[i]);
				
				System.out.print("�����Ͻðڽ��ϱ�?(y/n) >>>>");
				String deleteInput = scan.next();
				switch (deleteInput) {
				case "y" : 
					if(i == 0) {
							for (int j = 0; j < top-1 ; j++ ) {
								stdArr[j] = stdArr[j+1];
							}												
					}
					
					else if(0<i && i < top-1 ) {
						for (int j = 0; j < i ; j++ ) {
							stdArr[j] = stdArr[j];
						}
						for (int j = i; j < top ; j++ ) {
							stdArr[j] = stdArr[j+1];
						}
						
						stdArr[top-1].no = 0;
						stdArr[top-1].name = null;
						stdArr[top-1].kor = 0;
						stdArr[top-1].eng = 0;
						stdArr[top-1].math = 0;
						stdArr[top-1].total = 0;
						stdArr[top-1].avg = 0;
						stdArr[top-1].grade = null;
					}						
					
					
					else if(i== top -1) {//��??? null�� ��¼��?
						for (int j = 0; j < top-2 ; j++ ) {
							stdArr[j] = stdArr[j];
						}
						
						
						//ArrayList�� �ƴ϶� ��ü�� ���ֱ� ��ƴ�?
						stdArr[i].no = 0;
						stdArr[i].name = null;
						stdArr[i].kor = 0;
						stdArr[i].eng = 0;
						stdArr[i].math = 0;
						stdArr[i].total = 0;
						stdArr[i].avg = 0;
						stdArr[i].grade = null;
					}
					
				
					System.out.println("�����Ǿ����ϴ�."); return;
				case "n" : break;
		
					}
			}
		}
					
	}
	
	private void end() {
		System.out.println("::: �ý��� ���� ::: ");
		System.exit(0);
	}

	private  void play() {
		switch(menu()) {
		case "1" : input(); break;
		case "2" : output(); break;
		case "3" : search(); break;
		case "4" : modify(); break;
		case "5" : delete(); break;
		case "6" : end(); break;
		default : System.out.println("�ش� ���� �����ϴ�!!!");
		}
		
	}
	
	public static void main(String[] args) {
		new GradeManagement();
		
		
	}
}
