package org.comstudy21.ch01;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ch01Ex06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String fileName = "data.txt";
		
		InputStream is = new Ch01Ex06().getClass().getResourceAsStream(fileName); // new ��  local variable ��������� ��
//		 InputStream is = Ch01Ex06.class.getClass().getResourceAsStream(fileName);		
		
		Scanner scan2 = new Scanner(is);
		
		System.out.println("����>>>");
		while(scan.hasNext()) { //�ƹ��ų� �Է��ص� �Ȱ��� �� �߳�? hasNext()�� ���� token�� �ֳ� ���ĸ� �����ϱ�
//			System.out.println(scan2.next());
			scan = new Scanner( scan2.nextLine()) ;
			while(scan.hasNext()) {
				System.out.println(scan.next());
			}
			System.out.println();
		}

//		System.err.println("The End");
	}

}
