package gradeManangement_MVC;

import java.util.Scanner;

public class Menu {
	Controller c = new Controller();
	Scanner scan = new Scanner(System.in);
	int input;
	
	
	
	public void menu() {
		
		while(true) {	
			System.out.println(":::::::::::::::: 성적 출력 프로그램 ::::::::::::::::");
			System.out.println("1. 입력	2.출력	3.검색	4.수정	5.삭제	6.종료");
			input = scan.nextInt();
			switch (input) {
			case 1 : c.input(); break;
			case 2 : c.output(); break;
			case 3 : c.search(); break;
			case 4 : c.modify();break;
			case 5 : c.delete();break;
			case 6 : c.end(); break;		
			}
		}
	
	
	} // end of menu()

}
