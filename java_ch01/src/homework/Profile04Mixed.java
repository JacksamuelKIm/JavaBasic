package homework;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Profile04Mixed {
	public static void main(String[] args) throws IOException {
		//=======================     Scanner           ====================//
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
		// ===================  Without Scanner ===================================
		BufferedReader jobReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("4. ����: ");
		String job = jobReader.readLine();
		
		BufferedReader inYearReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("5. ��Ʈķ�� �Լҿ���: ");
		String inYear = inYearReader.readLine();
		
		BufferedReader coursePeriodReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("6. �Ʒÿ��� �� �ϼ�: ");
		String coursePeriod = coursePeriodReader.readLine();
		// ==================== txt �ҷ����̱�(getResourceAsStream) ===========================
		String fileName = "Profile2.txt";
		InputStream rest = new Profile04Mixed().getClass().getResourceAsStream(fileName);
		Scanner scanner2 = new Scanner(rest);
		//		System.out.println(scanner.nextLine()); �� �̷��� �ϴ� ���� �ȵɱ�????????????????????????????????
		while(scanner2.hasNext()) {
			System.out.println(scanner2.nextLine());			
		}
		// ������ while �κ��� ���ظ��ϰ� �׳� �� �Ф�
		// hasNext �� scanner.next �ø�� ���� ���ذ� �����ؼ� �ε�! => �� �̰����� �о�� �����غ���
	}

}
