package day02;
// 사용자로부터 입력을 받아서
// 1이면 남자 2이면 여자가 출력되는 프로그램을 작성하세요
import java.util.Scanner;

public class Ex08IfElse2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("남자는 1 여자는 2를 입력해 주세요: ");
		
		int sung = scanner.nextInt();
		
		if (sung == 1 ) {
			System.out.println("남자");			
		} else if (sung ==2)  {
			System.out.println("여자");
		} else {
			System.out.println("잘못된 입력임");
		}
		
		scanner.close();
	} // main end

}
