package org.comstudy21.ch03;

import java.util.Scanner;

// 클래스 선언하기 - 객체를 생성하기 위해서 클래스를 만든다
// 클래스는 객체의 참조변수를 선언하는 타입이 된다.
// (클래스)타입 (참조)변수 = new 생성자();
class People{
	//  
	int no;
	String name;
	String phone;
	
	@Override
	public String toString() {
		return " [no=" + no + ", name=" + name + ", phone=" + phone + "]";
	}
	
}


public class Ch03Ex20 {	
		static Scanner scan = new Scanner (System.in);
		
	private static People makePeople() {
		People pArr = new People();
		
		System.out.print("번호를 입력해주세요 >>");
		pArr.no = scan.nextInt();
		scan.nextLine();
		System.out.print("이름을 입력해주세요 >>");
		pArr.name = scan.nextLine();
		System.out.print("전화번호를 입력해주세요 >>");
		pArr.phone = scan.nextLine();
				
		return pArr;
	}
	
	private static void showList(People[] pArr) {
		for (int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i]);
		}
		
	}

	

	public static void main(String[] args) {
		People[] pArr = new People[3];
		
		// 3명의 번호, 이름 , 전화번호 입력
		
		for (int i =0; i<pArr.length; i++) {
			pArr[i] = makePeople();//				
		}		
		
		
		// pArr의 모둔 데이터 출력
		showList(pArr);
		
		

//		System.out.print("번호를 입력해주세요 >>");
//		pArr[i].no = scan.nextInt();
//		scan.nextLine();
//		System.out.print("이름을 입력해주세요 >>");
//		pArr[i].name = scan.nextLine();
//		System.out.print("전화번호를 입력해주세요 >>");
//		pArr[i].phone = scan.nextLine();	
		//이렇게 하면 길고 복잡하니 함수 만들어 쓰자
			
		// pArr의 모든 데이터 출력
		
	}
	
	
	

	
	public static void test02() {
		People[] pArr = new People[5]; //이렇게하면 c에서는 객체가 5개 만들어지나 자바에서는 참조변수가 5개 만들어짐. 4바이트짜리 참조변수가 5개 만들어짐
		
		pArr[0] = new People(); //이렇게 객체를 먼저 생성해줘야 다음의 필드들이 입력가능
		pArr[0].no = 1;
		pArr[0].name = "Hong";
		pArr[0].phone = "010-29222-8891";
		
		System.out.println(pArr[0]);
	}
	
	public static void test01(String[] args) {
		// People로 객체를 만들기
		// 참조변수: 객체를 참조한다. 물론 객체안에 있는 필드나 메소드도 참조한다.
		People hong = new People(); //People이 타임이 되는 것임. hong은 참조변수(주소값). 클래스에 있는 필드가 heap에 저장되고, 식별자는 stack에	
		
		//객체에 데이터를 저장하기.
		hong.no = 1;
		hong.name = "홍길동";
		hong.phone = "010-111-2222";
				
		//저장된 데이터를 사용하기
//		System.out.printf("&d\t&s\t&d\t ", hong.no, hong.name, hong.phone); //이거 귀찮으므로
//		System.out.println(hong.toString()); // 이렇게 할 필요도 없다. 클래스 안에 toString이 포함되 있으므로 객체를 출력하면 자동 출력
		System.out.println(hong);
		

	}

}
