package comstudy21.ch01;

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
