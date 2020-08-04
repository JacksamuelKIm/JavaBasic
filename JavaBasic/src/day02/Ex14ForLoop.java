package day02;
/*	반목문
 * 반복문ㅇ는 for 반목문과 while 2개의 반복문이 있다.
 * for 반복문의 경우, 하나의 int변수를 선택해서
 * 해당 변수가 특정 조건을 만족하면 코드를 실행, 변수의 값을 변화시키고
 * 조건을 다시 체크해서 만족하면 실행
 * 위 과정을 계속 반복하다가 조건이 만족되지 않으면 반복문이 종료가 괸다
*/
public class Ex14ForLoop {
	public static void main(String[] args) {
		// for 반복문은 다음과 같은 구조이다.
		for (int i =1; i <=5; i++) {
			System.out.printf("i의 현재값: %d\n", i);
		}
		//1. for 문의 조건식이 처음부터 틀리면 아예 실행이 되지 않는다/
//		for (int = 3; i <=0; i++) {
//			System.out.printf("i의 현재값: " + i);
//		}
		
		// 2. for문의 ()뒤에 ;을 넣으면 {}로 만족하지 않는다.
		// for (int i = 1; i <=5; i++); {
//		       System.out.println("i: " + i);
//	    }
		// 3. 굳이 변수의 이름을 i로 할 필요는 없지만
//		      전통적으로 i -> j -> k 순으로 들어간다.
		for(int width =1; width<= 3; width++) {
			System.out.println("현재 넓이: "+width);
		}
		
		// 4. 제어하는 변수의 초기화값이나 조건식에 다른 변수가 들어갈 수도 있다.
		int max = 5;
		for (int i = 1; i <= max; i++ ) {
			System.out.println("i의 현재값: "+i);
		}
	} // main end

}
