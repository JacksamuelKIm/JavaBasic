package test;
import static java.lang.System.out;

import java.util.Scanner;
//written on Aug 12 2020
public class Ch02Homework01Test {
	
	Scanner scanner = new Scanner(System.in);
	String user1, user1a, user2, user2a;	
	
	private void game() {
		System.out.println("::: GAME ���� :::");
		System.out.println("���� ���� �� �����Դϴ�. ����, ����, �� �߿��� �Է���");
		
		System.out.print("ö�� >>> ");
		user1 = scanner.nextLine();
		
		while (true) {
			if (!(user1.equals("����")||user1.equals("����")||user1.equals("��"))) {
				System.out.println("���� ���� �� �����Դϴ�. ����, ����, �� �߿��� �Է���");
				System.out.print("ö�� >>> ");
				user1 = scanner.nextLine();				
			} else {				
				break;
			}
			
		}

		/**
		 * ��!!!!!!!!!!!!!!!!
		 * equals()�� == �� ���� �� ���Ƶ� ������ �� �ٸ�
		 * 1. �޼ҵ�  vs ������
		 * 2.  ����� [quals() method for content comparison] 
		 *        vs  �ּҺ� [reference comparison (address comparison)]
		 * 3. equals()�� �޼ҵ�ϱ� �翬�� override����. ������ ���� ����� �θ�Ŭ���� override��(?)
		 */
		
		
		System.out.print("���� >>> ");
		user2 = scanner.nextLine();
		
		while (true)
			if(!(user2 != "����") && (user2 != "����") && (user2 != "��")) { // �Ǳ� �ϴµ� �� �Ǵ����� ��
			System.out.println("���� ���� �� �����Դϴ�. ����, ����, �� �߿��� �Է���");
			System.out.print("���� >>> ");
			user2 = scanner.nextLine();			
		} else {
			break;			
		}
		
		
		if (user1.equals(user2)) {
			System.out.println("���º��Դϴ� �ٽ��ϼ���");
			return; // �̰� �� �ִ� ����?
		}
		
		
		switch(user1) {
		case "����" :
			switch(user2) {
			case "����" : System.out.print("����");break;
			case "��" : System.out.print("ö����");
			}break;			
		case "����" :
			switch(user2) {
			case "����" : System.out.print("ö����");
			case "��" : System.out.print("����");
			}break;			
		case "��" :
			switch(user2) {
			case "����" : System.out.print("ö����");
			case "����" : System.out.print("����");
			}break;
		}
		System.out.println(" �̰���ϴ�");
	} // game end
	
	
	
	
	public Ch02Homework01Test() {
		game();
	}

	public static void main(String[] args) {
		new Ch02Homework01Test(); // ������ �޼���(�Լ�) ȣ�� new�� ���� �ȵ� 

	}

}
