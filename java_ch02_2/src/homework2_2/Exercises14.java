// written on Aug 12 2020
package homework2_2;

import java.util.Scanner;

public class Exercises14 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);	
		System.out.print("���������� �� �ϳ��� �Է��Ͻÿ� >>>");
		String in = scanner.nextLine();
		
		final String SCISSORS = "����";
		final String ROCK = "����";
		final String PAPER = "��";
		
		
//		switch (in)	{
//		case SCISSORS : System.out.println(1); break;					
//		
//		case ROCK : System.out.println(2); break;
//			
//		case PAPER : System.out.println(3); break;
//			
//		default : System.out.println(0); break;
		
		
		//// �ʱ�ȭ ���ִ� �� �� ����
		int result = 0;
		switch (in)	{
		case "����" : result = 1; break;					
		
		case "����" : result = 2; break;
			
		case "��" : result = 3; break;
			
		default : result = 0;  // ���� default ���̰ڴٸ� �̷���. �׷��� break ��� ������. �ʱⰪ �����Ƿ�
		}
		System.out.println(result);
//		default : System.out.println(0); break; �ʱⰪ�� �̸� �����༭ �����൵ ��
		
		
		
		
			
		
		
		
		}//main end
}
