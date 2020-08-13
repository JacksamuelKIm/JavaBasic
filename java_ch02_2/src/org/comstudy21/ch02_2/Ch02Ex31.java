package org.comstudy21.ch02_2;
//written on Aug 13 2020
import java.util.Scanner;

public class Ch02Ex31 {
static Scanner scan= new Scanner (System.in);
static int input;
	
public static void main(String[] args) {
		input = scan.nextInt();
		
		if(input%3 == 0 && input%5==0) {
			System.out.println("3의 배수이면서 5의 배수입니다");
		}else {
			if(input%3 == 0) {
				System.out.println("3의 배수입니다.");			
			} else {
				System.out.println("3의 배수가 아닙니다");
			}
			if(input%5 == 0) {
				System.out.println("5의 배수입니다.");			
			} else {
				System.out.println("5의 배수가 아닙니다");
			}
		} 

	}

}
