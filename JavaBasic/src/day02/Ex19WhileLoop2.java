package day02;
/* 사용자로부터 점수를 입력 받아서
 * A, B, C, D, F를 출력하는 프로그램.
 * 단 사용자가 잘못된 점수(0보다 작거나 100보다 큰)를 입력하면
 * 올바른 점수를 입력할 때까지 계속 입력을 받는다
 */

import java.util.Scanner;
public class Ex19WhileLoop2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int score = scanner.nextInt();
		while (0 > score || score > 100 ) {
			System.out.println("잘못 입력하셨습니다.");
			System.out.print("점수를 입력하세요: ");
			score = scanner.nextInt();
		}
		System.out.print("입력된 점수: "+score);
		
		if(score >= 90 ) {
			System.out.println("A");
		}else if (score >= 80) {
			System.out.println("B");
		}else if (score >= 70) {
			System.out.println("C");
		}else if (score >= 60) {
			System.out.println("D");
		}else {
			System.out.print("F");
		}
		
		scanner.close();
	}

}
