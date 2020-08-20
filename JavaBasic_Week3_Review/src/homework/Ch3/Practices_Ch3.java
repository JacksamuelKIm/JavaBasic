package homework.Ch3;
import java.util.Scanner;
import java.util.Random;

public class Practices_Ch3 {

	public Practices_Ch3() {
//		실전문제1();
//		실전문제2();
//		실전문제3();
//		실전문제4();
//		실전문제5();
//		실전문제6();
//		실전문제7();
//		실전문제8();
//		실전문제9();
		실전문제10();
//		실전문제11();
//		실전문제12();
//		실전문제13();
//		실전문제14();
//		실전문제15();
//		실전문제16();
		
	}
	
	
	
	private void 실전문제1() {
//		(1) 2부터 98까지의 2의 배수의 합을 구하여 그 합을 출력하는 코드이며 합은 2450 이다
		int sum =0, i=0;
		while (i<100) {
			sum = sum + i;
			i+=2;			
		}
		System.out.println(sum);
		
//		(2) WhileTest.class 참조
//		(3) ForTest.class 참조
//		(4) DoWhile.class 참조			
	}

	
	
	private void 실전문제2() {
		int n [][] = {{1}, {1,2,3}, {1}, {1, 2, 3, 4}, {1, 2}};
//		int j = 0;
		for(int i=0; i<=4 ; i++) {			
			
			for(int j = 0; j<n[i].length;j++ ) {
//				j = n[i].length - 1;
				System.out.print(n[i][j] + " ");
			}
			System.out.println();
		}			
	}

	
	
	private void 실전문제3() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하시오>>");
		int input = scanner.nextInt();
					
		for(int i = input; i>0 ; i--) {	
			for(int j = i; j>0; j--) {
				System.out.print("*");
			}			
			System.out.println();
		}		
		scanner.close();
	}

	
	
	private void 실전문제4() {
		Scanner scanner = new Scanner(System.in);
		
		//알파벳으로 이루어진 문자열 alpha 
		String [] alpha = {"a","b","c","d","e"};
		
		//콘솔창으로부터 알파벳 입력받기
		System.out.print("소문자 알파벳 하나를 입력하시오>>");	
		String input = scanner.next();
		
		//입력받은 소문자 알파벳의 인덱스 번호 찾기		
		int index = -1;
		for (int i = 0; i<alpha.length ; i++) {
			if(alpha[i].equals(input)) {
				 index = i;
			 }
		 }
//		System.out.println("입력받은 소문자의 index: " + index); // 잘 되나 확인차
		
		//알파벳 출력 코드
		for(int i = index; i>=0 ; i--) {
			for(int j = 0; j<= i; j++) {
				System.out.print(alpha[j]);
			}
			System.out.println();
		}						
		scanner.close();
	}

	
	
	private void 실전문제5() {
		Scanner scanner = new Scanner(System.in);
		
		//양의 정수 10가 담길 배열공간을 정수 타입의 배열 레퍼런스 num 할당
		int[] num  = new int[10];
		
		System.out.print("양의 정수 10개를 입력하시오>>");
		for (int i = 0; i< 10; i++) {
			num[i] = scanner.nextInt();  //여기서 배열의 크기를 넘어가는 정수갯수가 입력될 것을 대비해 exception 던져줘야 하지 않을까?	
		}
//		System.out.println(num[6]); // 잘 되나 확인차
		
		
		//3의 배수 출력하기
		System.out.print("3의 배수는 ");
		for (int j = 0; j<num.length; j++) {
			if(num[j]%3!=0) {
				continue; //3의 배수 아닌 애들이 나올 경우에는 그냥 다음 순번 j로 넘긴다
			}else {
				System.out.print(num[j] + " ");
			}				
		}		
		scanner.close();		
	}
	
	
	
	private void 실전문제6() {
		Scanner scanner = new Scanner(System.in);
		
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};		
		int count = 0; // 갯수
		int rest = 0; // 그 지폐 뺀 나머지
		
		System.out.print("금액을 입력하시오>> ");
		int input = scanner.nextInt();		
		for (int i =0; i<unit.length; i++) {
			//첫 입력시에는 나머지가 없으니 input을 그대로 받는다.
			if(i==0) {
			count = input/unit[i];			
			System.out.println(unit[i]+"원 짜리 : " + count + "개");
			rest = input%unit[i];
			continue;
			} 
			
			// 10000원 단위부터는 나머지 이용
			count = rest/unit[i];
			// 해당되는 돈의 단위의 갯수가 0일 시에는 출력하지 않는다.
			if (count !=0) {
				System.out.println(unit[i]+"원 짜리 : " + count + "개");	
			}			
			rest = rest%unit[i];			
		}		
		scanner.close();
	}

	private void 실전문제7() {
		Random r = new Random();
		int sum = 0;
		
		// 랜덤숫자 생성 및 배열에 할당
		System.out.print("랜덤한 정수들 : ");
		
		int [] num = new int [10];		
		for (int i = 0; i<num.length; i++) {
			num[i] = r.nextInt(10) + 1; // 0부터 9까지의 랜덤수가 생성되므로 한 칸씩 올리면 1~10
			sum = sum + num[i]; // 평균값 구하기 위해서 넣어놓기
			System.out.print(num[i] + " ");
		}
		System.out.println();
		System.out.println("평균은 " + (double) sum/10);		
	}




	private void 실전문제8() {
		Scanner scanner = new Scanner(System.in);
		Random r = new Random();
				
		System.out.print("정수 몇개?");
		int input = scanner.nextInt();
		
		//유효성 검사(?)
		while(input <0 || input >100  ) {
			System.out.print("정수 몇개? 제대로 입력할 때까지 반복이여");
			input = scanner.nextInt();				
		} 
		
		//랜덤 정수의 갯수 제한해주고 그 수들을 배열에 담기
		int [] num = new int [input];      // 랜덤 정수 담아줄 배열 생성 - 문제 7 참조 
		for(int i = 0; i<input ; i++) {
			num[i] = r.nextInt(100) + 1; //0~99 를 1~100으로 바꿔주고 담기			
		}
		
		// 배열에 같은 수가 없도록 하기.    이거 좀 살짝 불안
		for(int i = 0; i<input ; i++) {
			for(int j = 0; j<input ; j++) {
				while (i!=j && num[i] == num[j]) {
					num[i] = r.nextInt(100) + 1;
				}
			}
		}		
		
		// 배열 출력. 일단 있는대로 다 뽑아내기는 해야함
		for (int i = 0; i<input ; i++) {
			if (i%10 ==0) {     // 이거 매우 맘에 듬. 아마 곱하기 문제를 이렇게 했으면 심플했을듯
				System.out.println();
			}		
			
			if(num[i]<10) { // 숫자 정렬 아름답게 해주기
				System.out.print(" "+num[i] + " ");
			} else {
				System.out.print(num[i] + " "); 	
			}			
		}
		
	} // end of 연습문제 8
	
	
	
	private void 실전문제9() {
		Random r = new Random();
		
		
		// 배열 생성 및 런댐 정수 할당
		int [][] num = new int [4][4];
		
		
		for (int i = 0; i < 4; i++) {			
			for (int j = 0; j < 4; j++) {				
				num[i][j] = r.nextInt(16)+1;
				if(num[i][j]<10) { //줄 정렬을 위한 아름다운 기술. printf 모르고 알고 싶지도 않음
					System.out.print(num[i][j] + "   "+" "); //띄어쓰기 한 칸은 1의 자리와 10의 자리 차이 반영
					continue;
				}
				System.out.print(num[i][j] + "   ");				
			}
			System.out.println();
		}
		
	}// end of 실전문제9




	private void 실전문제10() {
		Random r = new Random();		
		int [][] num = new int [4][4];
		int coor[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}; 
		                         //좌표[0][0] ~ [3][3] 까지 총 16개
		
		int coorRan[] = new int [10]; //랜덤 좌표 생성. 10개 만
		
		for (int i = 0; i<coorRan.length; i++) {
			coorRan[i] = r.nextInt(16);			
		}				
		// 좌표 중복 제거기
		for(int i = 0; i<coorRan.length ; i++) {
			for(int j = 0; j<coorRan.length ; j++) {
				while (i!=j && coorRan[i] == coorRan[j]) {
					coorRan[i] = r.nextInt(16);
				}
			}
		}	
		
		//확인 작업 위한 출력
		
		for(int i = 0 ; i<coorRan.length ; i++) {
			System.out.print(coorRan[i] + " ");
		}
		System.out.println();
		
		//랜덤으로 생성된 좌표에 랜덤 생성 값 할당하기
		
		for(int i = 0; i<coorRan.length; i++) {
			for (int j = 0; j<coor.length; j++) {
				if (coorRan[i] == j ) {					
					switch (j) { // 랜덤생성된 좌표에 랜덤 값 부여
					case 0: num[0][0] = (r.nextInt(10)+1);System.out.println("num[0][0] : "+ num[0][0] + " ");break;
					case 1: num[0][1] = (r.nextInt(10)+1);System.out.println("num[0][1] : "+ num[0][1] + " ");break;
					case 2: num[0][2] = (r.nextInt(10)+1);System.out.println("num[0][2] : "+ num[0][2] + " ");break;
					case 3: num[0][3] = (r.nextInt(10)+1);System.out.println("num[0][3] : "+ num[0][3] + " ");break;
					case 4: num[1][0] = (r.nextInt(10)+1);System.out.println("num[1][0] : "+ num[1][0] + " ");break;
					case 5: num[1][1] = (r.nextInt(10)+1);System.out.println("num[1][1] : "+ num[1][1] + " ");break;
					case 6: num[1][2] = (r.nextInt(10)+1);System.out.println("num[1][2] : "+ num[1][2] + " ");break;
					case 7: num[1][3] = (r.nextInt(10)+1);System.out.println("num[1][3] : "+ num[1][3] + " ");break;
					case 8: num[2][0] = (r.nextInt(10)+1);System.out.println("num[2][0] : "+ num[2][0] + " ");break;
					case 9: num[2][1] = (r.nextInt(10)+1);System.out.println("num[2][1] : "+ num[2][1] + " ");break;
					case 10: num[2][2] = (r.nextInt(10)+1);System.out.println("num[2][2] : "+ num[2][2] + " ");break;
					case 11: num[2][3] = (r.nextInt(10)+1);System.out.println("num[2][3] : "+ num[2][3] + " ");break;
					case 12: num[3][0] = (r.nextInt(10)+1);System.out.println("num[3][0] : "+ num[3][0] + " ");break;
					case 13: num[3][1] = (r.nextInt(10)+1);System.out.println("num[3][1] : "+ num[3][1] + " ");break;
					case 14: num[3][2] = (r.nextInt(10)+1);System.out.println("num[3][2] : "+ num[3][2] + " ");break;
					case 15: num[3][3] = (r.nextInt(10)+1);System.out.println("num[3][3] : "+ num[3][3] + " ");break;					
					}					
				}
			}				
		}
		System.out.println();
		
		for (int i = 0; i<4 ; i++) {
			for (int j = 0 ; j<4 ; j++) {
				if(num[i][j]<10) { //줄 정렬을 위한 아름다운 기술. printf 모르고 알고 싶지도 않음
					System.out.print(num[i][j] + "   "+" "); //띄어쓰기 한 칸은 1의 자리와 10의 자리 차이 반영
					continue;
				}
				System.out.print(num[i][j] + "   ");	
			}
			System.out.println();
		}
		
		//=====================================================
		//위치도 랜덤 생성하려 했으나 실패
		//임의의 자리에 ? 내가 임의로 아무대나 넣으라는 소리야? 아니면 좌표도 랜덤?
		// 좌표도 랜덤이라면 배열 생성단계에서 부터 랜덤 걸어주고, 행의 length 활용?해야 할 듯
		// 근데 그럴려면 Array가 아닌 ArrayList를 해야 할 듯
		
//		int count = 10; //10개만 넣어주어야 하니까
//		for(int i = 0; i<count; i++) {
//			int limitRow = r.nextInt(3)+1; // 4x4니까 그 범위 안에서만 해줘야 하니까
//			int limitColumn = r.nextInt(3)+1; // +1은 bound가 0이 되면 안된다고 해서
//			int row = r.nextInt(limitRow); //행 랜덤 
//			int column = r.nextInt(limitColumn);; // 열 랜덤 
//			
//			num[row][column] = r.nextInt(10)+1; //			 
//		} 
//		
		
		
		// ============================================================
		
		
		
//		 나머지 6개의 빈 칸에 0 넣어주기 // 이거 자동으로 되는 거 같은데?
//		for (int i = 0; i<4; i++) {
//			for (int j = 0; j<4; j++) {
//				if (num[i][j] == -1) {
//					num[i][j] = 0;
//				}
//			}
//		}
		
		
	}// end of 실전문제10
		

	private void 실전문제11() {
		
		
		
		
		
		
		
	}




	private void 실전문제12() {
		// TODO Auto-generated method stub
		
	}




	private void 실전문제13() {
		for (int i=1; i<100; i++) {
			
			//한자리수 369 해결
			if(i<10 && (i%3==0)) {
				System.out.println(i + " 박수 짝");
			} else if (i>=10 && i%10!=0  && ((i/10)%3 == 0 || (i%10)%3 == 0) ) { 
				// 십의 자리나 일의 자리가 369 
				System.out.println(i + " 박수 짝");
			}
			// 10의 자리수에서 십의 자리의 수에 369 들어가는 애들 골라주기
		}		
	}




	private void 실전문제14() {
		// TODO Auto-generated method stub
		
	}




	private void 실전문제15() {
		// TODO Auto-generated method stub
		
	}




	private void 실전문제16() {
		// TODO Auto-generated method stub
		
	}




	public static void main(String[] args) {
		new Practices_Ch3();
	}
	
	
	
	
}
