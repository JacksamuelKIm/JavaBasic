package org.comstudy21.ch02;
import java.util.Scanner;
import static java.lang.System.out;
public class Ch02Ex04 {

	Scanner scan = new Scanner(System.in);
		
	public Ch02Ex04() {
	
	
	// # switch문으로 돌릴 함수 선택하기	
		out.print("선택 : ");
		switch(scan.nextInt()) {
		case 1: run(); break;
		case 2: run2(); break;
		case 3: run3(); break;
		default: out.println("해당 사항 없다");		
		
		}
		
		
		
		
}
	
	
	
	
	
	private void run() {
		// TODO Auto-generated method stub
		
	}





	private void run2() {
		// TODO Auto-generated method stub
		
	}





	private void run3() {
		// TODO Auto-generated method stub
		
	}





	public static void main(String[] args) {
		new Ch02Ex04();

		
		
	}

}
