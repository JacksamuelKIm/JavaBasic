package reflectionOnWhatIlearnedToday;

import java.io.IOException;

public class aug132020 {
	/*
	 * 
	 * 1. Scanner
	 * 한 함수 안에서 next()와 nextLine()을 같이 쓸 때만 충돌 일어나니
	 * Scanner 객체를 따로 만들어 주라는 거지 그 경우 이외에는 하나만 만들어 쓰면 된다. 
	 * 원래는 각 메소드 안에 scanner 불러주고 scanner.close()로 닫아줘야 함
	 * 
	 * Scanner의 메소드들은 사실 콘솔 프로그램을 할 때만 필요.
	 * 우리가 개발할 대다수는 GUI 이므로 실전에서는 거의 필요 없다
	 * 
	 * 
	 * 2. n진법의 n의 자리 구하기
	 * 
	 *    int x;
	 * 두 자리 정수의 10의 자리 => x/10
	 * 두 자리 정수의 1의 자리 => x%10
	 * 
	 *   
	 *   
	 * 3. 세 개의 수 가운데 중간크기의 값을 고르는 데는 여러가지가 있다.
	 * if 문도 있고,
	 *  ?가장 큰 값, 가장 작은 값을 뽑아놓고 나머지를 고르는 법도 있다.(클래스도 있을 듯)
	 * 3항 연산자도 있다  
	 * 
	 * 
	 * 4. 코딩스타일 
	 * 
	 * 두 자리 정수를 입력하는 거라고 조건이 주어지면 미리 제한을 걸어줘야 
	 * 인생이 편하고 뒤에서 코딩을 보다 깔끔하게 할 수 있다.
	 * 
	 * ||면 될 것을 굳이 나누어서 &&를 남용할  필요가 없다
	 * 
	 * 꼭 if else로 모두 한 번에 묶어 줄 필요가 없음
	 * 여러개의 if플 투과하면서 심플하게 원하는 값이 나오게 할 수도 있다.
	 *  
	 * 바로 코딩부터 하지 말고 의사코드 짜봐라. 매우 중요. 논리적으로 정리!
	 * 코드는 항상 깔끔해야 한다. 심플하고  한 가지 문제가 있으면 2, 3가지 방법으로 풀어보자
	 * 
	 * 
	 * 5.System.in.read()
	 * 
	 * return을 int로 한다. 그러나 자료를 읽을 때 통째로 읽는 것이 아니므로 주의.
	 *  입력된 자료를 하나하나 1byt씩 읽어들이기 때문에
	 * '150[엔터]'이라고 하면 49,53,18,13(CR의 값임) 이렇게 읽는다(ASCII)
	 * 따라서 '0'(==48)으로 빼줌으로서 원래 수로 돌리는 것임
	 * 
	 * Scanner의 nextInt()? next() 등은 토큰 단위로 읽는 듯 하다.
	 * //	
	 * 
============================증명(?) 을 위한 개인적인 실험및 결과==========================
	 * # 1. while loop의 조건문 안에서 입력해보기	
	private void assignValueIntheWhileLoop() throws IOException {
		System.out.print("원의 중심 점의 좌표를 입력하시오 >> ");
		while((input= System.in.read())!='\n') {
			if(('0'<=input) && (input<='9')) {
				coordinate = coordinate*10 + input - '0';  
			}
			
		}//while end
		System.out.println("점의 좌표는 "+coordinate+"이다.");
		
	}
===> 입력 후 결과 값 잘 나옴. 해피엔딩

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

=====>> 무한루프 무간지옥
=====>> why? while의 입장에서는 입력과정 없이. 단지 정수 5가 조건에 들어있을 뿐이기에.
======>> while 메소드에 외부에서의 입력이 있을 시 뭔가 return하도록 규정되어 있나?

 
	 * 
	 * 
	 * 6. 배열 
	 * ArrayList는 Array보다는 느리다
	 * 배열을 잘 써야 수준높은 프로그램을 만들 수 있다.
	 * 
	 * 
	 * 7. null 
	 * 아직 참조한 게 없는 참조변수. 참조할 것을 안 만들어놨다.
	 * ""는 null같이 보이지만 문자형 객체가 있는 것이므로 주의하자
	 * 
	 * 8. var 
	 * 자바에서도 타입 크게 안 따지는 var 라는 애로 처리할 수 있다 
	 * 자바 스크립트에서 넘어왔고, c++에서도 쓰임
	 * 
	 * 9. 타입변환 (casting)
	 * 값이 변형되거나 손실될 수 있다.
	 * 
	 * 10. loop 나오기
	 * //인풋을 loop안에서 하냐 밖에서 하냐에 따라 다른가봐
	 * 
	 * 11. do while
	 * 한  번 끝까지 진행 후
	 * while 상의 조건이 맞다면 다시 반복
	 * 
	 * 
	 * 
	 */
	
	
}
