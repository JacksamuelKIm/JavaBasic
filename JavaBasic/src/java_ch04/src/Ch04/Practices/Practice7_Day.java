package Ch04.Practices;

import java.util.Scanner;

public class Practice7_Day {
	private String work; // 하루에 할 일을 나타내는 문자열
	
	
	//constructor
	public Practice7_Day() {
		
	}
	
	// setter getter. 이름 맘에 안듬
	public void set(String work) {
		this.work = work;
	}
	
	public String get() {
		return work;
	}
	
	// method
	public void show() {
		if(work == null) {
			System.out.println("없습니다.");
		} else {
			System.out.println(work + "입니다.");
		}
	}
	
}
