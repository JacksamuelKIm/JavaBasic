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
	
	
//	# 1. while loop�� ���ǹ� �ȿ��� �Է��غ���	
	private void assignValueIntheWhileLoop() throws IOException {
		System.out.print("���� �߽� ���� ��ǥ�� �Է��Ͻÿ� >> ");
		while((input= System.in.read())!='\n') {
			if(('0'<=input) && (input<='9')) {
				coordinate = coordinate*10 + input - '0';  
			}
			
		}//while end
		System.out.println("���� ��ǥ�� "+coordinate+"�̴�.");
		
	}


//	# 2. ������ System.in.read()�� ���� �Ҵ��ϰ� �� ������ while�� �־��
	private void assignFirstAndPutTheVauleInTheLoopWhile() throws IOException {
		System.out.print("���� ���� �ƹ� ���� �Է��غ�. ������>>");
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
