package org.comstudy21.ch03;

import java.util.Scanner;

public class Ch03Ex03 {

	public static void main(String[] args) {
		
//		 1~9���� ���
//		for (int cnt=1; cnt<=9; cnt++) {
//			System.out.println(cnt);			
//		}
		
//		//# 2��
//		int dan = 2;
//		for(int cnt=1; cnt<=9; cnt++) {
//			System.out.printf("%d*%d = %d\n", dan, cnt, dan*cnt);			
//		}	
		
		//1�ܺ��� 9���� . ��, cnt ����
		
//		for(int dan =1; dan<=9 ; dan++) {
//			System.out.println();
//			for(int cnt=1; cnt<=9; cnt++ ) {
//				System.out.printf("%d x %d = %d ||\t", dan, cnt, dan*cnt);				
//			}
//		} // dan for end
		
		//1�ܺ��� 9���� . �� ���� 
		
		for(int cnt=1; cnt<=9; cnt++ ) {
			System.out.println();
			for(int dan =1; dan<=9 ; dan++) {
				System.out.printf("%d x %d = %d ||\t", dan, cnt, dan*cnt);				
			}
		} // dan for end
		
		
		
		
	}
}
