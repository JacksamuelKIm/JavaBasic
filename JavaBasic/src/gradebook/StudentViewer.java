package gradebook;
//사용자가 보게 될 화면을 만들어주는 메소드

import java.util.Scanner;

public class StudentViewer {
		private Scanner scanner;
		private StudentController controller;
	
	public StudentViewer() {
		scanner = new Scanner(System.in);
		controller = new StudentController();
		}
	
	
	public void showMenu() {
		while(true) {
			System.out.println("========================");
			System.out.println("|비트 고등학교 성적입출력 프로그램|");
			System.out.println("========================");
			System.out.println("1. 입력  2. 출력  3. 종료");
			int choice = scanner.nextInt();
			if(choice == 1) {
				// 학생 정보 입력 메소드를 실행
				insertStudent();
				
				
			}else if(choice == 2) {
				// 학생 정보 출력 메소드를 실행
				printAll();
			}else if(choice == 3) {
				System.out.println("사용해주셔서 감사합니다.");
				scanner.close();  //이게 여기 있는 것이랑 바깥에 있는 거에 차이가 크나?
			}						
		} //while end		
	} //showMenu end
	
	private void insertStudent() {
		System.out.println("-------- 새학생 정보 입력 --------");
		// 학생 정보를 입력 받아서 컨트롤러에 보내준다.
		StudentVO s = new StudentVO();
		
		System.out.print("이름: ");
		scanner.nextLine();  
		s.setName(scanner.nextLine()); 
				
		System.out.print("국어: ");
		s.setKorean(scanner.nextInt());
		
		System.out.print("영어: ");
		s.setEnglish(scanner.nextInt());
		
		System.out.print("수학: ");
		s.setMath(scanner.nextInt());
		
		scanner.nextLine();
		System.out.print("주민등록번호: ");
		s.setJumin(scanner.nextLine());
		
		controller.insert(s);
	} // insertStudent end
	
	
	private void printAll() {
		//컨트롤러한테 StudentVO[]을 요청해서
		//그 전체 내용을 출력한다
		StudentVO[] array = controller.selectAll();
		System.out.println("-------------------------------------");
		for(int i = 0; i < array.length; i++) {
			System.out.printf("\t\t%d. %s\n", i, array[i].getName());
		}
		System.out.println("-------------------------------------");
		System.out.println("상세보기할 번호를 누르세요(-1)은 뒤로");
		System.out.println(">");
		int choice = scanner.nextInt();
		choice = validateNumberInsert(choice, -1, array.length -1);
		if(choice == -1) {		
			//아무것도 안함. 따라서 메소드가 종료되서 showMenu()로 돌아감
			//메소드 전체가 종료됨. printAll()로 돌아감
		}else {
			// 해당 학생 정보를 출력하는 메소드를 실행
			print(array[choice]);
		
		}		
	} // printAll end
	
	
	private void print(StudentVO s) {
		System.out.println("============================");
		System.out.println(s.getName()+" 학생의 정보");
		System.out.println("============================");
		System.out.printf("이름: %s\n", s.getName());
		System.out.printf("국어: %d점 영어: %d점 수학: %d점\\n", s.getKorean(), s.getEnglish(), s.getMath());
		System.out.printf("총점: %d점 평균: %.2f점\n", controller.calculateSum(s), controller.calculateAverage(s) );
		System.out.println("============================");
		System.out.println("1. 수정   2. 삭제  3. 뒤로  ");
		System.out.print("> ");
		int choice = scanner.nextInt();
		choice = validateNumberInsert(choice, 1, 3);
		if (choice == 1) {
			//수정 메소드 실행			
		}else if (choice ==2) {
			//삭제 메소드 실행
			System.out.println("해당 학생의 정보를 정말 삭제하시겠습니까? y/n?");
			scanner.nextLine();
			String agreement = scanner.nextLine();
			if (agreement.equals("y")) {
				//컨트롤러에서 삭제 메소드 실행
				controller.delete(s);
				
			}else {
				
				
			}
			
			
			
		}else if (choice ==3) {
			//아무것도 안함 
		}
		
	}// print end
			
	
	private int validateNumberInsert(int number, int minimum, int maximum) {
		while(number < minimum || number > maximum) {
			System.out.println("잘못 입력하셨습니다");
			System.out.println("다시 입력해 주세요");
			System.out.print("> ");
			number = scanner.nextInt();
			
		} //while end
		
		return number;
	}
	
	
} //class end
