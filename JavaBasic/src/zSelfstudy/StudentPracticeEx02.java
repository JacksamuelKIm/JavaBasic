package zSelfstudy;

import java.util.Scanner;

public class StudentPracticeEx02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StudentPractice s = new StudentPractice();
		while(true) {
			System.out.println("비트 고등학교 성적관리 프로그램");
			System.out.println("1. 입력  2. 출력  3.  종료");
			System.out.print("> ");
			int choice = scanner.nextInt();
			if(choice == 1 ) {
				s.setAge(validateAge(scanner));
				
				scanner.nextLine();
				System.out.print("이름을 입력해 주세요");
				s.setName(scanner.nextLine());
				
				System.out.print("국어점수를 입력해주세요: ");
				s.setKorean(validateScore(scanner));
				
				System.out.print("영어점수를 입력해주세요: ");
				s.setEnglish(validateScore(scanner));
				
				System.out.print("수학점수를 입력해주세요: ");
				s.setMath(validateScore(scanner));
				
			} else if(choice == 2) {
				if(s.getKorean() == -1) {
					System.out.println("아직 입력된 정보가 없습니다.");
				}else {
					System.out.println(s);
					System.out.printf("총점: %03d점   평균: %.2f점\n", s.calculateSum(), s.calculateAverage());
				}
				
			} else if(choice == 3 ) {
				System.out.println("사용해 주셔서 감사합니다");
				break;
			}
			
		} //while end
		scanner.close();
	} // main end
	
	private static int validateAge(Scanner scanner) {
		System.out.print("나이를 입력하세요: ");
		int age = scanner.nextInt();
		if(age< 17 || age > 19) {
			System.out.println("잘못 입력하셨습니다.");
			System.out.print("나이를 입력하세요: ");
			age = scanner.nextInt();
		}
		return age;
	} //validateAge end
	
	private static int validateScore(Scanner sc) {
		int score = sc.nextInt();
		
		while(score < 0 || score > 100) {
			System.out.println("잘못 입력하셨습니다");
			System.out.println("다시 입력해주세요: ");
			score = sc.nextInt();
		}
		return score;
	} //validateScore end
	
}
