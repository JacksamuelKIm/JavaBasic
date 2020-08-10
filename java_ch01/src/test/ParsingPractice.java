package test;

public class ParsingPractice {

	public static void main(String[] args) {
	
		String someString = "123";
		
		
		int i = Integer.parseInt(someString);
		
		System.out.println(i);
		
		
		String tenString = "10";
//		Integer result = 20 + tenString; // ´ç±Ù ¾ÈµÊ
		
		Integer result = 20 + Integer.parseInt(tenString);
		
		System.out.println(result);
		
		
		// Parsing is to read the value of one object to convert it to another type. For example you may have a string with a value of "10". Internally that string contains the Unicode characters '1' and '0' not the actual number 10. The method Integer.parseInt takes that string value and returns a real number.
		// https://stackoverflow.com/questions/787735/what-is-parse-parsing
		
		
		
	

	}

}
