package org.comstudy21.homework;

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.out;

public class Ch02Homework02 {
	Scanner scan = new Scanner(System.in) ;
	final int ���� = 0;
	final int ���� = 1;
	final int �� = 2;
	Random rand = new Random();
	String[] ans = {"����", "����", "��"}; 
	
	Ch02Homework02 () {
		game();				
	} // constructor end
	
	
private void game() {
	out.println("======���� ���� ���� ��������!!!======");
	out.println("0)����   1) ����  2) ��  ");
	int system = rand.nextInt(3); // 0 , 1, 2 ������ ����

	
	out.print("����� >>>");
	int user = scan.nextInt();
	while (user<0 || user>2) {
		out.println("�Է� ������ �ʰ��Ͽ����ϴ�!");
		out.print("����� �ٽ��Է�!");
		user = scan.nextInt();
	}
	System.out.println("------------------");
	
	out.println("(�ý���)" +ans[system] +"   :  " + ans[user] +"(�����)" );
	System.out.println("------------------");
	
	if(user == system) {
		out.println("�����ϴ�.");
		return;		
	}
	String win = "�ý���";
	if (system == ����) {
		if(user == ����) 	win = "�����"; // �� �� �ۿ� ���� ���� {} �������൵ �ȴ�		
	} else if(system == ����) {
		if(user == ��) 	win = "�����";		
	} else if(system == ��) {
		if(user == ��) 	win = "�����";
	}
	System.out.println(win+"�� �̰���ϴ�");
		
	} // game end


	public static void main(String[] args) {
		new Ch02Homework02();
	}

} // class end
