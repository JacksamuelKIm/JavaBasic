package homework2_2;
//written on Aug 13 2020
import java.util.Scanner;

public class MOnthSeason {
	static Scanner scan = new Scanner(System.in);
	static int month=1, day=31;
	public static void main(String[] args) {
		//swtich~case�� �̿��ؼ� ������ ���� ����� �����Ͻÿ�.
		// �� �Է� : 2
		// => 2���� 28�ϱ��� �ִ�.
		// �� �Է� : 7
		// => 7���� 31�ϱ��� �ִ�.
		do {
		System.out.print("�� �Է�: ");
		month = scan.nextInt();
		} while (0> month || month >12);
		
		switch (month) {
		case 2 : day=28; break;
		case 7 : day=31; break;
		default :day=30;
		}
		System.out.printf("%d���� %d�ϱ��� �ִ�", month, day);
		

	}// main end

} // class end
