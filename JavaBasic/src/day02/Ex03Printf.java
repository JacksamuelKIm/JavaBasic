package day02;
// printf 를 사용하여
// 형식을 맞춰보자

// 공백문자
// 1. 스페이스 공백: 스페이스 한번
// 2. 탭 공백:\t
// 3. 개행문자:\n
// 탭공백이나 개행문자나 둘 다 글자수는 2개지만
// 실제로는 1개의 char로 취급이 된다

public class Ex03Printf {
	public static void main(String[] args) {
		// 1. 10진법 정수('d'ecimal)
			// A. 10진법 정수를 그대로 출력해라
		int number = 33;
		System.out.printf("1-A. %d\n", number);
			// B. 10진법 정수를 5자리로 맞추고 오른쪽 정렬해라
		System.out.printf("1-B. %5d\n", number);
			// B2. 10진법 정수를 5자리로 맞추고 오른쪽 정렬해야 하는데
		    //      숫자가 자릿수를 초과하면? 자릿수 맞추는 것은 무시된다
		System.out.printf("1-B2. %5d\n", 12345678);
			// C. 10진법 정수를 5자리로 맞추고 왼쪽 정렬해라
		System.out.printf("1-C. %-5d\n", number);
			// D. 10진법 정수를 5자리로 맞추고 오른쪽 정렬하고 왼쪽 빈자리는 0으로 채워라
		System.out.printf("1-D. %05d\n", number);
		
		
		number = 167;
		// 2. 16진법 정수(he'x'a decimal)
		// 16진법이란 각 자릿수가 0~15까지의 16개 숫자이고
		// 그리고 각 자리가 16의 제곱을 뜻하는 진법이다.
		// 10은 A, 11은 B, 12는 C, 13은 D, 14는 E, 15는 F로 표기해준다
			//A. 16진법 정수를 그대로 표시하고 알파벳이 존재하면 소문자로 표시해라 
		System.out.printf("2-A. %x\n", number);
			//B. 16진법 정수를 그대로 표시하고 알파벳이 존재하면 소문자로 표시해라
		System.out.printf("2-B. %X\n", number);
			//C. 16진법 정수를 5자리 오른쪽 정렬해서 표시하고 알파벳이 존재하면 소문자로 표시해라
		System.out.printf("2-C. %5x\n", number);
			//D. 16진법 정수를 8자리 오른쪽 정렬해서 표시하고 알파벳은 대문자로 표시해라
		System.out.printf("2-D. %-8X\n", number);
			//E. 16진법 정수를 8자리 오른쪽 정렬하고 왼쪽 빈 공간은 0 알파벳은 대문자로 표시해라
		System.out.printf("2-E. %08X\n", number);
		
		//3. 실수('f'loat)
		double myDouble = 123.45678;
			//A. 실수를 그대로 표시해라
		System.out.printf("3-A. %f\n", myDouble);
			//B. 실수를 소숫점 3번째 자리까지 표싷라
		System.out.printf("3-B. %.3f\n", myDouble);
			//C. 실수의 자릿수를 총 8자리로 맞추고 소숫점3번째 자리까지 표시해라
		System.out.printf("3-C. %08.3f\n", myDouble);
			//D. 실수를 과학표기법으로 표기해라
		System.out.printf("3-D. %e\n", myDouble);
		
		//4. 문자열
		String string1 = "aBcDeF";
			//A. 문자열을 그대로 표시해라
		System.out.printf("4-A. %s\n", string1);
			//B. 문자열을 모두 다 대문자로 표시해라
		System.out.printf("4-B. %S\n", string1);
		
		
		//printf를 사용할 때 주의할 점
		//1. 데이터 타입이 틀리면 에러
		//System.out.printf("1. %d\n", 3.141592);
		
		//2. %문자를 잘못 적었을 경우에는 부정확한 값 출력
		//System.out.printf("2. %h\n", 3.141592);
		
		//3. %문자의 갯수가 값의 갯수보다 많으면 에러. 반대는 괜찮음
		//System.out.printf("3. %d %d %d \n", 1, 2);
		
		
		
	}

}
