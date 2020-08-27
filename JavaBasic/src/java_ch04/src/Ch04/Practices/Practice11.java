package Ch04.Practices;

import java.util.Scanner;

class Add {
	int a,b;
	void setValue(int a, int b) {
		this.a = a; this.b =b;
	}
	
	int calculate() {
		int result = 0;
		result = a + b; 
		return result;
	}
		
}

class Sub {
	int a,b;
	void setValue(int a, int b) {
		this.a = a; this.b =b;
	}
	int calculate() {
		int result = 0;
		result = a - b;
		return result;
	}
}

class Mul {
	int a,b;
	void setValue(int a, int b) {
		this.a = a; this.b =b;
	}
	int calculate() {
		int result = 0;
		result = a*b;
		return result;
	}
}

class Div {
	int a,b;
	void setValue(int a, int b) {
		this.a = a; this.b =b;
	}
	int calculate() {
		int result = 0;
		
		if(b!=0) {
			result = a/b + a%b;
		}		
		return result;
	}
}


public class Practice11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오 >> ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		String operator = scan.next();
		
		switch (operator){
		case "+" : ;break;
		case "-" : ;break;
		case "*" : ;break;
		case "/" : ;break;
		
		}
		
		
	}
	
}
