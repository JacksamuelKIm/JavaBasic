package Ch04.Practices;
import java.util.Scanner;

class Dictionary {
	private static String [] kor = {"���", "�Ʊ�", "��", "�̷�", "���"};
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
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		while (true) {			
			System.out.print("�ѱ� �ܾ�? ");
			String k = scan.next();
			if (k.equals("�׸�")) {
				System.exit(0);
			}			
			if (Dictionary.kor2Eng(k).equals(k)) {
				System.out.println(k + "�� ���� ������ �����ϴ�. ");
			} else {
				System.out.println(k + "�� " + Dictionary.kor2Eng(k));
			}
		}
		
	}
}
