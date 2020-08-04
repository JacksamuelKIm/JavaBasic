package day02;
//의도적으로 break를 생략해서 코드를 간략화시켜보자
//사용자로부터  월을 입력 받아
//해당 월이 몇 일까지 있는지 출력하는프로그램


import java.util.Scanner;
public class Ex13Switch2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("월을 입력하세요: ");
		int month = scanner.nextInt();
		
		switch(month) {
			// break를 생략할 수 있기 때문에
		// 달같은 결과를 가진 케이스를 다 모아두고
		// 맨 마지막 케이스에만  코드를 적고 break를 적어주면 된다.
		
		case 2:
			System.out.println("28일까지 입니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일까지 입니다");
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31일까지 입니다");
				
			
		} //swithch 종료
		
//		하지만 스위치는 단점이잇다
//		변수의 가능한 값을에  대해 모두 case를 적어주어야 하기 때문에
//		사용처가 상당히 제한적입다,
//		범위 체크를 하는 if -else if구조를 사용해서
//		조건식을 만드는 게 좀 더 보편화 되어있는 방법이다.
//		
		scanner.close();
		

	}

}
