package org.comstudy21.ch02_2;
//written on Aug 12 2020
public class Ch02Ex06 {
	// (Ŭ������) ��� �ʵ�(���� ����)
	int a = 3;
	int b = 5;
	int a2, b2;
	
	public Ch02Ex06() {
		start();
	}

	public void start() {
		System.out.println("���� ������ ����");
		// ���� ������ (�� �Լ� ����) �ٸ� ����鿡���� ������ �� ����.
		a2 = a++;	// a2 == 3. a == 4 
		a2 = ++a;	// a == 5,  a2 == 5  
		a2 = a++;	// a2 ==5, a == 6
		a2 += 7;	// a2 == 12
		a2 %= 5;	// a2 == 2
		System.out.println("���� a2�� ��: " + a2);
		a2 = --b;	// b == 4 , a2 ==4 
		a2 = b++;   // a2 == 4, b ==5
		
		
		System.out.println("���� a2�� ��: " + a2);
		

	}

	public static void main(String[] args) {
		new Ch02Ex06();

	}

}
