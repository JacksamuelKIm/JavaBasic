package org.comstudy21.ch03.weekend;

import java.util.Scanner;




public class GradeManagement {
	
	Scanner scan = new Scanner(System.in);
	Student [] stdArr = new Student[100];
	int top = 0;
	int seq = 1; // no를 만들기 위한 변수로써 증가만 하는 역할
	
	public GradeManagement() {
		System.out.println("::::::::::::::: 성적 출력 프로그램 :::::::::::::::");
		
		
		while(true) {
			play();
			System.out.println("--------------------------------------------");
		}
	}
	
	
	private String menu() {
		System.out.println("1.입력 	2.출력	 3.검색 	4.수정 	5.삭제 	6.종료");
		System.out.print("Choice>>> ");
		String no = scan.next();
		return no;
	}
	
	
	private void input() {
		System.out.println("::::: 입력 기능 :::::");
		
		stdArr[top] = makeStudent();  // 이 top은 정확히 언제 ++되는가? makeStudent()를 넣은 다음? 이 메소드 종료이후?
		//아!! makeStudent()가 완전히 실행되어야 avg던 뭐던 할당이 되지!!!!!
		
		stdArr[top].rank =  rankCal(); //rank는 다른 값이 완전히 입력된 이후에 해야 복잡하게 꼬이지 않음
		
		System.out.print("+++++ 입력 완료 +++++");
		top++; //입력 다 하고 올려줘야지!
		
	}


	 Student makeStudent() {
		Student s = new Student();
		
		s.no = seq++;
		System.out.println("성명입력>>>");s.name= scan.next();
		System.out.println("국어점수>>>");s.kor= scan.nextInt();
		System.out.println("영어점수>>>");s.eng= scan.nextInt();
		System.out.println("수학점수>>>");s.math= scan.nextInt();
		
		s.total = s.kor + s.eng + s.math;
		s.avg = (double) s.total / s.subNums;
		s.grade = (s.avg>=90 ? "A" : s.avg>=80 ? "B" : s.avg>=70 ? "C" : s.avg>=60 ? "D" : "F")  ;
		
		s.rank = 0; // 일단 이렇게 깔아주고 그 다음에 수정하자. 아, 근데 나중에 수정삭제할떄 오류 안생길려나
		return s;
	}
	 
	private int rankCal() {
		
		//원래는 top따라서 rank를 12345 ~ 이런식으로 미리 해놓고 정렬하려 했는데 더 복잡해져서 놓치는 부분이 있는 듯 하다
		//일단 몽땅 다 0으로 해 놓고 여기서 평균값 비교하면서 직접 생성하자
		Student [] stdArrRank = new Student[100];
		for (int i = 0; i<=top; i++) {
			stdArrRank[i] = stdArr[i];
		}
		
		
		// stdArr에 영향주지 않도록 배열 하나 더 만들어 거기다 복사하고
		// 평균 높은 순으로 배열한 다음에 차례로 랭크 넣어주기
		for (int i = 0; i < top  ; i++) {  				
			for (int j = i + 1; j < top+1 ; j++) {
				if (stdArrRank[i].avg < stdArrRank[j].avg) {  // 같을 떄는 어떻게 할껀데?
					Student temp = stdArrRank[i];
					stdArrRank[i] = stdArrRank[j];
					stdArrRank[j] = temp;					
				} else if (stdArrRank[i].avg == stdArrRank[j].avg) {  // 같을 떄는 어떻게 할껀데?
					Student temp = stdArrRank[i+1]; 
					stdArrRank[i+1] = stdArrRank[j];
					stdArrRank[j] = temp;
				}
			}				
		}			
			
		
		for (int i = 0; i < top  ; i++) {
			for (int j = i+1; j < top+1  ; j++) {
				if(stdArrRank[i].avg == stdArrRank[j].avg) {
					stdArrRank[i].rank = i+1;
					stdArrRank[j].rank = stdArrRank[i].rank; 
					
				} else {
					stdArrRank[i].rank = i+1; //여기서 뭔가오류가 있고, 또 1등이 두명이면 어떻게 되는건데?
				}					
			}
		}
					
			return stdArrRank[top].rank;
	
	
	}


	private void output() { // 아 이건 다 보여주는건가?
		System.out.println(":::: 출력 기능 ::::");
		for(int i =0; i<top; i++) {
			System.out.println(stdArr[i]);
		}		
	}


	private void search() {
		System.out.println("::: 검색 기능 ::: "); // 검색과 출력이 무슨 차이가 있나? 검색하고 출력 안함? 아닌가;	
		System.out.print("검색하고자 하는 학생의 이름을 입력해주세요>>>>");
		String nameInput = scan.next();
		for(int i = 0; i<top; i++) {			
			if(nameInput.equals(stdArr[i].name)) {
				System.out.println("해당 학생의 기록은 다음과 같습니다.");
//				System.out.print(" 해당학생의 기록을 	1. 출력		2.  수정		3 삭제 >>"); 이건 시간 좀 남으면 하자
				System.out.println(stdArr[i]);
				break;
			} 
//				else if (){
//				System.out.println("해당 학생이 데이터베이스에 존재하지 않거나 잘못 입력하셨습니다."); 
//			}
			
			// 이것도 구현해야 하는데!!!
			
		}
		
	}


	private void modify() {
		System.out.println("::: 수정 기능 ::: ");// no는 안바꾸는 걸로 할까?
		System.out.print("수정하고자 하는 학생의 이름을 입력해주세요>>>>");
		String nameInput = scan.next();
		
		for(int i = 0; i<stdArr.length; i++) {
			
			if(nameInput.equals(stdArr[i].name)) {
				System.out.println("해당 학생의 기록은 다음과 같습니다.");				
				System.out.println(stdArr[i]);
				
				while(true) { //하나 입력하고 다시 나오면 귀찮으니까
					System.out.println("수정할 항목의 번호를 입력해주세요");
					System.out.print("1. 이름\t2. 국어\t3.영어\t4.수학\t5. 수정종료 >>>>");
					int modInput = scan.nextInt();
						switch (modInput) {
						case 1 : System.out.print("새로 입력할 이름>>> "); stdArr[i].name = scan.next();break;
						case 2 : System.out.print("새로 입력할 국어점수>>> "); stdArr[i].kor = scan.nextInt();break;
						case 3 : System.out.print("새로 입력할 영어점수>>> "); stdArr[i].eng = scan.nextInt();break;
						case 4 : System.out.print("새로 입력할 수학점수>>> "); stdArr[i].math = scan.nextInt();break;
						case 5 : return; // 음 이걸로 충분할까? no!
						default : System.out.println("잘못입력하셨습니다");
						}
				}
			} 
//			else if (!nameInput.equals(stdArr[i].name)){
//				System.out.println("해당 학생이 데이터베이스에 존재하지 않거나 잘못 입력하셨습니다.");
//			}
		}
		
	}


	private void delete() {
		System.out.println("::: 삭제 기능 ::: ");
		System.out.print("삭제하고자 하는 학생의 이름을 입력해주세요>>>>");
		String nameInput = scan.next();
		
		for(int i = 0; i<top; i++) {					
			if(nameInput.equals(stdArr[i].name)) {
				System.out.println("해당 학생의 기록은 다음과 같습니다.");				
				System.out.println(stdArr[i]);
				
				System.out.print("삭제하시겠습니까?(y/n) >>>>");
				String deleteInput = scan.next();
				switch (deleteInput) {
				case "y" : 
					if(i == 0) {
						for (int j = 1; j < top ; j++ ) {
							stdArr[j] = stdArr[i];
						}						
						
					}
					
					if(0<i && i < top-1 ) {
						for (int j = 0; j < i ; j++ ) {
							stdArr[j] = stdArr[i];
						}
						for (int j = i+1; j < top-1 ; j++ ) {
							stdArr[j] = stdArr[i+1];
						}						
					}						
					
					
					if(i== top -1) {
						for (int j = 0; j < top-2 ; j++ ) {
							stdArr[j] = stdArr[i];
						}						
					}
					
				
					System.out.println("삭제되었습니다."); return;
				case "n" : break;
		
					}
			}
		}
					
	}


	private void end() {
		System.out.println("::: 시스템 종료 ::: ");
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
		default : System.out.println("해당 사항 없습니다!!!");
		}
		
	}
	
	
	

	public static void main(String[] args) {
		new GradeManagement();
		
		
	}


	


	
	

	
}
