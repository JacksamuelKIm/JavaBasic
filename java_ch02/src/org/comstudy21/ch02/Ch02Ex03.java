package org.comstudy21.ch02;

import static java.lang.System.out;

public class Ch02Ex03 {

	
	public Ch02Ex03() {
	out.println("������ �Լ� ȣ��");		
	
	final double PI = 3.141592;
	String s;
	int i;
	
//	s = "���� ���η��ϴ�";
//	i = 20;
//	
//	test01(s);
//	test02(i);
	
	}
	
	

	private void test01 (String s) {
		out.println("test01 �Լ� ����");
		out.println(s);	
		
	}
	
	private void test02(int i) {
		out.println("test02 �Լ� ����");
		i = i * i ;
		out.println(i);
	}
	
	public void circleArea(double r) {
		double area = r * r; 
		out.println(area);
	}
	
	public void test03 () {
		out.printf(" ���� %c�� �����ڵ�� %d \n", 'A', (int) 'A');
		out.printf(" ���� %c�� �����ڵ�� %d \n", 'a', (int) 'a');
		out.printf(" ���� %c�� �����ڵ�� %d \n", '0', (int) '0');
		out.printf("---------------------------------- \n");
		out.printf("���� %c�� �����ڵ�� %d \n", 'A'+1, (int)('A'+1));
				
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		Ch02Ex03 ex03 = new Ch02Ex03();
		
		String s2 = "���� ���� �ð��̳�";
		int j = 50;
		
		ex03.test01(s2);
		ex03.test02(j);
		ex03.circleArea(25.7);
		ex03.test03();

	}

}
