package ch04_Practices;
import java.util.Scanner;

class Add {
	int a, b;	
	void setValue(int a, int b) {
		this.a = a; this.b=b;				
	}	
	int calculate() {
		int result = 0;
		result = a + b;		
		return result;
	}	
}

class Sub {
	int a, b;	
	void setValue(int a, int b) {
		this.a = a; this.b=b;				
	}	
	int calculate() {
		int result = 0;
		result = a - b;
		return result;
	}	
}

class Mul {
	int a, b;	
	void setValue(int a, int b) {
		this.a = a; this.b=b;				
	}	
	int calculate() {
		int result = 0;
		result = a*b;
		return result;
	}
	
}

class Div {
	int a, b;
	
	void setValue(int a, int b) {
		this.a = a; this.b=b;				
	}
	
	int calculate() {
		int result = 0;
		if(b!=0) {
			result = a/b; // 음 이게 맞나?
			return result;
		}
		System.out.println("0으로 나눌 수 없습니다.");
		return result;
	}
	
}

public class Practice11 {	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오 >> ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String operator = scanner.next();
		
		switch (operator) {
		case "+": 
			Add add = new Add();
			add.setValue(a, b);
			System.out.println(add.calculate());
			;break;
		case "-": 
			Sub sub = new Sub();
			sub.setValue(a, b);
			System.out.println(sub.calculate());
			;break;
		case "*": 
			Mul mul = new Mul();
			mul.setValue(a, b);
			System.out.println(mul.calculate());
			;break;
		case "/": 
			Div div = new Div();
			div.setValue(a, b);
			System.out.println(div.calculate());
			;break;			
		}
	}

}


	
