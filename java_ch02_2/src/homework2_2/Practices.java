// written on Aug 13 2020
package homework2_2;
import java.util.Scanner;

public class Practices {

	int mean;
	Scanner scan = new Scanner(System.in); 	Scanner scan2 = new Scanner(System.in); Scanner scan3 = new Scanner(System.in);
	Scanner scan4 = new Scanner(System.in); Scanner scan5 = new Scanner(System.in); Scanner scan6 = new Scanner(System.in);
	Scanner scan7 = new Scanner(System.in); Scanner scan8 = new Scanner(System.in); Scanner scan9 = new Scanner(System.in);
	Scanner scan10 = new Scanner(System.in); Scanner scan11 = new Scanner(System.in); Scanner scan12 = new Scanner(System.in);
	
	// �� �Լ� �ȿ��� next()�� nextLine()�� ���� �� ���� �浹 �Ͼ��
	//Scanner ��ü�� ���� ����� �ֶ�� ���� �� ��� �̿ܿ��� �ϳ��� ����� ���� �ȴ�. 
	// ������ �� �޼ҵ� �ȿ� scanner �ҷ��ְ� scanner.close()�� �ݾ���� ��
	
	
	public Practices() {
//		exchange();  // 1��
//		digitComparison();  // 2��
//		breakingMoney();  // 3��
//		mean();  / 4��
//		validateTri(); // 5��
		game369(); // 6��
//		inRect(); //7��
//		System.out.println(crashRect()); // 8��
//		inCir(); // 9��
//		crashCir(); //10��
//		seasonMonthIf(); // 11-1��
//		seasonMonthSwitch(); //11-2��
//		operationsIf(); // 12-1��
//		operationsSwitch(); // 12-2��
	}
	
	// �������� 1��
	public void exchange() {
		System.out.print("��ȭ�� �Է��ϼ���(���� ��)>>> ");
		int won = scan.nextInt();
		double dollar = (won / 1100);
		System.out.println(won + "�� $" + dollar + "�Դϴ�");
	}

	// �������� 2��
	public void digitComparison() {
		System.out.print("2�ڸ����� ���� �Է� (10~99) >>> ");
		int num, tens, ones, temp1, temp2;
		num = scan2.nextInt();
		tens = num / 10;
		ones = num % 10;
		if (tens == ones) {
			System.out.println("Yes! Great! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�"); // �ú��� ��� / 2���� / 10���� �� ������ ���
		} else {
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� ���� �ʽ��ϴ�"); // /�� % �����ڰ� ���� ��������� �ƴϰ���. ������
		}

	}

	// �������� 3��
	public void breakingMoney() {
		System.out.print("�ݾ��� �Է��Ͻÿ� >>> ");

		int mount = scan3.nextInt();
		int ��������, ������, õ����, ���, ���ʿ�, �ʿ�, �Ͽ�;

		�������� = mount / 50000;
		������ = (mount % 50000) / 10000;
		õ���� = ((mount % 50000) % 10000) / 1000;
		��� = (((mount % 50000) % 10000) % 1000) / 100;
		���ʿ� = ((((mount % 50000) % 10000) % 1000) % 100) / 50;
		�ʿ� = (((((mount % 50000) % 10000) % 1000) % 100) % 50) / 10;
		�Ͽ� = (((((mount % 50000) % 10000) % 1000) % 100) % 50) % 10;

		System.out.println("�������� " + �������� + "��");
		System.out.println("������ " + ������ + "��");
		System.out.println("õ���� " + õ���� + "��");
		System.out.println("��� " + ��� + "��");
		System.out.println("���ʿ� " + ���ʿ� + "��");
		System.out.println("�ʿ� " + �ʿ� + "��");
		System.out.println("�Ͽ� " + �Ͽ� + "��");

	}

	// �������� 4��
	public void mean() {
		int num1, num2, num3, mean;
		System.out.print("���� 3���� �Է� >>> ");
		num1 = scan4.nextInt();
		num2 = scan4.nextInt();
		num3 = scan4.nextInt();

		// switch�� ���ҷ���

		while (true) {
			if ((num1 > num2) && (num2 > num3)) {
				mean = num2; // �� �� �ȿ��� �ʱ�ȭ�� ������ ������ ����������
				System.out.println("�߰� ���� " + num2);
				break;
			} else if ((num2 < num1) && num2 < num3) {
				if (num1 < num3) {
					mean = num1; // �� �� �ȿ��� �ʱ�ȭ�� ������ ������ ����������
					System.out.println("�߰� ���� " + num1);
					break;
				} else if (num1 > num3) {
					mean = num3; // �� �� �ȿ��� �ʱ�ȭ�� ������ ������ ����������
					System.out.println("�߰� ���� " + num3);
					break;
				}
			}
		}
	} // mean() end
		
	
	
	// �������� 5��
	// ���� �� �����ϰ� �Ƹ��ٿ� ����� ���� �� ���� ������ ���

	public void validateTri() {
		int leg1, leg2, leg3, leg12, leg23, leg31;
		System.out.print("�ﰢ���� �� ���� ������ ���� 3���� �Է��Ͻÿ� >> ");
		leg1 = scan5.nextInt();
		leg2 = scan5.nextInt();
		leg3 = scan5.nextInt();
		leg12 = leg1 + leg2;
		leg23 = leg2 + leg3;
		leg31 = leg3 + leg1;

		if ((leg12 > leg3) && (leg23 > leg1) && (leg31 > leg2)) {
			System.out.println("�ﰢ���� �˴ϴ�");
		} else {
			System.out.println("�۽�... ����? ���а������� �ڴ��� ���� ������");
		}
	}

	
	// �������� 6��
	// 3�� ����� ���ϴ� ������ �ƴ�....
	public void game369() {
		// ���� �ڸ��� ���� ���ϴ� ��� : xy / 10 => x
		// ���� �ڸ��� ���� ���ϴ� ��� : xy % 10 => y
		// x�� 3�� ���(369)���� Ȯ���ϴ� ��� => x % 3 == 0
		// y�� 3�� ���(369)���� Ȯ���ϴ� ��� => y % 3 == 0
		// �׷��� (0%3)�� 0����..... 10���� �ڼ��İ� ������ �ȵ� 3�� �����°� �翬�� 0�� �ƴҶ� ���
		// ���� ���ڸ� ������ ���ڸ� ������ ��Ȯ�ϰ� ����������
		// (x!=0)&&(y!=0) ���ڸ� �� �̸鼭 0 ���� (���� �ڸ� �翬) ���� �ڸ� 0�� �ִ� else�� ��������
		// (x==0)&&(y!=0) ���ڸ� ���̸鼭 ���� �ڸ��� 0�� �ƴѾֵ�. 0�� else�� ����

		System.out.print("1~99 ������ ������ �Է��Ͻÿ� >> ");
		int num = scan6.nextInt();
		while (num < 1 || num > 99) {
			System.out.println("���� ���� ����. �ٽ� �Է���");
			System.out.print("1~99 ������ ������ �Է��Ͻÿ� >> ");
			 num = scan6.nextInt();
		}
		
		int x = num / 10; // ���� �ڸ��� ��
		int y = num % 10; // ���� �ڸ��� ��

		if ((x != 0) && (y != 0) && (x % 3 == 0) && (y % 3 == 0)) { // ���ڸ� �̸鼭, �� �ڸ� ��� 369�� �ϳ��� �ش�
			System.out.println("�ڼ�¦¦");
		} else if ((x == 0) &&  (x % 3 != 0) && (y % 3 == 0)) { // ���� �ڸ��� 0�̰�, ���� �ڸ� 3 6 9 �� ���� �ش�
			System.out.println("�ڼ�¦");  // while�� 0�� �������� �������� y!=0 �̶�� ������ ���� ���� �ʿ䰡 ����
		} else if ((x != 0) && (y != 0) && (x % 3 == 0) && (y % 3 != 0)) { // �� �ڸ��� �̸鼭 ���� �ڸ��� 369.
			System.out.println("�ڼ�¦"); // �ణ �����ϰ� ���� ���� �� ó�� ���̳�, �������ٴ� ����.
		} else if ((x != 0) && (y != 0) && (x % 3 != 0) && (y % 3 == 0)) { // �� �ڸ� ���̸鼭 ���� �ڸ��� 369
			System.out.println("�ڼ�¦");
		} else {
			System.out.println("��");
		}

	}// game369() ����
	
	
	
	// �������� 7��

	public void inRect() {
		System.out.print("�� (x,y)�� ��ǥ�� �Է��Ͻÿ� >> ");
		int x = scan7.nextInt();
		int y = scan7.nextInt();

		if (100 <= x && x <= 200) {
			if (100 <= y && y <= 200) {
				System.out.printf("(%d,%d)�� �簢�� �ȿ� �ֽ��ϴ�", x, y);
			} else {
				System.out.printf("(%d,%d)�� �簢�� �ۿ� �ֽ��ϴ�", x, y);
			}
		} else {
			System.out.printf("(%d,%d)�� �簢�� �ۿ� �ֽ��ϴ�", x, y);
		}

	} // validateRec end
		
	
	
	// �������� 8��

	// (x1,y1) (x2,y2) ��� ���簢���� (100, 100)
	// (200,200)�̶�� ���簢����
	// ���� �浹�ϴ� �� Ȯ���ϴ� ���α׷��ε�
	// x�� �󿡼��� ���� ������ ��ǥ�� y�� ��ǥ�� ��ġ�� ������ ���� �浹 x
	// ���������� y�� ��ǥ�� �־ x���� ���� �ٸ��� ���� x
	// �� ������ ��� ���� �ʿ��ϳ�. �̰� ������ ���� ���࿬���� Ȯ���ϳ�. �׷��� �����ΰ�
	public boolean crashRect() {
		int x1, y1, x2, y2;
		System.out.print("ù ��° ��(x1,y1)�� ��ǥ�� �Է��Ͻÿ�");
		x1 = scan7.nextInt();
		y1 = scan7.nextInt();

		System.out.print("�� ��° ��(x2,y2)�� ��ǥ�� �Է��Ͻÿ�");
		x2 = scan7.nextInt();
		y2 = scan7.nextInt();

		if ((x1 >= 100 && x1 <= 200) && ((y1 >= 100 && y1 <= 200))
				|| (x2 >= 100 && x2 <= 200) && ((y2 >= 100 && y2 <= 200))) {
			return true;
		} else {
			return false;
		}

	}

	// �������� 9��
	public void inCir() {
		double cx, cy, x, y, r, xcxPow, ycyPow, dPow;
		float d;

		System.out.print("���� �߽ɰ� ������ �Է� >> ");
		cx = scan9.nextDouble();
		cy = scan9.nextDouble();
		r = scan9.nextDouble();

		System.out.print("�� �Է� >> ");
		x = scan9.nextDouble();
		y = scan9.nextDouble();

		// �߽ɰ� ��(x,y)������ �Ÿ��� ������ r���� ������ �ȿ� �ִ°ŷ�!!
		// ���� �߽ɰ� ��(x,y)������ �Ÿ��� ��Ÿ��� ���� ��Ծ����
		// ���� �� ������ ���ϴ� �޼ҵ� ���� �� �� ÷ �Ẹ�±���!!

		xcxPow = Math.pow((x - cx), 2); // x�� �� �� ������ �Ÿ��� ����
		System.out.println(xcxPow);

		ycyPow = Math.pow((y - cy), 2); // y�� �� �� ������ �Ÿ��� ����
		System.out.println(ycyPow);

		dPow = xcxPow + ycyPow;
		d = (float) Math.sqrt(dPow); // �� �� ������ �Ÿ�
		System.out.println(d);

		if (d <= r) {
			System.out.printf("��(" + x + ", " + y + ")�� �� �ȿ� �ִ�."); // printf ���� ������ ���� ���µ� �����Ƽ� ����
		} else {
			System.out.println("�� ���̿���");
		}
	} // inCir() end

	
	// �������� 10��
	// �� ���� �߽� ������ �Ÿ��� �� ���� �������� �պ��� ũ�� ���� ��ġ�� �ʴ°���
	public void crashCir() {
		double x1, y1, x2, y2, r1, r2, r3, x2x1Pow, y2y1Pow, dPow;
		float d;

		System.out.print("ù ��° ���� �߽ɰ� ������ �Է� >>");
		x1 = scan10.nextDouble();
		y1 = scan10.nextDouble();
		r1 = scan10.nextDouble();
		System.out.print("�� ��° ���� �߽ɰ� ������ �Է� >>");
		x2 = scan10.nextDouble();
		y2 = scan10.nextDouble();
		r2 = scan10.nextDouble();

		// �Ÿ� ��
		x2x1Pow = Math.pow(x2 - x1, 2);
		y2y1Pow = Math.pow(y2 - y1, 2);
		dPow = x2x1Pow + y2y1Pow;
		d = (float) Math.sqrt(dPow); // �� �� ������ �Ÿ�
		r3 = r1 + r2; // �� ���� �������� ��

		if (d <= r3) {
			System.out.println("�� ���� ���� ��ģ��");
		} else {
			System.out.println("�Ȱ�ħ. ������");
		}

	} // crashCir end

	// �������� 11-1��
	public void seasonMonthIf() {
		System.out.print("���� �Է��ϼ���(1~12) >> ");
		int input = scan11.nextInt();

		if (3 <= input && input <= 5) {
			System.out.println("��");
		} else if (6 <= input && input <= 8) {
			System.out.println("����");
		} else if (9 <= input && input <= 11) {
			System.out.println("����");
		} else if ((input == 12) || (input == 1) || (input == 2)) {
			System.out.println("�ܿ�");
		} else {
			System.out.println("�߸��Է�");
		}
	} // seasonMonthIf() end
		
	
	// �������� 11-2��

	public void seasonMonthSwitch() {
		System.out.print("���� �Է��ϼ���(1~12) >> ");
		int input = scan11.nextInt();

		switch (input) {
		case 3: case 4: case 5:
			System.out.println("��"); break;
		case 6: case 7: case 8:
			System.out.println("����"); break;
		case 9: case 10: case 11:
			System.out.println("����"); 	break;
		case 12: case 1: case 2:
			System.out.println("�ܿ�"); 	break;
		default:
			System.out.println("�߸��Է�"); break;
		}
	} // seasonMonthSwitch() end

	// �������� 12�� -1
	public void operationsIf() {
		double num1, num2;
		String operator;

		System.out.print("����>> ");
		num1 = scan12.nextInt();
		operator = scan12.next();
		num2 = scan12.nextInt();

		if (operator.equals("+")) {
			System.out.printf("%f+%f�� ��� ����� %f", num1, num2, (num1 + num2));
		} else if (operator.equals("-")) {
			System.out.printf("%f-%f�� ��� ����� %f", num1, num2, (num1 - num2));
		} else if (operator.equals("*")) {
			System.out.printf("%f*%f�� ��� ����� %f", num1, num2, (num1 * num2));
		} else if (operator.equals("/")) {
			if (num2 == 0) {
				System.out.println("0���� ���� �� �����ϴ�");
			} else
				System.out.printf("%f/%f�� ��� ����� %f", num1, num2, (num1 / num2));
		} else {
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
		}
	}

	// �������� 12�� -2
	public void operationsSwitch() {
		double num1, num2;
		String operator;

		System.out.print("����>> ");
		num1 = scan12.nextInt();
		operator = scan12.next();
		num2 = scan12.nextInt();

		// switch�� if else�� �ణ �ٸ�������� �����ؾ�. ���� �ʿ�
		switch (operator) { // switch expression�� double�� �� �޴±�...
		case "+": 
			System.out.printf("%f+%f�� ��� ����� %f", num1, num2, (num1 + num2));
			break;
		case "-":
			System.out.printf("%f-%f�� ��� ����� %f", num1, num2, (num1 - num2));
			break;
		case "*":
			System.out.printf("%f*%f�� ��� ����� %f", num1, num2, (num1 * num2));
			break;
		case "/":
			if(num2 == 0) { // ���Ⱑ ��¦ ���
			System.out.println("0���� ���� �� �����ϴ�");
			break;
			} else {
				System.out.printf("%f/%f�� ��� ����� %f", num1, num2, ((num1 / num2)));
				break;
			}
		default:
			break;
		}
	} // operationsSwitch end

	public static void main(String[] args) {
	new Practices();		
	}
}
