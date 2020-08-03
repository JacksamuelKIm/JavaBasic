package day01;
/*할당연산자(Assignment Operator)
 * 할당연산자는 간단하게는
 * 변수나 상수에 값을 집어넣는 것부터 시작해서
 * 산술연산 혹은 쉬프트 연산 이후의 결과값을 집어넣는 것 까지 다양하게 사용가능하다.
 * 할당 연산자에는 반드시 = 이 들어간다.
 */
public class Ex06AssingnmentOperator {
	public static void main(String[] args) {
		int number1 = 30;
		int number2 = number1;
		
		// += -> 왼쪽의 "현재"값에 오른쪽 값을 더한 후에 다시 왼쪽에 할당하라
		System.out.println("number2의 현재값: "+ number2);
		number2 +=5;
		//위 코드를 풀어서 쓰면
		// number2 = number2 + 5;가 된다
		System.out.println("number2의 현재값: "+number2);
		
		
		// -= -> 왼쪽의 "현재"값에 오른쪽 값을 뺀 후 다시 왼쪽에 할당하라
		System.out.println("number2의 현재값: "+number2);
		number2 -=10;
		System.out.println("number2의 현재값: "+number2);
		
		
		// *= -> 왼쪽의 "현재"값에 오른쪽 값을 곱한 후 다시 왼쪽에 할당하라
		System.out.println("number2의 현재값: "+number2);
		number2 *=2;
		// number2 = number2 *2;
		System.out.println("number2의 현재값: "+number2);
		
		
		// /= -> 왼쪽의 "현재"값에 오른쪽 값을 나눈 후 다시 왼쪽에 할당하라
		System.out.println("number2의 현재값: "+number2);
		number2 /= 5;
		// number2 = number2 /5;
		System.out.println("number2의 현재값: "+number2);
		
		
		// %= -> 왼쪽의 현재값에 오른쪽 값을 나눈 나머지를 다시 왼쪽에 할당함
		System.out.println("number2의 현재값: "+number2);
		number2  %= 5 ;
		System.out.println("number2의 현재값: "+number2);
		
		
	}//main end

}
