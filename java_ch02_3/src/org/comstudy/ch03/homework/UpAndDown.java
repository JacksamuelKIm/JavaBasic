package org.comstudy.ch03.homework;

//ó������ min - max�� ��������;; �״�� UpAndDown2���� ArrayList�� ���� �Ƹ���� ����. 
//�� Ŭ���� ��ġ�ٰ� �� ���� ���� ������ ������
//��ġ��� ������ �Ƹ����� ���ϰ� �� ����
import java.util.Random;
import java.util.Scanner;

public class UpAndDown {
	Scanner scan = new Scanner(System.in); 	Scanner scan2 = new Scanner(System.in);
	Random r; 	int k, max, min, input; 	String choice;	
	public UpAndDown() {
	randomDraw();	
	}	
	
	private void randomDraw() {
		r = new Random();
		int k = r.nextInt(100);
		min = 0;
		max = 99;

		choice = "";

		System.out.println("���� �����Ͽ����ϴ�. ���߾� ������.");
		System.out.println("0-99");
		System.out.print("1>>");
		input = scan.nextInt();

		while (input != k) {
			for (int i = 1;; i++) {
				while (input < 0 || input > 99) {
					System.out.println("������ �ش����� �ʴ� ���Դϴ�. �ٽ� �Է����ֽʽÿ�");
					System.out.print(">>");
					input = scan.nextInt();
				}
				if (input < k) {
					System.out.println("�� ����");
					min = input + 1;
					System.out.println(min + "-" + max);
					System.out.print(i + 1+">>");
					input = scan.nextInt();
				} else if (input > k) {
					System.out.println("�� ����");
					max = input - 1;
					System.out.println(min + "-" + max);
					System.out.print(i + 1+">>");
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
						System.out.println("���� �����Ͽ�����. ���߾� ������.");
						System.out.println("0-99");
						System.out.println("1>>");

						input = scan.nextInt();
					} else if (choice.equals("n")) {
						System.out.println("������ �����մϴ�. �����մϴ�.");
						break;
					}
				}

			} // for end
		} // input while end
	} // randonDraw() end

	public static void main(String[] args) {
	new UpAndDown();	
	}

}