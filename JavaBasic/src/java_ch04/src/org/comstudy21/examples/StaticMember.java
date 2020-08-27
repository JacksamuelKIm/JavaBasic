package org.comstudy21.examples;

import java.util.Scanner;

class CurrencyConverter {
	private static double rate; //�ѱ� ��ȭ�� ���� ȯ��
	
	public static double toDollar(double won) {
		return won/rate; // �ѱ� ��ȭ�� �޷��� ��ȯ
	}
	
	public static double toKor(double dollar) {
		return dollar * rate; // �ѱ� ��ȭ�� �޷��� ��ȯ
	}
	
	public static void setRate(double r) {
		rate = r; // ȯ�� ����. KWR/$1
	}
	
}



public class StaticMember {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("ȯ��(1�޷�)>> ");
		double rate = scan.nextDouble();
		CurrencyConverter.setRate(rate); // �̱��޷� ȯ�� ����
		System.out.println("�鸸���� $" + CurrencyConverter.toDollar(10000000) + "�Դϴ�.");
		System.out.println("$100�� " + CurrencyConverter.toKor(100) + "���Դϴ�.");
		scan.close();

	}

}
