package Ch04.OpenChallenge;
import java.util.Scanner;
public class WorldGameAPP {
	static Scanner scan = new Scanner(System.in);	
	
	public static void main(String[] args) {
		run();
	}

	private static void run() {
		String wordCurrent = "�ƹ���";
		int lastIndex = wordCurrent.length() - 1;
		char lastChar = wordCurrent.charAt(lastIndex);
		char firstChar = wordCurrent.charAt(0);		
		
		System.out.println("�����ձ� ������ �����մϴ�.");
		System.out.print("���ӿ� �����ϴ� �ο��� �� ���Դϱ�?>>>");
		int numP = scan.nextInt();
		Player[] player = new Player[numP];
		
		//������ �̸� �Է� (Player Ŭ������ �� instance���� name �� �Է�
		for(int i = 0; i<player.length; i++) {//			
			System.out.print((i+1)+"��° ");
			player[i] = new Player();
		}		
		System.out.println("�����ϴ� �ܾ�� �ƹ����Դϴ�.");	
		int j = 0;
		while (true) {
			j = j%numP; // �׷��� ������ �� ��ŭ�� ������ �������ϱ�
			System.out.print(player[j].name  + ">>");
			player[j].getWordFromUser(); 
			if(player[j].word.charAt(0) == lastChar) {
				wordCurrent = player[j].word; 
				lastIndex = wordCurrent.length() - 1; // for �ȿ� ������ �־ �ٷδ� ������ �ȵǾ�����!!!!
				lastChar = wordCurrent.charAt(lastIndex);
				firstChar = wordCurrent.charAt(0);
				j++;
			} else {
				System.out.println(player[j].name + "��/�� �����ϴ�");
				break; // return �ᵵ �Ƿ���
			}			
		}				
		
	}

}
