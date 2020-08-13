// written on Aug 12 2020
//package homework2_2;
//
//import java.util.Scanner;
//
////public class Exercises {
////	1. class

//	2. 
//	(1) 계산과 같은 함수를 실행하려면 메소드 안에서 실행해야 하는데 필드만 입력 가능한 곳에서 실행하려 함

//	public class SampleProgram { 
//		int i; int j; 
//		public void sum() { 
//			i = 10; j = 20;  // 할당부터는 함수안에서만 가능
////			System.out.println(i+j); 
////			} 
//		}

//	(2) sample.java
//
//	(3) javac -SampleProgram.java
//
//	(4) java SmapleProgram

	
//	3.

//	﻿int _i; 
//	int %j; => %는 변수명으로 합당하지 않은 특수문자 
//	char 안녕; 
     => 잘못된 거 아님. 변수 이름이나까
//	double 1var; => 변수명 첫글자로 숫자 안됨 
//	char student_ID; 
//	final int abcdefghijklmnopqrstuvwxyz; 
    		 => final이므로 초기값 주어야하고 대문자로 변수 이름 
	
//	4.

//	﻿(1) int height; 
//	(2) double size = 0.25; 
//	(3) double total = height + size; 
//	(4) char c = 'a' 
//	(5) String name = "Jack"
	
//	5.

//	(﻿1) double 79.8  
//	System.out.println(67+12.8); 
//	double x = 67+12.8; 
//
//	(2)  int 3
//	System.out.println(10/3); 
//	
//	(3) int y = 10/3; 3. 3.3333333333333335    
   => 자바에서는 정수와 실수 계산하면 자동 실수로 변함
//	double System.out.println(10.0/3); double z = 10.0/3; 
//
//	(4) false boolean
	
//	6.
//	﻿final double BODYTEMP = 36.5;
	
//	7.
//
//	﻿(1) while(1) {} =====> while(true) 
//
//	(2) int n = 3.5; =====> double n 3.5; 
//
//	(3) int b = (3<5)?true:false; ======> boolean b = (3<5)?true:false; 
//
//	(4) int score = 85; if(80 < score < 90) System.out.print(score); 
//	===> int score = 85; if(80 < score || score < 90) System.out.print(score);
	​

//	8.
//
//	﻿int age; 
//	(1) age <= 12; 
//	(2) age< b && age > c; 
//	(3) age - 5 == 10; 
//	(4) age !=b || age == c;
	
//	9.
//
//	﻿int result = (sum > 100) ? 100 : 0; // 삼항연산자 사용했으나 sum 두 개 중복은 어쩌란 건지 
	=> 변수 다른거 써 
	   삼항 연산자의 우선순위가 늦으므로 괄호 안해줘도 됨
	
	
//	10. 
//	﻿boolean (n>5) ? System.out.println(n) : System.out.println(5);
	=>System.out.println((n>5) ? n : 5)
//	
//	
//	11.
//	﻿String text = "\" 를 출력하려면 \\ 다음에 \" 를 붙여 \\\" 과 같이 하면 됩니다.";
//	
//	12.	
//	나는 "Java를 100%"사랑해

	​

//	13.
	=> switch문은 break가 없으면 다음 연산까지 누적시켜줌
//
//	(1) 100
	=> 190   A구하지만 아래까지 쫙 다 내려가서 답이 더해짐
//	(2) 50
	=>  90
///	(3) 30
    => 40
//	(4) 0
//
//	​
//
//	​
//
//	​
//
//	14. 
//
//	switch (in)	{  
//	// switch의 괄호 안에 들어가는 String은 마치 String.equals() 함수처럼 작동되므로 
//	//굳이 in.equals()를 넣지 마라. 되지도 않음
//		case SCISSORS : System.out.println(1); break;					
//		
//		case ROCK : System.out.println(2); break;
//			
//		case PAPER : System.out.println(3); break;
//			
//		default : System.out.println(0); break;
//		}
	​

	​

	
}
