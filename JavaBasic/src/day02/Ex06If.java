package day02;
// 제어문
// 제어문이란 특정 코드의 실행여부 혹은 반복 여부를 결정(=제어)하는 코드를 가리킨다.
/* 제어문에는 조건문과 반복문이 있다.
 * 조건문: 조건이 맞으면 코드 실행!
 * 반복문: 조건이 맞으면 코드 반복!
 * 
 * 코드 블락이란 한 개의 {}으로 감싸진 모든 코드들을 코드 블락이라고 한다
 * 
 * 변수의 유효범위(scope)
 * 변수의 유효범위란 해당 변수가 실질적으로 유효한 점위를 말한다.
 * 변수가 선언된 이후부터 그 변수가 속해있난 코드 블락이 종료될 때까지 유효범위가 된다.
 * 해당 변수의 유효범위 안에서는 똑같은 이름의 변수는 만들 수가 없다.
 * 유효범위가 끝난 후에는 해당 변수는 사라진다. 즉 해당 변수를 호출할 수가 없다. 
 *  
 * 조건문 중 가장 대표적인 조건문은 바로 if 문이다.
 * if문은 ()안에 조건식이 true가 나오면 실행
 * false가 나오면 실행하지 않는다.
 * 
 * 조건식이란? boolean이 결과값으로 나오는 코드를 조건식이라 한다.
 *  
 */
public class Ex06If {

	public static void main(String[] args) {
		int age = 20;
		
		/* if문은
		 * if(조건식) {
		 *  조건식이 true일 때 실행할 코드들
		 *}
		 *의 형태를 가진다 
		*/
		
		if (age < 18) {
			System.out.println("나이: "+ age);
			int age2 = 30;
			System.out.println("미성년자입니다.");			
		}
		else {
			
		}
//		System.out.println(age2); 
//		위 코드에서 age2의 유효범위는 if 코드 블락 안이므로
//		유효하지 않기 때문에 ㅔㅇ러가 발생한다.
		System.out.println("프로그램 종료");
	}// main end
	
	
}
