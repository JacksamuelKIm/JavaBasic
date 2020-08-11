package test;

public class StringvalueOfPractice {

	public static void main(String[] args) {
		/** String.valueOf() 
		* String.valueOf() method converts int to String. 
		* The valueOf() is the static method of String class.
		* The signature of valueOf() method is given below
		* 
		*/
		
		int i =10;
		String s = String.valueOf(i);
		
		System.out.println(i+100); // i에다가 10 더함. 끝
		System.out.println(s+100); //100이 String으로 바뀌고 s로 concatenation

	}

}
