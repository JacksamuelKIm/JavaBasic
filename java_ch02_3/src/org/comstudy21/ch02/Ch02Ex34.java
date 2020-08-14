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
//		BufferedReader in = new BufferedReader(isr); 이런 식으로 해 줄수도 있고
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// InputStreamReader로 먼저 받아주고 그걸 BufferedReader로 wrapping
		// 그래야 띄어쓰기나 한글을 인식할 수 있다.
		
		
		
		System.out.print("성명 입력>> ");
		String name = in.readLine();
		System.out.print("나이 입력>> ");
		int age = Integer.parseInt(in.readLine());
		
		System.out.printf("성명 => %s\n", name);
		System.out.printf("성명 => %s\n", age);
	
	
	
	
	
	
	
	
	
	
	
	}


	public static void main(String[] args) throws IOException {
		new Ch02Ex34();
		
		
		

	}

}
