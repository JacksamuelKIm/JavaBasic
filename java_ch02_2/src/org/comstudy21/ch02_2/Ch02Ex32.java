package org.comstudy21.ch02_2;
//written on Aug 13 2020
import java.util.Scanner;

public class Ch02Ex32 {
	static final int MIN=0, MAX=100; 
	
	public Ch02Ex32() {
		grade();
	}
	
	
	private void grade() {
		String grade = "F";
		Scanner scan = new Scanner(System.in);
		int score = 0;
		
		do {
			System.out.printf("점수를 입력하세요(%d~%d) : ", MIN, MAX);
			score = scan.nextInt();			
		} while (score<0 || score>100);
				
		System.out.print(score + "점은 "); //돌다리도 두들겨 보고 건너라 
		
		if(score>=90) grade = "A";
		else if (score>=80) grade = "B";
		else if (score>=70) grade = "C";
		else if (score>=60) grade = "D";
		
		if(score%10 > 7) grade += "+";
		else if(score%10 < 3) grade += "-";
		
		System.out.println(grade + "학점입니다.");
		scan.close();
	}


	public static void main(String[] args) {
		new Ch02Ex32();

	}

}
