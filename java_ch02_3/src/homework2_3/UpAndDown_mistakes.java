// written on Aug 13 2020
package homework2_3;
import java.util.Random;
import java.util.Scanner;

public class UpAndDown_mistakes {
	Scanner scan = new Scanner(System.in); 	Scanner scan2 = new Scanner(System.in);
	Random r; 	int k; 	int input; 	String choice;	
	public UpAndDown_mistakes() {
	randomDraw();	
	}	
	
	private void randomDraw() {
		r = new Random();
		int k = r.nextInt(100);
		choice = "";
		
		System.out.println("���� �����Ͽ����ϴ�. ���߾� ������.");
		System.out.println("0-99");
		input = scan.nextInt();
		
		while (input != k) {
			for(int i=1; ;i++) {
			while (input < 0 || input > 99) {
				System.out.println("������ �ش����� �ʴ� ���Դϴ�. �ٽ� �Է����ֽʽÿ�");
				System.out.print(">>");
				input = scan.nextInt();
			}
			if (input < k) {
				System.out.println("�� ����");
				System.out.print(i + ">>");
				input = scan.nextInt(); // while�� expression�� �����Ƿ� �ʿ� ����
			} else if (input > k) {
				System.out.println("�� ����");
				System.out.print(i + ">>");
				input = scan.nextInt();
			}

			if (input == k) {
				System.out.println("�¾ҽ��ϴ�.");
				System.out.print("�ٽ� �Ͻðڽ��ϱ�?(y/n)>>>");
				i = 0;
				choice = scan2.nextLine();
				while (!(choice.equals("y")) && !(choice.equals("n"))) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ֽʽÿ�");
					choice = scan2.nextLine();
				} // choice while end

				if (choice.equals("y")) {
					System.out.println("���� �����Ͽ����ϴ�. ���߾� ������.");
					System.out.println("0-99");
					input = scan.nextInt();
				} else if (choice.equals("n")) {
					System.out.println("������ �����մϴ�. �����մϴ�.");
					break;
				}
			}	
			
			}//for end
		} // input while end
	} // randonDraw() end

	public static void main(String[] args) {
	new UpAndDown_mistakes();	
	}

}
