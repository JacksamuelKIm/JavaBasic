package org.comstudy21.ch03.except;

public class Ch03Except01 {

	public static void main(String[] args) {
		String[] sArr = {null, null, "korea", null, "japan", "china"}; 
		
		for (int i = 0; i<sArr.length; i++) {
			System.out.println(sArr[i]);// null이 null이라 그냥 문제없이 출력됨
		}
		
		for (int i = 0; i<sArr.length; i++){ 
			if("korea".equals(sArr[i])) { // 이렇게 하는 것은 문제없으나 
				System.out.println(sArr[i]);
			}
		}
		
		for (int i = 0; i<sArr.length; i++){
			try {
				if((sArr[i]).equals("korea")) { // 이렇게 하는 것은 문제없으나 
					System.out.println(sArr[i]);					
				}else {
					System.out.println("Korea가 아닙니다");
				}
			}catch	(NullPointerException e) {
				continue; // 다음 i로 진행
			}
		}
		
		
	}
	
	
	public static void test01() {
		String c = null; 
		// 이름(참조변수, 주소값)만 있을 뿐 객체가 존재하지 않음
		// NullPointException : 객체가 없기 때문에 멤버 접근 불가능!
		
		try{
			System.out.println("문자열 값은 " +c.toString());
		} 
		catch(NullPointerException e) {
			System.out.println("객체가 없기 때문에 멤버 접근이 불가능합니다!");
//			System.err.println("객체가 없기 때문에 멤버 접근이 불가능합니다!"); out과 err는 서로 스레드가 달라서 순서가 뒤바뀌어서 실행됨
			c = "새로운 문자열 값";
			System.out.println("문자열 값은 " +c.toString());
		}
		
		System.err.println("정상 종료");

	}

}
