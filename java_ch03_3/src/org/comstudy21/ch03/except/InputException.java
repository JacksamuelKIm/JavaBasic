package org.comstudy21.ch03.except;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.err.println("정수 3개를 입력하세요");
		int sum = 0, n = 0;
		
		for(int i = 0 ; i<3; i++) {
			
			try {
				n = scanner.nextInt();			
				
			} catch (InputMismatchException e) {
				System.out.print("정수가 아닙니다! 다시 입력하십시오!");
				scanner.next(); //입력 스트림에 있는 정수가 아닌 토큰을 버린다
				i--; //오 이거 괜찮다
				continue; //오 이거 괜찮다
			}
			sum += n;
		}
		System.out.println("합은 " + sum);
		scanner.close();
	}

}
