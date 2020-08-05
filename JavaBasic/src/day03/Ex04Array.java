package day03;
//배열 (Array)
//배열이란 똑같은 데이터타입을 정해진 크기만큼 연결시켜서
//우리가 굳이 여러개의 변수를 만들 필요 없이
//한 개의 이름으로 컨트롤 할 수 있게 도와주는 참조형 데이터 타입이다.

//배열은 index(위치번호)를 사용해서 각각의 배열 요소를 접근하게 된다.
//index는 0부터 배열의 크기 -1 까지이다.
//만약 잘못된 index(음의 정수나 배열의 크기와 같거나 크면)를 사용하면
//에러가 난다.

//배열 선언하기
//데이터타입[] 배열이름 = new 데이터타입[크기];

public class Ex04Array {
	public static void main(String[] args) {
		int[] intArray = new int[5];
		
		//배열에 있는 각각의 변수는 우리가 따로 이름을 짓는 게 아니라
		//배열이름[호출할 변수의 번호]로 호출하면 된다.
		System.out.println("배열의 0번째 값: "+intArray[0]);
		intArray[0] = 17;
		System.out.println("배열의 0번째 값: "+intArray[0]);
		
		// 만약 존재하지 않는 번호를 접근하게 되면?
		// 에러가 난다.
		// intArray[-1] = 9;
		
		
		// 배열의 크기는 우리가 값을 입력하던 안하던 항상
		// 처음 설정해 놓은 크기이다.
		// 배열의 크기를 확인할 때에는 배열이름.length를 호출하면 된다.
		System.out.println("배열의 크기: " + intArray.length );		
		
		// 기본형 데이터 타입의 배열은 0으로 초기화되고
		// 참조형 데이터 타입의 배열은 null로 초기화된다.
		
		// 따라서 참조형 데이터타입의 배열을 사용할 때에는
		// 한번 전체를 생성자를 통해서 초기화해야 합니다.
		for(int i = 0; i < intArray.length; i++) {
			System.out.printf("배열의 %d번째 값: %d\n", i, intArray[i]);
		}
		
		Student[] studentArray = new Student[5];
		for(int i = 0 ;i < studentArray.length; i++ ) {
//			System.out.println(i +"번째의 요소: " + studentArray[i]); //당연히 각자 null 나옴
			studentArray[i] = new Student();
			System.out.println(i +"번째의 요소: " + studentArray[i]);
		}
		
	}//main end
} //class end
