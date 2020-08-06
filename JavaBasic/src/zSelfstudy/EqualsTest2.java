package zSelfstudy;

import gradebook.StudentVO;

public class EqualsTest2 {
	// 학생 클래스의 필드
	private String name;
	private String jumin;
	private int korean;
	private int english;
	private int math;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJumin() {
		return jumin;
	}
	public void setJumin(String jumin) {
		this.jumin = jumin;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
// ===============================================================================================	
	public boolean equals(Object obj) {
		if (obj instanceof EqualsTest2 ) {
			EqualsTest2 s = (EqualsTest2)obj;
			if(name.equals(s.name) && jumin.equals(s.jumin)); 
			return true;  // 두번째 if뒤에 세미콜론 있어서 꼬였음.( {}도 없었고.??)
			
		}
		
		return false;
	}
	
	
	public static int indexOf(StudentVO s, StudentVO[] studentArray) {
		for (int i = 0; i < studentArray.length; i++) {
			if(s.equals(studentArray[i])) {
				return i; //return 하는 순간 메소드 전체가 바로 종료됨
			} //if end			
		} //for end		
		return -1; // 암 것도 못 찾을 때
		
		
		
	} // indexOf end
	
	
	
} // class end
	
	
	
	
	
	
	
	

