package reflectionOnWhatIlearnedToday;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Aug142020 {
	/*
	 * 1. Buffer 
	 * 키보드와 CPU의 속도차 완충역할
	 * 
	  InputStreamReader isr = new InputStreamReader(System.in);
	 	BufferedReader in = new BufferedReader(isr); 이런 식으로 해 줄수도 있고
	 	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	 	// InputStreamReader로 먼저 받아주고 그걸 BufferedReader로 wrapping
	 	// 그래야 띄어쓰기나 한글을 인식할 수 있다.
	 	 * 
	 	 * 
	 	 * 
	 * 
	 * 
	 * 2. for 문
	 * 초기문이 프로그램을 초기화시킨다는 것이 아님. Initialization임.
	 * 조건식의 결과가 false가 될 때가지 반복
	 * 조건식이 비어도 true의 의미
	 * 
	 * 누적을하기 위한 변수 선언 - 반복문 밖에 선언 후 초기화한다
	 * 지역변수는 초기화 하지 않으면 알 수 없는 값이 들어간다.
	 * 필드는 자동으로 초기화되만 지역변수는 쓰레기 값이 되서 뭐가 들어간지 모름
	 * 
	 * 반복 후 작업은 꼭 i++ 여만 되는 것도 아니고 하나만 넣어야 하는 것도 아니다.
	 * 
	 * 프로그래밍을 한 번에 다하려고 하지 말고 하나씩 단계별로 해본다.

		1+3+5+7+9+11+13 = 49를 짤 때도 

		=를 만들기 위해

		if부터 치지 말고 먼저 간단하게 테스트 해서 13579111349부터 뽑아봐라
	 * 
	 * for문과 while문은 사실상 같다. 구조만 조금 다를 뿐
	 * 
	 * for의 조건문을 비워두고 외부에서 초기화 시켜줘도 됨
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 
		for(int cnt = 1; cnt <=9 ; cnt++) {
			System.out.println(cnt); 						// 이렇게  cnt 넣어서 입력해봐 cnt ==1일때는 그대로 수행한다 쳐
			for (; startDan<=endDan ;startDan++) { 			// startDan을 그대로 넣어주면 1단만 나오고 말지 
			System.out.printf("%d x %d = %d\t\n", startDan, cnt, startDan*cnt ); 		// startDan은 기준을 주는 것으로서 끝. 그게 바뀌면 안되지
			} 												// 사람의 사고방식으로야 그냥 startDan 초기값 6이었으니까(e.g)그냥 그대로 써! 라고 하겠지
		}	 												// 컴퓨터 입장에서는 처음에야(cnt==1) 그냥 들어온 애로 시작했겠지만, 그 이후에는 초기문에 아무것도 없으니 당황. 뭐 하고 말게 없어서 안나옴!!!!!!!!! 	
			     											// 이중 for문 중 외벽 for에서 그럴때야 초기값 (6)~끝까지 가고(단 1회) 끝나겠지만 / 1회 이상(여기선 4회, 구구단이니 최소 9회 반복할때는 문제 터짐
		
	
	*/
	
	
	
}
