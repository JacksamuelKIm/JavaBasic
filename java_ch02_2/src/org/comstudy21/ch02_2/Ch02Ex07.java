package org.comstudy21.ch02_2;
//written on Aug 13 2020
import java.util.Scanner;

public class Ch02Ex07 {
	static Scanner scan = new Scanner(System.in);
	static String name = "";
	static char ch = 'y';
	
	public static void main(String[] args) {
						
		System.out.print("���� �Է�: ");
		name = scan.nextLine();
		System.out.println(name + "�� �ݰ�����!");
		System.out.print("��� �����ϰڽ��ϱ�? (y �Ǵ� n)>>>");
		ch = scan.nextLine().charAt(0);
		
		while (ch != 'y' && ch != 'n') {
			System.out.print("y �Ǵ� n�� �Է��ϼ���. >>>");
			ch = scan.nextLine().charAt(0);
		}
		
		System.out.println("�����ϼ̽��ϴ�.");
		
		
//		���� �Է� : ȫ�浿
//		==> ȫ�浿�� �ݰ�����!
//		��� �����ϰڽ��ϱ�? (y �Ǵ� n) : t
//		y �Ǵ� n�� �Է��ϼ���.
//		��� �����ϰڽ��ϰ�? (y �Ǵ� n) : n
//		�����ϼ̽��ϴ�.
		
		
		
		
		
		
	
	}
	
	
	public static void test() {
		Scanner scan = new Scanner(System.in);
		String name = "";
		char ch = 'y';
		
		System.out.println("���� �Է� : ");
		ch = scan.next().charAt(0); // �� �� ���ڸ� �̾ƿ�. ��.
		System.out.println("ch =>" + ch) ;
		
		

	}

}
