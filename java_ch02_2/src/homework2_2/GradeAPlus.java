// written on Aug 13 2020
package homework2_2;

import java.util.Scanner;

public class GradeAPlus {

Scanner scanner = new Scanner(System.in);
String grade;
int score;	
	

public GradeAPlus() {
		gradeCalculation();
} // constructor end
	
	private void gradeCalculation() {
		String grade;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 >> ");
		grade = "";
		int score = scanner.nextInt();
		
		if (score >= 90) {
			if (score>=97){
				grade = "A+";
			}else if(score<93){
				grade = "A-";				
			}else {
				grade = "A";
			}
		}
		if (score >= 80) {
			if (score>=87){
				grade = "B+";
			}else if(score<83){
				grade = "B-";				
			}else {
				grade = "B";
			}
		}	
		if (score >= 70) {
			if (score>=77){
				grade = "C+";
			}else if(score<73){
				grade = "C-";				
			}else {
				grade = "C";
			}
		}
		if (score >= 60) {
			if (score>=67){
				grade = "D+";
			}else if(score<63){
				grade = "D-";				
			}else {
				grade = "D";
			}
		}
		if (score < 60){
			grade = "F";
		}
		System.out.println("학점은 " + grade + "입니다.");
	}// method end

	



	
public static void main(String[] args) {
	new GradeAPlus();		
}
} // class end
	
		
		
		
		

	


