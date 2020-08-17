package org.comstudy.ch03.homework;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//Random r을 초기화 안해줘서 런타임 에러 났었음;;;


public class UpAndDown2 {
	
	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Random r = new Random(); //Random r을 초기화 안해줘서 런타임 에러 났었음;;; 
		int k,min, max, i, inNum;
		String choice;
		ArrayList <Integer> input = new ArrayList <>();
		
		
		k = r.nextInt(100);
		min = 0; max = 99;
		choice = "";
		
		System.out.println("수를 결정하였습니다. 맞추어보세요");
		i = 0;
		while(true) {
			System.out.println(min+"-"+max);
			System.out.print((i+1)+">>");
			input.add(i, (inNum = scan1.nextInt()));; //헐 이게 되네 
			if(input.get(i) < k) {
				min = input.get(i)+1;
				System.out.println("더 높게");
				System.out.println((input.get(i)+1)+"-"+max);
			} 
			else if (input.get(i) > k) {
				max = input.get(i)-1;
				System.out.println("더 낮게");
				System.out.println(min+"-"+(input.get(i)-1));
			
			}
			
			if(input.get(i) == k) {
				System.out.println("맞았습니다.");
				System.out.print("다시 하시겠습니까?(y/n)>>>");
				
				i = 0; min = 0 ; max = 99; 
				input = new ArrayList <>();
				
				choice = scan2.nextLine();
				while (!(choice.equals("y")) && !(choice.equals("n"))) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해 주십시오");
					choice = scan2.nextLine();
				} // choice while end

				if (choice.equals("y")) {
					System.out.println("수를 결정하였습니다. 맞추어 보세요.");
					
				} else if (choice.equals("n")) {
					System.out.println("게임을 종료합니다. 감사합니다.");
					break;
				}
			}
				
				
			
			
			
			
			
			
			
			i++;
		}
	} // main end
}// class end