package day02;
import java.util.*;
//사용자로부터 점수를 입력 받아서
//90~100: A
//80~: B
//70~: C
//60~: D
//~59: F
//가 출력되는 프로그램을 작성하시오
public class Ex10IfElseIf2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수: ");
		double score = scanner.nextDouble();
		
		if ( 0 <= score && score < 60) {
			System.out.println("F");
		} else if (score < 70) {
			System.out.println("D");   
		} else if (score < 80) {
			System.out.println("C");
		} else if (score < 90) {
			System.out.println("B");
		} else if (score <= 100) {
			System.out.println("A");
		} else {
			System.out.println("잘못된 입력입니다.");
		}
		
		//2번째 방법은 입력값이 유효하면
		//if가 실행되고
		//유효하지 않으면 메세지 출력이 실행되는
		//중첩 if 구조를 만드는 것이다
		System.out.println("-------------------------");
		System.out.println("2. 입력값을 점검중");
		System.out.println("`````````````````````````");
		
		if(score >=0 && score <= 100 ) {
			//올바른 점수이므로 if 실행
		if(score >= 90 ) {
			System.out.println("A");
		}else if (score >= 80) {
			System.out.println("B");
		}else if (score >= 70) {
			System.out.println("C");
		}else if (score >= 60) {
			System.out.println("D");
		}
		else {
			// 경고메세지 출력
			System.out.println("잘못 입력하셨습니다.");
		}
		}
		
		
		scanner.close();

	}

}
