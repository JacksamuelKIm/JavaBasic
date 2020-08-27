package Ch04.Practices;
import java.util.Scanner;
class Grade {
	int math;
	int sci;
	int eng;
	final int subSize = 3;
	
	public Grade(int math, int science, int english) {
		this.math = math;
		this.sci = science;
		this.eng = english;
	}
	
	public int average() {
		int sum = math + sci + eng ;
		int avg = sum / subSize;
		return avg;
	}
	
}

public class Practice2 {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("평균은 " + me.average());		
	}	
}
