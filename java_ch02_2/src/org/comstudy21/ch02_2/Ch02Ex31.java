package org.comstudy21.ch02_2;
//written on Aug 13 2020
import java.util.Scanner;

public class Ch02Ex31 {
static Scanner scan= new Scanner (System.in);
static int input;
	
public static void main(String[] args) {
		input = scan.nextInt();
		
		if(input%3 == 0 && input%5==0) {
			System.out.println("3�� ����̸鼭 5�� ����Դϴ�");
		}else {
			if(input%3 == 0) {
				System.out.println("3�� ����Դϴ�.");			
			} else {
				System.out.println("3�� ����� �ƴմϴ�");
			}
			if(input%5 == 0) {
				System.out.println("5�� ����Դϴ�.");			
			} else {
				System.out.println("5�� ����� �ƴմϴ�");
			}
		} 

	}

}
