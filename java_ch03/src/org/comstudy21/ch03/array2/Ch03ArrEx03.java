package org.comstudy21.ch03.array2;

public class Ch03ArrEx03 {

	public static void main(String[] args) {
		
		// intArray라고 지어진 int타입 레퍼런스 변수를 만들고(주소 부여) stack memory에 저장, 4행(크기4)짜리 2차원 변수를 heap에 생성. 주소로 연결 
		int [][] intArray = new int [4][]; 
			
			 intArray[0]= new int[3]; // intArray의 첫번째 행(index는 0)에 
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
