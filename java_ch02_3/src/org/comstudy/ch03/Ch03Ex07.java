package org.comstudy.ch03;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Ch03Ex07 {

	public Ch03Ex07() {
//		test07();
		test08();
	}
	
	public static void main(String[] args) {
		new Ch03Ex07();
	}
	
	public void test10() {
		// *********
		// **** **** 
		// ***   *** 
		// **     **
		// *       * 
		// **     **
		// ***   ***
		// **** ****
		// *********
		
		
		
	}
	
	
	
	
	public void test09() {
		// ^^^^*
		// ^^^***
		// ^^*****
		// ^*******
		// *********
		
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
		
		//    **
		//   ***
		//  ****
		// *****
		
		for (int i = 0; i<4 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				System.out.printf("%c", '*');
			}	
			System.out.println();
		}
			
		
		
		
		
		
	}
	
	
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
