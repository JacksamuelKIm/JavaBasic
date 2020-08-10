package org.comstudy21.ch01;

import java.io.IOException;

public class Ch01Ex05 {

	public static void main(String[] args) throws IOException {
		
		byte by[] = new byte [255];
		int number = 0;

		System.out.print("입력: ");
		System.in.read(by);
		
//		System.out.println(new String(by)); // 그냥 toString()는 안됨. 여전히 hashcode 나옴
//		System.out.println("프로그램 종료!"); // 배열의 크기가 255인데 
		
		
		
//		입력: 홍길동
		//           // 이 공백은 배열의 크기가 255인데 '홍길동' 몇 바이트 안되는 거 밖에 없으므로 나머지는 다 빈 칸 처리
//		홍길동
		
//		System.out.println(new String(by).trim()); // 한 방법
//		System.out.println("프로그램 종료!"); //  
		
		number = Integer.parseInt(new String(by).trim());
		
		System.out.println("number = " + number*100); // 한 방법
		System.out.println("프로그램 종료!"); //  
		
		
	}

}
