package org.comstudy21.ch01;

import java.io.IOException;

public class Ch01Ex05 {

	public static void main(String[] args) throws IOException {
		
		byte by[] = new byte [255];
		int number = 0;

		System.out.print("�Է�: ");
		System.in.read(by);
		
//		System.out.println(new String(by)); // �׳� toString()�� �ȵ�. ������ hashcode ����
//		System.out.println("���α׷� ����!"); // �迭�� ũ�Ⱑ 255�ε� 
		
		
		
//		�Է�: ȫ�浿
		//           // �� ������ �迭�� ũ�Ⱑ 255�ε� 'ȫ�浿' �� ����Ʈ �ȵǴ� �� �ۿ� �����Ƿ� �������� �� �� ĭ ó��
//		ȫ�浿
		
//		System.out.println(new String(by).trim()); // �� ���
//		System.out.println("���α׷� ����!"); //  
		
		number = Integer.parseInt(new String(by).trim());
		
		System.out.println("number = " + number*100); // �� ���
		System.out.println("���α׷� ����!"); //  
		
		
	}

}
