package homework.Ch3;

public class Exercises_Ch3 {
	
	public Exercises_Ch3() {
		//이론문제
//		연습문제1(); 
//		연습문제2();
//		연습문제3();
//		연습문제4();
//		연습문제5();
//		연습문제6();
//		연습문제7();
//		연습문제8();
//		연습문제9();
//		연습문제10();
//		연습문제11();
//		연습문제12();
//		연습문제13();
//		연습문제14();
	}
	
	private void 연습문제1() {
		/*1. 
		 * 1) 출력 결과: 1 3 5 7 9
		 * 2) 무엇을 하는 코드인가?:
		 * 
		 * 정수타입인 i에 먼저 1이라는 값을 부여하여 
		 * i를 띄어쓰기 " "와 함께 출력한다. 
		 * 
		 * 그리고 i(현재값 1)에 2를 더하여 새 값(3)을 할당하고
		 * 동일한 작업을 i의 값이  9가 될 때까지 (i<10) 반복한다.
		  */
		for (int i = 1; i < 10 ; i+=2) {
		System.out.print(i+" ");
		}		
	}
	
	private void 연습문제2() {
		/* 2. 출력 결과 sum값이 다른 하나는?
		 * 
		 * 1) for(int i=0; i<10; i++) sum+=i;  // 45
		 * 2) for(int i=9; i>0 ; i--) sum+=i;  // 45 
		 * 3) for(int i=0; i>10; i++) sum++;   // for문 실행 자체가 안됨. 0(초기값?) 
		 * 
		 */		
	}
	
	private void 연습문제3() {
		//답 : continue
		int sum=0, i=1;		
		while(i<100) {
			if(i%3 !=0) {
				i++;	
				continue;  // 빈 칸
			}
			else sum += i; //2+3+5+6+8+9
			i++;
				 // 문제 의도는 알겠는데 이 else가 빠져야 결과가 대조되면서 더 보기 좋을듯
				 // 이 것 때문에  conitnue 있든 없든 결과가 똑같음. 1683
				 // else 없으면 3333
		}
		System.out.println(sum);
	}
	
	private void 연습문제4() {
		//답 i>50
		int sum = 0, i = 1;
		while(true) {
			if(i>50)/* <-빈칸자리 */ break;
			sum +=i;
			i++;
		}
		System.out.println(sum);
	}
	
	private void 연습문제5() {
		//답: 4 
		int [] n1 = {1,2,3,4,5}; // n1 이라는 배열 변수(주소)를 만들고, 크기가 5이고 요소 1,2,3,4,5인 배열 공간할당
		int n2 [] = {0}; // 아 배열 명이랑 변수 이름이랑 순서 바뀌어도 상관은 없구나!! System.out.println(n2[0]);
		int [] n3 = new int [3]; // n3라는 이름의 배열변수(주소)?을 만들고, 거기에 크기3짜리 배열 자리를 할당
// 답4	int n[3] = new int [3];  문법적으로 말이 안 됨. 처음 앞은 그냥 주소만 할당해주는 건데 뭔 인덱스를 넣고 있음?  
	}
	
	private void 연습문제6() {
		//답: 4
		int array[] = {1,2,3,4,5};
		
		array[0] = -1; System.out.println("index0에 있는 애가 1에서 -1로 바뀜. array[0] = " + array[0]);
		int [] list = array; //list라는 배열에  array의 레퍼런스 값(주소 넣어줌) 배열 공간은 하나고 그대로임 .따라서 array의 요소 바뀌면 list의 요소도 동일하게 바뀜
		System.out.println(array[4]); // 그냥 5지 뭐
//	답4:	array[array.length] = 100;  //array는 크기가 5이고 마지막 요소의 인덱스가 4인데, 인덱스 5에 뭔가 할당하려하므로 exception		
	}

	private void 연습문제7() {
		String [] c = new String [10]; // 문제에서는 임의의 문자 10개도 넣어주라는 뉘앙스인데 그냥 스킵
		int [] n = {1, 2, 3, 4, 5};
		char [] day = {'일', '월', '화', '수', '목', '금', '토'}; // 내가 char라는 타입 공부 부족한듯
						
	}
	
	private void 연습문제8() {
		boolean [] bool = {true, false, false, true};
		double d [][][]= new double [5][4][];
		int var [][] = { {1,2,3}, {4,5,6}, {7,8,9}, {10,11,12} };		
	}

	private void 연습문제9() {
//		(1)오류 원인 : myArray라는 이름의 배열 레퍼런스(주소?)만 생성되었을 뿐, 데이터를 넣어줄 배열 공간이 생성되어 있지 않다.
//		 		    따라서 뭔가를 넣어주는 것 자체가 불가능.
//	    (2) 오류 수정: 배열 공간을 생성해주고 myArray라는 배열주소에 그 공간 할당	
		int myArray [] = new int [2];
		myArray[0] = -1;
		myArray[1] = myArray[0] + 1;
		
	}

	private void 연습문제10() {
//		(1)
		char[] alpha= {'a', 'b', 'c', 'd'};
		for(int i = 0; i<4; i++) 
			System.out.print(alpha[i]);
		
//		(2)		
		for(int i=0 ; i<4; i++ ) {
			char c = alpha[i];
			System.out.print(c);
		}
	}

	private void 연습문제11() {
//		답: 1 3 1 4 2
		int n [][] = {{1}, {1,2, 3}, {1}, {1,2,3,4}, {1,2}};
		for(int j=0; j<n.length; j++) {
			System.out.print(n[j].length + " ");
		}
		
	}

	private void 연습문제12() {
		//시각적으로 보다 이해가 쉽도록 해봤습니다.		
		double [][] array = {
							 {1.1, 1.2, 1.2, 1.4}, 
				             {2.1, 2.2}, 
				             {3.1, 3.2, 1.2}, 
				             {4.1}
				             						};		
	}

	private void 연습문제13() {
//		답: 1번
		
	}
	private void 연습문제14() {
//		자바 프로그램이 문법에 맞지 않게 작성되었을 때, 컴파일러는 컴파일 오류를 발생
//		시킨다. 예외는 컴파일 오류가 없는 자바 프로그램이 실행 중에 발생한 오류를
//		말하며, 프로그램이 이 오류에 대한 대처가 없다면 바로 종료된다. 이런 오류가 발생
//		할 가능성이 있는 코드들을 try 블록에 넣고, 오류가 발생하면 처리할 코드는
//		catch 블록에 넣는다. finally 블록은 생략 가능하다 
		
	}






	public static void main(String[] args) {
		new Exercises_Ch3();

	}

}
