package org.comstud21.ch03.practices;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력해!>>");
		int input = scan.nextInt();
		
		for (int i = 0; i<input; i++) {
			for (int j = i; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
}
