package gradebook;
// VO 클래스란
// Value Object의 줄임말으로써,
//  MVC 패턴 중에서 모델에 해당하는 클래스이다.

// 필드, 겟터/셋터, 그리고 Object 메소드 정도만 만들어준다.

public class StudentVO {
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
	
	
	public boolean equals(Object obj) {
		if (obj instanceof StudentVO ) {
			StudentVO s = (StudentVO)obj;
			if(name.equals(s.name) && jumin.equals(s.jumin)) { 
			return true;  // 두번째 if뒤에 세미콜론 있어서 꼬였음.( {}도 없었고.??)
			} // second if end
			
		}//first if end
		
		return false;
	}
	
	
	
	
} // class end
