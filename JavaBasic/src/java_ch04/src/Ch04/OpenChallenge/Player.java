package Ch04.OpenChallenge;
import java.util.Scanner;

public class Player {
	Scanner scan = new Scanner(System.in);
	String name ; // 그지같은 NullPointerException
	String word = " ";
	
	
	
	public Player() {
		System.out.print("참가자의 이름을 입력하세요>>");
		name = scan.next();		
	}
		
	public void getWordFromUser() { 
		this.word = scan.next(); // this를 넣고 안 넣고의 차이가 있나?
	}
	
	public void checkSuccess() { //하다보니 안씀
		
	}
}


