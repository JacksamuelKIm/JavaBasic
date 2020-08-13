package org.comstudy21.homework;
//written on Aug 13 2020
import java.util.Scanner;
import static java.lang.System.out;

import java.io.IOException;

public class Ch02Homework {
	private  Scanner scan = new Scanner(System.in);
	// 한 함수 안에서 next()와 nextLine()을 같이 쓸 때만 충돌 일어나니
	//Scanner 객체를 따로 만들어 주라는 거지 그 경우 이외에는 하나만 만들어 쓰면 된다. 
	// 원래는 각 메소드 안에 scanner 불러주고 scanner.close()로 닫아줘야 함
	public Ch02Homework() {
//		ex01();
//		ex02();
//		ex03();
//		ex04();
//		ex04_2();
//		ex05();
//		ex06();
//		ex06_2();
//		ex06_selfReCoding(); // 다른 방법으로 코딩해보기
		ex07();
		
	}
	
	int getNum() {
		int num = 0;
		
		try {
			int ch=0;
			while((ch=System.in.read())!='\n') { //엔터가 들어올 때까지 계속 돌아가도록 조건 정함
				 System.out.print(ch);
			    if('0'<=ch && ch<='9') { // 숫자인 경우에만
			    	num = num*10 + ch-'0';   // \n => LF => ascii에서 10임 // enter(Carriage Return) = >13 
			    	//             ch(의도한 수 + 48 / System.in.read()의 값은 int로 돌아옴)-48
			    } // System.in으로 받으면 int말고도 받을 수 있어 오류 안난다
				
			}
		} catch (IOException e) {} // 다른 이상한 애들 입력받을 수 있으니까?
		
		return num;
	}
	
	private void ex07() {
		int x1=100, y1=100, x2=200, y2=200 ;
		out.print("점 (x,y)의 x 좌표를 입력하시오 >> ");
		int x = getNum();
		out.print("점 (x,y)의 y 좌표를 입력하시오 >> ");
		int y = getNum();
		
		out.print("(" + x +", " + y +")");
		if((x1<=x&&x<=x2) && (y1<=y&&y<=y2)) {
			out.println("는 사각형 안에 있습니다.");
		}else 
			out.println("는 사각형 안에 없습니다.");
	}



	private void ex06_2() {
		out.print("2자리수 정수 입력 (10~99) >>> "); // 이렇게 제한을 해줘야 깔끔!!
		int num = scan.nextInt();
		while(num<1 || num > 99) {
			out.println("2자리 정수만 입력하세요");
			out.print("2자리수 정수 입력 (10~99) >>> ");
			num = scan.nextInt();
		}
		int n1 = num/10; // 10의 자리
		int n2 = num%10; // 1의 자리
		int cnt = 0; // count 박수 횟수
		
		if(n2!=0 && n2%3==0) {
			cnt++;
		}
		if(n1!=0 && n1%3 == 0) {
			cnt++;
		}		
		if(cnt>0) {
			out.println("박수");
			for(int i=0; i<cnt; i++) { // 야 이건 생각 못했다
				out.print("짝");
			}
		}
		
	}



	private void ex06() {
		scan = new Scanner(System.in);
		
		out.print("2자리수 정수 입력 (10~99) >>> "); // 이렇게 제한을 해줘야 깔끔!!
		int num = scan.nextInt();
		while(num<1 || num > 99) {
			out.println("2자리 정수만 입력하세요");
			out.print("2자리수 정수 입력 (10~99) >>> ");
			num = scan.nextInt();
		}
		int n1 = num/10; // 10의 자리
		int n2 = num%10; // 1의 자리
		// 3의 배수를 찾는다.
		if((n1!=0 && n1%3==0) || (n2!=0 && n2%3 ==0)) { 
			out.print("박수"); // 첫번째 if를 통과하면서 10의 자리든 1의 자리든 3의 배수 있는 애들은 통과
			  				  // 1의 자리이든 10의 자리이든 3의 배수가  있다는 소리니까
		}		
		if(n2!=0 && n2%3==0) { // 그 통과한 애들중  1의 자리에 3의 배수가 있으면 짝을 붙여줌 
			out.print("짝");   // 10의 자리에만 3의 배수가 있는 애들은 그냥 지나감
		}
		if(n1!=0 && n1%3 == 0) { // 이미 1의 자리에 짝이 있는 애들 중
			out.print("짝"); // 10의 자리에도 있으면 짝을 하나 더 붙여줘서 박수짝짝 됨
		}
	}



	private void ex06_selfReCoding() {
		scan = new Scanner(System.in);
		int input = scan.nextInt();
		int x = input / 10; // 십의 자리 수 구하기 
		int y = input % 10;// 일의 자리 수 구하기
		
		// 3의 배수를 깔끔하게 구현하기가 아름다운 코드의 핵심인 듯!
		// 0이 아니면서 3으로 나누면 나머지가 없음. x!=0, x % 3 == 0;
		// 0이 아니면서 3으로 나누면 나머지가 없음. y!=0, y % 3 == 0;
		
		// 0 인 애들은 어떻게 할껀데? else로 보내야지
		// 문제는 00 이것은 아예 성립하지가 않음. 입력이 1~99 사이에 오도록 해야
		// y != 0, 0y 인 애들은 단순하게 y%3==0을 구함
		// 
		
		
		scan.close();
		
	}



	private void ex05() {
		scan = new Scanner(System.in);
		
		out.print("정수 3개를 입력 >>> ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if(a+b>c && a+c>b && b+c>a) {
			out.println("삼각형이 됩니다");
		} else {
			out.println("삼각형을 만들 수 없습니다");
		}
		
		scan.close();
		
	}



	private void ex04_2() {
		scan = new Scanner(System.in);
		
		out.print("정수 3개 입력 >>> ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int max=0, mid=0, min=0;
		
		if(a>b) {
			max = a;
			min = b;
		}else {
			max = b;
			min = a;
		}
		out.println("큰 값은 " + max);
//		out.println("중간 값은 " + mid);
		out.println("작은 값은 " + min);
		
		if(c>max){
			mid = max;
			max = c;
		} else {
			if(c<min) {
				mid = min;
				min = c;
			} else {
				mid = c;
			}
		}
		out.println("큰 값은 " + max);
		out.println("중간 값은 " + mid);
		out.println("작은 값은 " + min);
		
	}



	private void ex04() {
		scan = new Scanner(System.in);
		
		out.print("정수 3개 입력 >>> ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int max, min;
		max = (a>b) ? a : b;
		max = (c>max) ? c : max ;
		min = a<b ? a : b;
		min = c<min ? c: min;
		
		int mid = 0;
		if(a<max && a>min) mid = a;
		if(b<max && b>min) mid = b;
		if(c<max && c>min) mid = c;
		out.println("중간 값은 " + mid);
	}



	private void ex03() { //이거 반복문으로도 할 수 있데!!!
		scan = new Scanner(System.in);
		
		out.print("금액을 입력하시오 >>> ");
		int money = scan.nextInt();
		out.printf("오만원권 %d매\n", money/50000);
		money = money % 50000;
		out.printf("만원권 %d매\n", money/10000);
		money = money % 10000;
		out.printf("천원권 %d매\n", money/1000);
		money = money % 10000;
		out.printf("백원 %개\n", money/100);
		money = money % 100;
		out.printf("오십원 %d개\n", money/50);
		money = money % 50;
		out.printf("십원 %d개\n", money/10);
		money = money % 10;
		out.printf("일원 %d개\n", money);
		
		scan.close();
	}



	private void ex02() {
		scan = new Scanner(System.in);
		
		out.print("2자리수 정수 입력 (10~99) >>> ");
		int num = scan.nextInt();
		while(num<10 || num>99) {
			out.println("2자리 정수만 입력하세요");
			out.print("2자리수 정수 입력 (10~99) >>> ");
			num = scan.nextInt();
		}
		int n1 = num/10;
		int n2 = num%10;
		if(n1==n2) {
			out.println("Yes! 10의 자리와 1의 자리가 같습니다");
		} else {
			out.println("No! 10의 자리와 1의 자리가 같지 않습니다");
		}
		
		scan.close();
	}



	private void ex01() {
		scan = new Scanner(System.in);
		
		System.out.print("원화를 입력하세요(단위 원)>>");
		int won = scan.nextInt();
		double $ = (won / 1100);
		System.out.printf("%d원은 $%.1f입니다", won, $);
		
		scan.close(); // 이게 원칙
		
	}



	public static void main(String[] args) {
		new Ch02Homework();

	}

}
