// written on Aug 13 2020
package org.comstudy21.ch02_2;

import java.util.Scanner;

public class Ch02Ex07Answer {
	static Scanner scan = new Scanner(System.in);
	static String name = "";
	static char ch = 'y';
	
	public static void main(String[] args) {
	 
		// 재귀호출 대신 이거 쓴다던데 재귀호출이 뭐임???
	 while(ch == 'y') {
		System.out.print("성명 입력: ");
		name = scan.next();
		System.out.println(name + "님 반가워요!");
		System.out.print("계속 진행하겠습니까? (y 또는 n)>>>");
		ch = scan.nextLine().charAt(0); //굳이 charAT()쓸 필요 있을까?
		}
		while(!(ch=='y') || ch == 'n') {
			System.out.println("y 또는 n만 입력하세요.");
			System.out.print("계속 진행하겠습니까? (y 또는 n)>>>");
			ch = scan.nextLine().charAt(0);		}	
		System.out.println("수고하셨습니다.");
	}	
		
//		성명 입력 : 홍길동
//		==> 홍길동님 반가워요!
//		계속 진행하겠습니까? (y 또는 n) : t
//		y 또는 n만 입력하세요.
//		계속 진행하겠습니가? (y 또는 n) : n
//		수고하셨습니다.
		
		
		
		
		
		
	
	
	
	
	public static void test() {
		Scanner scan = new Scanner(System.in);
		String name = "";
		char ch = 'y';
		
		System.out.println("문자 입력 : ");
		ch = scan.next().charAt(0); // 딱 한 글자만 뽑아옴. 오.
		System.out.println("ch =>" + ch) ;
		
		

	}

}
