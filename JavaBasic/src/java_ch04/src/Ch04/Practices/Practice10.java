package Ch04.Practices;
import java.util.Scanner;

class Dictionary {
	private static String [] kor = {"사랑", "아기", "돈", "미래", "희망"};
	private static String [] eng = {"love", "baby", "money", "future", "hope"};	
	public static String kor2Eng(String word) { 	
		String e;
		for (int i = 0 ; i<kor.length ;i++) {
			if(word.equals(kor[i])) {
				e = eng[i];
				return e;
			}
		}		
		return word;		
	}
}

public class Practice10 {
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("한영 단어 검색 프로그램입니다.");
		while (true) {			
			System.out.print("한글 단어? ");
			String k = scan.next();
			if (k.equals("그만")) {
				System.exit(0);
			}			
			if (Dictionary.kor2Eng(k).equals(k)) {
				System.out.println(k + "는 저의 사전에 없습니다. ");
			} else {
				System.out.println(k + "은 " + Dictionary.kor2Eng(k));
			}
		}
		
	}
}
