package org.comstudy21.ch02_2;
//written on Aug 12 2020
public class Ch02Ex06 {
	// (클래스의) 멤버 필드(전역 변수)
	int a = 3;
	int b = 5;
	int a2, b2;
	
	public Ch02Ex06() {
		start();
	}

	public void start() {
		System.out.println("증감 연산자 연습");
		// 로컬 변수는 (그 함수 밖의) 다른 멤버들에서는 접근할 수 없다.
		a2 = a++;	// a2 == 3. a == 4 
		a2 = ++a;	// a == 5,  a2 == 5  
		a2 = a++;	// a2 ==5, a == 6
		a2 += 7;	// a2 == 12
		a2 %= 5;	// a2 == 2
		System.out.println("최종 a2의 값: " + a2);
		a2 = --b;	// b == 4 , a2 ==4 
		a2 = b++;   // a2 == 4, b ==5
		
		
		System.out.println("최종 a2의 값: " + a2);
		

	}

	public static void main(String[] args) {
		new Ch02Ex06();

	}

}
