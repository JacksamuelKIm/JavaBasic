package ch04_Practice12;

import java.util.Scanner;

public class Utils {
	static Scanner scanner = new Scanner(System.in);
	Seat[] s = new Seat[10]; 
	Seat[] a = new Seat[10];
	Seat[] b = new Seat[10];
	
	public Utils() {		
		for (int i = 0 ; i<10 ; i++) {
			s[i] = new Seat("S");
			a[i] = new Seat("A");
			b[i] = new Seat("B");
		}
		
	}
	
	//메인 메뉴
	public int mainMenu() {		
		
		System.out.print("예약:1,  조회:2,  취소:3,  끝내기:4>> ");
		int input = scanner.nextInt();		
		return input;
	}
	

		
		// 1. 예약  - 기능 -좌석보여주기 for 예약
		public void showSeat(Seat[] s) {
			for (int i = 0 ; i<10 ; i++) {
				System.out.print(s[i].name+" ");
			}		
		}
		
	//1.예약 - 좌석입력
	public void chooseSeat() {		
		String n; //입력받은 이름
		int index; // 좌석번호  인덱스(-1 미리 할꺼임)
			
		//좌석 등급
		System.out.print("좌석구분   S(1),  A(2),  B(3)>> ");
		int input = scanner.nextInt();		
			
			switch (input) {		
			case 1 : // S석 입력
				System.out.print("S>>");
				showSeat(s);
							
				System.out.print("\n이름>>");
				n = scanner.next();			
				System.out.print("번호>>");
				index = scanner.nextInt() -1 ;
				// 좌석번호 유효성 검사
				while(index>=10 || index<0) {
					System.out.println("존재하지 않는 좌석입니다. 다시 입력해주세요");
					System.out.print("번호>>");
					index = scanner.nextInt() -1 ;
				}
				
				//예약 중복 검사
				while(!s[index].name.equals("---")) {
					System.out.println("이미 예약된 자리입니다. 다른 자리를 선택해주세요.");
					System.out.print("번호>>");
					index = scanner.nextInt() -1 ;
				} 
				
				s[index].name = n;
				
				;break;
				
			case 2 : //A석 입력
				System.out.print("A>>");
				showSeat(a);
				
				System.out.print("\n이름>>");
				n = scanner.next();
				System.out.print("번호>>");
				index = scanner.nextInt() -1 ;
				
				// 좌석번호 유효성 검사
				while(index>=10 || index<0) {
					System.out.println("존재하지 않는 좌석입니다. 다시 입력해주세요");
					System.out.print("번호>>");
					index = scanner.nextInt() -1 ;
				}
				//예약 중복 검사
				while(!a[index].name.equals("---")) {
					System.out.println("이미 예약된 자리입니다. 다른 자리를 선택해주세요.");
					System.out.print("번호>>");
					index = scanner.nextInt() -1 ;
				} 
				
				a[index].name = n;
				
				;break;
			
			case 3 : //B석 입력
				System.out.print("B>>");
				showSeat(b);
				
				System.out.print("\n이름>>");
				n = scanner.next();
				System.out.print("번호>>");
				index = scanner.nextInt() -1 ;
				
				// 좌석번호 유효성 검사
				while(index>=10 || index<0) {
					System.out.println("존재하지 않는 좌석입니다. 다시 입력해주세요");
					System.out.print("번호>>");
					index = scanner.nextInt() -1 ;
				}
				//예약 중복 검사
				while(!b[index].name.equals("---")) {
					System.out.println("이미 예약된 자리입니다. 다른 자리를 선택해주세요.");
					System.out.print("번호>>");
					index = scanner.nextInt() -1 ;
				} 
				
				b[index].name = n;
				
				;break;			
			default : 
				System.out.println("잘못된 입력입니다.");
				
		}
	}
	
	//2.조회 - 전 좌석 보여주기 for 조회
	public void showSeat() {
		for (int j = 0; j < 3; j++) {
			System.out.print(j == 0 ? "S>>" : j == 1 ? "A>>" : "B>>");
			for (int i = 0; i < 10; i++) {
				System.out.print((j == 0 ? s : j == 1 ? a : b)[i].name + " ");
			}
			System.out.println();
		}
		System.out.println("<<<조회를 완료하였습니다.>>>");
	}

	
	//3. 취소
	public void cancel() {
		String n; //입력받는 이름
		boolean flag;
		
			
		//좌석 등급
		System.out.print("좌석구분   S(1),  A(2),  B(3)>> ");
		int input = scanner.nextInt();		
			
			switch (input) {		
			case 1 : // S석 취소
				System.out.print("S>>");
				showSeat(s);
							
				System.out.print("\n이름>>");
				n = scanner.next();			
				
				flag = false;
				for(int i = 0; i<s.length ;i++ ) {
					if (s[i].name.equals(n)) {
						s[i].name = "---";
						flag = true;
					} 
				}
				
				if(flag == false) {
					System.out.println("예약되어 있지 않은 이름입니다.");
				}
				
				;break;
				
			case 2 : //A석 취소
				System.out.print("A>>");
				showSeat(a);
				
				System.out.print("\n이름>>");
				n = scanner.next();
				
				flag = false;
				for(int i = 0; i<a.length ;i++ ) {
					if (a[i].name.equals(n)) {
						a[i].name = "---";
						flag = true;
					} 
				}
				
				if(flag == false) {
					System.out.println("예약되어 있지 않은 이름입니다.");
				}
				
				;break;
			
			case 3 : //B석 취소
				System.out.print("B>>");
				showSeat(b);
				
				System.out.print("\n이름>>");
				n = scanner.next();
				
				flag = false;
				for(int i = 0; i<b.length ;i++ ) {
					if (b[i].name.equals(n)) {
						b[i].name = "---";
						flag = true;
					} 
				}
				
				if(flag == false) {
					System.out.println("예약되어 있지 않은 이름입니다.");
				}
				
				;break;			
			default : 
				System.out.println("잘못된 입력입니다.");	
		}
	}
}
