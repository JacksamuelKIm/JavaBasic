package org.comstudy21.cls;

// 클래스 = 필드 + 메소드
// 클래스는 사용자 정의 데이터 타입
// 접근지정자가 생략되면 디폴트 접근지정자(패키지멤버)
// 같은 패키지내에서는 같은 이름의 클래스가 존재할 수 없다


class Point01{
	private int x;
	private int y;
	
	
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	
	//Lombok.jar를 이용해서 자동생성 가능. (나중에 함)
	
}

public class Ch04Ex01 {

	public static void main(String[] args) {
		//객체를 만들기 위해서는 클래스가 필요하다
		// 타입(클래스) 변수(참조) = new ㅐㅇ성자
		// 변수만 선언하면  ponin 
		Point01 pt = new Point01();
		//멈버필드에 값 넣기: 점(.) 연산자를 이용해서 멤버에 접근
//		pt.x = 120; 
//		pt.y = 150;		
//		System.out.printf("x:%d, y:%d\n", pt.x, pt.y);
		
		// 정보 은닉이 되면 클래스 외부에서 접근이 불가능해진다.
		// setters/getters를 이용해서 데이터 필드 접근
		// 일반적으로 필드는 private, 메소드는 public
		
		
		pt.setX(300);
		pt.setY(300);
		
		System.out.printf("x:%d, y:%d", pt.getX(), pt.getY());
		
	}

}
