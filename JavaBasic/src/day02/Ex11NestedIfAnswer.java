package day02;
import java.util.Scanner; 
import java.util.Scanner; 
/* 중첩 if문 예제
 * 성별 - 나이 - 신체등급을 입력 받아
 * 남자 && 18세이상 - 신체등급 3급이하는 현역
 *                       4급은 공익
 *                       그외는 면제
 * 그 외의 경우에는 "국방의 의무가 없습니다"가 출력되는 프로그램을 작성하세요.
 * 조건1: 여성일 경우 나이나 신체등급을 입력하지 않습니다.
 * 조건2: 남성이지만 18세미만일 경우에는 신체등급을 입력하지 않습니다.
 */
public class Ex11NestedIfAnswer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("남/녀를 입력해주세요: ");
		String sex = scanner.nextLine();
						
		if (sex.equals("남)")) {
			System.out.print("나이를 입력하세요: ");
			int age = scanner.nextInt();
			if (age < 18 ) {
				System.out.print("아직 미성년자이므로 국방의 의무가 없습니다");
			} else {
				//18세 이상 성인 남성이므로 신체 등급 입력을 받는다.
				System.out.print("신체등급을 입력해주세요: ");
				int category = scanner.nextInt();
				if(category <=3) {
					// 신체등급 1~3 급이므로 현역
					System.out.println("현역입니다.");
				} else if (category == 4 ) {
					// 신체등급 4급이므로 공익
					System.out.println("공익입니다.");
				} else {
					System.out.println("면제입니다.");
				}
				
			}
			

	
	} //big if end 
	else {
		// 여자이므로 메세지만 출력
		System.out.println("여성이므로 국방의 의무가 없습니다");
	}
	
	
	}
} // class end
