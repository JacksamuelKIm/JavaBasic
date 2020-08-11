package org.comstudy21.ch02;

public class Ch02Ex01 {
	String title = "객체의 멤버 접근하기";
	
	// 함수 선언 -->>호출
	// 함수는 불러 주어야만 실행이 된다.
	
	// 디폴트 생성자 함수: 매개변수가 선언되지 않았다.
	public Ch02Ex01() {
		// 생성자 함수는 리턴형이 없다. 함수 이름이 클래스 이름과 같다.
		// 생성자 함수는 임의 호출 불가능. 객체 생성시 한 번만 자동 호출.  
		System.out.println("생성자 함수 호출..");
		
	}
	
	
	void start() {
		System.out.println("start() 함수 실행");		
	}
	
	
	public static void main(String[] args) {
		// 객체 생성 - new 연산자를 사용한다.
		// 클래스는 사용자 정의 타입이다.(reference type!!!!!) 참조형!!!
		// 객체를 참조하고 그 객체안에 데이터를 담을 수 있다.
		Ch02Ex01 ex01; // 참조형 변수가 선언되었다. (stack 메모리공간) 스택 메모리 
		ex01 = new Ch02Ex01(); // 객체가 힙 메모리(heap memory)에 생성된다. 힙 메모리 - 동적할당 (runtime 시에 만들어짐)
		// new를 통해 생성자 함수를 불러오는 것임. 생성자 함수는 임의로 막 호출 안됨
		
		// 참조변수는 전부 4바이트 - 집 주소
		// 객체의 크기는 별개임 - 집
		
		//0X(16진법은 이렇게 시작)~~~~~
		//객체 안의 멤버들을 불러들일 때 점 찍어서 접근. Ex01.b.~~
		//객체의 멤버 접근하기
		System.out.println(ex01.title);
		
		//객체의 멤버함수 혹출
		ex01.start();

	}

}
