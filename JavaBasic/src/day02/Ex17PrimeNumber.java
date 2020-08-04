package day02;
//소수란?
// 약수가 1과 자기자신만 있는 숫자
// = 약수의 갯수가 2개인 숫자 (1은 1개이므로 해당 안됨)

//약수란?
// 나눠 떨어지는 수
// = 나머지가 0인 수

//어떤 숫자의 약수 중 가장 큰 수는?
//자기 자신

//우리는 위의 3가지 조건을 이용해서
//1~100까지의 소수를 구하는 프로그램을 작성해 볼 것이다.

public class Ex17PrimeNumber {
	public static void main(String[] args) {
		//i: 소수인지 아닌지 검사할 숫자
		//j: i의 약수인지 아닌지 검사할 숫자
		int primeNumber = 0;
		for(int i = 1 ; i <=100; i++) {
			//약수의 갯수를저장할 변수 count를 선언하고 0으로 초기화한다.
			int count = 0;
			
			for(int j = 1; j <= i ; j++) {
				if (i % j == 0) {					
					count++;
				} //if end
			}// for j end
			if (count == 2) {
				primeNumber ++;
				System.out.println(i+"는 소수입니다");
			}
		} //for i end
		System.out.println("소수의 총 갯수: " +  primeNumber);
	} // main end

}
