package test;

import java.util.Arrays;
import java.util.Scanner;

public class DecimalToBinary2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �� 32��Ʈ ������ �Է��غ���>>");
		int n  = scanner.nextInt();
		int [] b = new int [32]; // int ��¥�� 32��Ʈ �̴ϱ� �̰� �ִ�(??)
		
		int i = 0;
		while (n != 1) {  // ÷���� n <2��� �ϸ� ���� ��ü�� �� �Ǵ� ��찡 ��ټ�
			b[i] = n % 2; // �迭���ٰ� �������� 2���� �� �־��ֱ�
			n = n / 2; // �̾ ������ ��(share)����  ����ؼ� �����ֱ� ���ؼ�
			if(n<2) {
				b[i+1] = n; //���� ������ ���� 1�̴ϱ� �ű�� �־������
			}			
			i++; // ���⼭ i = i+1 �Ǵ� ���� no no
		}		
		
		//System.out.println(n); //���� ���ڸ�. ������ 1�� �Ǿ�� ���ٵ�.... => �� ���� ���� �ʿ� ����
//		System.out.println(Arrays.toString(b)); // �迭 �� ���� ���
		//���⿡�� String���� ���ؼ� ����� �ȵǳ�����
		// => �� �ƴϳ� =>????
		
		
		//System.out.println(b[i]).indexof(b); // Ȯ���� �ϰ� ������ �Լ��� ��;;;


		int j = 0;
		// ����. ��� ���� ����
//		System.out.println(b[i-j]);
		
		
		int[] b2;
		b2 = new int[j+1];
		for (j = 0; j < i + 1 ; j++) { //j�� �Ѱ� ������ ���� �̻��ؼ� �ȵƴ��� ��. for ���� �Ķ���� ���� �ʿ�
//			System.out.print(b[i-j]);
			b2 = new int[j+1];
			b2[j] = b[i-j];			
		}
		
		
		
		
		System.out.println(Arrays.toString(b2)); // for ������ b2�� �ȳ���;;;;
		// # ���� ¥���� 0�� ��� ��������?
		// # ��ü�� ����
//		int j = 0;
//		while (i != 0) {  // �� �� i�� 0�� ���� ����� �ȿ� �� �ִ°� ��Ÿ����
//			b[j] = b[i];
//			i--; j++;
//		}
////		b[j+1] = b[i=0]; // ������ �ϳ�
//		
//		System.out.println(Arrays.toString(b));
		
		
	}

}
