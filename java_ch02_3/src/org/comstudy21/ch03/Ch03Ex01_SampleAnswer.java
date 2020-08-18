package org.comstudy21.ch03;

public class Ch03Ex01_SampleAnswer {
	static final int Max =21;
	public Ch03Ex01_SampleAnswer() {
//		test5();
//		test6_Self1(); // count
//		test6_Self2(); //flag
//		test6_Flag_SampleAnswer(); //flag
		test6_Count_SampleAnswer(); //count
	}
	
	

	
	
	
	private void test6_Count_SampleAnswer() {
		// (0 -) 1 + 1 - 2 + 3 - 5 + 8 - 13 + 21 = 14
		int total = 2;
		int cnt = 0;
		
		for(int prev=0, cur=1,next=0; cur<=21; next=prev+cur, prev=cur, cur=next) {// �̷��� �ϸ� �Ǻ���ġ�� �� ��ü�� ���� 
			System.out.print(cur);
			if(cnt%2 == 0) {
				System.out.print(" + ");
				total -= cur;
			} else {
				System.out.print(cur==21 ? " = ": " - ");
				total += cur;
			}			
			cnt++;
			
		} // end of for
		System.out.println(total);
	}






	private void test6_Flag_SampleAnswer() {
		// (0 -) 1 + 1 - 2 + 3 - 5 + 8 - 13 + 21 = 14
		int prev = 0; //���� ��
		int cur = 1; // ���� �� 
		int next = 0; // ���� ��
		int total = 2; // ����
		boolean flag = true;
		
		while (cur <= Max) {
			
			next = prev + cur;			
			prev = cur;
			System.out.print(cur);
			if(flag){
				System.out.print(" + ");
				total -= cur;
				flag = false;				
			} else { 
				System.out.print(cur == Max ? " = ":" - ");
				total += cur;
				flag = true;
			}
			
			
			cur = next;				
		}
		System.out.println(total);
	}






	public void test6_Self2() { //flag
		// (0 -) 1 + 1 - 2 + 3 - 5 + 8 - 13 + 21 = 14
				
		boolean flag = false;
		boolean flagPlus = false;
		boolean flagMinus = false;
		int cur = 1;
		int prev = 0;
		int next;
		int total = 1; // ù��° ���� �� �̸� �־�����
		int cnt = 1;
		
		System.out.print(cur); //ù��° ���� �� �Ҵ�� ����� �ۿ���
		while (cur<=21) {			
			next = prev + cur;
			prev = cur;	
			
			if (cnt%2==0) { // ¦��  cnt
				flagPlus = true;
			} else if (cnt>=2 && cnt%2==1) { // Ȧ��  cnt. ù��° ����
				flagMinus = true;
			} 
			
			
			if (flagPlus) { // ¦�� cnt
				total = total + cur;
				System.out.print(" + " + cur);
				flagPlus = false;  // �̷��� �ٲ���� ���̴� �� ��������!!!!
			}
			
			if (flagMinus) { // Ȧ�� cnt 
				total = total - cur;
				System.out.print(" - " + cur);
				flagMinus = false; // �̷��� �ٲ���� ���̴� �� ��������!!!!
			}
			
			cur = next;
			cnt++;		
		}
		System.out.print(" = " + total);			
		
		
		
			
			
			
				
		
		
		
		
	}
	
	private void test6_Self1() { // count
		// (0 +) 1 + 1 - 2 + 3 - 5 + 8 - 13 + 21 = 14
		
		int cur = 1;
		int prev = 0;
		int next;
		int total = 0;
		int cnt = 1;
		
		
		while (cur<=21) {			
			next = prev + cur;
			prev = cur;			
			
			if(cnt <= 2 && cur!=21) {
				System.out.print(cur + " - ");
				total = total + cur;
			}
			
			if(cnt>2 && cnt%2==1 && cur!=21) {				
				System.out.print(cur + " + ");
				total = total - cur;
			} 
			if(cnt>2 && cnt%2==0 && cur!=21) {
				System.out.print(cur + " - ");
				total = total + cur;
			}			
			
			if(cur==21) {
				System.out.print(cur + " = ");
				total = total + cur;
			}
			
			cur = next;
			cnt++;		
		}
		System.out.print(total);
		
		
	}




	public void test5() {
		// (0 +) 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 = 54
		int prev = 0; //���� ��
		int cur = 1; // ���� �� 
		int next; // ���� ��
		int total = 0; // ����
		
		while (cur <=21) {
			System.out.print(cur);
			System.out.print(cur!=21?"+":"=");
		
			total += cur;
			
			next = prev + cur;
			prev = cur;
			cur = next;
		}
		System.out.println(total);
	}

	public static void main(String[] args) {
		new Ch03Ex01_SampleAnswer();
	} //end of main
	
	
	
} // end of class
