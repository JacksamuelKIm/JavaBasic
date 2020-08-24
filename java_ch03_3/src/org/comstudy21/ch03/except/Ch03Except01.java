package org.comstudy21.ch03.except;

public class Ch03Except01 {

	public static void main(String[] args) {
		String[] sArr = {null, null, "korea", null, "japan", "china"}; 
		
		for (int i = 0; i<sArr.length; i++) {
			System.out.println(sArr[i]);// null�� null�̶� �׳� �������� ��µ�
		}
		
		for (int i = 0; i<sArr.length; i++){ 
			if("korea".equals(sArr[i])) { // �̷��� �ϴ� ���� ���������� 
				System.out.println(sArr[i]);
			}
		}
		
		for (int i = 0; i<sArr.length; i++){
			try {
				if((sArr[i]).equals("korea")) { // �̷��� �ϴ� ���� ���������� 
					System.out.println(sArr[i]);					
				}else {
					System.out.println("Korea�� �ƴմϴ�");
				}
			}catch	(NullPointerException e) {
				continue; // ���� i�� ����
			}
		}
		
		
	}
	
	
	public static void test01() {
		String c = null; 
		// �̸�(��������, �ּҰ�)�� ���� �� ��ü�� �������� ����
		// NullPointException : ��ü�� ���� ������ ��� ���� �Ұ���!
		
		try{
			System.out.println("���ڿ� ���� " +c.toString());
		} 
		catch(NullPointerException e) {
			System.out.println("��ü�� ���� ������ ��� ������ �Ұ����մϴ�!");
//			System.err.println("��ü�� ���� ������ ��� ������ �Ұ����մϴ�!"); out�� err�� ���� �����尡 �޶� ������ �ڹٲ� �����
			c = "���ο� ���ڿ� ��";
			System.out.println("���ڿ� ���� " +c.toString());
		}
		
		System.err.println("���� ����");

	}

}
