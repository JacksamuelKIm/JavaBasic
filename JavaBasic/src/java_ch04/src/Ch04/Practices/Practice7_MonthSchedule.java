package Ch04.Practices;
import java.util.Scanner;

public class Practice7_MonthSchedule {	
	Scanner scan = new Scanner(System.in);
	Practice7_Day[] arrDays;
	int lastday;

	// constructor. ����Ʈ�� �����Ƽ� �� ��
	public Practice7_MonthSchedule(int i) {
		arrDays = new Practice7_Day[i];
		lastday = i;
		for(int j=0; j<lastday; j++) {
			arrDays[j] = new Practice7_Day(); // work�� null�̴��� ��ü ��ü�� �����ؾ� ���� ����!!!!
		}		
	}
	
	// Methods
	public void input() { // ����
		System.out.print("��¥(1~" + lastday + ")?>> ");
		int day = scan.nextInt();
		System.out.print("�� ��(�� ĭ���� �Է�)?>> ");
//		try { 								NullPointException �ߴ� �� Ŭ���� Day�� constructor�� ��� �׷� �ɱ�?
		arrDays[day-1].set(scan.next()); //   �׷���!!! arrDays[day-1]�� ���۷������� ���� ��ü�� �ƴϴϱ�??!! 
//		} catch (NullPointerException e) {}      // 
	}
	
	public void view() { // �Է�
		System.out.print("��¥(1~" + lastday + ")?>> ");
		int day = scan.nextInt();		
		arrDays[day-1].show();	// NullPointException�� �ߴ� ����  work�� null�̱� ������ DayŬ������ ��ü ��ü�� ���� ���ؼ�?	
	}	
	
	public void finish() { // ������
		System.exit(0);
	}
	
	public void run() { 		
		while (true) {
			System.out.println(":::::::::: �̹��� ������ ���� ���α׷� ::::::::::");
			System.out.print("�� ��(�Է�:1      ����:2      ������:3) >>");
			int num = scan.nextInt();
			
			if (num == 1) input();			
			if (num == 2) view();						
			if (num == 3) finish();			
		}
	}	
	
	public static void main(String[] args) {
		Practice7_MonthSchedule april = new Practice7_MonthSchedule(30);		
		april.run();		
	}
}
