package test;
import static java.lang.System.out;

import java.util.Scanner;
//written on Aug 12 2020
public class Ch02Homework01Test {
	
	Scanner scanner = new Scanner(System.in);
	String user1, user1a, user2, user2a;	
	
	private void game() {
		System.out.println("::: GAME 실행 :::");
		System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력해");
		
		System.out.print("철수 >>> ");
		user1 = scanner.nextLine();
		
		while (true) {
			if (!(user1.equals("가위")||user1.equals("바위")||user1.equals("보"))) {
				System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력해");
				System.out.print("철수 >>> ");
				user1 = scanner.nextLine();				
			} else {				
				break;
			}
			
		}

		/**
		 * 아!!!!!!!!!!!!!!!!
		 * equals()랑 == 랑 같은 것 같아도 성격이 좀 다름
		 * 1. 메소드  vs 연산자
		 * 2.  내용비교 [quals() method for content comparison] 
		 *        vs  주소비교 [reference comparison (address comparison)]
		 * 3. equals()는 메소드니까 당연히 override가능. 없으면 가장 가까운 부모클래서 override씀(?)
		 */
		
		
		System.out.print("영희 >>> ");
		user2 = scanner.nextLine();
		
		while (true)
			if(!(user2 != "가위") && (user2 != "바위") && (user2 != "보")) { // 되긴 하는데 왜 되는지를 모름
			System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력해");
			System.out.print("영희 >>> ");
			user2 = scanner.nextLine();			
		} else {
			break;			
		}
		
		
		if (user1.equals(user2)) {
			System.out.println("무승부입니다 다시하세요");
			return; // 이건 왜 넣는 거지?
		}
		
		
		switch(user1) {
		case "가위" :
			switch(user2) {
			case "바위" : System.out.print("영희가");break;
			case "보" : System.out.print("철수가");
			}break;			
		case "바위" :
			switch(user2) {
			case "가위" : System.out.print("철수가");
			case "보" : System.out.print("영희가");
			}break;			
		case "보" :
			switch(user2) {
			case "바위" : System.out.print("철수가");
			case "가위" : System.out.print("영희가");
			}break;
		}
		System.out.println(" 이겼습니다");
	} // game end
	
	
	
	
	public Ch02Homework01Test() {
		game();
	}

	public static void main(String[] args) {
		new Ch02Homework01Test(); // 생성자 메서드(함수) 호출 new가 맘에 안듬 

	}

}
