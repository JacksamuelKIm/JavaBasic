package org.comstudy21.ch03.except;

import java.util.Scanner;
public class DevideByZeroHandling {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("나뉨수를 입력하십시오: ");
			int dividend = scan.nextInt();
			System.out.println("나눗수를 입력하시오: ");
			int divider = scan.nextInt();
			
			try {
				System.out.println("나눗수" + dividend +"를 나뉨수" + divider + "로 나누면 몫은 " + dividend / divider + "입니다" );
			} catch (ArithmeticException e) {
				System.err.println("0으로 나눌 수 없습니다. 다시 입력하세요!");
			}			
			
		}		
		
		
	} //main end

} // class end
