package org.comstudy21.ch03.except;

public class Ch03Except02 {

	public Ch03Except02() throws Exception {
//		test01();
		test02();
	}
	
	
	private void test02() throws Exception {
		throw new Exception("강제로 발생된 예외 객체"); 
		
	}


	private void test01() {
		// 예외 강제 발생시키기
//		new Exception("강제로 발생된 예외 객체"); //생성만 하고 아직 안던짐
		
		try{
			throw new Exception("강제로 발생된 예외 객체"); 
		} catch (Exception e) {
			System.err.println("예외 처리부분 >> " + e);
		}
		
	}


	public static void main(String[] args) throws Exception {
//		try {
//			new Ch03Except02();
//		} catch (Exception e) {
//			System.out.println("");
//		}
		
		System.out.println("실행 종료!");

	}

}
