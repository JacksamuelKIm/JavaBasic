package zSelfstudy;

public class StudentPracticePrameterTest01 {

	public static void main(String[] args) {
		
		StudentPractice test01 = new StudentPractice();
		System.out.println(test01);  // 이렇게 원래 텅텅 빈 놈인데
		
		StudentPractice test02 = new StudentPractice("Jack", 32);  // 이런 Constructor with Parameter를 통해 객체를 만들 경우
		System.out.println(test02); // Parameter안의 값을 그 텅텅빈 혹인 기본으로 주어진 값만 있던 필드 안에 넣어 준다는 소리
	}

}
