package homework;
import java.util.Scanner;
//     1. Scanner ��ü�̿� 
public class Profile01 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		
	System.out.println("==============================================");
	System.out.println("==========        ������ �׸� �Է�            ===========");
	
	System.out.print("1. �̸�: ");
	String name = scanner.next();  
	
	System.out.print("2. ����: ");
	int age = scanner.nextInt();
	
	scanner.nextLine();
	System.out.print("3. ����: ");
	String major = scanner.nextLine(); 
	
	System.out.print("4. ����: ");
	String job = scanner.nextLine(); 
	
	System.out.print("5. ��Ʈķ�� �Լҿ���: ");
	int inYear = scanner.nextInt();
	
	System.out.print("6. �Ʒÿ��� �� �ϼ�: ");
	int coursePeriod = scanner.nextInt();
	
	System.out.print("7. ���� �δ� ����(true or false): ");
	boolean feeCharge = scanner.nextBoolean();
	
	System.out.print("8. ��� ����(�� ����): ");
	int wishSalary = scanner.nextInt();
		
	scanner.nextLine();
	System.out.print("9. ��� ����: ");
	String wishRegion = scanner.nextLine();
	
	System.out.print("10. ��� �о�: ");
	String wishIndustry = scanner.next();
	
	
	
	scanner.close();
	} // main end

} // class end
