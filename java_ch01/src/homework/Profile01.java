package homework;
import java.util.Scanner;
//     1. Scanner 객체이용 
public class Profile01 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		
	System.out.println("==============================================");
	System.out.println("==========        프로필 항목 입력            ===========");
	
	System.out.print("1. 이름: ");
	String name = scanner.next();  
	
	System.out.print("2. 나이: ");
	int age = scanner.nextInt();
	
	scanner.nextLine();
	System.out.print("3. 전공: ");
	String major = scanner.nextLine(); 
	
	System.out.print("4. 직업: ");
	String job = scanner.nextLine(); 
	
	System.out.print("5. 비트캠프 입소연도: ");
	int inYear = scanner.nextInt();
	
	System.out.print("6. 훈련예정 총 일수: ");
	int coursePeriod = scanner.nextInt();
	
	System.out.print("7. 전액 부담 여부(true or false): ");
	boolean feeCharge = scanner.nextBoolean();
	
	System.out.print("8. 희망 연봉(만 단위): ");
	int wishSalary = scanner.nextInt();
		
	scanner.nextLine();
	System.out.print("9. 희망 지역: ");
	String wishRegion = scanner.nextLine();
	
	System.out.print("10. 희망 분야: ");
	String wishIndustry = scanner.next();
	
	
	
	scanner.close();
	} // main end

} // class end
