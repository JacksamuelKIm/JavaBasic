// written on Aug 13 2020
package homework2_2;

import java.io.IOException;

public class TestTest {
int input;
int score;
	
	public TestTest() throws IOException {
		calculator();
	}
	
	
	private void calculator() throws IOException {
		score = 0;
		System.out.print("���� ���� �Է���>>>");
		input = 0;
		
		while ((input = System.in.read())!='\n') { //��ǲ�� loop�ȿ��� �ϳ� �ۿ��� �ϳĿ� ���� �ٸ�����
		if('0'<=input && input<='9') { // ������ ��쿡��
	    	score = score*10 + input-'0';
		}		
		if (score>=80) {
			System.out.println("����: " + score);
			System.out.println("�հ��Դϴ�");
		} else {
			System.out.println("�� �Ӹ�");
		}
		
	}
		
	}


	public static void main(String[] args) throws IOException {
		new TestTest();		
		

	}

}
