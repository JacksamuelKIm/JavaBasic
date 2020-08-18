package org.comstudy21.ch03.array.homework;

import java.util.Scanner;

public class Ch03Practices {
	static Scanner scanner = new Scanner(System.in);
	
	public Ch03Practices() {
		practice05();
	}
	
	
	private void practice05() {
		
		int[] num = new int[10];
		System.out.print("양의 정수 10개를 입력하시오 >>>");
		for(int i = 0; i<10; i++) {
			num[i] = scanner.nextInt();			
		}		
		
		for(int i = 0; i<10 ; i++) {
			if (num[i]%3 != 0) {
				continue;
			}
			System.out.print(num[i] + " ");
		}
		
	}


	public static void main(String[] args) {
		new Ch03Practices();

	}

}
