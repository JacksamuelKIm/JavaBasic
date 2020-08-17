package org.comstudy.ch03;

import java.util.Scanner;

public class Ch03Ex04_SampleAnswer2 {
	Scanner scanner = new Scanner(System.in);
		
	public Ch03Ex04_SampleAnswer2() {
		answer1();
	}
	
	
	public void answer1() {
				
		System.out.print("시작단을 입력하세요: ");
		int startDan = scanner.nextInt();		
		while (startDan <2 || startDan >9) {
			System.out.println("범위 이외의 숫자입니다. 다시 입력해 주십시오");
			System.out.print("시작 단을 입력해 주세요: ");
			startDan = scanner.nextInt();
		}		
		
		System.out.print("종료 단을 입력해 주세요: ");
		int endDan = scanner.nextInt();		
		while(endDan <2 || endDan >9) {
			System.out.println("범위 이외의 숫자입니다. 다시 입력해 주십시오");
			System.out.print("종료 단을 입력해 주세요: ");
			endDan = scanner.nextInt();
		}
		
		if(startDan > endDan) {
			int temp = endDan;
			endDan = startDan;
			startDan=endDan;			
		}
		
		
		for(int dan = startDan; dan<=endDan ; dan+=3) {
			for(int i =0; i<3; i++) {
				if(dan+i<=endDan){
					System.out.print(dan+i + "단\t");
				}
			}
			System.out.println();
			for(int cnt = 1; cnt<=9 ; cnt++) {
				for(int i = 0; i<3 ; i++) {
					if (dan+i<=endDan) {
						System.out.printf("%d*%d=%d\t", dan+i, cnt, (dan+i)*cnt);
					}				
				}
				System.out.println();
			}
		}	
	}
		
		
		
		
	public static void main(String[] args) {
		new Ch03Ex04_SampleAnswer2();
	} // end of main
	
}// end of class

