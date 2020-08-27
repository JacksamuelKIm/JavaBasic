package Ch04.Practices;
import java.util.Scanner;

public class Practice8_PhoneBook {
	static Scanner scan = new Scanner(System.in);
	Practice8_Phone[] list;	
	int num;
	int i;
	
	public Practice8_PhoneBook() {
		System.out.print("인원수 >> ");
		num = scan.nextInt();	
		list = new Practice8_Phone [num];
		for (int i = 0; i<num;i++) {
			list[i] = new Practice8_Phone();
		}
		run();
	}
	
	private void show(int i) {//  왜 작동을 안할까? 하나는 되고 왜 나머지는 안되는건데? //매개변수?!!! this!!의 문제가 아닐듯
//		this.i = i;
		System.out.println(list[i].name + "의 번호는 " + list[i].tel + "입니다");
	}
	
	public void input() {				
		for (int i = 0; i<num;i++) {
			System.out.print((i+1) +"번 -이름>> ");
			list[i].name = scan.next();
			list[i].tel = scan.nextLine();
			System.out.print((i+1) +"번 -전화번호>> ");
			list[i].tel = scan.nextLine();
			
		}
		System.out.println("저장되었습니다...");
	}
	
	public void search() {
		
		while(true) {		
			System.out.print("검색할 이름>>");
			String nameSearch = scan.next();			
			
			if(nameSearch.equals("그만")){ 
				System.exit(0);					
			}		
			
			boolean state = true;

			for (int i = 0; i<num; i++) {
				if(nameSearch.equals(list[i].name)) {
					show(i);//작동 이상. //no! 제어문의 문제!!!	/	
					state = false;						
				}
			}
			
			if(state == true) { // 이 부분은 2시간을 해도 몰라서 찾아봄. Shame!
				System.out.println(nameSearch+"이 없습니다.");
			}					
		}		
	}		

	public void run() {
		input();
		search();		
	}
	
	public static void main(String[] args) {
		new Practice8_PhoneBook();		
	}
}
