package homework2_2;

import java.util.Scanner;

public class Practices {
int mean;
	Scanner scan = new Scanner(System.in); 	Scanner scan2 = new Scanner(System.in); Scanner scan3 = new Scanner(System.in);
	Scanner scan4 = new Scanner(System.in); Scanner scan5 = new Scanner(System.in); Scanner scan6 = new Scanner(System.in);
	Scanner scan7 = new Scanner(System.in); Scanner scan8 = new Scanner(System.in); Scanner scan9 = new Scanner(System.in);
	Scanner scan10 = new Scanner(System.in); Scanner scan11 = new Scanner(System.in); Scanner scan12 = new Scanner(System.in);
	
	public Practices() {
//		exchange();  // 1번
//		digitComparison();  // 2번
//		breakingMoney();  // 3번
//		mean();  / 4번
//		validateTri(); // 5번
//		game369(); // 6번
//		inRect(); //7번
//		System.out.println(crashRect()); // 8번
//		inCir(); // 9번
//		crashCir(); //10번
//		seasonMonthIf(); // 11-1번
//		seasonMonthSwitch(); //11-2번
//		operationsIf(); // 12-1번
		operationsSwitch(); // 12-2번
	}
	
	// 실전문제 1번
	public void exchange() {
		System.out.print("원화를 입력하세요(단위 원)>>> ");
		int won = scan.nextInt();
		double dollar = (won / 1100);
		System.out.println(won + "은 $" + dollar + "입니다");
	}

	// 실전문제 2번
	public void digitComparison() {
		System.out.print("2자리수의 정수 입력 (10~99) >>> ");
		int num, tens, ones, temp1, temp2;
		num = scan2.nextInt();
		tens = num / 10;
		ones = num % 10;
		if (tens == ones) {
			System.out.println("Yes! Great! 10의 자리와 1의 자리가 같습니다"); // 시분초 계산 / 2진법 / 10진법 다 동일한 방식
		} else {
			System.out.println("Yes! Great! 10의 자리와 1의 자리가 같습니다"); // /와 % 연산자가 괜히 만들어진게 아니겠지. 수학임
		}

	}

	// 실전문제 3번
	public void breakingMoney() {
		System.out.print("금액을 입력하시오 >>> ");

		int mount = scan3.nextInt();
		int 오만원권, 만원권, 천원권, 백원, 오십원, 십원, 일원;

		오만원권 = mount / 50000;
		만원권 = (mount % 50000) / 10000;
		천원권 = ((mount % 50000) % 10000) / 1000;
		백원 = (((mount % 50000) % 10000) % 1000) / 100;
		오십원 = ((((mount % 50000) % 10000) % 1000) % 100) / 50;
		십원 = (((((mount % 50000) % 10000) % 1000) % 100) % 50) / 10;
		일원 = (((((mount % 50000) % 10000) % 1000) % 100) % 50) % 10;

		System.out.println("오만원권 " + 오만원권 + "매");
		System.out.println("만원권 " + 만원권 + "매");
		System.out.println("천원권 " + 천원권 + "매");
		System.out.println("백원 " + 백원 + "개");
		System.out.println("오십원 " + 오십원 + "개");
		System.out.println("십원 " + 십원 + "개");
		System.out.println("일원 " + 일원 + "개");

	}

	// 실전문제 4번
	public void mean() {
		int num1, num2, num3, mean;
		System.out.print("정수 3개를 입력 >>> ");
		num1 = scan4.nextInt();
		num2 = scan4.nextInt();
		num3 = scan4.nextInt();

		// switch로 못할려나

		while (true) {
			if ((num1 > num2) && (num2 > num3)) {
				mean = num2; // 음 이 안에서 초기화된 변수는 밖으로 못나오나봐
				System.out.println("중간 값은 " + num2);
				break;
			} else if ((num2 < num1) && num2 < num3) {
				if (num1 < num3) {
					mean = num1; // 음 이 안에서 초기화된 변수는 밖으로 못나오나봐
					System.out.println("중간 값은 " + num1);
					break;
				} else if (num1 > num3) {
					mean = num3; // 음 이 안에서 초기화된 변수는 밖으로 못나오나봐
					System.out.println("중간 값은 " + num3);
					break;
				}
			}
		}
	} // mean() end
		
	
	
	// 실전문제 5번
	// 뭔가 더 심플하고 아름다운 방법이 있을 것 같은 느낌이 든다

	public void validateTri() {
		int leg1, leg2, leg3, leg12, leg23, leg31;
		System.out.print("삼각형의 각 변의 길이인 정수 3개를 입력하시오 >> ");
		leg1 = scan5.nextInt();
		leg2 = scan5.nextInt();
		leg3 = scan5.nextInt();
		leg12 = leg1 + leg2;
		leg23 = leg2 + leg3;
		leg31 = leg3 + leg1;

		if ((leg12 > leg3) && (leg23 > leg1) && (leg31 > leg2)) {
			System.out.println("삼각형이 됩니다");
		} else {
			System.out.println("글쎄... 뭘까? 수학공부하자 코더로 남기 싫으면");
		}
	}

	
	// 실전문제 6번
	// 3의 배수만 구하는 문제가 아님....
	public void game369() {
		// 십의 자리의 숫자 구하는 방법 : xy / 10 => x
		// 일의 자리의 숫자 구하는 방법 : xy % 10 => y
		// x가 3의 배수(369)인지 확인하는 방법 => x % 3 == 0
		// y가 3의 배수(369)인지 확인하는 방법 => y % 3 == 0
		// 그런데 (0%3)도 0이지..... 10에서 박수쳐가 나오면 안됨
		// 따라서 두자리 수인지 한자리 수인지 정확하게 규정해주자
		// (x!=0)&&(y!=0) 두자리 수 이면서 0 없음 (십의 자리 당연) 일의 자리 0인 애는 else로 빠지겠지
		// (x==0)&&(y!=0) 한자리 수이면서 일의 자리가 0은 아닌애들. 0은 else로 빠짐

		System.out.print("1~99 사이의 정수를 입력하시오 >> ");
		int num = scan6.nextInt();
		// 십의 자리의 수
		int x = num / 10;
		// 일의 자리의 수
		int y = num % 10;

		if ((x != 0) && (y != 0) && (x % 3 == 0) && (y % 3 == 0)) { // 두자리 이면서, 두 자리 모두 369중 하나에 해당
			System.out.println("박수짝짝");
		} else if ((x == 0) && (y != 0) && (x % 3 != 0) && (y % 3 == 0)) { // 십의 자리는 0이고, 일의 자리 3 6 9 세 개만 해당
			System.out.println("박수짝");
		} else if ((x != 0) && (y != 0) && (x % 3 == 0) && (y % 3 != 0)) { // 두 자릿수 이면서 십의 자리만 369.
			System.out.println("박수짝"); // 약간 과도하게 조건 걸은 것 처럼 보이나, 오류보다는 낫지.
		} else if ((x != 0) && (y != 0) && (x % 3 != 0) && (y % 3 == 0)) { // 두 자리 수이면서 일의 자리만 369
			System.out.println("박수짝");
		} else {
			System.out.println("빵");
		}

	}// game369() 종료
	
	
	
	// 실전문제 7번

	public void inRect() {
		System.out.print("점 (x,y)의 좌표를 입력하시오 >> ");
		int x = scan7.nextInt();
		int y = scan7.nextInt();

		if (100 <= x && x <= 200) {
			if (100 <= y && y <= 200) {
				System.out.printf("(%d,%d)는 사각형 안에 있습니다", x, y);
			} else {
				System.out.printf("(%d,%d)는 사각형 밖에 있습니다", x, y);
			}
		} else {
			System.out.printf("(%d,%d)는 사각형 밖에 있습니다", x, y);
		}

	} // validateRec end
		
	
	
	// 실전문제 8번

	// (x1,y1) (x2,y2) 라는 직사각형과 (100, 100)
	// (200,200)이라는 직사각형이
	// 서로 충돌하는 지 확인하는 프로그램인듯
	// x축 상에서는 완전 동일한 좌표에 y축 좌표가 겹치지 않으면 전혀 충돌 x
	// 마찬가지로 y축 좌표가 있어도 x축이 전혀 다르면 문제 x
	// 와 수학적 사고 많이 필요하네. 이거 개발을 위한 예행연습이 확실하네. 그래서 실전인가
	public boolean crashRect() {
		int x1, y1, x2, y2;
		System.out.print("첫 번째 점(x1,y1)의 좌표를 입력하시오");
		x1 = scan7.nextInt();
		y1 = scan7.nextInt();

		System.out.print("두 번째 점(x2,y2)의 좌표를 입력하시오");
		x2 = scan7.nextInt();
		y2 = scan7.nextInt();

		if ((x1 >= 100 && x1 <= 200) && ((y1 >= 100 && y1 <= 200))
				|| (x2 >= 100 && x2 <= 200) && ((y2 >= 100 && y2 <= 200))) {
			return true;
		} else {
			return false;
		}

	}

	// 실전문제 9번
	public void inCir() {
		double cx, cy, x, y, r, xcxPow, ycyPow, dPow;
		float d;

		System.out.print("원의 중심과 반지름 입력 >> ");
		cx = scan9.nextDouble();
		cy = scan9.nextDouble();
		r = scan9.nextDouble();

		System.out.print("점 입력 >> ");
		x = scan9.nextDouble();
		y = scan9.nextDouble();

		// 중심과 점(x,y)사이의 거리가 반지름 r보다 작으면 안에 있는거래!!
		// 원의 중심과 점(x,y)사이의 거리는 피타고라스 정리 써먹어야지
		// 제곱 및 제곱근 구하는 메소드 오늘 둘 다 첨 써보는구나!!

		xcxPow = Math.pow((x - cx), 2); // x축 두 점 사이의 거리의 제곱
		System.out.println(xcxPow);

		ycyPow = Math.pow((y - cy), 2); // y축 두 점 사이의 거리의 제곱
		System.out.println(ycyPow);

		dPow = xcxPow + ycyPow;
		d = (float) Math.sqrt(dPow); // 두 점 사이의 거리
		System.out.println(d);

		if (d <= r) {
			System.out.printf("점(" + x + ", " + y + ")는 원 안에 있다."); // printf 포멧 때문에 오류 나는데 귀찮아서 생략
		} else {
			System.out.println("원 밖이에요");
		}
	} // inCir() end

	
	// 실전문제 10번
	// 두 원의 중심 사이의 거리가 두 원의 반지름의 합보다 크면 서로 겹치지 않는거지
	public void crashCir() {
		double x1, y1, x2, y2, r1, r2, r3, x2x1Pow, y2y1Pow, dPow;
		float d;

		System.out.print("첫 번째 원의 중심과 반지름 입력 >>");
		x1 = scan10.nextDouble();
		y1 = scan10.nextDouble();
		r1 = scan10.nextDouble();
		System.out.print("두 번째 원의 중심과 반지름 입력 >>");
		x2 = scan10.nextDouble();
		y2 = scan10.nextDouble();
		r2 = scan10.nextDouble();

		// 거리 비교
		x2x1Pow = Math.pow(x2 - x1, 2);
		y2y1Pow = Math.pow(y2 - y1, 2);
		dPow = x2x1Pow + y2y1Pow;
		d = (float) Math.sqrt(dPow); // 두 원 사이의 거리
		r3 = r1 + r2; // 두 원의 반지름의 합

		if (d <= r3) {
			System.out.println("두 원은 서로 겹친다");
		} else {
			System.out.println("안겹침. 남남임");
		}

	} // crashCir end

	// 실전문제 11-1번
	public void seasonMonthIf() {
		System.out.print("달을 입력하세요(1~12) >> ");
		int input = scan11.nextInt();

		if (3 <= input && input <= 5) {
			System.out.println("봄");
		} else if (6 <= input && input <= 8) {
			System.out.println("여름");
		} else if (9 <= input && input <= 11) {
			System.out.println("가을");
		} else if ((input == 12) || (input == 1) || (input == 2)) {
			System.out.println("겨울");
		} else {
			System.out.println("잘못입력");
		}
	} // seasonMonthIf() end
		
	
	// 실전문제 11-2번

	public void seasonMonthSwitch() {
		System.out.print("달을 입력하세요(1~12) >> ");
		int input = scan11.nextInt();

		switch (input) {
		case 3: case 4: case 5:
			System.out.println("봄"); break;
		case 6: case 7: case 8:
			System.out.println("여름"); break;
		case 9: case 10: case 11:
			System.out.println("가을"); 	break;
		case 12: case 1: case 2:
			System.out.println("겨울"); 	break;
		default:
			System.out.println("잘못입력"); break;
		}
	} // seasonMonthSwitch() end

	// 실전문제 12번 -1
	public void operationsIf() {
		double num1, num2;
		String operator;

		System.out.print("연산>> ");
		num1 = scan12.nextInt();
		operator = scan12.next();
		num2 = scan12.nextInt();

		if (operator.equals("+")) {
			System.out.printf("%f+%f의 계산 결과는 %f", num1, num2, (num1 + num2));
		} else if (operator.equals("-")) {
			System.out.printf("%f-%f의 계산 결과는 %f", num1, num2, (num1 - num2));
		} else if (operator.equals("*")) {
			System.out.printf("%f*%f의 계산 결과는 %f", num1, num2, (num1 * num2));
		} else if (operator.equals("/")) {
			if (num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다");
			} else
				System.out.printf("%f/%f의 계산 결과는 %f", num1, num2, (num1 / num2));
		} else {
			System.out.println("잘못 입력하였습니다.");
		}
	}

	// 실전문제 12번 -2
	public void operationsSwitch() {
		double num1, num2;
		String operator;

		System.out.print("연산>> ");
		num1 = scan12.nextInt();
		operator = scan12.next();
		num2 = scan12.nextInt();

		// switch는 if else랑 약간 다른방식으로 접근해야. 연구 필요
		switch (operator) { // switch expression은 double을 못 받는군...
		case "+": 
			System.out.printf("%f+%f의 계산 결과는 %f", num1, num2, (num1 + num2));
			break;
		case "-":
			System.out.printf("%f-%f의 계산 결과는 %f", num1, num2, (num1 - num2));
			break;
		case "*":
			System.out.printf("%f*%f의 계산 결과는 %f", num1, num2, (num1 * num2));
			break;
		case "/":
			if(num2 == 0) { // 여기가 살짝 고민
			System.out.println("0으로 나눌 수 없습니다");
			break;
			} else {
				System.out.printf("%f/%f의 계산 결과는 %f", num1, num2, ((num1 / num2)));
				break;
			}
		default:
			break;
		}
	} // operationsSwitch end

	public static void main(String[] args) {
	new Practices();		
	}
	
}
