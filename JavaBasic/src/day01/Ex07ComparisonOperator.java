package day01;
// 비교 연산자(Comparison Operator)
// 2개의 값을 비교한다/
// > >= < <= == !=
// 비교 연산자의 결과값은 참 혹은 거짓밖에 없으므로
// boolean이 나온다.

public class Ex07ComparisonOperator {
	public static void main(String[] args) {
		int number1 = 6;
		int number2 = 5;
		System.out.println("number1 > number2: " + (number1 > number2));
		
		System.out.println("number1 < number2: " + (number1 < number2));
		
		number2 = 6;
		System.out.println("number1 < number2: " + (number1 < number2));
		System.out.println("number1 <= number2: " + (number1 <= number2));

		// == 2개의 값이 같은 지 비교한다.
		System.out.println("number1 == number2: " + (number1 == number2));
		// !=은 2개의 값이 다른지 비교한다.
		System.out.println("number1 != number2: " + (number1 != number2));		
		
		//하지만 비교연산자를 사용할 때 한 가지 주의할 점이 있다.
		//클래스형 변수(=객체)의 값이 같은지 비교할 때에는 사용해선 안된다.
		String string1 = "abc";
		String string2 = new String("abc");
		String string3 = string1;
		System.out.println("string1: " + string1);
		System.out.println("string1: " + string2);
		System.out.println("string3: " + string3);
		
		System.out.println("string1 == string2: " + (string1 == string2));
		System.out.println("string1 == string2: " + (string1 == string3));
		System.out.println("string1 == string2: " + (string2 == string3));
		
		
		//비교 연산자는 해당 공간에 저장된 값을 비교한다.
		// 참조형 변수는 변수공간에 메모리 값이 저장되어있다.
		// 그렇다면 비교연산자는 참조형 변수를 비교할 때 무슨 값을 비교할까?
		// 해당 참조형 변수의 실제값이 아닌 메모리값을 비교하게 되고
		// 따라서 우리가 원한건 "abc"글자가 일치하는 지를 확인하는 것이지만
		// 실제로는 각각의 메모리주소만 비교한 것이다.
		
		
		//primitive variable들은 Java의 stack에 저장되지만
		// Reference타입(?)들은 변수는 메모리만 저장하고
		// 그 안의 값들은 heap에 저장됨
		
		// 클래스 내부의 기능을 접근할 때에는
		// 접근 연산자인 . 을 이용해서 접근해야 한다.
		System.out.println("string1.equals(string2): " + string1.equals(string2));
		System.out.println("string1.equals(string3): " + string1.equals(string3));
		System.out.println("string2.equals(string2): " + string2.equals(string2));
		
		
		
		
		
		
	}

}
