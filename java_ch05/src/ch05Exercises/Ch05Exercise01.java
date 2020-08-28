package ch05Exercises;
class A {
	private int a;
	public void set(int a) {
		this.a = a;
	}	
}
class B extends A {	
	protected int b, c;
}
class C extends B {	
	public int d, e;
}
class D extends C {
	public void f() {
		a = 1;
		set(10);
		b = 20;
		d = 30;
	}
}
public class Ch05Exercise01 {
	public static void main(String[] args) {
		A objA = new A(); // a는 prviate이라 A 클래스 내에서만 접근 가능. 그러니까 setter가 존재하는 거지								
		B objB = new B(); // objB는 클래스 A를 상속받는 클래스  B의 instance이지만, 부모 클래스의 private 멤버인 a에 접근 불가.
			objB.b = 10;  // 클래스 B의 b,c는 protected 접근 제한자가 붙어 있으므로, 같은 패키지 내에 있는 다른 클래스나 / 이를 상속한 클래스들은 접근 가능
						// a b c
		C objC = new C(); // a b c d e
			objC.b = 12;
			objC.c = 16;
			objC.d = 17;
			objC.e = 27;
	}	
}
