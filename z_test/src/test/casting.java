package test;

import static java.lang.System.out;
import static java.lang.System.in;


public class casting {

	public static void main(String[] args) {
			
		out.printf("문자 %c의 숫자 값은 %d이다. \n", 'C', (int)'C');
		
		char ch = 'C';
		
		out.printf("문자 %c의 숫자 값은 %d이다. \n", ch+5, (int)('C'+5));
		
		
		
		char[] chArr = { 'a', 'b', 'c', 'd', 'e'};
				
		for (int i = 0 ; i<chArr.length ;i++) {
			System.out.printf("문자 %c의 숫자 값은 %d이다. \n" ,chArr[i], (int)chArr[i]);
			System.out.printf("문자 %c에서 %c+5칸 씩 가면 숫자 값은 %d이다. \n" ,chArr[i], chArr[i]+5, (int)(chArr[i]+5));
		}
		
		
		
		
		
		
		
		
		
	}
	
	
}
