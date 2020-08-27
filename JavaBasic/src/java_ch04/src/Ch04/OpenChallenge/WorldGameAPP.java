package Ch04.OpenChallenge;
import java.util.Scanner;
public class WorldGameAPP {
	static Scanner scan = new Scanner(System.in);	
	
	public static void main(String[] args) {
		run();
	}

	private static void run() {
		String wordCurrent = "아버지";
		int lastIndex = wordCurrent.length() - 1;
		char lastChar = wordCurrent.charAt(lastIndex);
		char firstChar = wordCurrent.charAt(0);		
		
		System.out.println("끝말잇기 게임을 시작합니다.");
		System.out.print("게임에 참가하는 인원은 몇 명입니까?>>>");
		int numP = scan.nextInt();
		Player[] player = new Player[numP];
		
		//참가자 이름 입력 (Player 클래스의 각 instance들의 name 값 입력
		for(int i = 0; i<player.length; i++) {//			
			System.out.print((i+1)+"번째 ");
			player[i] = new Player();
		}		
		System.out.println("시작하는 단어는 아버지입니다.");	
		int j = 0;
		while (true) {
			j = j%numP; // 그래야 참가자 수 많큼의 값으로 떨어지니까
			System.out.print(player[j].name  + ">>");
			player[j].getWordFromUser(); 
			if(player[j].word.charAt(0) == lastChar) {
				wordCurrent = player[j].word; 
				lastIndex = wordCurrent.length() - 1; // for 안에 가둬져 있어서 바로는 도입이 안되었구나!!!!
				lastChar = wordCurrent.charAt(lastIndex);
				firstChar = wordCurrent.charAt(0);
				j++;
			} else {
				System.out.println(player[j].name + "이/가 졌습니다");
				break; // return 써도 되려나
			}			
		}				
		
	}

}
