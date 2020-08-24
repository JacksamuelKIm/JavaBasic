package org.comstudy21.ch03.except;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.err.println("���� 3���� �Է��ϼ���");
		int sum = 0, n = 0;
		
		for(int i = 0 ; i<3; i++) {
			
			try {
				n = scanner.nextInt();			
				
			} catch (InputMismatchException e) {
				System.out.print("������ �ƴմϴ�! �ٽ� �Է��Ͻʽÿ�!");
				scanner.next(); //�Է� ��Ʈ���� �ִ� ������ �ƴ� ��ū�� ������
				i--; //�� �̰� ������
				continue; //�� �̰� ������
			}
			sum += n;
		}
		System.out.println("���� " + sum);
		scanner.close();
	}

}
