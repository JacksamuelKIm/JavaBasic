package test;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ ���� �Է��ϼ��� >>>");
		int deci = scanner.nextInt();
		int biRest;
		int devider = 2;
		
		String biResult = "";
		String temp;
		
		while (true) {
			biRest = deci % devider;
			deci = deci / devider;
			
			System.out.print(biRest + " ");  // �̰� �� �ϴ���
			
			temp = Integer.toString(biRest);
			biResult = temp + biResult; 
						
			
			if(deci < 2) {
				
				temp = Integer.toString(deci);				
				biResult = temp + biResult;				
				System.out.println(temp);
				
				break;
			}
		}
		System.out.println("������: " + biResult);	
		
		

	}

}
