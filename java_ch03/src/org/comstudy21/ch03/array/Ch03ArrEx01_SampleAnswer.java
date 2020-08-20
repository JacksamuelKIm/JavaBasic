package org.comstudy21.ch03.array;

import java.util.Arrays;
import java.util.Scanner;

public class Ch03ArrEx01_SampleAnswer {
	static Scanner scan = new Scanner(System.in);
	
	static int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
	static int total = 0, rest = 0; //1월 1일부터 지난 날짜, 남은 날짜
	static int month, day, month2, day2, threeMonths;
	
	public Ch03ArrEx01_SampleAnswer() {
//		test02();
//		test05();
	}
	
	
	
	public static void main(String[] args) {
		new Ch03ArrEx01_SampleAnswer();
		//또 다른 방법. 더하기.
		
		System.out.print("월 입력:");
		month = scan.nextInt();
		System.out.print("일 입력:");
		day = scan.nextInt();
		
		int nextMonth = 0;
		int nextDay = 0;
		total = days[month-1] -day;
		int i = month% days.length;   // 이렇게 해주는 이유가 뭐더라.... 12넘어갈때를 위해
		for(int cnt = 0; cnt<3 ; cnt++) {
			i %= days.length;   // 이 순서 중요. 이거부터 해야 i가 0이 안됨
			total += days[i++];
			
		}		
		if(total>=100)  {
			nextMonth = i;
			nextDay = days[nextMonth-1] - (total -100);
			System.out.printf("100일 후 날짜는 %d월%d일 입니다. \n", i+1, days[i] - (total-100));
		} else {
			nextMonth = i+1;
			nextMonth = nextMonth>12 ? 1: nextMonth;
			nextDay = 100-total;
			System.out.printf("100일 후 날짜는 %d월%d일 입니다. \n", i-1<0?12:i, 31);
		}
		
		
		
	}
	
	
	
	
	
	
	public static void test05() {
		System.out.print("월 입력:");
		month = scan.nextInt();
		System.out.print("일 입력:");
		day = scan.nextInt();
				
		//입력받은 날 이후 100일이후의 월일 표시 // 12월 31일 표시하면 그 다음해(이거는 입력 x)의 월일 표시
		// 하나씩 빼 나가기
		
		total = 100 - (days[month-1] -day);
		int i = month;
		i %= days.length; //OUT OF BOUND EXCEPTION 방지/ 12부터는  0으로 돌아감
		while(total > days[i]) {
			total -=days[i];
			i++;
			i%= days.length;			
		}
		
		System.out.printf("100일 후 날짜는 %d월%d일 입니다. \n", i+1, total);
		
	
		
		
		
		
		
		
		
		
	} // method end
	
	
	
	
	
	
	
	public static void test03() {
//		new Ch03ArrEx01();
		
		System.out.print("월 입력:");
		month = scan.nextInt();
		day = days[month-1];
		
		System.out.printf("%d월은 %d일까지 있다.", month, day);
		
		
	}
	
	
	
	
	public static void test02() {
		//        월     1   2  3  4  5  6  7  8  9 10 11  12
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		//     index  0   1  2  3  4  5  6  7  8  9 10 11
		
		
		int size = days.length;
		int total = 0;
		System.out.println(Arrays.toString(days));
		for(int i =0; i<12 ; i++) {
			System.out.println(i+1 + "월은 " + days[i] + "일까지 있다." );
			total = total + days[i];
		}
		System.out.println("1년은 " + total + "입니다");
		System.out.println("마지막 달의 일수는 " + days[size-1] + "입니다");
				
	}
	
	public void test01() {
		
		// 배열 선언과 동시에 리터럴로 초기화한다.
		int[] arr = {10, 13, 19, 21, 35, 90, 45};
		
		// 배열의 주소값 말고 그 요소 출력할때는 String으로 바꿔서
		System.out.println(Arrays.toString(arr));
				
		// 배열의 크기를 확인한다.
		int size= arr.length;
		System.out.println("배열의 크기: " + size);
		System.out.println("첫번째 요소 값 " + arr[0]);
		System.out.println("첫번째 요소 값 " + arr[size-1]);
		
		
	}

}
