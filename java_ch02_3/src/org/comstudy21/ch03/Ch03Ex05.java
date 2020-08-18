package org.comstudy21.ch03;

public class Ch03Ex05 {

	public static void main(String[] args) {
		
		여기: for (int i = 0; i<5; i++) {
			for(int j = 0; j<5; j++) {
				if (j == 2) break 여기;  //loop 두 단계 이상 벗어나고 싶을 때 label 써라  
				System.out.println(""+i+j+"\t");
			}
			System.out.println();
		}
	}

}
