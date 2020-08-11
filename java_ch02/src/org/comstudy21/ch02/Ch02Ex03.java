package org.comstudy21.ch02;

import static java.lang.System.out;

public class Ch02Ex03 {

	
	public Ch02Ex03() {
	out.println("생성자 함수 호출");		
	
	final double PI = 3.141592;
	String s;
	int i;
	
//	s = "속이 더부룩하다";
//	i = 20;
//	
//	test01(s);
//	test02(i);
	
	}
	
	

	private void test01 (String s) {
		out.println("test01 함수 생성");
		out.println(s);	
		
	}
	
	private void test02(int i) {
		out.println("test02 함수 생성");
		i = i * i ;
		out.println(i);
	}
	
	public void circleArea(double r) {
		double area = r * r; 
		out.println(area);
	}
	
	public void test03 () {
		out.printf(" 문자 %c의 유니코드는 %d \n", 'A', (int) 'A');
		out.printf(" 문자 %c의 유니코드는 %d \n", 'a', (int) 'a');
		out.printf(" 문자 %c의 유니코드는 %d \n", '0', (int) '0');
		out.printf("---------------------------------- \n");
		out.printf("문자 %c의 유니코드는 %d \n", 'A'+1, (int)('A'+1));
				
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		Ch02Ex03 ex03 = new Ch02Ex03();
		
		String s2 = "이제 쉬는 시간이네";
		int j = 50;
		
		ex03.test01(s2);
		ex03.test02(j);
		ex03.circleArea(25.7);
		ex03.test03();

	}

}
