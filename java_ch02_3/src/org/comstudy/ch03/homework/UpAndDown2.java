package org.comstudy.ch03.homework;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//Random r�� �ʱ�ȭ �����༭ ��Ÿ�� ���� ������;;;


public class UpAndDown2 {
	
	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Random r = new Random(); //Random r�� �ʱ�ȭ �����༭ ��Ÿ�� ���� ������;;; 
		int k,min, max, i, inNum;
		String choice;
		ArrayList <Integer> input = new ArrayList <>();
		
		
		k = r.nextInt(100);
		min = 0; max = 99;
		choice = "";
		
		System.out.println("���� �����Ͽ����ϴ�. ���߾����");
		i = 0;
		while(true) {
			System.out.println(min+"-"+max);
			System.out.print((i+1)+">>");
			input.add(i, (inNum = scan1.nextInt()));; //�� �̰� �ǳ� 
			if(input.get(i) < k) {
				min = input.get(i)+1;
				System.out.println("�� ����");
				System.out.println((input.get(i)+1)+"-"+max);
			} 
			else if (input.get(i) > k) {
				max = input.get(i)-1;
				System.out.println("�� ����");
				System.out.println(min+"-"+(input.get(i)-1));
			
			}
			
			if(input.get(i) == k) {
				System.out.println("�¾ҽ��ϴ�.");
				System.out.print("�ٽ� �Ͻðڽ��ϱ�?(y/n)>>>");
				
				i = 0; min = 0 ; max = 99; 
				input = new ArrayList <>();
				
				choice = scan2.nextLine();
				while (!(choice.equals("y")) && !(choice.equals("n"))) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ֽʽÿ�");
					choice = scan2.nextLine();
				} // choice while end

				if (choice.equals("y")) {
					System.out.println("���� �����Ͽ����ϴ�. ���߾� ������.");
					
				} else if (choice.equals("n")) {
					System.out.println("������ �����մϴ�. �����մϴ�.");
					break;
				}
			}
				
				
			
			
			
			
			
			
			
			i++;
		}
	} // main end
}// class end