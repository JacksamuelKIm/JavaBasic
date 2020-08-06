package zSelfstudy;

public class ForEachPractice {

	public static void main(String[] args) {

		String [] fruits = {"Orange", "Apple", "Pear", "Banana"};
		
		for (String fruit : fruits) {			
			System.out.println(fruit);
		}
		
		
		for (int i = 0; i <fruits.length ; i++) {
			String fruit = fruits[i];
			System.out.println(fruit);
			
		}
		
		
		String [] grades = { "A", "B", "C", "D", "F" };
		
//		for (int i = 0; i < grades.length ; i++) {
//			System.out.println(grades[i]);			
//		}
		
		for (String grade: grades) {
			System.out.println(grade);
			
		}
		
		
		
		

	} // main end

}
