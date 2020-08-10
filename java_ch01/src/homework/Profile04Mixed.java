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
		System.out.println("==========        프로필 항목 입력            ===========");
		
		System.out.print("1. 이름: ");
		String name = scanner.next();  
		
		System.out.print("2. 나이: ");
		int age = scanner.nextInt();
		
		scanner.nextLine();
		System.out.print("3. 전공: ");
		String major = scanner.nextLine(); 
		// ===================  Without Scanner ===================================
		BufferedReader jobReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("4. 직업: ");
		String job = jobReader.readLine();
		
		BufferedReader inYearReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("5. 비트캠프 입소연도: ");
		String inYear = inYearReader.readLine();
		
		BufferedReader coursePeriodReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("6. 훈련예정 총 일수: ");
		String coursePeriod = coursePeriodReader.readLine();
		// ==================== txt 불러들이기(getResourceAsStream) ===========================
		String fileName = "Profile2.txt";
		InputStream rest = new Profile04Mixed().getClass().getResourceAsStream(fileName);
		Scanner scanner2 = new Scanner(rest);
		//		System.out.println(scanner.nextLine()); 왜 이렇게 하는 것은 안될까????????????????????????????????
		while(scanner2.hasNext()) {
			System.out.println(scanner2.nextLine());			
		}
		// 마지막 while 부분은 이해못하고 그냥 함 ㅠㅠ
		// hasNext 및 scanner.next 시리즈에 대한 이해가 부족해서 인듯! => 더 이것저것 읽어보고 연습해보자
	}

}
