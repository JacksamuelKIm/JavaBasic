package day02;
/*  조건문2 - Swtich
 *  스위치는 1개의 변수를 선택해서
 *  그 변수가 가능한 값에 따른 각각의 코드를 적어주게 된다.
 *   
 */
public class Ex12Switch {
	public static void main(String[] args) {
		int number = 2;
		// 스위치는 ()안에 어떤 변수를 쓸 지 선택을 한다.
		switch(number) {
		// 그리고 해당 변수의 값에 따른 case를 적고 실행할 코드를 적어주게 된다.
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		default:
			System.out.println("그 외 입니다.");
			break;
				
		
		} // switch end

	} // main end

} // class end
