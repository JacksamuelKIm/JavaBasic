package org.comstudy21.ch03.array2;

public class Ch03ArrEx03 {

	public static void main(String[] args) {
		
		// intArray��� ������ intŸ�� ���۷��� ������ �����(�ּ� �ο�) stack memory�� ����, 4��(ũ��4)¥�� 2���� ������ heap�� ����. �ּҷ� ���� 
		int [][] intArray = new int [4][]; 
			
			 intArray[0]= new int[3]; // intArray�� ù��° ��(index�� 0)�� 
			 intArray[1]= new int[2];
			 intArray[2]= new int[3];
			 intArray[3]= new int[2];
			 
		for(int i = 0; i<intArray.length; i++) {
			for(int j = 0; j<intArray[i].length; j++) {
				intArray [i][j] = ((i+1)*10)+j;			
			}				
		}
			 
		for(int i = 0; i<intArray.length; i++) {
			for(int j = 0; j<intArray[i].length; j++) {
				System.out.print(intArray [i][j] + " ");			
			}
			System.out.println();
		}
		
		System.out.println(intArray[0]);

	}

}
