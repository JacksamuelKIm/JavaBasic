package org.comstudy21.ch02;
//written on Aug 13 2020
import java.util.Scanner;

public class Ch02Ex33 {
	static Scanner scan = new Scanner(System.in);
	static int month=1, day=31;
	public static void main(String[] args) {
		//swtich~case를 이용해서 다음과 같은 기능을 구현하시오.
		// 월 입력 : 2
		// => 2월은 28일까지 있다.
		// 월 입력 : 7
		// => 7월은 31일까지 있다.
		
		// 유효성 검사
		do {
			System.out.print("월 입력: ");
			month = scan.nextInt();
		} while (1 > month || month > 12); // 잘못된 입력 필터

		
				
		switch (month){
		case 1: case 3: case 5: case 7 : case 8: case 10: case 12: day = 31; break;
		case 2: day = 28; break;
		case 4:	case 6: case 9: case 11: day = 30; 	break;
		default: System.out.println("잘못 입력하였습니다."); return; // 이렇게 하면 31일에 대한 것도 적어야지. 근데 위에서 걸려 여기까지 안옴
		}
		System.out.printf("%d월은 %d일까지 있다", month, day);
		

	}// main end

} // class end
