package Ch04.OpenChallenge;
import java.util.Scanner;

public class Player {
	Scanner scan = new Scanner(System.in);
	String name ; // �������� NullPointerException
	String word = " ";
	
	
	
	public Player() {
		System.out.print("�������� �̸��� �Է��ϼ���>>");
		name = scan.next();		
	}
		
	public void getWordFromUser() { 
		this.word = scan.next(); // this�� �ְ� �� �ְ��� ���̰� �ֳ�?
	}
	
	public void checkSuccess() { //�ϴٺ��� �Ⱦ�
		
	}
}


