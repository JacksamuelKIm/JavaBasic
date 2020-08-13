package org.comstudy21.homework;
//written on Aug 13 2020
import java.util.Scanner;
import static java.lang.System.out;

import java.io.IOException;

public class Ch02Homework {
	private  Scanner scan = new Scanner(System.in);
	// �� �Լ� �ȿ��� next()�� nextLine()�� ���� �� ���� �浹 �Ͼ��
	//Scanner ��ü�� ���� ����� �ֶ�� ���� �� ��� �̿ܿ��� �ϳ��� ����� ���� �ȴ�. 
	// ������ �� �޼ҵ� �ȿ� scanner �ҷ��ְ� scanner.close()�� �ݾ���� ��
	public Ch02Homework() {
//		ex01();
//		ex02();
//		ex03();
//		ex04();
//		ex04_2();
//		ex05();
//		ex06();
//		ex06_2();
//		ex06_selfReCoding(); // �ٸ� ������� �ڵ��غ���
		ex07();
		
	}
	
	int getNum() {
		int num = 0;
		
		try {
			int ch=0;
			while((ch=System.in.read())!='\n') { //���Ͱ� ���� ������ ��� ���ư����� ���� ����
				 System.out.print(ch);
			    if('0'<=ch && ch<='9') { // ������ ��쿡��
			    	num = num*10 + ch-'0';   // \n => LF => ascii���� 10�� // enter(Carriage Return) = >13 
			    	//             ch(�ǵ��� �� + 48 / System.in.read()�� ���� int�� ���ƿ�)-48
			    } // System.in���� ������ int���� ���� �� �־� ���� �ȳ���
				
			}
		} catch (IOException e) {} // �ٸ� �̻��� �ֵ� �Է¹��� �� �����ϱ�?
		
		return num;
	}
	
	private void ex07() {
		int x1=100, y1=100, x2=200, y2=200 ;
		out.print("�� (x,y)�� x ��ǥ�� �Է��Ͻÿ� >> ");
		int x = getNum();
		out.print("�� (x,y)�� y ��ǥ�� �Է��Ͻÿ� >> ");
		int y = getNum();
		
		out.print("(" + x +", " + y +")");
		if((x1<=x&&x<=x2) && (y1<=y&&y<=y2)) {
			out.println("�� �簢�� �ȿ� �ֽ��ϴ�.");
		}else 
			out.println("�� �簢�� �ȿ� �����ϴ�.");
	}



	private void ex06_2() {
		out.print("2�ڸ��� ���� �Է� (10~99) >>> "); // �̷��� ������ ����� ���!!
		int num = scan.nextInt();
		while(num<1 || num > 99) {
			out.println("2�ڸ� ������ �Է��ϼ���");
			out.print("2�ڸ��� ���� �Է� (10~99) >>> ");
			num = scan.nextInt();
		}
		int n1 = num/10; // 10�� �ڸ�
		int n2 = num%10; // 1�� �ڸ�
		int cnt = 0; // count �ڼ� Ƚ��
		
		if(n2!=0 && n2%3==0) {
			cnt++;
		}
		if(n1!=0 && n1%3 == 0) {
			cnt++;
		}		
		if(cnt>0) {
			out.println("�ڼ�");
			for(int i=0; i<cnt; i++) { // �� �̰� ���� ���ߴ�
				out.print("¦");
			}
		}
		
	}



	private void ex06() {
		scan = new Scanner(System.in);
		
		out.print("2�ڸ��� ���� �Է� (10~99) >>> "); // �̷��� ������ ����� ���!!
		int num = scan.nextInt();
		while(num<1 || num > 99) {
			out.println("2�ڸ� ������ �Է��ϼ���");
			out.print("2�ڸ��� ���� �Է� (10~99) >>> ");
			num = scan.nextInt();
		}
		int n1 = num/10; // 10�� �ڸ�
		int n2 = num%10; // 1�� �ڸ�
		// 3�� ����� ã�´�.
		if((n1!=0 && n1%3==0) || (n2!=0 && n2%3 ==0)) { 
			out.print("�ڼ�"); // ù��° if�� ����ϸ鼭 10�� �ڸ��� 1�� �ڸ��� 3�� ��� �ִ� �ֵ��� ���
			  				  // 1�� �ڸ��̵� 10�� �ڸ��̵� 3�� �����  �ִٴ� �Ҹ��ϱ�
		}		
		if(n2!=0 && n2%3==0) { // �� ����� �ֵ���  1�� �ڸ��� 3�� ����� ������ ¦�� �ٿ��� 
			out.print("¦");   // 10�� �ڸ����� 3�� ����� �ִ� �ֵ��� �׳� ������
		}
		if(n1!=0 && n1%3 == 0) { // �̹� 1�� �ڸ��� ¦�� �ִ� �ֵ� ��
			out.print("¦"); // 10�� �ڸ����� ������ ¦�� �ϳ� �� �ٿ��༭ �ڼ�¦¦ ��
		}
	}



	private void ex06_selfReCoding() {
		scan = new Scanner(System.in);
		int input = scan.nextInt();
		int x = input / 10; // ���� �ڸ� �� ���ϱ� 
		int y = input % 10;// ���� �ڸ� �� ���ϱ�
		
		// 3�� ����� ����ϰ� �����ϱⰡ �Ƹ��ٿ� �ڵ��� �ٽ��� ��!
		// 0�� �ƴϸ鼭 3���� ������ �������� ����. x!=0, x % 3 == 0;
		// 0�� �ƴϸ鼭 3���� ������ �������� ����. y!=0, y % 3 == 0;
		
		// 0 �� �ֵ��� ��� �Ҳ���? else�� ��������
		// ������ 00 �̰��� �ƿ� ���������� ����. �Է��� 1~99 ���̿� ������ �ؾ�
		// y != 0, 0y �� �ֵ��� �ܼ��ϰ� y%3==0�� ����
		// 
		
		
		scan.close();
		
	}



	private void ex05() {
		scan = new Scanner(System.in);
		
		out.print("���� 3���� �Է� >>> ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if(a+b>c && a+c>b && b+c>a) {
			out.println("�ﰢ���� �˴ϴ�");
		} else {
			out.println("�ﰢ���� ���� �� �����ϴ�");
		}
		
		scan.close();
		
	}



	private void ex04_2() {
		scan = new Scanner(System.in);
		
		out.print("���� 3�� �Է� >>> ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int max=0, mid=0, min=0;
		
		if(a>b) {
			max = a;
			min = b;
		}else {
			max = b;
			min = a;
		}
		out.println("ū ���� " + max);
//		out.println("�߰� ���� " + mid);
		out.println("���� ���� " + min);
		
		if(c>max){
			mid = max;
			max = c;
		} else {
			if(c<min) {
				mid = min;
				min = c;
			} else {
				mid = c;
			}
		}
		out.println("ū ���� " + max);
		out.println("�߰� ���� " + mid);
		out.println("���� ���� " + min);
		
	}



	private void ex04() {
		scan = new Scanner(System.in);
		
		out.print("���� 3�� �Է� >>> ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int max, min;
		max = (a>b) ? a : b;
		max = (c>max) ? c : max ;
		min = a<b ? a : b;
		min = c<min ? c: min;
		
		int mid = 0;
		if(a<max && a>min) mid = a;
		if(b<max && b>min) mid = b;
		if(c<max && c>min) mid = c;
		out.println("�߰� ���� " + mid);
	}



	private void ex03() { //�̰� �ݺ������ε� �� �� �ֵ�!!!
		scan = new Scanner(System.in);
		
		out.print("�ݾ��� �Է��Ͻÿ� >>> ");
		int money = scan.nextInt();
		out.printf("�������� %d��\n", money/50000);
		money = money % 50000;
		out.printf("������ %d��\n", money/10000);
		money = money % 10000;
		out.printf("õ���� %d��\n", money/1000);
		money = money % 10000;
		out.printf("��� %��\n", money/100);
		money = money % 100;
		out.printf("���ʿ� %d��\n", money/50);
		money = money % 50;
		out.printf("�ʿ� %d��\n", money/10);
		money = money % 10;
		out.printf("�Ͽ� %d��\n", money);
		
		scan.close();
	}



	private void ex02() {
		scan = new Scanner(System.in);
		
		out.print("2�ڸ��� ���� �Է� (10~99) >>> ");
		int num = scan.nextInt();
		while(num<10 || num>99) {
			out.println("2�ڸ� ������ �Է��ϼ���");
			out.print("2�ڸ��� ���� �Է� (10~99) >>> ");
			num = scan.nextInt();
		}
		int n1 = num/10;
		int n2 = num%10;
		if(n1==n2) {
			out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�");
		} else {
			out.println("No! 10�� �ڸ��� 1�� �ڸ��� ���� �ʽ��ϴ�");
		}
		
		scan.close();
	}



	private void ex01() {
		scan = new Scanner(System.in);
		
		System.out.print("��ȭ�� �Է��ϼ���(���� ��)>>");
		int won = scan.nextInt();
		double $ = (won / 1100);
		System.out.printf("%d���� $%.1f�Դϴ�", won, $);
		
		scan.close(); // �̰� ��Ģ
		
	}



	public static void main(String[] args) {
		new Ch02Homework();

	}

}
