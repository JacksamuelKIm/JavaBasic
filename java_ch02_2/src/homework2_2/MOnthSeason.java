package homework2_2;
//written on Aug 13 2020
import java.util.Scanner;

public class MOnthSeason {
	static Scanner scan = new Scanner(System.in);
	static int month=1, day=31;
	public static void main(String[] args) {
		//swtich~case를 이용해서 다음과 같은 기능을 구현하시오.
		// 월 입력 : 2
		// => 2월은 28일까지 있다.
		// 월 입력 : 7
		// => 7월은 31일까지 있다.
		do {
		System.out.print("월 입력: ");
		month = scan.nextInt();
		} while (0> month || month >12);
		
		switch (month) {
		case 2 : day=28; break;
		case 7 : day=31; break;
		default :day=30;
		}
		System.out.printf("%d월은 %d일까지 있다", month, day);
		

	}// main end

} // class end
