package org.comstudy.ch03;

import java.util.Scanner;

public class Ch03Ex02 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int cnt = 0;
		int total = 0;

		System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���");

		// # nextLine()�� �ϳ����� �д� �� Ȯ������ �׽�Ʈ
//		Scanner scan = new Scanner(System.in);
//		int s = scan.nextInt();
//		System.out.println(s);
		
		
		int num = scan.nextInt(); // 
		while (num != -1) {
			total += num;
			cnt++;
			num = scan.nextInt();
		} 
		if(cnt == 0) {
			System.out.println("�Էµ� ���� �����ϴ�.");
			return;			// �̰� ��Ȯ�� ���� �𸣰ڴ�
		}
		System.out.println("����" + cnt + "���̸�,");
		System.out.println("��� : " + (double)total/cnt + "�Դϴ�");
		scan.close();

	}
	
	
	
	public static void test01() {
		int cnt = 0;
		int total = 0;

		System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���");

		int num = 0;
		while ((num = scan.nextInt()) != -1) {
			total += num;
			cnt++;
					
		} // while end
		System.out.println("����" + "���� �Է¹޾ҽ��ϴ�.");
		System.out.println("total => " + total);
		System.out.println("��� : " + (double)total/cnt);
		
		
	} // main ed

} // CLASS END
