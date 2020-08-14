package homework2_3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UpAndDown_new {
	Scanner scan1 = new Scanner(System.in);
	Scanner scan2 = new Scanner(System.in);
	Random r = new Random(); 
	int k,min, max, i, inNum;
	String choice;
	ArrayList <Integer> input = new ArrayList <>();
		
	public void game() {
		k = r.nextInt(100);
		min = 0; max = 99;
		choice = "";
		
		System.out.println("수를 결정하였습니다. 맞추어보세요");
		i = 0;
		while(true) {
			System.out.println(min+"-"+max); //여기서 min - max 되므로 아래다 다시 써줄 이유가 없다
			System.out.print((i+1)+">>");
			input.add(i, (inNum = scan1.nextInt()));; //헐 이게 되네 
			
			// sample answer참고해서 도입
			
//			대충 이런식으로 하면 되겠지만 에러가 있음... 여기를 거치면 아직 루프 안이라서 그런지 
//			재시작해도 답이 그 전 게임과 동일.
//			메소드 밖으로 재시작 기능을 빼던가 해야지
//			while(input.get(i)<min || input.get(i)>max) { //유효성 check
//				System.out.println("입력 범위를 초과했습니다. 다시 입력하세요!");
//				System.out.print("사용자 입력: ");
//				input.add(i, (inNum = scan1.nextInt()));; //헐 이게 되네 		
//			}
			
			
			if(input.get(i) < k) {
				min = input.get(i)+1;
				System.out.println("더 높게");
			} 
			else if (input.get(i) > k) {
				max = input.get(i)-1;
				System.out.println("더 낮게");
			}
			
			if(input.get(i) == k) {
				System.out.println("맞았습니다.");
				System.out.print("다시 하시겠습니까?(y/n)>>>");
				
				i = -1; min = 0 ; max = 99; 
				ArrayList <Integer> input = new ArrayList <>();
				
				choice = scan2.nextLine();
				while (!(choice.equals("y")) && !(choice.equals("n"))) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해 주십시오");
					choice = scan2.nextLine();
				} // choice while end

				if (choice.equals("y")) {
					System.out.println("수를 결정하였습니다. 맞추어 보세요.");
					
				} else if (choice.equals("n")) {
					System.out.println("게임을 종료합니다. 감사합니다.");
					break;
				}
			}			
			i++;
		}
		
		
	}// game() end


	
	
	
	public UpAndDown_new() {
		game();
	}  // constructor end
	public static void main(String[] args) {
		new UpAndDown_new(); 
	} // main end
}// class end