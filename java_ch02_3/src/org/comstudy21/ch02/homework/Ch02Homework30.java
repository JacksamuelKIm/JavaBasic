package org.comstudy21.ch02.homework;
import static java.lang.System.in;
import java.util.Random;
import java.util.Scanner;

// written on Aug 14 2020
//Sample Answer for UpAndDown~~
public class Ch02Homework30 {
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();//�� ��ȣ �ȿ� �� ������ �׻� ���� ���� ����
	
	
	public Ch02Homework30() {  // �� �̷���!! ������ �ٽ� ������ �Ǵ� �Ŵϱ�
		char yn = 'y';
		while(yn == 'y') {
			game();
			
			System.out.println("��õ� �ϰڽ��ϱ�?(y/n");
			yn = scan.next().charAt(0);
			while(!(yn=='y' || yn == 'n')) {
				System.out.println("y �Ǵ� n�� �Է��ϼ���: ");
				yn = scan.next().charAt(0);
			}
			System.out.println();
		}
		System.out.println("������ �� ������.");
	}
	
	private void game() {
		// ���� ���� ���� (1���� 100����) .å�� �ణ �ٸ�
		int min=1, max=100;
		int sysNum = min + rand.nextInt(max); // �Ȱ����� ���� max ������ �� ������� ��
		int userNum = 0;
		int cnt = 5; //�õ� Ƚ��
		
		System.out.println("�ý����� 1~100������ ������ �����ߴ�. ("+sysNum+")");		
		while(cnt > 0) {
			System.out.println("���� ������. ��ȸ�� "+ cnt +"ȸ�Դϴ�");
			System.out.printf("����� �Է�(%d~%d) : ", min, max);
			userNum = scan.nextInt();
			while(userNum<min || userNum>max) { //��ȿ�� check
				System.out.println("�Է� ������ �ʰ��߽��ϴ�. �ٽ� �Է��ϼ���!");
				System.out.print("����� �Է�: ");
				userNum = scan.nextInt();				
			}
			System.out.println("�Է��Ͻ� ���ڴ� ");
			if(userNum == sysNum) { 
				System.out.println("�����Դϴ�");
				break;
			}
			if(userNum > sysNum) {
				System.out.println("�ʹ� ū �����Դϴ�.");
				//ū ���ڰ� ���Ա⶧���� max�� ���� �ٿ��ش�.
				max = userNum - 1;
			} else {
				System.out.println("�ʹ� ���� �����Դϴ�.");
				min = userNum + 1;
			}
			
			cnt --;
		} // end of while
		if(cnt == 0) //�̰� �־�� ������ ����
		System.out.println("��ȸ�� ��� ���� �߽��ϴ�.");		
	} // end of game();




	public static void main(String[] args) {
		new Ch02Homework30();

	}

}
