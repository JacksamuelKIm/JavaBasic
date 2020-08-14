package org.comstudy.ch03;

import java.util.Scanner;

public class Ch03Ex02 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int cnt = 0;
		int total = 0;

		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요");

		// # nextLine()은 하나씩만 읽는 거 확인위한 테스트
//		Scanner scan = new Scanner(System.in);
//		int s = scan.nextInt();
//		System.out.println(s);
		
		
		int num = scan.nextInt(); // 
		while (num != -1) {
			total += num;
			cnt++;
			num = scan.nextInt();
		} 
		if(cnt == 0) {
			System.out.println("입력된 수가 없습니다.");
			return;			// 이게 정확히 뭔지 모르겠다
		}
		System.out.println("정수" + cnt + "개이며,");
		System.out.println("평균 : " + (double)total/cnt + "입니다");
		scan.close();

	}
	
	
	
	public static void test01() {
		int cnt = 0;
		int total = 0;

		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요");

		int num = 0;
		while ((num = scan.nextInt()) != -1) {
			total += num;
			cnt++;
					
		} // while end
		System.out.println("정수" + "개를 입력받았습니다.");
		System.out.println("total => " + total);
		System.out.println("평균 : " + (double)total/cnt);
		
		
	} // main ed

} // CLASS END
