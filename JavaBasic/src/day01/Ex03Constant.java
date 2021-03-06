package day01;
/*상수
 * 상수는 변수와는 다르게 해당 공간에 한 번 값이 초기화되면
 * 다시 초기화가 불가능 해지는 공간을 상수라고 한다.
 * 상수는 변수와 똑같이 만들지만
 * 가장 앞에 final 이라는 키워드를 붙여서 만들어 줄 수 있게 된다 
 */

public class Ex03Constant {
	static final int QUANTITY = 30;
	static final int PRICE = 1500;
	
	
	public static void main(String[] args) {
		int number1 = 30;
		final int NUMBER1= 45;
		// NUMBER1= 250; 불가능
		// NUMBER1은 상수이기 때문에 새로운 값으로 초기화 할 수 없게 된다.
		
		// 상수는 여러분들이 처음 코딩을 배우실 때에는 그리 안쓰며,
		//그리 중요하지 않은 개념처럼 보인다.
		
		/*하지만 실제 프로그래밍에서 상수는 매우 중요한 역할을 맡는다.
		 * 상수가 매우 중요한 역할을 맡는 곳은
		 * 바로 하드코딩을 피할 때이다. 
		 *  
		 *  하드코딩이란 복잡하지 않은 코딩을 할 때 좋은 방법으로서
		 *  특정 값이나 무언가를 말 그대로 코드에 때려박는 것을 하드코딩이라고 한다.
		 */
		
		// 하드코딩 예시
		int price = 30 * 1500;
		System.out.println("물건 30개의 값은 개당 1500원 이므로 " + price + "원입니다.");
		
		
		//코드가 어렵다가 아니라, 경직되어있다- 딱딱하다라는 뜻
		//위 코드에서 30과 1500은 갑자기 튀어나온 숫자로서
		/* 만약 우리가 변경을 해야한다면 힘들게 찾아야 한다.
		 * 즉 바술처럼 갑자기 튀어나온 숫자라고 해서 마술의 숫자 혹은  Magic Number라고 부른다.
		 */		 

		//이와 반대로 코딩의 난이도는 올라가지만 유지/보수를 쉽게 하기 위해서
		//적극적으로 상수를 사용해서 마술의 숫자를 예방하게 하는 코딩을 소프트 코딩
		// 유연한 코딩이라고 한다.
		
		//위의 코드를 상수를 써서 마술의 숫자를 예방하려면
		//가장 위에(CLASS ~~~{ 다음줄)
		//상수를 선언하고
		//그 상서를 필요할 때 사용하면 된다.
			
		int totalPrice = QUANTITY * PRICE;
		
		
		
	}
}
