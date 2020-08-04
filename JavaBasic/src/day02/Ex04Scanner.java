package day02;
import java.util.*;

// Scanner란
// 자바에서 입력을 담당하는 클래스이다.
// 우리가 어디선가 입력을 받아야 한다면
// 스캐너를 통해서 입력이 가능하다.
// 입력이란 외부에서 값을 불러오는 것을 입력이라고 한다.
// 예시: 파일 입력의 경우 우리가 파일의 값을 입력하는 것이 아니라
//      파일의 값을 프로그램에 입력하는 것을 말한다. 

// 스캐너는 외부 클래스 (자바의 기본 라이브러리)이기 때문에
// 우리가 어디에 있는 지를 지정해 주어야 한다.
// 외부 클래스의 위치를 지정할 때에는
// import 클래스위치; 라고
// 클래스 위에 적어주어야 한다.
public class Ex04Scanner {

	public static void main(String[] args) {
		// Scanner 클래스의 객체를 만들어서
		// 무언가 입력을 할 때에는 그 객체의 메소드를 호출해서 입력을 받으면 된다.
		
		Scanner scanner = new Scanner(System.in);
		
		// 1. 정수 값을 입력 받을 때에는 nextInt()를 실행하면 된다.
		System.out.print("정수를 입력해 주세요: ");
		int number = scanner.nextInt();
		System.out.printf("사용자가 입력한 정수는 %d입니다. \n", number);
		// Scanner는 버퍼메모리라는 곳에 임시 저장된 값을 읽어온다.
		// 이렇게 메모리를 읽어오거나 참조하는 클래스의 객체는
		// 항상 제일 마지막줄에 close() 메소드를 호출해 주어야 한다.
		
		//2. 실수 값을 입력 받을 때에는 nextDouble()을 실행하면 된다.
		System.out.print("실수를 입력해 주세요: ");
		double myDouble = scanner.nextDouble();
		System.out.printf("사용자가 입력한 실수는 %f입니다. \n", myDouble);
		
		//3. 스트링을 입력 받을 때에는 nextLine()을 실행하면 된다.
		// 하지만 nextInt()나 nextDouble()을 사용하고 나면
		// 버퍼메모리에 엔터키가 남아있기 때문에
		// nextLine에 벅가 발생하여 아무런 입력도 못하게 된다.
		// 이러한 버그를 방지해주기 위해서
		// 버퍼메모리를 비워주어야 하고 따라서
		// scanner.nextLine()을 한번 단독 실행시켜주면 된다.
		// 단 이클립스의 자동완성기능 때문에
		// scanner.nextLine을 적어도
		// scanner.hasNextLine()으로 적힐 수 있기 때문에
		// 확인하고 적어준다.
		scanner.nextLine();
		System.out.print("이름을 입력해주세요: ");
		String name = scanner.nextLine();
		System.out.printf("사용자의 이름은 %s입니다. \n", name);
		
		scanner.close();
	} // main end

}
