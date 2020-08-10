package homework;
import java.io.InputStream;
import java.util.Scanner;
public class Profile02 {
	public static void main(String[] args) {
		
		String fileTitle = "Profile.txt"; 
		InputStream name = new Profile02().getClass().getResourceAsStream(fileTitle);
	//	System.out.println(name); // hash code만 나옴. why??? 알 듯 모를 듯
		
		Scanner scanner = new Scanner(name);
				
		while(scanner.hasNext()) {			
			System.out.println(scanner.nextLine());
		}
		

	scanner.close();	
	} //main end

} // class end
