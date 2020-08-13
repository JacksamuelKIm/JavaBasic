package hallOfHonour;
//written on Aug 13 2020
import java.io.IOException;
import java.util.Scanner;

public class Input_InWhile_OutWhile_Test {
	int input;
	int coordinate;
	
	public Input_InWhile_OutWhile_Test() throws IOException {
		input = 0;
		coordinate = 0;
		
		assignValueIntheWhileLoop();
		assignFirstAndPutTheVauleInTheLoopWhile();
	}
	
	
//	# 1. while loop의 조건문 안에서 입력해보기	
	private void assignValueIntheWhileLoop() throws IOException {
		System.out.print("원의 중심 점의 좌표를 입력하시오 >> ");
		while((input= System.in.read())!='\n') {
			if(('0'<=input) && (input<='9')) {
				coordinate = coordinate*10 + input - '0';  
			}
			
		}//while end
		System.out.println("점의 좌표는 "+coordinate+"이다.");
		
	}


//	# 2. 변수에 System.in.read()를 먼저 할당하고 그 변수를 while에 넣어보기
	private void assignFirstAndPutTheVauleInTheLoopWhile() throws IOException {
		System.out.print("뭐든 간에 아무 수나 입력해봐. 정수로>>");
		input = System.in.read();
		while(input != '\n') {
			if('0'<= input && input < '9'){
				coordinate = coordinate*10 + input-'0';  
			}			
		}
		System.out.println(coordinate);
		
	}



	public static void main(String[] args) throws IOException {
		new Input_InWhile_OutWhile_Test();
		
		
			
					

		

	
		
	
		
		
		
		
		
		
	} // main end
}//class end
