package org.comstudy21.homework;
import static java.lang.System.out;

import java.util.Scanner;

public class Ch02Homework01 {

	Scanner scan = new Scanner(System.in);
	
	public Ch02Homework01() {
		game();		
	}
	
	private void game() {
		out.println("::: GAME ���� :::");
		System.out.println("���������� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���");
		out.print("ö�� >> ");
		String user1 = scan.next();
		out.print("���� >> ");
		String user2 = scan.next();	
		
		if(user1.equals(user2)) {
			out.println("�����ϴ�.");
			return;				//�̰� ����???			
		}
		
		switch(user1) {
		case "����" :
			switch(user2) {
			case "����" : out.print("����");        // switch ������ �𸣰ڴ� 
			case "��" : out.print("ö����");		// ���� �� break ����????
			}break;
		case "����" :
			switch(user2) {
			case "����;" : out.print("ö����");
			case "��" : out.print("����");
			}break;
		case "��" :
			switch(user2) {
			case "����" : out.print("ö����"); 
			case "����" : out.print("����");
			}break;
				
		}
		out.println(" �̰���ϴ�");
	} // game end
		
		
		
	
	



	public static void main(String[] args) {
		new Ch02Homework01(); // Ŭ���� �ȿ��� Constructor�� ��Գ�!!

	}

}
