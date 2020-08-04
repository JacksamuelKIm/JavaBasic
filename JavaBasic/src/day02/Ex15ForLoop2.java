package day02;
/*  사용자로부터 입력을 받아서
 *  1부터 그 수까지의 합을 구하는 프로그램을 작성하시오.
 *  
 *  그 후에 다시 입력을 받아서
 *  1부터 그 수까지의 곱을 고하는 프로그램을 작성하시오.
 *  
 *  단 곱을 구할 때에 사용자가 14이상의 값을 입력하면 "표현범위를 넣었습니다." 가 표현되고
 *  14 미만일 경우에는 결과값을 보여주게 되는 코드를 작성하시오
 */
import java.util.Scanner;
public class Ex15ForLoop2 {
	public static void main(String[] args) {
		System.out.print("숫자를 입력해주세요: ");
		Scanner scanner = new Scanner(System.in);
		int userNumber = scanner.nextInt();
		
		int result = 0;
		
		for (int i = 1; i <= userNumber; i++ ) {
		result += i;	
		} // addition for 종료
		System.out.printf("1부터 %d까지의 합: %d\n", userNumber, result);
	
		
		
		
		
	 System.out.print("숫자를 다시 입력해주세요: ");
		userNumber = scanner.nextInt();
		result = 1;
		if(userNumber >= 14) {
			//경고 메세지 출력
			System.out.println("최대범위를 넣었습니다");
		} else {
			for (int i = 1; i <= userNumber; i++ ) {
			result *= i;		
			} // times for 종료
			System.out.printf("1부터 %d까지의 곱: %d\n", userNumber, result);
			//1~userNumber까지의 곱을 계산 후 출력
		} // else 종료
		

		
		scanner.close();
	} // main 종료

} // class 종료
