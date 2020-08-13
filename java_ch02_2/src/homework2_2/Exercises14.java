// written on Aug 12 2020
package homework2_2;

import java.util.Scanner;

public class Exercises14 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);	
		System.out.print("가위바위보 중 하나를 입력하시오 >>>");
		String in = scanner.nextLine();
		
		final String SCISSORS = "가위";
		final String ROCK = "바위";
		final String PAPER = "보";
		
		
//		switch (in)	{
//		case SCISSORS : System.out.println(1); break;					
//		
//		case ROCK : System.out.println(2); break;
//			
//		case PAPER : System.out.println(3); break;
//			
//		default : System.out.println(0); break;
		
		
		//// 초기화 해주는 게 더 간단
		int result = 0;
		switch (in)	{
		case "가위" : result = 1; break;					
		
		case "바위" : result = 2; break;
			
		case "보" : result = 3; break;
			
		default : result = 0;  // 굳이 default 붙이겠다면 이렇게. 그러나 break 없어도 종료임. 초기값 있으므로
		}
		System.out.println(result);
//		default : System.out.println(0); break; 초기값을 미리 정해줘서 안해줘도 됨
		
		
		
		
			
		
		
		
		}//main end
}
