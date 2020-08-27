package Ch04.Practices;
import java.util.Scanner;

public class Practice7_MonthSchedule {	
	Scanner scan = new Scanner(System.in);
	Practice7_Day[] arrDays;
	int lastday;

	// constructor. 디폴트는 귀찮아서 안 함
	public Practice7_MonthSchedule(int i) {
		arrDays = new Practice7_Day[i];
		lastday = i;
		for(int j=0; j<lastday; j++) {
			arrDays[j] = new Practice7_Day(); // work는 null이더라도 객체 자체는 존재해야 문제 없음!!!!
		}		
	}
	
	// Methods
	public void input() { // 보기
		System.out.print("날짜(1~" + lastday + ")?>> ");
		int day = scan.nextInt();
		System.out.print("할 일(빈 칸없이 입력)?>> ");
//		try { 								NullPointException 뜨는 게 클래스 Day의 constructor가 없어서 그런 걸까?
		arrDays[day-1].set(scan.next()); //   그렇군!!! arrDays[day-1]는 레퍼런스이지 실제 객체가 아니니까??!! 
//		} catch (NullPointerException e) {}      // 
	}
	
	public void view() { // 입력
		System.out.print("날짜(1~" + lastday + ")?>> ");
		int day = scan.nextInt();		
		arrDays[day-1].show();	// NullPointException이 뜨는 것은  work가 null이기 이전에 Day클래스의 객체 자체가 존재 안해서?	
	}	
	
	public void finish() { // 끝내기
		System.exit(0);
	}
	
	public void run() { 		
		while (true) {
			System.out.println(":::::::::: 이번달 스케쥴 관리 프로그램 ::::::::::");
			System.out.print("할 일(입력:1      보기:2      끝내기:3) >>");
			int num = scan.nextInt();
			
			if (num == 1) input();			
			if (num == 2) view();						
			if (num == 3) finish();			
		}
	}	
	
	public static void main(String[] args) {
		Practice7_MonthSchedule april = new Practice7_MonthSchedule(30);		
		april.run();		
	}
}
