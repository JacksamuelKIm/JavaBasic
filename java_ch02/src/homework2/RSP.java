package homework2;
import java.util.Scanner;
public class RSP {
	static Scanner scan1 = new Scanner(System.in);
	static Scanner scan2 = new Scanner(System.in);
	static String cheolSoo0, cheolSoo;
	static String yeongHee0, yeongHee;
	
	public static void main(String[] args) {
		System.out.println("=============== õ������ ���������� ��ȸ================");
		
		// ö�� �Է� �ޱ�
		System.out.print("ö�� >> ");
		cheolSoo0 = scan1.nextLine();
		while(true) { // ����� �Է� ���ϸ� ���� �ݺ�
			if (!(cheolSoo0.equals("����")||cheolSoo0.equals("����")||cheolSoo0.equals("��")))  {
				System.out.println("����,����,�� �߿����� �Է��ϼ���. ��Ÿ�� �ƴ϶�� �ʵ��ΰ�....");
				System.out.print("ö�� >> ");
				cheolSoo0 = scan1.nextLine();
			}else  {
				cheolSoo = cheolSoo0;
				break;
			}
		}
		
//		System.out.println("ö�� ��� ����ֳ� ����: " + cheolSoo); while loop���� ���� �� ������ Ȯ���Ϸ��� �Է�
		
		
		// ���� �Է� �ޱ�
		System.out.print("����>> ");
		yeongHee0 = scan2.nextLine();
		while(true) { // ����� �Է� ���ϸ� ���� �ݺ�
			if (!(yeongHee0.equals("����")||yeongHee0.equals("����")||yeongHee0.equals("��")))  {
				System.out.println("����,����,�� �߿����� �Է��ϼ���. ��Ÿ�� �ƴ϶�� �ʵ��ΰ�....");
				System.out.print("����>> ");
				yeongHee0 = scan2.nextLine();
			}else  {
				yeongHee = yeongHee0;
				break;
			}
		}	
				
		// ���������� ���а�����.  ���º� �� ���� �ݺ�
		while(true) {
			if (cheolSoo.equals(yeongHee)) {  
				System.out.println("���º��Դϴ�. �ٽ� �ϼ���");
				System.out.print("ö�� >> ");
				cheolSoo = scan1.nextLine();
				System.out.print("����>> ");
				yeongHee = scan2.nextLine();
			} else {
			  break;
			}
		} //while end 
		
				
			if ((cheolSoo.equals("����") && yeongHee.equals("����"))) { 
				System.out.printf("ö�� ���: %s  ���� ���: %s\n",cheolSoo, yeongHee);
				System.out.println("	���� ��");			
				System.out.println("���� ��. ��������");
				
			} else if ((cheolSoo.equals("����") && yeongHee.equals("��"))) { 
				System.out.printf("ö�� ���: %s  ���� ���: %s\n",cheolSoo, yeongHee);
				System.out.println("	ö�� ��");			
				System.out.println("���� ��. ��������");			
						
			} else if ((cheolSoo.equals("����") && yeongHee.equals("����"))) { 
				System.out.printf("ö�� ���: %s  ���� ���: %s\n",cheolSoo, yeongHee);
				System.out.println("	ö�� ��");			
				System.out.println("���� ��. ��������");
				
			} else if ((cheolSoo.equals("����") && yeongHee.equals("��"))) { 
				System.out.printf("ö�� ���: %s  ���� ���: %s\n",cheolSoo, yeongHee);
				System.out.println("	���� ��");			
				System.out.println("���� ��. ��������");
								
			} else if ((cheolSoo.equals("��") && yeongHee.equals("����"))) { 
				System.out.printf("ö�� ���: %s  ���� ���: %s\n",cheolSoo, yeongHee);
				System.out.println("	���� ��");			
				System.out.println("���� ��. ��������"); 	
								
			} else if ((cheolSoo.equals("��") && yeongHee.equals("����"))) { 
				System.out.printf("ö�� ���: %s  ���� ���: %s\n",cheolSoo, yeongHee);
				System.out.println("	ö�� ��");			
				System.out.println("���� ��. ��������");
				
			}
			
	} // main end

} // class end
