package day02;
import java.util.Scanner;
//사용자로부터
/* 학년 - 이름 - 국어점수 - 영어점수 - 수학점수 순으로 입력을 받고
 *  ##학년 ###
 *  "국어: ###점 영어: ###점 수학: ###점"
 *  "총점: ###점 평균: ##.###점"이 출력되는 프로그램을 작성하세요
 * 
 */
public class Ex05Grade {
	final static int SUBJECT_NUMBER = 3;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("몇 학년 입니까?: ");
		int grade = scanner.nextInt();
		
		scanner.nextLine();
		System.out.print("이름이 뭐에요?: ");
		String name = scanner.nextLine();
		
		System.out.print("국어점수?: ");
		int korean = scanner.nextInt();
		
		System.out.print("영어점수?: ");
		int english = scanner.nextInt();
		
		System.out.print("수학점수?: ");
		int math = scanner.nextInt();
		
		int total = korean + english + math;
		double average = total / SUBJECT_NUMBER;
		
		System.out.printf("%2d학년 %s\n", grade, name);
		System.out.printf("국어 %03d점 영어 %03d점 수학 %03d점 \n", korean, english, math );
		System.out.printf("총점 %03d점 평균%7.3f점\n", total, average);
			
		scanner.close();
		
		
	} //main end
	
	
}
