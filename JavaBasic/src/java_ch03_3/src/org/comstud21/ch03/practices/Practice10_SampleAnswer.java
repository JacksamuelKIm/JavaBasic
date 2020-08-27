package org.comstud21.ch03.practices;

import java.util.Random;

public class Practice10_SampleAnswer {
	
	public static void main(String[] args) {
		//4x4 2차원 배열 생성
		int [][] arr = new int [4][4];
		
		
		for(int cnt=0; cnt<10; ) {
			int i = (int)(Math.random()*4);
			int j = (int)(Math.random()*4);
			if(arr[i][j] == 0 ) {
				arr[i][j] = 1 + (int)(Math.random()*10);
				cnt++; //우왕 이거 좋다!
			}
		}
		
				
		
		
		
		//출력용
		for (int i = 0; i<arr.length; i++) {
			for (int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + ((j%4==3) ? "\n":"\t"));
			}
		}
		
		
	}
}
