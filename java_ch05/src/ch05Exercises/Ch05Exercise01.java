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
		A objA = new A(); // a�� prviate�̶� A Ŭ���� �������� ���� ����. �׷��ϱ� setter�� �����ϴ� ����								
		B objB = new B(); // objB�� Ŭ���� A�� ��ӹ޴� Ŭ����  B�� instance������, �θ� Ŭ������ private ����� a�� ���� �Ұ�.
			objB.b = 10;  // Ŭ���� B�� b,c�� protected ���� �����ڰ� �پ� �����Ƿ�, ���� ��Ű�� ���� �ִ� �ٸ� Ŭ������ / �̸� ����� Ŭ�������� ���� ����
						// a b c
		C objC = new C(); // a b c d e
			objC.b = 12;
			objC.c = 16;
			objC.d = 17;
			objC.e = 27;
	}	
}
