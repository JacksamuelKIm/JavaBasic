package ch04_Practice12;
import java.util.Scanner;

public class View {
	Scanner scanner = new Scanner(System.in);	
	public View() {

		
		Utils utils = new Utils();
		
		System.out.println("명품 콘서트홀 예약시스템입니다.");		
		while(true) {			
			
			switch (utils.mainMenu()) {			
			
			case 1 :
				utils.chooseSeat();				
				;break;
			case 2 :
				utils.showSeat();
				;break;
			case 3 :
				utils.cancel();
				;break;
			case 4 :
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
				;break;
			default :
				System.out.println("없는 메뉴입니다.");
				;break;
				
			}			
			
			}
		}
	
	
}
