package gradeManagementBackup;

public class Student2 {
	int no;
	String name;
	
	int kor;
	int eng;
	int math;
	
	final int subNums = 3;
	
	int total;
	double avg;
	String grade;
	
	int rank;

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", total="
				+ total + ", avg=" + avg + ", grade=" + grade + ", rank=" + rank + "]";
	}	
}
