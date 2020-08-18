package org.comstudy21.ch03.array.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Ch03ArrEx01 {
	static Scanner scan = new Scanner(System.in);
	
	static int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
	static int total = 0, rest = 0; //1�� 1�Ϻ��� ���� ��¥, ���� ��¥
	static int month, day, month2, day2, threeMonths;
	
	public Ch03ArrEx01() {
//		test02();
	}
	
	
	public static void main(String[] args) {
		System.out.print("�� �Է�:");
		month = scan.nextInt();
		System.out.print("�� �Է�:");
		day = scan.nextInt();
		
		//�Է¹��� ���ϱ����� ��¥�� total�� �����Ѵ�.
		//1�� 1�Ϻ��� 0��0�ϱ����� 00���� �������ϴ�.
		total = 0; //�̹��޺��� �Է¹��� �� ����������		
		for(int i =0; i<month-1; i++) {
			total = total + days[i];			
		}
		System.out.println("1�� 1�Ϻ��� "+month+"��"+day+"�� ������ " + total + "���� �������ϴ�.");
		
		//�Է¹��� ��¥�κ��� ���������� ��¥			
		int size = days.length;
		rest = days[month-1]-day;
		for(int i = month; i<size ;i++) {
			rest = rest + days[i];
		}
		System.out.println(month+"�� "+day+"�Ϻ��� ���������� " + rest+"�� ���ҽ��ϴ�");
		
				
		//�Է¹��� �� ���� 100�������� ���� ǥ�� // 12�� 31�� ǥ���ϸ� �� ������(�̰Ŵ� �Է� x)�� ���� ǥ��
		 
		 
		int left = days[month-1] - day; // �Էµ� ���� ���� ���� �ϼ� (����� �ϼ� - ���� ����)
		int x = 100 - left ; // 100�Ͽ��� �Էµ� ���� ���� ���� �ϼ��� �� ��
		int next1 = 0, next2=0, next3=0, next4=0;
		
		if (month == 9) {
			next1 = month +1;
			next2 = next1 +1;
			next3 = next2 +1;
			next4 = 12 - next3 + 1;		
		}else if (month==10) {
			next1 = month+1;
			next2 = next1+1;
			next3 = 12 - next2 + 1;
			next4 = next3 + 1;
		}else if (month==11) {
			next1 = month+1;
			next2 = 12 - next1 + 1;
			next3 = next2 + 1;
			next4 = next3 + 1;
		}else if (month==12) {
			next1 = 12 - month + 1;
			next2 = next1 + 1;
			next3 = next2 + 1;
			next4 = next3 + 1;
		}else {
			next1 = month + 1;
			next2 = next1 + 1;
			next3 = next2 + 1;
			next4 = next3 + 1;
		}		
		threeMonths = days[next1-1] + days[next2-1] + days[next3-1];		
		
			if (100-left < threeMonths) {
				month2 = next3;
				day2 =  100 - (left + days[next1-1] + days[next2-1]);			
			}	
			if (100-left > threeMonths) {			
				month2 = next4;
				day2 = 100 - (threeMonths+left);										
			}			
			System.out.println(month+"�� "+day+"�Ϻ��� 100�� �Ĵ� "+month2+"�� "+day2+"�� �Դϴ�");	
	} // method end
	
	
	
	
	
	
	
	public static void test03() {
//		new Ch03ArrEx01();
		
		System.out.print("�� �Է�:");
		month = scan.nextInt();
		day = days[month-1];
		
		System.out.printf("%d���� %d�ϱ��� �ִ�.", month, day);
		
		
	}
	
	
	
	
	public static void test02() {
		//        ��     1   2  3  4  5  6  7  8  9 10 11  12
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		//     index  0   1  2  3  4  5  6  7  8  9 10 11
		
		
		int size = days.length;
		int total = 0;
		System.out.println(Arrays.toString(days));
		for(int i =0; i<12 ; i++) {
			System.out.println(i+1 + "���� " + days[i] + "�ϱ��� �ִ�." );
			total = total + days[i];
		}
		System.out.println("1���� " + total + "�Դϴ�");
		System.out.println("������ ���� �ϼ��� " + days[size-1] + "�Դϴ�");
				
	}
	
	public void test01() {
		
		// �迭 ����� ���ÿ� ���ͷ��� �ʱ�ȭ�Ѵ�.
		int[] arr = {10, 13, 19, 21, 35, 90, 45};
		
		// �迭�� �ּҰ� ���� �� ��� ����Ҷ��� String���� �ٲ㼭
		System.out.println(Arrays.toString(arr));
				
		// �迭�� ũ�⸦ Ȯ���Ѵ�.
		int size= arr.length;
		System.out.println("�迭�� ũ��: " + size);
		System.out.println("ù��° ��� �� " + arr[0]);
		System.out.println("ù��° ��� �� " + arr[size-1]);
		
		
	}

}
