package day03;
//사용자로부터
//나이 이름 국어 영어 수학 점수를 입력받아서 
//출력하는 프로그램
//단 사용자가 종료를 누르기 전까지 무한히 돌아간다
//입력을 선택하면 해당 정보들을 입력만 받는다
//출력을 선택하면 해당 정보들을 출력만 한다

//고려해 볼 점: 변수는 어디에 선언해야 할까
import java.util.Scanner;

public class Ex02GradeBook2Answer {
	final static int SUBJECT_NUMBERS = 3;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = new String(); // while 바깥해서 해줘야
		int age = 0;  // while 바깥해서 해줘야 \일단 0으로 해놔야
		int kor = 0;  // while 바깥해서 해줘야 \입력 안됐으면 0처리
		int eng = 0;  // while 바깥해서 해줘야 \되지 않ㄱㅆ나
		int math = 0; // while 바깥해서 해줘야 \		
		
		while (true) {
			System.out.println(" 1. 입력  2. 출력  3. 종료");
			System.out.print("> ");
			int choice = scanner.nextInt();
						
			if (choice == 1 ) {
				System.out.print("이름: ");
				name = scanner.nextLine();
				scanner.nextLine();
				System.out.print("나이: ");
				age = scanner.nextInt();
				System.out.print("국어점수: ");
				kor = scanner.nextInt();
				System.out.print("영어점수: ");
				eng = scanner.nextInt();
				System.out.print("수학점수: ");
				math = scanner.nextInt();
				
				
			} else if (choice == 2) {
				if(age == 0) {
					//아직 아무런 입력도 되지 않았으므로 경고 메세지만 출력
					System.out.println("아직 입력된 값이 없습니다");
				}else {
					System.out.printf("이름: %s, 나이: %03d세\n", name, age );
					System.out.printf("국어: %03d점, 영어: %03d점, 수학: %03d점\n", kor, eng, math);
					int sum = kor + eng + math;
					double average = sum / (double) SUBJECT_NUMBERS; //3.0은 매직넘버
					System.out.printf("총점: %03d점, 평균: %.2f\n", sum, average);
				}
				
			} else if (choice == 3) {
				System.out.println("사용해 주셔서 감사합니다");
				break;
			} 			
			
		} //while end
		
		scanner.close();
	} // main end

} // class end
