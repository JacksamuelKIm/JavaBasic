package org.comstudy21.ch03;

import java.util.Scanner;

// Ŭ���� �����ϱ� - ��ü�� �����ϱ� ���ؼ� Ŭ������ �����
// Ŭ������ ��ü�� ���������� �����ϴ� Ÿ���� �ȴ�.
// (Ŭ����)Ÿ�� (����)���� = new ������();
class People{
	//  
	int no;
	String name;
	String phone;
	
	@Override
	public String toString() {
		return " [no=" + no + ", name=" + name + ", phone=" + phone + "]";
	}
	
}


public class Ch03Ex20 {	
		static Scanner scan = new Scanner (System.in);
		
	private static People makePeople() {
		People pArr = new People();
		
		System.out.print("��ȣ�� �Է����ּ��� >>");
		pArr.no = scan.nextInt();
		scan.nextLine();
		System.out.print("�̸��� �Է����ּ��� >>");
		pArr.name = scan.nextLine();
		System.out.print("��ȭ��ȣ�� �Է����ּ��� >>");
		pArr.phone = scan.nextLine();
				
		return pArr;
	}
	
	private static void showList(People[] pArr) {
		for (int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i]);
		}
		
	}

	

	public static void main(String[] args) {
		People[] pArr = new People[3];
		
		// 3���� ��ȣ, �̸� , ��ȭ��ȣ �Է�
		
		for (int i =0; i<pArr.length; i++) {
			pArr[i] = makePeople();//				
		}		
		
		
		// pArr�� ��� ������ ���
		showList(pArr);
		
		

//		System.out.print("��ȣ�� �Է����ּ��� >>");
//		pArr[i].no = scan.nextInt();
//		scan.nextLine();
//		System.out.print("�̸��� �Է����ּ��� >>");
//		pArr[i].name = scan.nextLine();
//		System.out.print("��ȭ��ȣ�� �Է����ּ��� >>");
//		pArr[i].phone = scan.nextLine();	
		//�̷��� �ϸ� ��� �����ϴ� �Լ� ����� ����
			
		// pArr�� ��� ������ ���
		
	}
	
	
	

	
	public static void test02() {
		People[] pArr = new People[5]; //�̷����ϸ� c������ ��ü�� 5�� ��������� �ڹٿ����� ���������� 5�� �������. 4����Ʈ¥�� ���������� 5�� �������
		
		pArr[0] = new People(); //�̷��� ��ü�� ���� ��������� ������ �ʵ���� �Է°���
		pArr[0].no = 1;
		pArr[0].name = "Hong";
		pArr[0].phone = "010-29222-8891";
		
		System.out.println(pArr[0]);
	}
	
	public static void test01(String[] args) {
		// People�� ��ü�� �����
		// ��������: ��ü�� �����Ѵ�. ���� ��ü�ȿ� �ִ� �ʵ峪 �޼ҵ嵵 �����Ѵ�.
		People hong = new People(); //People�� Ÿ���� �Ǵ� ����. hong�� ��������(�ּҰ�). Ŭ������ �ִ� �ʵ尡 heap�� ����ǰ�, �ĺ��ڴ� stack��	
		
		//��ü�� �����͸� �����ϱ�.
		hong.no = 1;
		hong.name = "ȫ�浿";
		hong.phone = "010-111-2222";
				
		//����� �����͸� ����ϱ�
//		System.out.printf("&d\t&s\t&d\t ", hong.no, hong.name, hong.phone); //�̰� �������Ƿ�
//		System.out.println(hong.toString()); // �̷��� �� �ʿ䵵 ����. Ŭ���� �ȿ� toString�� ���Ե� �����Ƿ� ��ü�� ����ϸ� �ڵ� ���
		System.out.println(hong);
		

	}

}
