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
	
	
	private void way03() { // ������� ���
		
		System.out.print("Type in the damn letter!!>>>");
		
		char input = scan.next().charAt(0);		
		System.out.println(input);
		
		for(char ch = 'a'; ch<=input; ch++) {  //����ó���Ǵ°ǰ�? ����
			for(char j = 'a'; j<=input-(ch-'a'); j++) {
				System.out.print(j); // print �޼ҵ��� ���뿡 ���ؼ� strin���� ��ȯ�Ǿ�(?) ��µǴ°��� �� ������
			}
			System.out.println(); // print �޼ҵ�� �⺻������ ���ڿ����
		}
	}
	
	private void way02() throws IOException {
		System.out.print("Type in the damn letter!!>>>");
		int input = (int) System.in.read() - 97;
//		System.out.println(input);
		
		for(int i = 0; i<=input; i++) {
			for(int j = 97; j<=input -(i-97); j++) { //�̷��� f�����ۿ� �ȵ���
				System.out.print((char)j );
			}
			System.out.println();
		
		}
	}




	public static void way01() {
		//�̰Ŵ� �׳� ��¸� �ϴ°���....
		
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
