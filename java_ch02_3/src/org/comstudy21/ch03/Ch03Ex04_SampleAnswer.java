package org.comstudy21.ch03;

import java.util.Scanner;

public class Ch03Ex04_SampleAnswer {
	static Scanner scan = new Scanner (System.in); 
	public static void main(String[] args) {
		int startDan = 0;
		int endDan = 0;
		
		System.out.print("���� �� �Է�: ");
		startDan = scan.nextInt();
		while(startDan<2 || startDan>9) {
			System.out.println("�Է� ������ �ʰ��Ͽ����ϴ�.");
			System.out.print("���� �� �Է�: ");
			startDan = scan.nextInt();
			
		}
		
		System.out.print("���� �� �Է�: ");
		endDan = scan.nextInt();
		while(endDan < startDan  && (endDan< 2 || endDan>9)) {
			System.out.println("�Է� ������ �ʰ��Ͽ����ϴ�.");
			System.out.print("���� �� �Է�: ");
			endDan = scan.nextInt();
		}
		if (startDan >endDan) {
			int temp = startDan;
			startDan = endDan;
			endDan = temp;
		}
		
		
		for (int dan=startDan; dan<=endDan; dan++) {
			System.out.printf("***%d***\n", dan);
			for(int cnt = 1; cnt<=9; cnt++) {
				System.out.printf("%d*%d=%d\n", dan, cnt, dan*cnt);
			}
		} 
		
		
		
	} // end of main	
} // end of class
