package org.comstud21.ch03.practices;

import java.io.IOException;
import java.util.Scanner;

public class Practice4_Self {
	Scanner scan = new Scanner(System.in);
	
	public Practice4_Self() throws IOException {
//		way01();
//		way02();
		way03();
		way04();
		way05();
		
		
}

	private void way05() {
		String [] alpha = {"a","b","c","d","e"};

	}
	
	private void way04() {
		

	}
	
	
	private void way03() { // 강사님의 방법
		
		System.out.print("Type in the damn letter!!>>>");
		
		char input = scan.next().charAt(0);		
		System.out.println(input);
		
		for(char ch = 'a'; ch<=input; ch++) {  //숫자처리되는건가? ㅇㅇ
			for(char j = 'a'; j<=input-(ch-'a'); j++) {
				System.out.print(j); // print 메소드의 내용에 의해서 strin으로 변환되어(?) 출력되는것일 뿐 숫자임
			}
			System.out.println(); // print 메소드는 기본적으로 문자열출력
		}
	}
	
	private void way02() throws IOException {
		System.out.print("Type in the damn letter!!>>>");
		int input = (int) System.in.read() - 97;
//		System.out.println(input);
		
		for(int i = 0; i<=input; i++) {
			for(int j = 97; j<=input -(i-97); j++) { //이러면 f까지밖에 안되지
				System.out.print((char)j );
			}
			System.out.println();
		
		}
	}




	public static void way01() {
		//이거는 그냥 출력만 하는거지....
		
		for (int i = 0; i<5; i++) {
			for (int j = 0; j<5-i; j++) {
				System.out.print((char)(97+j));
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		new Practice4_Self();
	}
	
	
}
