package org.comstudy.ch03;

import java.util.Scanner;

public class Ch03Ex04 {
	Scanner scan = new Scanner(System.in);
	
	public Ch03Ex04() {
//		timesTable3x3();
//		startEndDan();
//		startEndDanError();
		startEndDan_timesTable3x3();
		
	}
	
	
	private void startEndDan_timesTable3x3() {
		
		// 시작단 입력
		System.out.print("시작 단을 입력해 주세요: ");
		int startDan = scan.nextInt();		
		
		// 2에서 9까지의 범위 이외의 숫자 걸러주는 유효성검사? 넣어주자
		while (startDan <2 || startDan >9) {
			System.out.println("범위 이외의 숫자입니다. 다시 입력해 주십시오");
			System.out.print("시작 단을 입력해 주세요: ");
			startDan = scan.nextInt();
		}	
		
		//종료단 입력
		System.out.print("종료 단을 입력해 주세요: ");
		int endDan = scan.nextInt();
		
		// 2에서 9까지의 범위 이외의 숫자 걸러주는 유효성검사? 넣어주자
		while(endDan <2 || endDan >9) {
			System.out.println("범위 이외의 숫자입니다. 다시 입력해 주십시오");
			System.out.print("종료 단을 입력해 주세요: ");
			endDan = scan.nextInt();
		}
		
		// 시작단을 종료단보다 더 크게 넣어주는 무식한 애들을 도와주는 필터를 넣자. 
		if(startDan > endDan) {
			int temp = endDan;
			endDan = startDan;
			startDan=endDan;			
		}
		
		//입력받은  시작단/종료단 으로 아름다운 3x3행렬을 만들어주자
		int danSize = endDan - startDan; 
		int row1size = (danSize>=3) ? 3:danSize;
		int row2size = (danSize-row1size)>=3 ? 3 : (danSize-row1size) ; 
		int row3size = (danSize-row1size-row2size)>=3 ? 3 : (danSize-row1size-row2size) ;
		
		// 1행
		for(int cnt = 1; cnt<=9 ; cnt++){				
			System.out.println();
			for (int dan = startDan ; dan <= startDan+row1size ; dan++) { 
			System.out.printf("%d x %d = %d\t",dan, cnt, dan*cnt);
			}				
		} // 외벽 for end (sizeOfcolumn>=3? 3:sizeOfcolumn)
		
		System.out.println(); // 행 간 사이 벌려주기
		
		// 2행
		if (danSize>3) {		
			
			for(int cnt = 1; cnt<=9 ; cnt++){				
				System.out.println();
				for (int dan = startDan+3 ; dan <= startDan+row1size+row2size ; dan++) { 
				System.out.printf("%d x %d = %d\t",dan, cnt, dan*cnt);
				}			
			}
		}
		
		System.out.println(); //행 간 사이 벌려주기
		
		//3행
		if (danSize>6) {		
			
			for(int cnt = 1; cnt<=9 ; cnt++){				
				System.out.println();
				for (int dan = startDan+3+3 ; dan <= startDan+row1size+row2size+row3size ; dan++) { 
				System.out.printf("%d x %d = %d\t",dan, cnt, dan*cnt);
				}			
			}
		}			
			
	} // method end

	private void startEndDanError() {
		
		// 실수!! 이헤도 부족! 이렇게 하지 말자!!
		int startDan = 0;
		int endDan = 0;
		
		System.out.println("시작 단 입력 : ");
		startDan = scan.nextInt();
		System.out.println("종료 단 입력 : ");
		endDan = scan.nextInt();
		
		//시작 단 ~ 종료 단까지 출력하기
		//단, 시작단이 종료단보다 큰 수가 들어와도 같은 결과가 되도록 하세요.
		//유효성 검사 하세요.
		
		
		// 2~9 사이의 수가 들어와야 되고 같으면 빼자
		while ((startDan < 2 || startDan >9)) {
			System.out.println("이거 구구단입니다. 다시 입력해");
			System.out.println("시작 단 입력 : ");
			startDan = scan.nextInt();
		}
		while ((endDan < 2 || endDan >9)) {
			System.out.println("이거 구구단입니다. 다시 입력해");
			System.out.println("종료 단 입력 : ");
			endDan = scan.nextInt();
		}
		
		// 시작단이 종료단보다 크면 바꿔치기 temp 써야하나 된장
		if (startDan > endDan) {
//			int temp1 = startDan; 보기에는 좋지만 사실 없어도 될듯
			int temp2 = endDan;			
			endDan = startDan;
			startDan = temp2;			
		}
		
		// 시작단부터 종료단까지
		
				
		for(int cnt = 1; cnt <=9 ; cnt++) {
			System.out.println(cnt); // 이렇게  cnt 넣어서 입력해봐 cnt ==1일때는 그대로 수행한다 쳐
			for (; startDan<=endDan ;startDan++) { // startDan을 그대로 넣어주면 1단만 나오고 말지 
			System.out.printf("%d x %d = %d\t\n", startDan, cnt, startDan*cnt ); // startDan은 기준을 주는 것으로서 끝. 그게 바뀌면 안되지
			} // 사람의 사고방식으로야 그냥 startDan 초기값 6이었으니까(e.g)그냥 그대로 써! 라고 하겠지
		}	 // 컴퓨터 입장에서는 처음에야(cnt==1) 그냥 들어온 애로 시작했겠지만, 그 이후에는 초기문에 아무것도 없으니 당황. 뭐 하고 말게 없어서 안나옴!!!!!!!!! 	
		     // 이중 for문 중 외벽 for에서 그럴때야 초기값 (6)~끝까지 가고(단 1회) 끝나겠지만 / 1회 이상(여기선 4회, 구구단이니 최소 9회 반복할때는 문제 터짐
	}
		
	




	private void startEndDan() {
		
		int startDan = 0;
		int endDan = 0;
		
		System.out.println("시작 단 입력 : ");
		startDan = scan.nextInt();
		System.out.println("종료 단 입력 : ");
		endDan = scan.nextInt();
		
		//시작 단 ~ 종료 단까지 출력하기
		//단, 시작단이 종료단보다 큰 수가 들어와도 같은 결과가 되도록 하세요.
		//유효성 검사 하세요.
		
		
		// 2~9 사이의 수가 들어와야 되고 같으면 빼자
		while ((startDan < 2 || startDan >9)) {
			System.out.println("이거 구구단입니다. 다시 입력해");
			System.out.println("시작 단 입력 : ");
			startDan = scan.nextInt();
		}
		while ((endDan < 2 || endDan >9)) {
			System.out.println("이거 구구단입니다. 다시 입력해");
			System.out.println("종료 단 입력 : ");
			endDan = scan.nextInt();
		}
		
		// 시작단이 종료단보다 크면 바꿔치기 temp 써야하나 된장
		if (startDan > endDan) {
			int temp1 = startDan;
			int temp2 = endDan;			
			endDan = temp1;
			startDan = temp2;			
		}
		
		// 시작단부터 종료단까지
		
		
		for(int cnt = 1; cnt <=9 ; cnt++) {
			System.out.println();
			for (int dan = startDan; dan<=endDan ;dan++) { // startDan을 그대로 넣어주면 1단만 나오고 말지
			System.out.printf("%d x %d = %d\t", dan, cnt, dan*cnt );
			}
		}
	}





	private void timesTable3x3() {
		
		for(int cnt = 1; cnt<=9 ; cnt++) {
			System.out.println();
			for(int dan = 1; dan<=3 ; dan++) {
				System.out.printf("%d x %d = %d \t", dan, cnt, dan*cnt);
			}
		}
		System.out.println();
		for(int cnt = 1; cnt<=9 ; cnt++) {
			System.out.println();			
			for(int dan = 4; dan<=6 ; dan++) {				
				System.out.printf("%d x %d = %d \t", dan, cnt, dan*cnt);
			}
		}
		System.out.println();
		for(int cnt = 1; cnt<=9 ; cnt++) {
			System.out.println();			
			for(int dan = 7; dan<=9 ; dan++) {				
				System.out.printf("%d x %d = %d \t", dan, cnt, dan*cnt);
			}
		}
		
	}





	public static void main(String[] args) {
		new Ch03Ex04();
//		int startDan = 0;
//		int endDan = 0;
//		
//		System.out.println("시작 단 입력 : ");
//		startDan = scan.nextInt();
//		System.out.println("종료 단 입력 : ");
//		endDan = scan.nextInt();
		
		//시작 단 ~ 종료 단까지 출력하기
		//단, 시작단이 종료단보다 큰 수가 들어와도 같은 결과가 되도록 하세요.
		//유효성 검사 하세요.
		
		
		// 2~9 사이의 수가 들어와야 되고 같으면 빼자
//		while ((startDan < 2 || startDan >9)) {
//			System.out.println("이거 구구단입니다. 다시 입력해");
//			System.out.println("시작 단 입력 : ");
//			startDan = scan.nextInt();
//		}
//		while ((endDan < 2 || endDan >9)) {
//			System.out.println("이거 구구단입니다. 다시 입력해");
//			System.out.println("종료 단 입력 : ");
//			endDan = scan.nextInt();
//		}
//		
//		// 시작단이 종료단보다 크면 바꿔치기 temp 써야하나 된장
//		if (startDan > endDan) {
//			int temp1 = startDan;
//			int temp2 = endDan;			
//			endDan = temp1;
//			startDan = temp2;			
//		}
//		
		// 시작단부터 종료단까지
		
		
//		for(int cnt = 1; cnt <=9 ; cnt++) {
//			System.out.println();
//			for (int dan = startDan; dan<=endDan ;dan++) { // startDan을 그대로 넣어주면 1단만 나오고 말지
//			System.out.printf("%d x %d = %d\t", dan, cnt, dan*cnt );
//			}
//		}
		
		
		
		// 3행 3열로 계산이 나오도록 하자
		
		
		
		
	} // main end
		
} // class end		
		
		
		
		
		
		

	


