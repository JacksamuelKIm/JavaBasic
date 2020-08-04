package day02;
/* 무한루프란?
 * 종료디지 않고 영원히 반복되는 반복문
 * 무한루프는 여러가지 방법으로 만들 수 있다
 */
public class Ex20InfiniteLoop {
	public static void main(String[] args) {
		// 무한루프 1번.
		// 변수가 변하지 않는 상태
//		int number = 1;
//		while(number <5) {
//			System.out.println("무한루프 1번");
//		}//while end
				
		// 무한루프 2번.
	    // 항상 참이 되는 조건식
//		while (0<1) {
//			System.out.println("무한루프 2번");
//		}

		// 무한루프 3번
		// 뭐하러 식을 만드나... true를 적어보자
		while(true) {
			System.out.println("무한루프 3번");
		}
			
			
	}// main end

}
