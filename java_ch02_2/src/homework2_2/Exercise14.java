package homework2_2;

import java.util.Scanner;

public class Exercise14 {

	
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);	
	System.out.print("가위바위보 중 하나를 입력하시오 >>>");
	String in = scanner.nextLine();
	
	final String SCISSORS = "가위";
	final String ROCK = "바위";
	final String PAPER = "보";
	
	
	switch (in)	{
	case SCISSORS : System.out.println(1); break;					
	
	case ROCK : System.out.println(2); break;
		
	case PAPER : System.out.println(3); break;
		
	default : System.out.println(0); break;
	}	
	
	
	
	}//main end
	
}// class end
