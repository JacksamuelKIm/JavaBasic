package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Profile03WithoutScanner {

	public static void main(String[] args) throws IOException {
				
		
		BufferedReader nameReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("1. ÀÌ¸§: ");
		String name = nameReader.readLine();		
		
		
		BufferedReader ageReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("2. ³ªÀÌ: ");
		String age = ageReader.readLine();
		
		BufferedReader majorReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("3. Àü°ø: ");
		String major = majorReader.readLine();
		
		BufferedReader jobReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("4. Á÷¾÷: ");
		String job = jobReader.readLine();
		
		BufferedReader inYearReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("5. ºñÆ®Ä·ÇÁ ÀÔ¼Ò¿¬µµ: ");
		String inYear = inYearReader.readLine();
		
		BufferedReader coursePeriodReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("6. ÈÆ·Ã¿¹Á¤ ÃÑ ÀÏ¼ö: ");
		String coursePeriod = coursePeriodReader.readLine();
		
		BufferedReader feeFreeReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("7. Àü¾× ºÎ´ã ¿©ºÎ(true or false): ");
		String feeFree = feeFreeReader.readLine();
		
		BufferedReader wishSalaryReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("8. Èñ¸Á ¿¬ºÀ(¸¸ ´ÜÀ§): ");
		String wishSalary = wishSalaryReader.readLine();
		
		BufferedReader wishRegionReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("9. Èñ¸Á Áö¿ª: ");
		String wishRegion = wishRegionReader.readLine();
		
		BufferedReader wishIndustryReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("10. Èñ¸Á ºÐ¾ß: ");
		String wishIndustry = wishIndustryReader.readLine();
		

	}

}
