package org.comstudy.ch03.homework;

//처음에는 min - max를 구현못함;; 그대신 UpAndDown2에서 ArrayList를 통해 아름답게 구현. 
//이 클래스 고치다가 그 같은 좋은 영감이 떠오름
//고치기는 했지만 아름답지 못하고 좀 복잡
import java.util.Random;
import java.util.Scanner;

public class UpAndDown {
	Scanner scan = new Scanner(System.in); 	Scanner scan2 = new Scanner(System.in);
	Random r; 	int k, max, min, input; 	String choice;	
	public UpAndDown() {
	randomDraw();	
	}	
	
	private void randomDraw() {
		r = new Random();
		int k = r.nextInt(100);
		min = 0;
		max = 99;

		choice = "";

		System.out.println("수를 결정하였습니다. 맞추어 보세요.");
		System.out.println("0-99");
		System.out.print("1>>");
		input = scan.nextInt();

		while (input != k) {
			for (int i = 1;; i++) {
				while (input < 0 || input > 99) {
					System.out.println("버위에 해당하지 않는 수입니다. 다시 입력해주십시오");
					System.out.print(">>");
					input = scan.nextInt();
				}
				if (input < k) {
					System.out.println("더 높게");
					min = input + 1;
					System.out.println(min + "-" + max);
					System.out.print(i + 1+">>");
					input = scan.nextInt();
				} else if (input > k) {
					System.out.println("더 낮게");
					max = input - 1;
					System.out.println(min + "-" + max);
					System.out.print(i + 1+">>");
					input = scan.nextInt();
				}

				if (input == k) {
					System.out.println("맞았습니다.");
					System.out.print("다시 하시겠습니까?(y/n)>>>");
					i = 0;
					choice = scan2.nextLine();
					while (!(choice.equals("y")) && !(choice.equals("n"))) {
						System.out.println("잘못 입력하셨습니다. 다시 입력해 주십시오");
						choice = scan2.nextLine();
					} // choice while end

					if (choice.equals("y")) {
						System.out.println("수를 결정하였습니. 맞추어 보세요.");
						System.out.println("0-99");
						System.out.println("1>>");

						input = scan.nextInt();
					} else if (choice.equals("n")) {
						System.out.println("게임을 종료합니다. 감사합니다.");
						break;
					}
				}

			} // for end
		} // input while end
	} // randonDraw() end

	public static void main(String[] args) {
	new UpAndDown();	
	}

}