package org.comstudy21.ch02;

public class Ch02Ex02 {
	public Ch02Ex02() {
		System.out.println("생성자 함수 호출");
		
		test01();
		
	}
	
	
	private void test01() {
		System.out.println("test01 함수 호출");		
	}


	public static void main(String[] args) {
		new Ch02Ex02(); // 객체생성 - 생성자 함수 호출
		
		
		
	}
	
	
}
