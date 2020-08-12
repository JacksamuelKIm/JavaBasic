package test;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("십진법 수를 입력하세요 >>>");
		int deci = scanner.nextInt();
		int biRest;
		int devider = 2;
		
		String biResult = "";
		String temp;
		
		while (true) {
			biRest = deci % devider;
			deci = deci / devider;
			
			System.out.print(biRest + " ");  // 이거 왜 하더라
			
			temp = Integer.toString(biRest);
			biResult = temp + biResult; 
						
			
			if(deci < 2) {
				
				temp = Integer.toString(deci);				
				biResult = temp + biResult;				
				System.out.println(temp);
				
				break;
			}
		}
		System.out.println("이진법: " + biResult);	
		
		

	}

}
