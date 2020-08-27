package Ch04.Practices;
import java.util.Scanner;

public class Practice8_PhoneBook {
	static Scanner scan = new Scanner(System.in);
	Practice8_Phone[] list;	
	int num;
	int i;
	
	public Practice8_PhoneBook() {
		System.out.print("�ο��� >> ");
		num = scan.nextInt();	
		list = new Practice8_Phone [num];
		for (int i = 0; i<num;i++) {
			list[i] = new Practice8_Phone();
		}
		run();
	}
	
	private void show(int i) {//  �� �۵��� ���ұ�? �ϳ��� �ǰ� �� �������� �ȵǴ°ǵ�? //�Ű�����?!!! this!!�� ������ �ƴҵ�
//		this.i = i;
		System.out.println(list[i].name + "�� ��ȣ�� " + list[i].tel + "�Դϴ�");
	}
	
	public void input() {				
		for (int i = 0; i<num;i++) {
			System.out.print((i+1) +"�� -�̸�>> ");
			list[i].name = scan.next();
			list[i].tel = scan.nextLine();
			System.out.print((i+1) +"�� -��ȭ��ȣ>> ");
			list[i].tel = scan.nextLine();
			
		}
		System.out.println("����Ǿ����ϴ�...");
	}
	
	public void search() {
		
		while(true) {		
			System.out.print("�˻��� �̸�>>");
			String nameSearch = scan.next();			
			
			if(nameSearch.equals("�׸�")){ 
				System.exit(0);					
			}		
			
			boolean state = true;

			for (int i = 0; i<num; i++) {
				if(nameSearch.equals(list[i].name)) {
					show(i);//�۵� �̻�. //no! ����� ����!!!	/	
					state = false;						
				}
			}
			
			if(state == true) { // �� �κ��� 2�ð��� �ص� ���� ã�ƺ�. Shame!
				System.out.println(nameSearch+"�� �����ϴ�.");
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
