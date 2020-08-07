package parkingLotSystem_Too_Grandiose;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParkViewer {
	
	private Scanner scanner;
	
	
	public ParkViewer() {
		scanner = new Scanner(System.in);
		
	}
	
	public void parkMeterMenu() throws ParseException {
		// 주차장 미터기(?) 메뉴판
		
		int choice;
		int empty;
		int record;		
		while(true) {
			choice = scanner.nextInt();
			System.out.println("=====================================");
			System.out.println("============== 0000 주차장 =============");
			System.out.println("     1. 입고         2. 출고         3. 종료(관리자)");
			
			if(choice == 1) {
				System.out.println("  1. 빈 차고 확인    2. 뒤로 ");
				empty = scanner.nextInt();
				if (empty == 1) {
					System.out.println();// 빈 차고 목록 보여주기
					System.out.println("(빈 차고 중)차량 입고기록을 확인할 차고를 선택해주세요");
					System.out.println(      ); // 여기다 차고를 어떻게 표시한다? 일단 Array부터 해결해야 할 듯
					record = scanner.nextInt(); //단순 번호보다는 차고를 바로 보여주는 게 좋지 않을까? nextInt()안에 아름다운 애를 입력해주자
					
					if(record == -1) { 	// 임시로 정함 뭔지 몰겠음				
						System.out.println("잘못된 입력입니다. 해당 차고에 차가 존재하고 있습니다.");
						empty = scanner.nextInt(); //돌아가기
					}else if (record != -1  ) { // 임시로 정함 뭔지 몰겠음   // 1)해당 차고 번호 보여주고 2)시간 입력시키고 3)차량번호 입력시키자!
						System.out.println("======== 차고 번호: " + "=========");
						// 차고 및 시간 입력
						customerInput();
						
						
						
					}					
					
				}else if (empty == 2) {
					System.out.println(">");
					choice = scanner.nextInt();
					// 이렇게 하면 빠져나가겠지. 아름다움!
				}else {
					System.out.println("잘못된 입력입니다.");					
				}
				
			}else if(choice == 2) {
				
				
			}else if(choice == 3) {
				
			break;
			}
			
			
		} // while end
		
	}
	
	
	DateFormat sdf = new SimpleDateFormat("HH:mm");//시간포맷
	
	public void customerInput () throws ParseException{
								
		ParkVO[] c = new ParkVO[5];
		int index;
		
		System.out.println("차량번호 / 시간을 입력해 주십시오.");
		System.out.print("들어온 시간(시간:분): ");
				
		c[index].setEnteringHM(scanner.nextLine());
		Date entering = sdf.parse(c[index].getEnteringHM());
		
		System.out.println("입력된 들어온 시간: " + entering); // 확인용
		
		}
		
		
	 // customerInput end
//		==================================================		
	
			
				 
	
	
	public void customerOutput () throws ParseException{
		ParkVO c = new ParkVO();
		int index;
		
		System.out.println("차량번호 / 시간을 입력해 주십시오.");
		System.out.print("나가는 시간(시간:분): ");
		
		c.setLeavingHM(scanner.nextLine());
		Date leaving = sdf.parse(c.getLeavingHM());
		
		System.out.println("입력된 나가는 시간: " + leaving); // 확인용
		
		System.out.print("차량번호: ");
		c.setPlateNumber(scanner.nextLine());
		
		
	} // customerOutput end
	
	
	public int parkingFeeCaculator () {
		
		if(entering.after(leaving)){
		     long diffMs = leaving.getTime() - d2.getTime();
		     long diffSec = diffMs / 1000;		    
		     System.out.println("The difference is "+min+" minutes and "+sec+" seconds.");
		    }

		    if(d1.before(d2)){
		     long diffMs = d2.getTime() - d1.getTime();
		     long diffSec = diffMs / 1000;
		     long min = diffSec / 60;
		     long sec = diffSec % 60;
		     System.out.println("The difference is "+min+" minutes and "+sec+" seconds.");
		    }

		    if(d1.equals(d2)){
		     System.out.println("The difference is 0 minutes and 0 seconds.");
		    }	
		
	}
	
	
	
	
	
} // class end
