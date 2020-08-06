package zSelfstudy;

public class StudentPractice {
//	Field
	String name;
	int age;
	int korean;
	int english;
	int math;
	String jumin;
	private final int SUBJECT_NUMBERS = 3;
	
//	Method(s)
	
	public static void goSchool() {
		System.out.println("학교가자!!!!"); 
	}

	public int calculateSum() {
		return korean + english + math;
	}
	
	public double calculateAverage() {
		return calculateSum() / (double) SUBJECT_NUMBERS;
	}
	
	
	//Constructor
	
	public StudentPractice() {
		name = "기본 생성됨";
		age = -1;
		korean = -1;
		english = -1;
		math = -1;
		jumin = new String();
		
	}
	
	//Constructor with parameters
	
	public StudentPractice(String name, int age) {
		this.name = name;
		this.age = age;				
	}
	
	public String toString() {
		String string = new String();
		string = "이름: " + name;
		string += ", 나이: " + age + "세";
		string += ", 국어: " + korean + "점"; 
		string += ", 영어: " + english + "점";
		string += ", 수학: " + math + "점";
		return string;
	}
	
	
	// overriding "equals()" 
	public boolean equals(Object obj) {
		if(obj instanceof StudentPractice) {
			StudentPractice s = (StudentPractice) obj;
			if(this.name.equals(s.name) && this.jumin.equals(s.jumin)) {
				return true;
			}			
		}
		
		return false;
	} //equals end

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	public String getJumin() {
		return jumin;
	}

	public void setJumin(String jumin) {
		this.jumin = jumin;
	}
	
	
	
} // class end
