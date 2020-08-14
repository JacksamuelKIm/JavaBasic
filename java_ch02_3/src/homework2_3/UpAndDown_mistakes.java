// written on Aug 13 2020
package homework2_3;
import java.util.Random;
import java.util.Scanner;

public class UpAndDown_mistakes {
	Scanner scan = new Scanner(System.in); 	Scanner scan2 = new Scanner(System.in);
	Random r; 	int k; 	int input; 	String choice;	
	public UpAndDown_mistakes() {
	randomDraw();	
	}	
	
	private void randomDraw() {
		r = new Random();
		int k = r.nextInt(100);
		choice = "";
		
		System.out.println("수를 결정하였습니다. 맞추어 보세요.");
		System.out.println("0-99");
		input = scan.nextInt();
		
		while (input != k) {
			for(int i=1; ;i++) {
			while (input < 0 || input > 99) {
				System.out.println("버위에 해당하지 않는 수입니다. 다시 입력해주십시오");
				System.out.print(">>");
				input = scan.nextInt();
			}
			if (input < k) {
				System.out.println("더 높게");
				System.out.print(i + ">>");
				input = scan.nextInt(); // while의 expression에 있으므로 필요 없음
			} else if (input > k) {
				System.out.println("더 낮게");
				System.out.print(i + ">>");
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
					System.out.println("수를 결정하였습니다. 맞추어 보세요.");
					System.out.println("0-99");
					input = scan.nextInt();
				} else if (choice.equals("n")) {
					System.out.println("게임을 종료합니다. 감사합니다.");
					break;
				}
			}	
			
			}//for end
		} // input while end
	} // randonDraw() end

	public static void main(String[] args) {
	new UpAndDown_mistakes();	
	}

}
