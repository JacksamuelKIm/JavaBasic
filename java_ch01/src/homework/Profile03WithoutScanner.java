package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Profile03WithoutScanner {

	public static void main(String[] args) throws IOException {
				
		
		BufferedReader nameReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("1. �̸�: ");
		String name = nameReader.readLine();		
		
		
		BufferedReader ageReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("2. ����: ");
		String age = ageReader.readLine();
		
		BufferedReader majorReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("3. ����: ");
		String major = majorReader.readLine();
		
		BufferedReader jobReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("4. ����: ");
		String job = jobReader.readLine();
		
		BufferedReader inYearReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("5. ��Ʈķ�� �Լҿ���: ");
		String inYear = inYearReader.readLine();
		
		BufferedReader coursePeriodReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("6. �Ʒÿ��� �� �ϼ�: ");
		String coursePeriod = coursePeriodReader.readLine();
		
		BufferedReader feeFreeReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("7. ���� �δ� ����(true or false): ");
		String feeFree = feeFreeReader.readLine();
		
		BufferedReader wishSalaryReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("8. ��� ����(�� ����): ");
		String wishSalary = wishSalaryReader.readLine();
		
		BufferedReader wishRegionReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("9. ��� ����: ");
		String wishRegion = wishRegionReader.readLine();
		
		BufferedReader wishIndustryReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("10. ��� �о�: ");
		String wishIndustry = wishIndustryReader.readLine();
		

	}

}
