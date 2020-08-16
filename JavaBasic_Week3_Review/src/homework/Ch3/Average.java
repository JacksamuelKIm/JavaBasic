package homework.Ch3;

public class Average {

	public static void main(String[] args) {
		int sum = 0;
		int divider = 3;
		
		for (int i=0; i<args.length; i++) {
			sum = sum + Integer.parseInt(args[i]);
		}
		
		double average = (double) sum / args.length;

	}

}
