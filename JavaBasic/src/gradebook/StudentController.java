package gradebook;

import util.ArrayUtil;

// 데이터를 가공해서 뷰어에 보내주는 역할
public class StudentController {
	//학생 객체의 총점을 계산하는 메소드
	private final int SUBJECT_NUMBERS = 3;
	private StudentVO[] studentArray;
	
	public StudentController() {
		studentArray = new StudentVO[0];
	}
	
	public int calculateSum (StudentVO s) {
		return s.getKorean() + s.getEnglish() + s.getMath();  

	}

	// 학생 객체의 평균을 계산하는 메소드
	public double calculateAverage(StudentVO s) {
		return calculateSum(s) / (double)SUBJECT_NUMBERS;
		
	}
	
	// 파라미터로 넘어온 학생 객체를 studentArray 에 추가하는 메소드
	public void insert(StudentVO s) {
		studentArray = ArrayUtil.add(studentArray, s);
		
	}
	
	public StudentVO[] selectAll() {
		return studentArray;
	}
	
	public void delete(StudentVO s) {
		studentArray = ArrayUtil.remove(studentArray, s);		
	}
	
	
	
}
