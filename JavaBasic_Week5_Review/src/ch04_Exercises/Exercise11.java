package ch04_Exercises;

public class Exercise11 {
	
}

class StaticTest {
	static int a;
	static int getA() { return a;}
	int b;
	int getB() { return b;}
	int f() {return getA(); }
	static int g() {return getB();}
}