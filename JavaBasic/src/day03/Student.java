package day03;

public class Student {
//	필드
//	학생이 가져와야 할 정보들의 공간을 "선언"만 한다
	String name;
	int age;
	int korean;
	int english;
	int math;
	String jumin;
	private final int SUBJECT_NUMBERS = 3;
	
	
	
	
	
//	메소드
//	학생 클래스 객체가 실행 가능한 메소드
	
	public static void goSchool() {
		System.out.println("학교가자!!!!"); // return으로 하면 어떻게 되려나
	}

	public int calculateSum() {
		return korean + english + math;
	}
	
	public double calculateAverage() {
		return calculateSum() / (double) SUBJECT_NUMBERS;
	}
	
	
	public Student() {
		name = "기본 생성됨";
		age = -1;
		korean = -1;
		english = -1;
		math = -1;
		jumin = new String();
		
	}
	
	public Student(String name, int age) {
		// 만약 파라미터가 있다면
		//this란 해당 메소드를 실행하는 객체 그 자신을 뜻한다
		//아래의 this.name은 파라미터의 name을 뜻하는 게 아니라
		// 이 생성자를 호출한 객체의 name을 뜻한다.
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
	
	
	// equals()메소드 오버라이드
	public boolean equals(Object obj) {
		//equals 메소드 내부에서는
		//먼저 파라미터로 들어온 obj가 Student 클래스 객체인지 확인하고
		//만약 맞으면 obj를 typecasting해서 임시로 Student객체에 덮어씌운다.
		//덮어씌운 객체의 이름과 주민번호와, 이 메서드를 실행하는 객체의 이름과 주민번호를 비교해서
		//두 개가 모두 같을 때에만 return true 해준다.
		
		//1. obj가 Student 객체인지 확인
		//   이거는 instanceof라는 예약어를 통해서 한다.
		if(obj instanceof Student) {
			//이 if에 들어왔다는 것은 obj가 Student의 객체란 의미가 된다.
			//다른 클래스 객체에 Student를 typecasting하면 에러가 나지만
			//Student클래스 객체라면 Student를 typecasting할 수 있다.
			Student s = (Student) obj;
			
			// 이 메소드를 실행하는 Student객체의 필드와
			// obj에 Student를 명시적 형변환한 s의 필드를 
			// 비교해서
			// 특정 정보가 같으면 return true해주면 된다.
			// 우리가 비교할 특정 정보는 이름과 주민번호이다.		
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
