package org.comstud21.ch03.practices;

import java.util.Scanner;

public class Practice14_SampleAnswer {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String course[] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int score [] = {95, 88, 76, 62, 55};
		
		
		while (true) {
			System.out.print("���� �̸�>>");
			String name = scanner.next();
			if (name.equals("�׸�"))
				break;
			boolean flag = true; // boolean ���� ������  i�� �ۿ��� �������ְ� �ض�. �׷��� flag�� ��Ȯ!
			for (int i = 0; i < course.length; i++) {
				if (name.equals(course[i])) {
					flag = false;
					System.out.println(name + "�� " + score[i] + "���Դϴ�.");
				}
			}
			if (flag) {
				System.out.println("���� �����Դϴ�");
			}

		}
	}
}
