package org.comstudy21.ch03.except;

import java.util.Scanner;
public class DevideByZeroHandling {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("�������� �Է��Ͻʽÿ�: ");
			int dividend = scan.nextInt();
			System.out.println("�������� �Է��Ͻÿ�: ");
			int divider = scan.nextInt();
			
			try {
				System.out.println("������" + dividend +"�� ������" + divider + "�� ������ ���� " + dividend / divider + "�Դϴ�" );
			} catch (ArithmeticException e) {
				System.err.println("0���� ���� �� �����ϴ�. �ٽ� �Է��ϼ���!");
			}			
			
		}		
		
		
	} //main end

} // class end
