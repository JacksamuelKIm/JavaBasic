package org.comstudy21.ch03.array.homework;

import java.util.Random;
import java.util.Scanner;
public class Practices_Ch3 {
	
	public Practices_Ch3() {
//		��������1();
//		��������2();
//		��������3();
//		��������4();
//		��������5();
//		��������6();
//		��������7();
//		��������8();
//		��������9();
//		��������10();
//		��������11();
//		��������12();
//		��������13();
		��������14();
//		��������15();
//		��������16();
		
	}
	
	
	
	private void ��������1() {
//		(1) 2���� 98������ 2�� ����� ���� ���Ͽ� �� ���� ����ϴ� �ڵ��̸� ���� 2450 �̴�
		int sum =0, i=0;
		while (i<100) {
			sum = sum + i;
			i+=2;			
		}
		System.out.println(sum);
		
//		(2) WhileTest.class ����
//		(3) ForTest.class ����
//		(4) DoWhile.class ����			
	}

	
	
	private void ��������2() {
		int n [][] = {{1}, {1,2,3}, {1}, {1, 2, 3, 4}, {1, 2}};
//		int j = 0;
		for(int i=0; i<=4 ; i++) {			
			
			for(int j = 0; j<n[i].length;j++ ) {
//				j = n[i].length - 1;
				System.out.print(n[i][j] + " ");
			}
			System.out.println();
		}			
	}

	
	
	private void ��������3() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�>>");
		int input = scanner.nextInt();
					
		for(int i = input; i>0 ; i--) {	
			for(int j = i; j>0; j--) {
				System.out.print("*");
			}			
			System.out.println();
		}		
		scanner.close();
	}

	
	
	private void ��������4() {
		Scanner scanner = new Scanner(System.in);
		
		//���ĺ����� �̷���� ���ڿ� alpha 
		String [] alpha = {"a","b","c","d","e"};
		
		//�ܼ�â���κ��� ���ĺ� �Է¹ޱ�
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");	
		String input = scanner.next();
		
		//�Է¹��� �ҹ��� ���ĺ��� �ε��� ��ȣ ã��		
		int index = -1;
		for (int i = 0; i<alpha.length ; i++) {
			if(alpha[i].equals(input)) {
				 index = i;
			 }
		 }
//		System.out.println("�Է¹��� �ҹ����� index: " + index); // �� �ǳ� Ȯ����
		
		//���ĺ� ��� �ڵ�
		for(int i = index; i>=0 ; i--) {
			for(int j = 0; j<= i; j++) {
				System.out.print(alpha[j]);
			}
			System.out.println();
		}						
		scanner.close();
	}

	
	
	private void ��������5() {
		Scanner scanner = new Scanner(System.in);
		
		//���� ���� 10�� ��� �迭������ ���� Ÿ���� �迭 ���۷��� num �Ҵ�
		int[] num  = new int[10];
		
		System.out.print("���� ���� 10���� �Է��Ͻÿ�>>");
		for (int i = 0; i< 10; i++) {
			num[i] = scanner.nextInt();  //���⼭ �迭�� ũ�⸦ �Ѿ�� ���������� �Էµ� ���� ����� exception ������� ���� ������?	
		}
//		System.out.println(num[6]); // �� �ǳ� Ȯ����
		
		
		//3�� ��� ����ϱ�
		System.out.print("3�� ����� ");
		for (int j = 0; j<num.length; j++) {
			if(num[j]%3!=0) {
				continue; //3�� ��� �ƴ� �ֵ��� ���� ��쿡�� �׳� ���� ���� j�� �ѱ��
			}else {
				System.out.print(num[j] + " ");
			}				
		}		
		scanner.close();		
	}
	
	
	
	private void ��������6() {
		Scanner scanner = new Scanner(System.in);
		
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};		
		int count = 0; // ����
		int rest = 0; // �� ���� �� ������
		
		System.out.print("�ݾ��� �Է��Ͻÿ�>> ");
		int input = scanner.nextInt();		
		for (int i =0; i<unit.length; i++) {
			//ù �Է½ÿ��� �������� ������ input�� �״�� �޴´�.
			if(i==0) {
			count = input/unit[i];			
			System.out.println(unit[i]+"�� ¥�� : " + count + "��");
			rest = input%unit[i];
			continue;
			} 
			
			// 10000�� �������ʹ� ������ �̿�
			count = rest/unit[i];
			// �ش�Ǵ� ���� ������ ������ 0�� �ÿ��� ������� �ʴ´�.
			if (count !=0) {
				System.out.println(unit[i]+"�� ¥�� : " + count + "��");	
			}			
			rest = rest%unit[i];			
		}		
		scanner.close();
	}

	private void ��������7() {
		Random r = new Random();
		int sum = 0;
		
		// �������� ���� �� �迭�� �Ҵ�
		System.out.print("������ ������ : ");
		
		int [] num = new int [10];		
		for (int i = 0; i<num.length; i++) {
			num[i] = r.nextInt(10) + 1; // 0���� 9������ �������� �����ǹǷ� �� ĭ�� �ø��� 1~10
			sum = sum + num[i]; // ��հ� ���ϱ� ���ؼ� �־����
			System.out.print(num[i] + " ");
		}
		System.out.println();
		System.out.println("����� " + (double) sum/10);		
	}




	private void ��������8() {
		Scanner scanner = new Scanner(System.in);
		Random r = new Random();
				
		System.out.print("���� �?");
		int input = scanner.nextInt();
		
		//��ȿ�� �˻�(?)
		while(input <0 || input >100  ) {
			System.out.print("���� �? ����� �Է��� ������ �ݺ��̿�");
			input = scanner.nextInt();				
		} 
		
		//���� ������ ���� �������ְ� �� ������ �迭�� ���
		int [] num = new int [input];      // ���� ���� ����� �迭 ���� - ���� 7 ���� 
		for(int i = 0; i<input ; i++) {
			num[i] = r.nextInt(100) + 1; //0~99 �� 1~100���� �ٲ��ְ� ���			
		}
		
		// �迭�� ���� ���� ������ �ϱ�.    �̰� �� ��¦ �Ҿ�
		for(int i = 0; i<input ; i++) {
			for(int j = 0; j<input ; j++) {
				while (i!=j && num[i] == num[j]) {
					num[i] = r.nextInt(100) + 1;
				}
			}
		}		
		
		// �迭 ���. �ϴ� �ִ´�� �� �̾Ƴ���� �ؾ���
		for (int i = 0; i<input ; i++) {
			if (i%10 ==0) {     // �̰� �ſ� ���� ��. �Ƹ� ���ϱ� ������ �̷��� ������ ����������
				System.out.println();
			}		
			
			if(num[i]<10) { // ���� ���� �Ƹ���� ���ֱ�
				System.out.print(" "+num[i] + " ");
			} else {
				System.out.print(num[i] + " "); 	
			}			
		}
		
	} // end of �������� 8
	
	
	
	private void ��������9() {
		Random r = new Random();
		
		
		// �迭 ���� �� ���� ���� �Ҵ�
		int [][] num = new int [4][4];
		
		
		for (int i = 0; i < 4; i++) {			
			for (int j = 0; j < 4; j++) {				
				num[i][j] = r.nextInt(16)+1;
				if(num[i][j]<10) { //�� ������ ���� �Ƹ��ٿ� ���. printf �𸣰� �˰� ������ ����
					System.out.print(num[i][j] + "   "+" "); //���� �� ĭ�� 1�� �ڸ��� 10�� �ڸ� ���� �ݿ�
					continue;
				}
				System.out.print(num[i][j] + "   ");				
			}
			System.out.println();
		}
		
	}// end of ��������9




	private void ��������10() {
		Random r = new Random();		
		int [][] num = new int [4][4];
		int coor[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}; 
		                         //��ǥ[0][0] ~ [3][3] ���� �� 16��
		
		int coorRan[] = new int [10]; //���� ��ǥ ����. 10�� ��
		
		for (int i = 0; i<coorRan.length; i++) {
			coorRan[i] = r.nextInt(16);			
		}				
		// ��ǥ �ߺ� ���ű�
		for(int i = 0; i<coorRan.length ; i++) {
			for(int j = 0; j<coorRan.length ; j++) {
				while (i!=j && coorRan[i] == coorRan[j]) {
					coorRan[i] = r.nextInt(16);
				}
			}
		}	
		
		//Ȯ�� �۾� ���� ���
		
		for(int i = 0 ; i<coorRan.length ; i++) {
			System.out.print(coorRan[i] + " ");
		}
		System.out.println();
		
		//�������� ������ ��ǥ�� ���� ���� �� �Ҵ��ϱ�
		
		for(int i = 0; i<coorRan.length; i++) {
			for (int j = 0; j<coor.length; j++) {
				if (coorRan[i] == j ) {					
					switch (j) { // ���������� ��ǥ�� ���� �� �ο�
					case 0: num[0][0] = (r.nextInt(10)+1);System.out.println("num[0][0] : "+ num[0][0] + " ");break;
					case 1: num[0][1] = (r.nextInt(10)+1);System.out.println("num[0][1] : "+ num[0][1] + " ");break;
					case 2: num[0][2] = (r.nextInt(10)+1);System.out.println("num[0][2] : "+ num[0][2] + " ");break;
					case 3: num[0][3] = (r.nextInt(10)+1);System.out.println("num[0][3] : "+ num[0][3] + " ");break;
					case 4: num[1][0] = (r.nextInt(10)+1);System.out.println("num[1][0] : "+ num[1][0] + " ");break;
					case 5: num[1][1] = (r.nextInt(10)+1);System.out.println("num[1][1] : "+ num[1][1] + " ");break;
					case 6: num[1][2] = (r.nextInt(10)+1);System.out.println("num[1][2] : "+ num[1][2] + " ");break;
					case 7: num[1][3] = (r.nextInt(10)+1);System.out.println("num[1][3] : "+ num[1][3] + " ");break;
					case 8: num[2][0] = (r.nextInt(10)+1);System.out.println("num[2][0] : "+ num[2][0] + " ");break;
					case 9: num[2][1] = (r.nextInt(10)+1);System.out.println("num[2][1] : "+ num[2][1] + " ");break;
					case 10: num[2][2] = (r.nextInt(10)+1);System.out.println("num[2][2] : "+ num[2][2] + " ");break;
					case 11: num[2][3] = (r.nextInt(10)+1);System.out.println("num[2][3] : "+ num[2][3] + " ");break;
					case 12: num[3][0] = (r.nextInt(10)+1);System.out.println("num[3][0] : "+ num[3][0] + " ");break;
					case 13: num[3][1] = (r.nextInt(10)+1);System.out.println("num[3][1] : "+ num[3][1] + " ");break;
					case 14: num[3][2] = (r.nextInt(10)+1);System.out.println("num[3][2] : "+ num[3][2] + " ");break;
					case 15: num[3][3] = (r.nextInt(10)+1);System.out.println("num[3][3] : "+ num[3][3] + " ");break;					
					}					
				}
			}				
		}
		System.out.println();
		
		for (int i = 0; i<4 ; i++) {
			for (int j = 0 ; j<4 ; j++) {
				if(num[i][j]<10) { //�� ������ ���� �Ƹ��ٿ� ���. printf �𸣰� �˰� ������ ����
					System.out.print(num[i][j] + "   "+" "); //���� �� ĭ�� 1�� �ڸ��� 10�� �ڸ� ���� �ݿ�
					continue;
				}
				System.out.print(num[i][j] + "   ");	
			}
			System.out.println();
		}
		
		//=====================================================
		//��ġ�� ���� �����Ϸ� ������ ����
		//������ �ڸ��� ? ���� ���Ƿ� �ƹ��볪 ������� �Ҹ���? �ƴϸ� ��ǥ�� ����?
		// ��ǥ�� �����̶�� �迭 �����ܰ迡�� ���� ���� �ɾ��ְ�, ���� length Ȱ��?�ؾ� �� ��
		// �ٵ� �׷����� Array�� �ƴ� ArrayList�� �ؾ� �� ��
		
//		int count = 10; //10���� �־��־�� �ϴϱ�
//		for(int i = 0; i<count; i++) {
//			int limitRow = r.nextInt(3)+1; // 4x4�ϱ� �� ���� �ȿ����� ����� �ϴϱ�
//			int limitColumn = r.nextInt(3)+1; // +1�� bound�� 0�� �Ǹ� �ȵȴٰ� �ؼ�
//			int row = r.nextInt(limitRow); //�� ���� 
//			int column = r.nextInt(limitColumn);; // �� ���� 
//			
//			num[row][column] = r.nextInt(10)+1; //			 
//		} 
//		
		
		
		// ============================================================
		
		
		
//		 ������ 6���� �� ĭ�� 0 �־��ֱ� // �̰� �ڵ����� �Ǵ� �� ������?
//		for (int i = 0; i<4; i++) {
//			for (int j = 0; j<4; j++) {
//				if (num[i][j] == -1) {
//					num[i][j] = 0;
//				}
//			}
//		}
		
		
	}// end of ��������10
		

	private void ��������11() {
		//Average.java �� Average.class ���. 
		// ���̹� ī�信 �̹� �÷�����
	}




	private void ��������12() {
		// �ϴ� ����.
		
	}




	private void ��������13() {
		for (int i=1; i<100; i++) {
			
			//���ڸ��� 369 �ذ�
			if(i<10 && (i%3==0)) {
				System.out.println(i + " �ڼ� ¦");
			} else if (i>=10 && i%10!=0  && ((i/10)%3 == 0 || (i%10)%3 == 0) ) { 
				// ���� �ڸ��� ���� �ڸ��� 369 
				System.out.println(i + " �ڼ� ¦");
			}
			// 10�� �ڸ������� ���� �ڸ��� ���� 369 ���� �ֵ� ����ֱ�
		}		
	}




	private void ��������14() {
		Scanner scanner = new Scanner(System.in);
		String course[] = { "Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int score[] = {95, 88, 76, 62, 55};
		String name;
		int point;
		
		
		System.out.print("���� �̸�>>");
		name = scanner.nextLine();
		
//		for
//		if (course[i].equals(name)) {
//			
//		}
		
		
	}




	private void ��������15() {
		// TODO Auto-generated method stub
		
	}




	private void ��������16() {
		// TODO Auto-generated method stub
		
	}




	public static void main(String[] args) {
		new Practices_Ch3();
	}
	
	
	
	
}