package org.comstudy21.ch01;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ch01Ex06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String fileName = "data.txt";
		
		InputStream is = new Ch01Ex06().getClass().getResourceAsStream(fileName); // new 로  local variable 설정해줘야 됨
//		 InputStream is = Ch01Ex06.class.getClass().getResourceAsStream(fileName);		
		
		Scanner scan2 = new Scanner(is);
		
		System.out.println("실행>>>");
		while(scan.hasNext()) { //아무거나 입력해도 똑같은 거 야냐? hasNext()는 단지 token이 있냐 없냐만 따지니까
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
