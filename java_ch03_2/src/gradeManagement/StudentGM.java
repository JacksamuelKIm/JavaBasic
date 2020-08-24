package gradeManagement;

public class StudentGM {
	
	int no; // it woudl be awesome if this "no" could be changed after modification
	String name;
	
	int kor;
	int eng;
	int math;
	
	int total;
	double avg;
	
	int rank; // 이건 다른 애들 값이 array에 다 입력된 후에야 가능!!

	@Override
	public String toString() {
		return "순위: " + rank + ", 학생번호: " + no + ", 이름: " + name + ", 국어점수: " + kor + ", 영어점수: " + eng + ", 수학점수: " + math
				+ ", 총점: " + total + ", 평균: " + Math.floor(avg*10)/10;
	}
	
	
}
