package org.comstudy21.ch01;

public class Ch01Ex01 {

	public static void main(String[] args) {
		System.out.println("Hello World");
	
		
//		for (int i=0; i<args.length; i++) {
//			System.out.println(i + " => " + args[i]);	
//		}
		
		if(args.length == 3) {
			System.out.println("1. ���̵� : " +  args[0]);
			System.out.println("2. ��°� : " +  args[1]);
			System.out.println("3. �� �� : " +  args[2]);			
		} else {
			System.out.println("�Ķ���� �Է� ������ ���� �ʽ��ϴ�!");
		}

	} // main end

} // class end
