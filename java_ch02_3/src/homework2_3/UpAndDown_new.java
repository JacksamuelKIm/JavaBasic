package homework2_3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UpAndDown_new {
	Scanner scan1 = new Scanner(System.in);
	Scanner scan2 = new Scanner(System.in);
	Random r = new Random(); 
	int k,min, max, i, inNum;
	String choice;
	ArrayList <Integer> input = new ArrayList <>();
		
	public void game() {
		k = r.nextInt(100);
		min = 0; max = 99;
		choice = "";
		
		System.out.println("���� �����Ͽ����ϴ�. ���߾����");
		i = 0;
		while(true) {
			System.out.println(min+"-"+max); //���⼭ min - max �ǹǷ� �Ʒ��� �ٽ� ���� ������ ����
			System.out.print((i+1)+">>");
			input.add(i, (inNum = scan1.nextInt()));; //�� �̰� �ǳ� 
			
			// sample answer�����ؼ� ����
			
//			���� �̷������� �ϸ� �ǰ����� ������ ����... ���⸦ ��ġ�� ���� ���� ���̶� �׷��� 
//			������ص� ���� �� �� ���Ӱ� ����.
//			�޼ҵ� ������ ����� ����� ������ �ؾ���
//			while(input.get(i)<min || input.get(i)>max) { //��ȿ�� check
//				System.out.println("�Է� ������ �ʰ��߽��ϴ�. �ٽ� �Է��ϼ���!");
//				System.out.print("����� �Է�: ");
//				input.add(i, (inNum = scan1.nextInt()));; //�� �̰� �ǳ� 		
//			}
			
			
			if(input.get(i) < k) {
				min = input.get(i)+1;
				System.out.println("�� ����");
			} 
			else if (input.get(i) > k) {
				max = input.get(i)-1;
				System.out.println("�� ����");
			}
			
			if(input.get(i) == k) {
				System.out.println("�¾ҽ��ϴ�.");
				System.out.print("�ٽ� �Ͻðڽ��ϱ�?(y/n)>>>");
				
				i = -1; min = 0 ; max = 99; 
				ArrayList <Integer> input = new ArrayList <>();
				
				choice = scan2.nextLine();
				while (!(choice.equals("y")) && !(choice.equals("n"))) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ֽʽÿ�");
					choice = scan2.nextLine();
				} // choice while end

				if (choice.equals("y")) {
					System.out.println("���� �����Ͽ����ϴ�. ���߾� ������.");
					
				} else if (choice.equals("n")) {
					System.out.println("������ �����մϴ�. �����մϴ�.");
					break;
				}
			}			
			i++;
		}
		
		
	}// game() end


	
	
	
	public UpAndDown_new() {
		game();
	}  // constructor end
	public static void main(String[] args) {
		new UpAndDown_new(); 
	} // main end
}// class end