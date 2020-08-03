package day01;
//연산자
/*연산자란 기호에 자바가 내부적으로 코드를 지정하여
 * 기호를 만나면 특정 기호를 실행하도록 정의해 놓은 것을
 * 연산자라고 한다.
 * 
 * 연산자에는 크게
 * 산술, 할당, 비교, 논리, 쉬프트 5가지 연산자가 존재한다.
 * 
 * 산술연산자(Arithmetic Operator)
 * 산술연산자란 간단한 사칙연산 + 나머지 연산자를 산술연산자라고 한다.
 * + - * / & ++ --  
 */
public class Ex05ArithmeticOperator {
	public static void main(String[] args) {
		int number1 = 30;
		int number2 = 45;
		
		int result1 = number1 + number2;
		System.out.println("number1 + number2 = "+result1);
		
		int result2 = number1 - number2;
		System.out.println("number1 - number2 = "+result2);
		
		int result3 = number1 * number2;
		System.out.println("number1 * number2 = "+result3);
		
		int result4 = number1 / number2;
		System.out.println("number1 / number2 = "+result4);
		
		//정수 나누기 정수의 경우
		/*한가지 주의할 것이 있는데
		 * 정수 나누기 정수를 실행해서 나머지가 나올경우
		 * 그 나머지는 무조건 버려지게 된다
		 * 따라서 5 / 3의 경우 몫 1과 나머지 2 이므로 1만 남게 된다.
		 */
				
		int result5 = number1 % number2;
		System.out.println("number1 & number2 = "+result5);
		/* %연산자는 나머지를 구하는 연산자이다
		 * 만약 number1 나누기 number2가
		 * 나눠 떨어져서 나머지가 없으면0
		 * 있으면 나머지가 나오게된다
		 * 
		 */
		
		
		// ++, --는 좀 특이한 친구들로서
		// 변수의 값을 정확히 1씩 증가시키거나 감소시킨다.
		// 하지만 변수의 앞에 붙냐 뒤에 붙냐에 따라서 실행 시점이 달라지게 된다.
		System.out.println("number1의 현재값: "+number1);
		
		//++가 뒤에 붙으면 해당 줄에서 가장 마지막에 실행된다.
		System.out.println("numer1++의 현재값: "+ (number1++));
		// 위의 코드에서 화면에 number1의 현재값을 출력하고 나서야
		// number1++가 실행되서 number1의 값이 1 증가하게 되는 것이다.
		
		System.out.println("numer1++의 현재값: "+ number1);		
		
		// 반대로 ++, --가 앞에 붙으면 해당 줄에서 가장 먼저 실행이 된다.
		System.out.println("--number1의 현재값: "+ --number1);
		System.out.println("number1의 현재값: "+number1);
		
		// 서로 다른 자료형끼리 산술연산하면
		// 작은 데이터타입을 자동으로 더 큰 데이터타입으로 암시적 형변환한다.
		// 정수형과 실수형을 연산시키면 정수형을 실수형으로 타입캐스팅 한 후에 연산한다.
		
		byte myByte = 100;
		System.out.println("myByte + 1000: "+ (myByte + 1000)); 
		//1000과 결합하면서 자동으로 int형으로 바뀌어 overflow 일어나지 않음
		
		System.out.println("myByte + 3.141592: " + (myByte + 3.141592));
		//자동으로 double전환
		
		//그렇다면 아래의 두 줄은 각각 어떻게 나올까?
		System.out.println(100+23);
		System.out.println("100"+23);
		//""는 여러 문자가 모여있는 문자열, String이라는 의미이다.
		//즉 "100"은 숫자로서 '백'이라는 의미가 아니라
		//문자 1 0 0 이 이어져있다 라는 의미이다.
		//그렇다면 String에 + 가 붙으면 어떻게 될까?
		//뒤에 더할 내용을 String으로 바꾸고
		//String + String이 일어나서
		//2개의 문자열을 이어준다.
		//즉 10023이라는 5글자의 문자열이 되는 것이다.
	} // main end
}
