package org.comstudy21.ch03.except;

public class Ch03Except02 {

	public Ch03Except02() throws Exception {
//		test01();
		test02();
	}
	
	
	private void test02() throws Exception {
		throw new Exception("������ �߻��� ���� ��ü"); 
		
	}


	private void test01() {
		// ���� ���� �߻���Ű��
//		new Exception("������ �߻��� ���� ��ü"); //������ �ϰ� ���� �ȴ���
		
		try{
			throw new Exception("������ �߻��� ���� ��ü"); 
		} catch (Exception e) {
			System.err.println("���� ó���κ� >> " + e);
		}
		
	}


	public static void main(String[] args) throws Exception {
//		try {
//			new Ch03Except02();
//		} catch (Exception e) {
//			System.out.println("");
//		}
		
		System.out.println("���� ����!");

	}

}
