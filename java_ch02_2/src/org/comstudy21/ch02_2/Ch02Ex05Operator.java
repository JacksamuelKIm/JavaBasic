package org.comstudy21.ch02_2;
//written on Aug 12 2020
import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;

public class Ch02Ex05Operator {
	
	Scanner scan = new Scanner(in);
	int time;
	int second, minute, hour;
	
	public Ch02Ex05Operator() {
		start();		
	}
	
	private void start() {
		out.print("정수를 입력하세요: ");
		time = scan.nextInt();
		second = time % 60;
		minute = (time/60) % 60;
		hour = (time / 60) / 60;
		
		out.printf("%d초는 %d시간 %d분 %d초 입니다. \n", time, hour, minute, second);		
	}

	public static void main(String[] args) {
		new Ch02Ex05Operator();	//Constructor도 결국 method이므로. 근데 new가 맘에 안든다.

	}

}
