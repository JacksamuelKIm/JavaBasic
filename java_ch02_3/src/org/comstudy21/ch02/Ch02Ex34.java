package org.comstudy21.ch02;
// writteb on Aug 14 2020
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// written on Aug 14 2020
public class Ch02Ex34 {

	public Ch02Ex34() throws IOException {
		test();
	}
	
	
	private void test() throws IOException {
//		InputStreamReader isr = new InputStreamReader(System.in);
//		BufferedReader in = new BufferedReader(isr); �̷� ������ �� �ټ��� �ְ�
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// InputStreamReader�� ���� �޾��ְ� �װ� BufferedReader�� wrapping
		// �׷��� ���⳪ �ѱ��� �ν��� �� �ִ�.
		
		
		
		System.out.print("���� �Է�>> ");
		String name = in.readLine();
		System.out.print("���� �Է�>> ");
		int age = Integer.parseInt(in.readLine());
		
		System.out.printf("���� => %s\n", name);
		System.out.printf("���� => %s\n", age);
	
	
	
	
	
	
	
	
	
	
	
	}


	public static void main(String[] args) throws IOException {
		new Ch02Ex34();
		
		
		

	}

}
