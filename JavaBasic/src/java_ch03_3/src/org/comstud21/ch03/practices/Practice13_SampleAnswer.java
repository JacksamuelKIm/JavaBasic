package org.comstud21.ch03.practices;

public class Practice13_SampleAnswer {

	public static void main(String[] args) {
		
		for(int i = 1; i<100; i++) {
			int a = -1, b= -1; //10�� �ڸ� 1���ڸ��� �̷��� ������� �и��߱���!! -1�� ������
			
			if(i<10) { // �ϴ� ���� �ڸ� ���� �ڸ��� �� �ֵ� ������ְ�
				b = i;
			} else {
				a = i/10;
				b = i%10;
			}
			
			//���⼭���� �з� ����
			boolean bool1 = a!=0&&a%3==0;
			boolean bool2 = b!=0&&b%3==0;
			
			
			if(bool1 || bool2) {
				System.out.print(i + " �ڼ� ");
				if(bool1) System.out.print("¦");
				if(bool2) System.out.print("¦");
				System.out.println();
				
			}
			
			
		}

	}

}
