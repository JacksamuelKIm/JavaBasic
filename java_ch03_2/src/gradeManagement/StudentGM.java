package gradeManagement;

public class StudentGM {
	
	int no; // it woudl be awesome if this "no" could be changed after modification
	String name;
	
	int kor;
	int eng;
	int math;
	
	int total;
	double avg;
	
	int rank; // �̰� �ٸ� �ֵ� ���� array�� �� �Էµ� �Ŀ��� ����!!

	@Override
	public String toString() {
		return "����: " + rank + ", �л���ȣ: " + no + ", �̸�: " + name + ", ��������: " + kor + ", ��������: " + eng + ", ��������: " + math
				+ ", ����: " + total + ", ���: " + Math.floor(avg*10)/10;
	}
	
	
}
