package org.comstudy21.ch02;

public class Ch02Ex01 {
	String title = "��ü�� ��� �����ϱ�";
	
	// �Լ� ���� -->>ȣ��
	// �Լ��� �ҷ� �־�߸� ������ �ȴ�.
	
	// ����Ʈ ������ �Լ�: �Ű������� ������� �ʾҴ�.
	public Ch02Ex01() {
		// ������ �Լ��� �������� ����. �Լ� �̸��� Ŭ���� �̸��� ����.
		// ������ �Լ��� ���� ȣ�� �Ұ���. ��ü ������ �� ���� �ڵ� ȣ��.  
		System.out.println("������ �Լ� ȣ��..");
		
	}
	
	
	void start() {
		System.out.println("start() �Լ� ����");		
	}
	
	
	public static void main(String[] args) {
		// ��ü ���� - new �����ڸ� ����Ѵ�.
		// Ŭ������ ����� ���� Ÿ���̴�.(reference type!!!!!) ������!!!
		// ��ü�� �����ϰ� �� ��ü�ȿ� �����͸� ���� �� �ִ�.
		Ch02Ex01 ex01; // ������ ������ ����Ǿ���. (stack �޸𸮰���) ���� �޸� 
		ex01 = new Ch02Ex01(); // ��ü�� �� �޸�(heap memory)�� �����ȴ�. �� �޸� - �����Ҵ� (runtime �ÿ� �������)
		// new�� ���� ������ �Լ��� �ҷ����� ����. ������ �Լ��� ���Ƿ� �� ȣ�� �ȵ�
		
		// ���������� ���� 4����Ʈ - �� �ּ�
		// ��ü�� ũ��� ������ - ��
		
		//0X(16������ �̷��� ����)~~~~~
		//��ü ���� ������� �ҷ����� �� �� �� ����. Ex01.b.~~
		//��ü�� ��� �����ϱ�
		System.out.println(ex01.title);
		
		//��ü�� ����Լ� Ȥ��
		ex01.start();

	}

}