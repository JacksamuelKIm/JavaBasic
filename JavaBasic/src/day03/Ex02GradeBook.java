package day03;
//사용자로부터
//나이 이름 국어 영어 수학 점수를 입력받아서 
//출력하는 프로그램
//단 사용자가 종료를 누르기 전까지 무한히 돌아간다
//입력을 선택하면 해당 정보들을 입력만 받는다
//출력을 선택하면 해당 정보들을 출력만 한다

//고려해 볼 점: 변수는 어디에 선언해야 할까
import java.util.Scanner;

public class Ex02GradeBook {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		while (true) {
			System.out.println("======================");
			System.out.println("     성적관리 프로그램        ");
			System.out.println("======================");
			System.out.println(" 1. 입력  2. 출력  3. 종료");
			System.out.print("> ");
			int selection = scanner.nextInt();
			String inputName;
			int inputAge;
			int inputKor;
			int inputEng;
			int inputMath;
			
			if (selection == 1 ) {
				System.out.print("이름: ");
				inputName = scanner.nextLine();
				System.out.print("나이: ");
				inputAge = scanner.nextInt();
				System.out.print("국어점수: ");
				inputKor = scanner.nextInt();
				System.out.print("영어점수: ");
				inputEng = scanner.nextInt();
				System.out.print("수학점수: ");
				inputMath = scanner.nextInt();
				
			} if (selection == 2) {
				System.out.printf("이름: "); // if범위 밖이라 못써먹네);
			
			
			
			
			
			} else if (selection == 3) {
				System.out.println("사용해 주셔서 감사합니다");
				break;
			} else {
				System.out.println("잘못 누르셨습니다.");
			}
			
			
		} //while end
		
		scanner.close();
	} // main end

} // class end
