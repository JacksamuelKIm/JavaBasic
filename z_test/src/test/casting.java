package test;

import static java.lang.System.out;
import static java.lang.System.in;


public class casting {

	public static void main(String[] args) {
			
		out.printf("���� %c�� ���� ���� %d�̴�. \n", 'C', (int)'C');
		
		char ch = 'C';
		
		out.printf("���� %c�� ���� ���� %d�̴�. \n", ch+5, (int)('C'+5));
		
		
		
		char[] chArr = { 'a', 'b', 'c', 'd', 'e'};
				
		for (int i = 0 ; i<chArr.length ;i++) {
			System.out.printf("���� %c�� ���� ���� %d�̴�. \n" ,chArr[i], (int)chArr[i]);
			System.out.printf("���� %c���� %c+5ĭ �� ���� ���� ���� %d�̴�. \n" ,chArr[i], chArr[i]+5, (int)(chArr[i]+5));
		}
		
		
		
		
		
		
		
		
		
	}
	
	
}
