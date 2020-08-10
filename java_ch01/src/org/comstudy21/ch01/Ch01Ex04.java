package org.comstudy21.ch01;

import java.io.IOException;

public class Ch01Ex04 {
	public static void main(String[] args) throws IOException {
		System.out.print("정수 입력 >>> ");
		int number = System.in.read(); 
		
//		System.out.println("입력 값 => " + (char) number); // 키보드로 입력하면 ascii 값이 들어가기 때문에 답이 이상함
														// char로 casting하면 되지면 여전히 아스키임....
		
//		System.out.println("입력 값 => " + number - 0); // 그냥 이대로 실행하면 "입력 값 =>" 이라는 문자열과 number가 합쳐져서 새 문자열이 됨. 당연히 오류
													 // 괄호쳐서 number와 0을 묶어주어야

		if(number >= '0' && number <= '9') { // '' 넣어주는 거랑 안 넣는 거랑 어떤 차이인지 고민해보자!!!!!!!!!
			number = number -'0';
			System.out.println("입력 받은 숫자 * 100 => " + number * 100);
		} else {
			System.out.println("입력 받은 문자 => " + (char) number);
		}
		
		
	} // main end

} //class end
