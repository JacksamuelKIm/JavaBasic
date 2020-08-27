package org.comstud21.ch03.practices;

public class Practice13_SampleAnswer {

	public static void main(String[] args) {
		
		for(int i = 1; i<100; i++) {
			int a = -1, b= -1; //10의 자리 1의자리를 이렇게 기똥차게 분리했구나!! -1도 괜찮구
			
			if(i<10) { // 일단 일의 자리 십의 자리에 올 애들 만들어주고
				b = i;
			} else {
				a = i/10;
				b = i%10;
			}
			
			//여기서부터 분류 시작
			boolean bool1 = a!=0&&a%3==0;
			boolean bool2 = b!=0&&b%3==0;
			
			
			if(bool1 || bool2) {
				System.out.print(i + " 박수 ");
				if(bool1) System.out.print("짝");
				if(bool2) System.out.print("짝");
				System.out.println();
				
			}
			
			
		}

	}

}
