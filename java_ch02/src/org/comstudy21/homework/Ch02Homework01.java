package org.comstudy21.homework;
import static java.lang.System.out;

import java.util.Scanner;

public class Ch02Homework01 {

	Scanner scan = new Scanner(System.in);
	
	public Ch02Homework01() {
		game();		
	}
	
	private void game() {
		out.println("::: GAME 실행 :::");
		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		out.print("철수 >> ");
		String user1 = scan.next();
		out.print("영희 >> ");
		String user2 = scan.next();	
		
		if(user1.equals(user2)) {
			out.println("비겼습니다.");
			return;				//이게 뭐지???			
		}
		
		switch(user1) {
		case "가위" :
			switch(user2) {
			case "바위" : out.print("영희가");        // switch 문법을 모르겠다 
			case "보" : out.print("철수가");		// 여긴 왜 break 없지????
			}break;
		case "바위" :
			switch(user2) {
			case "가으;" : out.print("철수가");
			case "보" : out.print("영희가");
			}break;
		case "보" :
			switch(user2) {
			case "바위" : out.print("철수가"); 
			case "가위" : out.print("영희가");
			}break;
				
		}
		out.println(" 이겼습니다");
	} // game end
		
		
		
	
	



	public static void main(String[] args) {
		new Ch02Homework01(); // 클래스 안에서 Constructor를 써먹네!!

	}

}
