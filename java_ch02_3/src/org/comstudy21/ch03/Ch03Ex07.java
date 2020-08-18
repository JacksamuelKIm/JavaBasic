package org.comstudy21.ch03;

import java.util.Scanner;

public class Ch03Ex07 {

	public Ch03Ex07() {
//		test07();
//		test08();
//		test09();
//		test10();
		test11();
//		test12();
	}
	
	

	public static void main(String[] args) {
		new Ch03Ex07();
	}
	
	private void test12() {
				// 7�� 7��
				// ũ�� �Է� : 7 (Ȧ���� �Է� �� �� �ֵ���)
				
				//*******
				//**    *
				//* *   *
				//*  *  *
				//*   * *
				//*    **
				//*******
		
		Scanner scanner = new Scanner(System.in);	
				
		
		System.out.print("ũ�� �Է�(Ȧ����) : ");
		int input = scanner.nextInt();
		while(input <=1 || input%2 ==0) {  // ��ȿ�� �˻�! 1�� �Է¹��� ���ϵ��� �Ϻη� ��. empty ��������
			System.out.println("���� ���� �����Դϴ�. �ٽ� �Է��� �ֽʽÿ�");
			System.out.print("ũ�� �Է�(Ȧ����) : ");
			input = scanner.nextInt();
		}
			
//		int empty = input - 3; // ���� ���� .  ���⼭ �� 3�� �� ���� �ȿ����� *�� ��� ����
//		int pattern = 3; // �̰� �� ���������� �翬�Ѱ�
//		�� ģ���� ��ü�� ����� �ʾ����� �̷� ���� �����غ��� �Ẹ�鼭 *�� ���� ��ǥ�� i,j��� ���� ������. ���� i==j 
		
		for (int i = 0; i < input ; i++) {
			for (int j = 0; j < input ; j++) {			
				if((i==0 || i==input-1) || (j==0 || j==input-1)) {
					System.out.print('*');
				} else if(i==j) {
					System.out.print('*');
				} else {
				System.out.print(' ');
				}			
			}		
			System.out.println();
		}
	}
	
	
	public void test11() {
		// *********
		// **** **** 
		// ***   *** 
		// **     **
		// *       * 
		// **     **
		// ***   ***
		// **** ****
		// *********
		
		for(int i = 0; i<5 ; i++) {
			for(int j = 0; j<9 ; j++) {
				if (4-i<j && j<4+i){
					System.out.print(' ');
				} else {
					System.out.print('*');
				}	
			}
			System.out.println();
		}
		
		for(int i = 0; i<4 ; i++) {
			for(int j = 0; j<9 ; j++) {
				if (1+i<j && j<7-i) {
					System.out.print(' ');
				} else {
					System.out.print('*');
				} 
			}
			System.out.println();
		}
	}
	
	private void test10() {
		
		// ^^*****
		// ^*******
		// *********
		// ^*******
		// ^^*****
		// ^^^***
		// ^^^^*
		
		for (int i = 0; i < 3 ; i++) {
			for (int j = 0; j < 7+i ; j++) {				
				if (j<2-i) {
					System.out.print('^');
				} else {
					System.out.print('*');
				}
			}
			System.out.println();
		}
		
		for (int i = 0; i < 4 ; i++) {
			for (int j = 0; j < 8-i ; j++) {
				if (j<1+i) {
					System.out.print('^');
				} else {
					System.out.print('*');
				}
			}
			System.out.println();
		}
	}
	
	
	
	
	public void test09() {
		// ^^^^*
		// ^^^***
		// ^^*****
		// ^*******
		// *********
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5+i ; j++) {//				
				System.out.printf("%c", j<4-i?'^':'*');										
			}
			System.out.println();
		}
	}
	
	
	public void test08() {
		// *****
		//  ****
		//   ***
		//    **
		//     *
		//    **
		//   ***
		//  ****
		// *****		
		for (int i = 0; i<5; i++) {
			for (int j = 0; j<5; j++) {
				System.out.printf("%c" , j>=i ? '*':' ');
			}
			System.out.println();
		}		
		for (int i = 0; i<4 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				System.out.printf("%c", j<3-i? ' ': '*');	
			}	
			System.out.println();
		}
	} // end of test 08
	
	
	public void test07() {
		// *****
		// ****
		// ***
		// **
		// *
		// **
		// ***
		// ****
		// *****						
		for (int i = 0 ; i<9 ; i++) {
			for (int j = 0; j<5-i; j++) {
				System.out.printf("%c", '*');
			}
			for (int j = 0; j < i-4 ; j++) {
				System.out.printf("%c", '*');				
			}
			System.out.println();			
		}
	} // test07 end
	
	public void test06() {
		// *****
		// ^****
		// ^^***
		// ^^^**
		// ^^^^*
		
		for (int i = 0; i<5 ; i++) {
			for (int j = 0 ; j<5 ; j++) {
			System.out.printf("%c", j <= i-1 ? '^' : '*' );
			}
			System.out.println();
		}		
	}
	
	
	public  void test05 () {
		// ^^^^*
		// ^^^**
		// ^^***
		// ^****
		// *****
		
		for(int i = 0 ; i < 5 ; i++) {
			for (int j = 0; j<5; j++) {
				System.out.printf("%c",j== 4-i? "^":"*");
			}
		System.out.println();			
		}
	
	}
	
	
	public  void test04 () {
		// ^^^^* 0 1
		// ^^^** 1 2
		// ^^*** 2 3
		// ^**** 3 4
		// ***** 4 5

		for(int i=0; i<5; i++) {
			for(int k=0; k<4-i; k++) {
				System.out.print(" ");
			}
			for(int j=0; j<i+1; j++) {
				System.out.printf("%c", '*');
			}
			System.out.println();
		}
	
	} //end of test04
	
	
	
	
	public void test03() {
		// *	       0   1
		// **          1   2
		// ***         2   3
		// ****        3   4
		// *****       4   5
		
		for(int i = 0 ; i < 5 ; i++) {
			for (int j = 0; j<i+1 ;j++) {
				System.out.printf("%c",'*');
			}
		System.out.println();			
		}
		
	}
	
	
	public void test03_Self() {
		// *	       0   1
		// **          1   2
		// ***         2   3
		// ****        3   4
		// *****       4   5
		
		for(int i = 0 ; i < 5 ; i++) {
			for (int j = 0; j<=i ;j++) {
				System.out.printf("%c",'*');
			}
		System.out.println();			
		}
			
		
		
		
	}
	
	
	
	public static void test02_Self() {
		
		for(int i=5; i>0 ; i--) {
			for(int j=i; j>0; j--) {
				System.out.printf("%c",'*');
			}
			System.out.println();
		}
		
	}
		
	
	
	public static void test02 (){
		// *****    0   5
		// ****     1   4
		// ***      2   3
		// **       3   2
		// *        4   1
		
		
		for(int i=0; i<5 ; i++) {
			for(int j=0; j<5-i; j++) {
				System.out.printf("%c",'*');
			}
			System.out.println();
		}
		
	}
	
	
	public static void test01() {
		// *****
		// *****
		// *****
		// *****
		// *****
		
		for(int i=0; i<5 ; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%c",'*');
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
