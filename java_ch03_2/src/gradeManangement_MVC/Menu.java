package gradeManangement_MVC;

import java.util.Scanner;

public class Menu {
	Controller c = new Controller();
	Scanner scan = new Scanner(System.in);
	int input;
	
	
	
	public void menu() {
		
		while(true) {	
			System.out.println(":::::::::::::::: ���� ��� ���α׷� ::::::::::::::::");
			System.out.println("1. �Է�	2.���	3.�˻�	4.����	5.����	6.����");
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
