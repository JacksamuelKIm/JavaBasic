package org.comstudy21.ch02.homework;
import static java.lang.System.in;
import java.util.Random;
import java.util.Scanner;

// written on Aug 14 2020
//Sample Answer for UpAndDown~~
public class Ch02Homework30 {
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();//이 괄호 안에 값 넣으면 항상 같은 값이 나옴
	
	
	public Ch02Homework30() {  // 오 이렇게!! 게임을 다시 돌리면 되는 거니까
		char yn = 'y';
		while(yn == 'y') {
			game();
			
			System.out.println("재시도 하겠습니까?(y/n");
			yn = scan.next().charAt(0);
			while(!(yn=='y' || yn == 'n')) {
				System.out.println("y 또는 n만 입력하세요: ");
				yn = scan.next().charAt(0);
			}
			System.out.println();
		}
		System.out.println("다음에 또 만나요.");
	}
	
	private void game() {
		// 높다 낮다 게임 (1부터 100사이) .책과 약간 다름
		int min=1, max=100;
		int sysNum = min + rand.nextInt(max); // 똑같지만 서도 max 넣으면 더 깔끔하지 뭐
		int userNum = 0;
		int cnt = 5; //시도 횟수
		
		System.out.println("시스템이 1~100사이의 난수를 선택했다. ("+sysNum+")");		
		while(cnt > 0) {
			System.out.println("맞춰 보세요. 기회는 "+ cnt +"회입니다");
			System.out.printf("사용자 입력(%d~%d) : ", min, max);
			userNum = scan.nextInt();
			while(userNum<min || userNum>max) { //유효성 check
				System.out.println("입력 범위를 초과했습니다. 다시 입력하세요!");
				System.out.print("사용자 입력: ");
				userNum = scan.nextInt();				
			}
			System.out.println("입력하신 숫자는 ");
			if(userNum == sysNum) { 
				System.out.println("정답입니다");
				break;
			}
			if(userNum > sysNum) {
				System.out.println("너무 큰 숫자입니다.");
				//큰 숫자가 들어왔기때문에 max의 값을 줄여준다.
				max = userNum - 1;
			} else {
				System.out.println("너무 작은 숫자입니다.");
				min = userNum + 1;
			}
			
			cnt --;
		} // end of while
		if(cnt == 0) //이게 있어야 구분이 되지
		System.out.println("기회를 모두 소진 했습니다.");		
	} // end of game();




	public static void main(String[] args) {
		new Ch02Homework30();

	}

}
