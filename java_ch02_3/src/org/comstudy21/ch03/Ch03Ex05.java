package org.comstudy21.ch03;

public class Ch03Ex05 {

	public static void main(String[] args) {
		
		����: for (int i = 0; i<5; i++) {
			for(int j = 0; j<5; j++) {
				if (j == 2) break ����;  //loop �� �ܰ� �̻� ����� ���� �� label ���  
				System.out.println(""+i+j+"\t");
			}
			System.out.println();
		}
	}

}
