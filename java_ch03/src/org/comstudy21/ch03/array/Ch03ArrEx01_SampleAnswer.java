package org.comstudy21.ch03.array;

import java.util.Arrays;
import java.util.Scanner;

public class Ch03ArrEx01_SampleAnswer {
	static Scanner scan = new Scanner(System.in);
	
	static int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
	static int total = 0, rest = 0; //1�� 1�Ϻ��� ���� ��¥, ���� ��¥
	static int month, day, month2, day2, threeMonths;
	
	public Ch03ArrEx01_SampleAnswer() {
//		test02();
//		test05();
	}
	
	
	
	public static void main(String[] args) {
		new Ch03ArrEx01_SampleAnswer();
		//�� �ٸ� ���. ���ϱ�.
		
		System.out.print("�� �Է�:");
		month = scan.nextInt();
		System.out.print("�� �Է�:");
		day = scan.nextInt();
		
		int nextMonth = 0;
		int nextDay = 0;
		total = days[month-1] -day;
		int i = month% days.length;   // �̷��� ���ִ� ������ ������.... 12�Ѿ���� ����
		for(int cnt = 0; cnt<3 ; cnt++) {
			i %= days.length;   // �� ���� �߿�. �̰ź��� �ؾ� i�� 0�� �ȵ�
			total += days[i++];
			
		}		
		if(total>=100)  {
			nextMonth = i;
			nextDay = days[nextMonth-1] - (total -100);
			System.out.printf("100�� �� ��¥�� %d��%d�� �Դϴ�. \n", i+1, days[i] - (total-100));
		} else {
			nextMonth = i+1;
			nextMonth = nextMonth>12 ? 1: nextMonth;
			nextDay = 100-total;
			System.out.printf("100�� �� ��¥�� %d��%d�� �Դϴ�. \n", i-1<0?12:i, 31);
		}
		
		
		
	}
	
	
	
	
	
	
	public static void test05() {
		System.out.print("�� �Է�:");
		month = scan.nextInt();
		System.out.print("�� �Է�:");
		day = scan.nextInt();
				
		//�Է¹��� �� ���� 100�������� ���� ǥ�� // 12�� 31�� ǥ���ϸ� �� ������(�̰Ŵ� �Է� x)�� ���� ǥ��
		// �ϳ��� �� ������
		
		total = 100 - (days[month-1] -day);
		int i = month;
		i %= days.length; //OUT OF BOUND EXCEPTION ����/ 12���ʹ�  0���� ���ư�
		while(total > days[i]) {
			total -=days[i];
			i++;
			i%= days.length;			
		}
		
		System.out.printf("100�� �� ��¥�� %d��%d�� �Դϴ�. \n", i+1, total);
		
	
		
		
		
		
		
		
		
		
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
