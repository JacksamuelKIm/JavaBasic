package org.comstudy21.ch03.array.homework;

import java.util.Scanner;
public class Ch03ArrEx00 {
static Scanner scanner = new Scanner (System.in);
	
	enum Week{��, ȭ, ��, ��, ��, ��, ��}
	public Ch03ArrEx00() {
	//		test01();
	//		test02();
	//		test03();
	//		test04();
		
		
	}
	
	private void test01() {
		// ���� 3-8
		// ��� 5���� �Է¹޾� �迭�� �����ϰ�, ���� ū ���� ����ϴ� ���α׷��� �ۼ��϶�
		
		int [] arr = new int [5];
		int max = 0;
		int size = arr.length;
		System.out.print("��� 5���� �Է��Ͻÿ�>>>");
		for (int i = 0; i<5; i++) {
			arr[i] = scanner.nextInt();
			if (arr[i]>max) {
				max = arr[i];
			}			
		}
		System.out.println("���� ū ��: " + max);
	}
	
	private void test02() {
		// ���� 3-8 
		// �迭�� length �ʵ带 �̿��Ͽ� �迭 ũ�⸸ŭ ������ �Է¹ް� ����� ���ϴ� ���α׷��� �ۼ��϶�!
		
		
		int[] intArray = new int[7];
		int sum = 0;
		int arrSize =  intArray.length;
				
		System.out.print("������ " + arrSize + "�� �Է��Ͻÿ�>> ");
		for (int i = 0; i<arrSize; i++) {
			intArray[i] = scanner.nextInt();
			sum = sum + intArray[i];
		}
		double average = (double) sum / arrSize;
		System.out.printf("����� %.2f�̴�", average);
		
	}

	private void test03() {
		// for each�� �̿��Ͽ�  sum ���ϱ�
		int[] n = {1,2,3,4,5};
		int sum = 0;
		for ( int k : n) {
			sum +=k;
		}
		System.out.println(sum);
		
		// ����  3-9 (for each�� ����)
		
	}
	
	private void test04() {
		// ���
		String[] names = { "���", "��", "�ٳ���", "ü��", "����", "����" };
		for (String s : names) {
			System.out.print(s + " ");
		}

	}
	
	


	public static void main(String[] args) {
		new Ch03ArrEx00();
		
		// enum �� for each�� Ȱ����
		for (Week day : Week.values()) {
			System.out.print(day + "����");
			System.out.println();
		}
		
		
		
		
		 
		
		

	}

}
