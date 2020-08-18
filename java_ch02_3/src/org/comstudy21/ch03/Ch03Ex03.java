package org.comstudy21.ch03;

import java.util.Scanner;

public class Ch03Ex03 {

	public static void main(String[] args) {
		
//		 1~9까지 출력
//		for (int cnt=1; cnt<=9; cnt++) {
//			System.out.println(cnt);			
//		}
		
//		//# 2단
//		int dan = 2;
//		for(int cnt=1; cnt<=9; cnt++) {
//			System.out.printf("%d*%d = %d\n", dan, cnt, dan*cnt);			
//		}	
		
		//1단부터 9까지 . 단, cnt 순으
		
//		for(int dan =1; dan<=9 ; dan++) {
//			System.out.println();
//			for(int cnt=1; cnt<=9; cnt++ ) {
//				System.out.printf("%d x %d = %d ||\t", dan, cnt, dan*cnt);				
//			}
//		} // dan for end
		
		//1단부터 9까지 . 단 순으 
		
		for(int cnt=1; cnt<=9; cnt++ ) {
			System.out.println();
			for(int dan =1; dan<=9 ; dan++) {
				System.out.printf("%d x %d = %d ||\t", dan, cnt, dan*cnt);				
			}
		} // dan for end
		
		
		
		
	}
}
