package day02;
/*  자바의 3가지 콘솔 출력방법
 *  자바에서는 콘솔에 출력하는 방법을 3가지 지원해주고 있는데
 *  print, printf, println이다.
 *  print: 괄호안의 내용을 출력하고 다음 출력위치는 다음칸
 *  printf:괄호안의 내용을 출력할 떄 형식을 맞춰줄 수 있다. 다음 출력위치는 다음칸
 *  println: 괄호안의 내용을 출력하고 다음 출력위치는 다음줄.  
 */


public class Ex02Print {
	public static void main(String[] args) {
		//print
		String string1 = "abc";
		String string2 = "DEF";
		System.out.print(string1);
		System.out.print(string2);
		System.out.println(string1);
		System.out.println(string2);
		System.out.printf("%s",string1);
		System.out.printf("%s",string2);
		

	}

}
