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
		System.out.print("시험 점수 입력해>>>");
		input = 0;
		
		while ((input = System.in.read())!='\n') { //인풋을 loop안에서 하냐 밖에서 하냐에 따라 다른가봐
		if('0'<=input && input<='9') { // 숫자인 경우에만
	    	score = score*10 + input-'0';
		}		
		if (score>=80) {
			System.out.println("점수: " + score);
			System.out.println("합격입니다");
		} else {
			System.out.println("뭐 임마");
		}
		
	}
		
	}


	public static void main(String[] args) throws IOException {
		new TestTest();		
		

	}

}
