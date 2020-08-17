package org.comstudy.ch03;

import java.util.Scanner;

public class Ch03Ex04 {
	Scanner scan = new Scanner(System.in);
	
	public Ch03Ex04() {
//		timesTable3x3();
//		startEndDan();
//		startEndDanError();
		startEndDan_timesTable3x3();
		
	}
	
	
	private void startEndDan_timesTable3x3() {
		
		// ���۴� �Է�
		System.out.print("���� ���� �Է��� �ּ���: ");
		int startDan = scan.nextInt();		
		
		// 2���� 9������ ���� �̿��� ���� �ɷ��ִ� ��ȿ���˻�? �־�����
		while (startDan <2 || startDan >9) {
			System.out.println("���� �̿��� �����Դϴ�. �ٽ� �Է��� �ֽʽÿ�");
			System.out.print("���� ���� �Է��� �ּ���: ");
			startDan = scan.nextInt();
		}	
		
		//����� �Է�
		System.out.print("���� ���� �Է��� �ּ���: ");
		int endDan = scan.nextInt();
		
		// 2���� 9������ ���� �̿��� ���� �ɷ��ִ� ��ȿ���˻�? �־�����
		while(endDan <2 || endDan >9) {
			System.out.println("���� �̿��� �����Դϴ�. �ٽ� �Է��� �ֽʽÿ�");
			System.out.print("���� ���� �Է��� �ּ���: ");
			endDan = scan.nextInt();
		}
		
		// ���۴��� ����ܺ��� �� ũ�� �־��ִ� ������ �ֵ��� �����ִ� ���͸� ����. 
		if(startDan > endDan) {
			int temp = endDan;
			endDan = startDan;
			startDan=endDan;			
		}
		
		//�Է¹���  ���۴�/����� ���� �Ƹ��ٿ� 3x3����� ���������
		int danSize = endDan - startDan; 
		int row1size = (danSize>=3) ? 3:danSize;
		int row2size = (danSize-row1size)>=3 ? 3 : (danSize-row1size) ; 
		int row3size = (danSize-row1size-row2size)>=3 ? 3 : (danSize-row1size-row2size) ;
		
		// 1��
		for(int cnt = 1; cnt<=9 ; cnt++){				
			System.out.println();
			for (int dan = startDan ; dan <= startDan+row1size ; dan++) { 
			System.out.printf("%d x %d = %d\t",dan, cnt, dan*cnt);
			}				
		} // �ܺ� for end (sizeOfcolumn>=3? 3:sizeOfcolumn)
		
		System.out.println(); // �� �� ���� �����ֱ�
		
		// 2��
		if (danSize>3) {		
			
			for(int cnt = 1; cnt<=9 ; cnt++){				
				System.out.println();
				for (int dan = startDan+3 ; dan <= startDan+row1size+row2size ; dan++) { 
				System.out.printf("%d x %d = %d\t",dan, cnt, dan*cnt);
				}			
			}
		}
		
		System.out.println(); //�� �� ���� �����ֱ�
		
		//3��
		if (danSize>6) {		
			
			for(int cnt = 1; cnt<=9 ; cnt++){				
				System.out.println();
				for (int dan = startDan+3+3 ; dan <= startDan+row1size+row2size+row3size ; dan++) { 
				System.out.printf("%d x %d = %d\t",dan, cnt, dan*cnt);
				}			
			}
		}			
			
	} // method end

	private void startEndDanError() {
		
		// �Ǽ�!! ���쵵 ����! �̷��� ���� ����!!
		int startDan = 0;
		int endDan = 0;
		
		System.out.println("���� �� �Է� : ");
		startDan = scan.nextInt();
		System.out.println("���� �� �Է� : ");
		endDan = scan.nextInt();
		
		//���� �� ~ ���� �ܱ��� ����ϱ�
		//��, ���۴��� ����ܺ��� ū ���� ���͵� ���� ����� �ǵ��� �ϼ���.
		//��ȿ�� �˻� �ϼ���.
		
		
		// 2~9 ������ ���� ���;� �ǰ� ������ ����
		while ((startDan < 2 || startDan >9)) {
			System.out.println("�̰� �������Դϴ�. �ٽ� �Է���");
			System.out.println("���� �� �Է� : ");
			startDan = scan.nextInt();
		}
		while ((endDan < 2 || endDan >9)) {
			System.out.println("�̰� �������Դϴ�. �ٽ� �Է���");
			System.out.println("���� �� �Է� : ");
			endDan = scan.nextInt();
		}
		
		// ���۴��� ����ܺ��� ũ�� �ٲ�ġ�� temp ����ϳ� ����
		if (startDan > endDan) {
//			int temp1 = startDan; ���⿡�� ������ ��� ��� �ɵ�
			int temp2 = endDan;			
			endDan = startDan;
			startDan = temp2;			
		}
		
		// ���۴ܺ��� ����ܱ���
		
				
		for(int cnt = 1; cnt <=9 ; cnt++) {
			System.out.println(cnt); // �̷���  cnt �־ �Է��غ� cnt ==1�϶��� �״�� �����Ѵ� ��
			for (; startDan<=endDan ;startDan++) { // startDan�� �״�� �־��ָ� 1�ܸ� ������ ���� 
			System.out.printf("%d x %d = %d\t\n", startDan, cnt, startDan*cnt ); // startDan�� ������ �ִ� �����μ� ��. �װ� �ٲ�� �ȵ���
			} // ����� ��������ξ� �׳� startDan �ʱⰪ 6�̾����ϱ�(e.g)�׳� �״�� ��! ��� �ϰ���
		}	 // ��ǻ�� ���忡���� ó������(cnt==1) �׳� ���� �ַ� �����߰�����, �� ���Ŀ��� �ʱ⹮�� �ƹ��͵� ������ ��Ȳ. �� �ϰ� ���� ��� �ȳ���!!!!!!!!! 	
		     // ���� for�� �� �ܺ� for���� �׷����� �ʱⰪ (6)~������ ����(�� 1ȸ) ���������� / 1ȸ �̻�(���⼱ 4ȸ, �������̴� �ּ� 9ȸ �ݺ��Ҷ��� ���� ����
	}
		
	




	private void startEndDan() {
		
		int startDan = 0;
		int endDan = 0;
		
		System.out.println("���� �� �Է� : ");
		startDan = scan.nextInt();
		System.out.println("���� �� �Է� : ");
		endDan = scan.nextInt();
		
		//���� �� ~ ���� �ܱ��� ����ϱ�
		//��, ���۴��� ����ܺ��� ū ���� ���͵� ���� ����� �ǵ��� �ϼ���.
		//��ȿ�� �˻� �ϼ���.
		
		
		// 2~9 ������ ���� ���;� �ǰ� ������ ����
		while ((startDan < 2 || startDan >9)) {
			System.out.println("�̰� �������Դϴ�. �ٽ� �Է���");
			System.out.println("���� �� �Է� : ");
			startDan = scan.nextInt();
		}
		while ((endDan < 2 || endDan >9)) {
			System.out.println("�̰� �������Դϴ�. �ٽ� �Է���");
			System.out.println("���� �� �Է� : ");
			endDan = scan.nextInt();
		}
		
		// ���۴��� ����ܺ��� ũ�� �ٲ�ġ�� temp ����ϳ� ����
		if (startDan > endDan) {
			int temp1 = startDan;
			int temp2 = endDan;			
			endDan = temp1;
			startDan = temp2;			
		}
		
		// ���۴ܺ��� ����ܱ���
		
		
		for(int cnt = 1; cnt <=9 ; cnt++) {
			System.out.println();
			for (int dan = startDan; dan<=endDan ;dan++) { // startDan�� �״�� �־��ָ� 1�ܸ� ������ ����
			System.out.printf("%d x %d = %d\t", dan, cnt, dan*cnt );
			}
		}
	}





	private void timesTable3x3() {
		
		for(int cnt = 1; cnt<=9 ; cnt++) {
			System.out.println();
			for(int dan = 1; dan<=3 ; dan++) {
				System.out.printf("%d x %d = %d \t", dan, cnt, dan*cnt);
			}
		}
		System.out.println();
		for(int cnt = 1; cnt<=9 ; cnt++) {
			System.out.println();			
			for(int dan = 4; dan<=6 ; dan++) {				
				System.out.printf("%d x %d = %d \t", dan, cnt, dan*cnt);
			}
		}
		System.out.println();
		for(int cnt = 1; cnt<=9 ; cnt++) {
			System.out.println();			
			for(int dan = 7; dan<=9 ; dan++) {				
				System.out.printf("%d x %d = %d \t", dan, cnt, dan*cnt);
			}
		}
		
	}





	public static void main(String[] args) {
		new Ch03Ex04();
//		int startDan = 0;
//		int endDan = 0;
//		
//		System.out.println("���� �� �Է� : ");
//		startDan = scan.nextInt();
//		System.out.println("���� �� �Է� : ");
//		endDan = scan.nextInt();
		
		//���� �� ~ ���� �ܱ��� ����ϱ�
		//��, ���۴��� ����ܺ��� ū ���� ���͵� ���� ����� �ǵ��� �ϼ���.
		//��ȿ�� �˻� �ϼ���.
		
		
		// 2~9 ������ ���� ���;� �ǰ� ������ ����
//		while ((startDan < 2 || startDan >9)) {
//			System.out.println("�̰� �������Դϴ�. �ٽ� �Է���");
//			System.out.println("���� �� �Է� : ");
//			startDan = scan.nextInt();
//		}
//		while ((endDan < 2 || endDan >9)) {
//			System.out.println("�̰� �������Դϴ�. �ٽ� �Է���");
//			System.out.println("���� �� �Է� : ");
//			endDan = scan.nextInt();
//		}
//		
//		// ���۴��� ����ܺ��� ũ�� �ٲ�ġ�� temp ����ϳ� ����
//		if (startDan > endDan) {
//			int temp1 = startDan;
//			int temp2 = endDan;			
//			endDan = temp1;
//			startDan = temp2;			
//		}
//		
		// ���۴ܺ��� ����ܱ���
		
		
//		for(int cnt = 1; cnt <=9 ; cnt++) {
//			System.out.println();
//			for (int dan = startDan; dan<=endDan ;dan++) { // startDan�� �״�� �־��ָ� 1�ܸ� ������ ����
//			System.out.printf("%d x %d = %d\t", dan, cnt, dan*cnt );
//			}
//		}
		
		
		
		// 3�� 3���� ����� �������� ����
		
		
		
		
	} // main end
		
} // class end		
		
		
		
		
		
		

	


