package org.comstudy21.ch03.array.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Ch03ArrEx01 {
	static Scanner scan = new Scanner(System.in);
	
	static int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
	static int total = 0, rest = 0; //1월 1일부터 지난 날짜, 남은 날짜
	static int month, day, month2, day2, threeMonths;
	
	public Ch03ArrEx01() {
//		test02();
	}
	
	
	public static void main(String[] args) {
		System.out.print("월 입력:");
		month = scan.nextInt();
		System.out.print("일 입력:");
		day = scan.nextInt();
		
		//입력받은 월일까지의 날짜를 total에 누적한다.
		//1월 1일부터 0월0일까지는 00일이 지났습니다.
		total = 0; //이번달부터 입력받은 달 이전까지만		
		for(int i =0; i<month-1; i++) {
			total = total + days[i];			
		}
		System.out.println("1월 1일부터 "+month+"월"+day+"일 까지는 " + total + "일이 지났습니다.");
		
		//입력받은 날짜로부터 연말까지의 날짜			
		int size = days.length;
		rest = days[month-1]-day;
		for(int i = month; i<size ;i++) {
			rest = rest + days[i];
		}
		System.out.println(month+"월 "+day+"일부터 연말까지는 " + rest+"일 남았습니다");
		
				
		//입력받은 날 이후 100일이후의 월일 표시 // 12월 31일 표시하면 그 다음해(이거는 입력 x)의 월일 표시
		 
		 
		int left = days[month-1] - day; // 입력된 현재 달의 남은 일수 (현재달 일수 - 오늘 일자)
		int x = 100 - left ; // 100일에서 입력된 현재 달의 남은 일수를 뺀 값
		int next1 = 0, next2=0, next3=0, next4=0;
		
		if (month == 9) {
			next1 = month +1;
			next2 = next1 +1;
			next3 = next2 +1;
			next4 = 12 - next3 + 1;		
		}else if (month==10) {
			next1 = month+1;
			next2 = next1+1;
			next3 = 12 - next2 + 1;
			next4 = next3 + 1;
		}else if (month==11) {
			next1 = month+1;
			next2 = 12 - next1 + 1;
			next3 = next2 + 1;
			next4 = next3 + 1;
		}else if (month==12) {
			next1 = 12 - month + 1;
			next2 = next1 + 1;
			next3 = next2 + 1;
			next4 = next3 + 1;
		}else {
			next1 = month + 1;
			next2 = next1 + 1;
			next3 = next2 + 1;
			next4 = next3 + 1;
		}		
		threeMonths = days[next1-1] + days[next2-1] + days[next3-1];		
		
			if (100-left < threeMonths) {
				month2 = next3;
				day2 =  100 - (left + days[next1-1] + days[next2-1]);			
			}	
			if (100-left > threeMonths) {			
				month2 = next4;
				day2 = 100 - (threeMonths+left);										
			}			
			System.out.println(month+"월 "+day+"일부터 100일 후는 "+month2+"월 "+day2+"일 입니다");	
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
