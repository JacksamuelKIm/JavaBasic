package day03;
import java.util.Scanner;
// 무한 루프를 이용하여 메뉴를 만들어보자.
public class Ex01ShowMenu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		while(true) {
			System.out.println("======================");
			System.out.println("비트 고등학교 성적관리 프로그램");
			System.out.println("======================");
			System.out.println(" 1. 입력  2. 출력  3. 종료");
			System.out.print("> ");
			int choice = scanner.nextInt();
			if (choice == 1) {
				//성적 입력하는 코드 실행
			} else if (choice == 2) {
				//성적 출력하는 코드 실행
			} else if (choice == 3) {
				// 종료메세 출력 후 종료
				System.out.println("사용해 주셔서 감사합니다");
				break;
			} else {
				System.out.println("잘못 누르셨습니다.");
			} //if elseif else end
			
		} // while end
		
		// 만약 무한루프가 정상적인 방법으로 종료될 수 없다면
		// 무한루프 아래에 있는 모든 코드들은 영원히 실행 불가능하기 때문에
		// 에러가 발생한다.
		
		scanner.close();
		
	} //main end
}
