package org.comstudy.ch03;

public class Ch03Ex01 {

	public Ch03Ex01() {
		// test();
		// odd1();
		// odd2();
		// odd3();
		// test1();
		// test1_SampleAnswer();
//		test2(); // 피보나치 수열
		 test3();// 피보나치 수열 응용

	}

	private void test3() { // 피보나치 수열 응용 . 과제
		// 1 + 1 - 2 + 3 - 5 + 8 - 13 + 21 = 14
		int sum = 0;
		int total = 0;
		int size = 8;
		int[] num = new int[size + 3]; // num[0], num[1], num[2]  
		num[0] = 0;  // 배열의 맨 앞자리 비우기 싫어서 였는데 필요 없네

		for (int i = 1; i <= size; i++) {
			if(i==1) {
				num[i] = 1;
				num[i+1] = num[i] + num[i-1];
				total = num[i] + num[i+1];
				System.out.print(num[i]+" + "+num[i+1]);
			}
			num[i+2] = num[i] + num[i+1];			
			
			if(i>=3 && i%2==1) {
				System.out.print(" - "+num[i]);
				total = total - num[i];
						
			} 
			if (i>3 && i%2==0) {
				System.out.print(" + " + num[i]);
				total = total + num[i];
			}
			if (i==size) {
				System.out.print(" = ");
			}			
		}		
		System.out.println(total);
	}

	private void test2() { // 피보나치 수열
		// 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 = 54
		int sum = 0;
		int temp = 0, temp2 = 0;
		int total = 0;
		int size = 8;
		int[] num = new int[size + 3]; // num[0], num[1], num[2]  
		num[0] = 0;

		for (int i = 1; i <= size; i++) {
			if(i==1) {
				num[i] = 1;
				num[i+1] = num[i] + num[i-1];
			}
			num[i+2] = num[i] + num[i+1];			
			if(i!=size){
				System.out.print(num[i] + " + ");
			}else {
				System.out.print(num[i] + " = ");
			}
			total = total + num[i];
		}		
		System.out.println(total);
		

	}

	private void test1_SampleAnswer() {
		// 1 + 2 - 3 + 4 - 5 + 6 - 7 + 8 - 9 + 10 = 7

		int total = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.print(i);

			// 부호출력
			if (i % 2 == 1) { // 홀수
				System.out.print(" + ");
			} else { // 짝수
				System.out.print(i == 10 ? " = " : " - ");
			}

			int change = 1;
			if (i >= 2) {
				change = ((i % 2 == 0) ? i : -i);
			}
			total = total + change;
		}
		System.out.println(total);

	} // method end

	private void test1() { // 구현은 되지만 뭔가 맘에 안듬. 답을 위한 코딩.... 지저분
		// 1 + 2 - 3 + 4 - 5 + 6 - 7 + 8 - 9 + 10 = 7
		int sum = 1;
		System.out.print(1 + " + ");
		for (int i = 2; i <= 10; i++) {
			System.out.print(i);

			if (i != 10) {
				System.out.print((i % 2 == 0 && i <= 9) ? " + " : " - ");
			}
			if (i == 10) {
				System.out.print(" = ");
			}
			int change = (i % 2 == 0) ? i : -i;
			sum = sum + change;
		}
		System.out.print(sum);
		// 아름답지 못함. 복잡함
		// int sum = 1 + 2 ;
		// for (int i=1, j=2 ; i<=5 && j<=10 ;i+=2,j+=2 ) {
		// System.out.print(i);
		// System.out.print(j);
		// System.out.println((i==9 && j==10)?" = " : " + ");
		// sum = sum + ( -i + j);
		// }
	} // end of test1()

	private void odd3() {
		// 2 + 4 + 6 + 8 + 10 + 12 + 14 = 56
		int i = 2;
		int sum = 0;
		while (i <= 14) {
			System.out.print(i);
			System.out.print(((i == 14) ? " = " : " + "));
			sum = sum + i;
			i += 2;

		}
		System.out.println(sum);
	}

	private void odd2() {
		// 1 + 3 + 5 + 7 + 9 + 11 + 13 = 49
		// 2 + 4 + 6 + 8 + 10 + 12 + 14 = 56
		int sum = 0;
		for (int i = 2; i <= 14; i += 2) {
			System.out.print(i);
			System.out.print((i == 14) ? " = " : " + ");
			sum = sum + i;
		}
		System.out.println(sum);

	} // end of odd2

	public void odd1() {
		// 1 + 3 + 5 + 7 + 9 + 11 + 13 = 49
		int sum = 0;
		for (int i = 0; i <= 6; i++) {
			System.out.print((2 * i + 1));
			System.out.print(((2 * i + 1) == 13) ? "=" : "+");

			sum += ((2 * i) + 1);
			// System.out.println(sum);
		}
		System.out.print(sum);

	} // end of odd1

	public void test() {
		// 누적을하기 위한 변수 선언 - 반복문 밖에 선언 후 초기화한다
		// 지역변수는 초기화 하지 않으면 알 수 없는 값이 들어간다.
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
			System.out.print(i);

			// 부호를 붙여본다

			// 2. 삼항연산자 이용
			System.out.print((i == 10) ? "=" : "+");
			// 1. 기본적인 if else
			// if(i == 10) {
			// System.out.print(" = ");
			//
			// }else {
			// System.out.print("+");
			// }

		}
		System.out.print(sum);
	} // end of test

	public static void main(String[] args) {
		new Ch03Ex01();

	} // end of main

} // end of class
