package day02;
// if는 한 개의 결과만 핸들 가
// if - else는 2개의 결과 중 한 개만 핸들
// if - else if - else if .......-else는 우리가 필요한 만큼의 결과를 핸들 가능하다!
public class Ex09IfElseIf {
	public static void main(String[] args) {
		int age = 10;
		if ( age < 6 ) {
			System.out.println("유아");
		}else if (age <= 13) {
			
			System.out.println("어린이");
		}else if (age < 18 ) {
			System.out.println("청소년");			
		}else {
			System.out.println("성인");
		}

	}

}
