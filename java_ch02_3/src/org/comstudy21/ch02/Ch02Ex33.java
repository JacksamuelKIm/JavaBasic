package org.comstudy21.ch02;
//written on Aug 13 2020
import java.util.Scanner;

public class Ch02Ex33 {
	static Scanner scan = new Scanner(System.in);
	static int month=1, day=31;
	public static void main(String[] args) {
		//swtich~case�� �̿��ؼ� ������ ���� ����� �����Ͻÿ�.
		// �� �Է� : 2
		// => 2���� 28�ϱ��� �ִ�.
		// �� �Է� : 7
		// => 7���� 31�ϱ��� �ִ�.
		
		// ��ȿ�� �˻�
		do {
			System.out.print("�� �Է�: ");
			month = scan.nextInt();
		} while (1 > month || month > 12); // �߸��� �Է� ����

		
				
		switch (month){
		case 1: case 3: case 5: case 7 : case 8: case 10: case 12: day = 31; break;
		case 2: day = 28; break;
		case 4:	case 6: case 9: case 11: day = 30; 	break;
		default: System.out.println("�߸� �Է��Ͽ����ϴ�."); return; // �̷��� �ϸ� 31�Ͽ� ���� �͵� �������. �ٵ� ������ �ɷ� ������� �ȿ�
		}
		System.out.printf("%d���� %d�ϱ��� �ִ�", month, day);
		

	}// main end

} // class end
