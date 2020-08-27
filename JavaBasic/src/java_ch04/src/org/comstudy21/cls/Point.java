package org.comstudy21.cls;

public class Point {

	int x;
	int y;
	
	public Point() {
		// 디폴트 생성자 - 개발자가 만들지 않으면 컴파일러가 자동 추가시킴
		System.out.println("디폴트 생성자 호출!");
	}

	public Point(int _x, int _y) {
		// 생성자 오버로딩 - 이폴트 생성자는 더 이상 컴파일러에 의해 자동 추가되지 않는다.
		// 생성자 오버로딩을 했을 경우에 디폴트 생성자도 꼭 만들어줘라! 오버로딩을 하면 디폴트가 자동으로 만들어지지 않으므로
		x = _x;
		y = _y;
		
	}
	
	
	public void showPoint() {
		System.out.println("(" + x + ", " +y + ")");
		
	}
	
	
}
