package org.comstud21.ch03.practices;

import java.util.Scanner;

public class Practice14_SampleAnswer {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score [] = {95, 88, 76, 62, 55};
		
		
		while (true) {
			System.out.print("과목 이름>>");
			String name = scanner.next();
			if (name.equals("그만"))
				break;
			boolean flag = true; // boolean 쓰기 싫으면  i를 밖에다 선언해주고 해라. 그런데 flag가 명확!
			for (int i = 0; i < course.length; i++) {
				if (name.equals(course[i])) {
					flag = false;
					System.out.println(name + "은 " + score[i] + "점입니다.");
				}
			}
			if (flag) {
				System.out.println("없는 과목입니다");
			}

		}
	}
}
