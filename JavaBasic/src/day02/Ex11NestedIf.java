package day02;
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
public class Ex11NestedIf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("성별: ");
		String sex = scanner.nextLine();
		
		
		
		if (sex.equals("남)")) {
			System.out.print("나이: ");
			int age = scanner.nextInt();
								
			if ( age >=18) {
				System.out.print("신체등급(1~5): ");
				int grade = scanner.nextInt();	
				if (grade <=3) {
					System.out.println("현역");
				} else if (3 < grade && grade <5){
					System.out.println("공익");
				} else {
					System.out.println("국방의 의무가 없습니다");
				}
			}
			
			else {
				System.out.println("국방의 의무가 없습니다");
			}
		
					
			
		
		} //if end 
		
		
		else {
			System.out.println("국방의 의무가 없습니다");}

	}

}
