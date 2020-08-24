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
			System.out.println(":::::: 성적 관리 프로그램 :::::: ");
			run();			
		}		
	}	
	
	private void run() {
		System.out.println("1. 입력	2.출력	3.검색	4.수정	5.삭제	6.종료");
		System.out.print(">>>");
		String input = scan.next(); 
		
		switch (input) {
		case "1" : input(); break;
		case "2" : output(); break;
		case "3" : search("검색"); break;
		case "4" : modify(); break;
		case "5" : delete(); break;
		case "6" : exit(); break;
		default : System.out.println("잘못된 입력입니다."); break;		
		
		}		
	}

		
	private void input() {
		System.out.println("::::: 입력 기능 :::::");
		stdArr[top++] = dataInput(); 
		System.out.println("::::: 입력 완료 :::::");
		
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
		
		System.out.print("학생의 이름을 입력해주세요>>");
		s.name = scan.next();
		System.out.print("국어점수를 입력해주세요>>");
		s.kor = scan.nextInt(); 
		System.out.print("영어점수를 입력해주세요>>");
		s.eng = scan.nextInt();
		System.out.print("수학점수를 입력해주세요>>");
		s.math = scan.nextInt();
		
		s.total = (s.kor + s.eng + s.math);
		s.avg =  s.total / 3.0;
		
		return s;
	}


	private void output() {
		System.out.println("::::: 출력 기능 :::::");
		for (int i = 0; i<top; i++) {
			System.out.println(stdArr[i]);
		}
		
	}


	private void search(String title) {
		System.out.println(":::::" + title + " 기능 :::::");	
		System.out.println(title.equals("검색") ? "검색하고자 하는 학생의 이름을 입력해주세요. \n>>>" :title + "하고자 하는 학생의 번호를 입력해주세요. \n>>>");
		String searchInput = scan.next();
		
		for(int i = 0; i<top ; i++) {
			if(searchInput.equals(stdArr[i].name)) {				
				System.out.println(stdArr[i]);				
			}
		}		
	}

	private void modify() {
		search("수정");
		int modifyNum = scan.nextInt();
		int modifyIdx; // 같은 이름이 두 명 이상일 경우에는 어떻게 해야하지?
		for(int i = 0; i<top ; i++) {
			if(modifyNum == stdArr[i].no) {				
				System.out.println(stdArr[i]);				
			}
		}
		
		System.out.print("수정하실 학생의 번호를 입력해주세요. >>");
		int modifyNum2 = scan.nextInt();
		
		
		
		
		
		
		System.out.println("수정하시겠습니까?");
		System.out.print("1. 성적수정	2. 수정종료");
		int modifyNum3 = scan.nextInt();
		switch(modifyNum3) {
		case 1 : 
			System.out.print("1. 국어점수 수정	2. 영어점수 수정    3. 수학점수 수정");
			int modifySubNum = scan.nextInt();
			switch (modifySubNum) {
			case 1: 
				
				; break;
			case 2: ; break;
			case 3: ; break;
			default : System.out.println("잘못된 입력입니다");
				
			}
			
			
			break;
		case 2 : return; // 여기서 나갈수 있을려나?
		default : System.out.println("잘못된 입력입니다"); 
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
