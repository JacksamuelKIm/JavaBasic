package org.comstudy21.homework;

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.out;

public class Ch02Homework02 {
	Scanner scan = new Scanner(System.in) ;
	final int 가위 = 0;
	final int 바위 = 1;
	final int 보 = 2;
	Random rand = new Random();
	String[] ans = {"가위", "바위", "보"}; 
	
	Ch02Homework02 () {
		game();				
	} // constructor end
	
	
private void game() {
	out.println("======가위 바위 보를 시작하자!!!======");
	out.println("0)가위   1) 바위  2) 보  ");
	int system = rand.nextInt(3); // 0 , 1, 2 에서만 나옴

	
	out.print("사용자 >>>");
	int user = scan.nextInt();
	while (user<0 || user>2) {
		out.println("입력 범위를 초과하였습니다!");
		out.print("사용자 다시입력!");
		user = scan.nextInt();
	}
	System.out.println("------------------");
	
	out.println("(시스템)" +ans[system] +"   :  " + ans[user] +"(사용자)" );
	System.out.println("------------------");
	
	if(user == system) {
		out.println("비겼습니다.");
		return;		
	}
	String win = "시스템";
	if (system == 가위) {
		if(user == 바위) 	win = "사용자"; // 한 개 밖에 없을 때는 {} 생략해줘도 된다		
	} else if(system == 바위) {
		if(user == 보) 	win = "사용자";		
	} else if(system == 보) {
		if(user == 보) 	win = "사용자";
	}
	System.out.println(win+"가 이겼습니다");
		
	} // game end


	public static void main(String[] args) {
		new Ch02Homework02();
	}

} // class end
