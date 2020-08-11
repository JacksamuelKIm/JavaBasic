package homework2;
import java.util.Scanner;
public class RSP {
	static Scanner scan1 = new Scanner(System.in);
	static Scanner scan2 = new Scanner(System.in);
	static String cheolSoo0, cheolSoo;
	static String yeongHee0, yeongHee;
	
	public static void main(String[] args) {
		System.out.println("=============== 천하제일 가위바위보 대회================");
		
		// 철수 입력 받기
		System.out.print("철수 >> ");
		cheolSoo0 = scan1.nextLine();
		while(true) { // 제대로 입력 안하면 무한 반복
			if (!(cheolSoo0.equals("가위")||cheolSoo0.equals("바위")||cheolSoo0.equals("보")))  {
				System.out.println("가위,바위,보 중에서만 입력하세요. 오타가 아니라면 초딩인가....");
				System.out.print("철수 >> ");
				cheolSoo0 = scan1.nextLine();
			}else  {
				cheolSoo = cheolSoo0;
				break;
			}
		}
		
//		System.out.println("철수 결과 살아있나 보자: " + cheolSoo); while loop에서 값이 잘 나오나 확인하려고 입력
		
		
		// 영희 입력 받기
		System.out.print("영희>> ");
		yeongHee0 = scan2.nextLine();
		while(true) { // 제대로 입력 안하면 무한 반복
			if (!(yeongHee0.equals("가위")||yeongHee0.equals("바위")||yeongHee0.equals("보")))  {
				System.out.println("가위,바위,보 중에서만 입력하세요. 오타가 아니라면 초딩인가....");
				System.out.print("영희>> ");
				yeongHee0 = scan2.nextLine();
			}else  {
				yeongHee = yeongHee0;
				break;
			}
		}	
				
		// 가위바위보 승패가르기.  무승부 시 무한 반복
		while(true) {
			if (cheolSoo.equals(yeongHee)) {  
				System.out.println("무승부입니다. 다시 하세요");
				System.out.print("철수 >> ");
				cheolSoo = scan1.nextLine();
				System.out.print("영희>> ");
				yeongHee = scan2.nextLine();
			} else {
			  break;
			}
		} //while end 
		
				
			if ((cheolSoo.equals("가위") && yeongHee.equals("바위"))) { 
				System.out.printf("철수 결과: %s  영희 결과: %s\n",cheolSoo, yeongHee);
				System.out.println("	영희 승");			
				System.out.println("게임 끝. 집에가라");
				
			} else if ((cheolSoo.equals("가위") && yeongHee.equals("보"))) { 
				System.out.printf("철수 결과: %s  영희 결과: %s\n",cheolSoo, yeongHee);
				System.out.println("	철수 승");			
				System.out.println("게임 끝. 집에가라");			
						
			} else if ((cheolSoo.equals("바위") && yeongHee.equals("가위"))) { 
				System.out.printf("철수 결과: %s  영희 결과: %s\n",cheolSoo, yeongHee);
				System.out.println("	철수 승");			
				System.out.println("게임 끝. 집에가라");
				
			} else if ((cheolSoo.equals("바위") && yeongHee.equals("보"))) { 
				System.out.printf("철수 결과: %s  영희 결과: %s\n",cheolSoo, yeongHee);
				System.out.println("	영희 승");			
				System.out.println("게임 끝. 집에가라");
								
			} else if ((cheolSoo.equals("보") && yeongHee.equals("가위"))) { 
				System.out.printf("철수 결과: %s  영희 결과: %s\n",cheolSoo, yeongHee);
				System.out.println("	영희 승");			
				System.out.println("게임 끝. 집에가라"); 	
								
			} else if ((cheolSoo.equals("보") && yeongHee.equals("바위"))) { 
				System.out.printf("철수 결과: %s  영희 결과: %s\n",cheolSoo, yeongHee);
				System.out.println("	철수 승");			
				System.out.println("게임 끝. 집에가라");
				
			}
			
	} // main end

} // class end
