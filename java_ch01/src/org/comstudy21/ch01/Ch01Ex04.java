package org.comstudy21.ch01;

import java.io.IOException;

public class Ch01Ex04 {
	public static void main(String[] args) throws IOException {
		System.out.print("���� �Է� >>> ");
		int number = System.in.read(); 
		
//		System.out.println("�Է� �� => " + (char) number); // Ű����� �Է��ϸ� ascii ���� ���� ������ ���� �̻���
														// char�� casting�ϸ� ������ ������ �ƽ�Ű��....
		
//		System.out.println("�Է� �� => " + number - 0); // �׳� �̴�� �����ϸ� "�Է� �� =>" �̶�� ���ڿ��� number�� �������� �� ���ڿ��� ��. �翬�� ����
													 // ��ȣ�ļ� number�� 0�� �����־��

		if(number >= '0' && number <= '9') { // '' �־��ִ� �Ŷ� �� �ִ� �Ŷ� � �������� ����غ���!!!!!!!!!
			number = number -'0';
			System.out.println("�Է� ���� ���� * 100 => " + number * 100);
		} else {
			System.out.println("�Է� ���� ���� => " + (char) number);
		}
		
		
	} // main end

} //class end
