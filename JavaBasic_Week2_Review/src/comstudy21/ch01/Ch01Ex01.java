package comstudy21.ch01;

public class Ch01Ex01 {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		
//		===========================================================
//		for (int i = 0; i<args.length ; i++) {
//			System.out.println(i + " => " + args[i]);
//		}
//	       별 거 없음 as long as you know 
//		how to compile and run the program through either Eclipse or cmd
//		===============================================================
		
		if(args.length == 3) {
			System.out.println("1. 아이디: " + args[0]);
			System.out.println("2. 사는곳: " + args[1]);
			System.out.println("3. 나   이: " + args[2]);			
		} else {
			System.out.println("파라미터 입력 형식이 맞지 않습니다");			
		}
		

	}

}
