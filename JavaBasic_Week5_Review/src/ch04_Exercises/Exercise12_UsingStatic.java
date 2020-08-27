package ch04_Exercises;

class StaticSample {
	public int x;
	public static int y;
	public static int f() { return y;}
}

public class Exercise12_UsingStatic {
	public static void main(String[] args) {
		StaticSample.x = 5;
		StaticSample.y = 10;
		int tmp = StaticSample.f();
		StaticSample a = new StaticSample();
		tmp = a.y;
		
	}
}
