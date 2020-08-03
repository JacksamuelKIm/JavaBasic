package day01;
// 논리연산자(Logical Operator)
// 논리연산자란 2개의 boolean값에 대한 연산을 한다.
// AND OR NOT 3가지가 있다.
// AND: 2개가 모두 true일 때에만 true
// OR: 2개중 한 개라도 true이면 true
// NOT: boolean 값을 반전시킨다. false는 true로 true는 false로

// AND: &&
// OR: ||
// NOT: !
public class Ex08LogicalOperator {
	public static void main(String[] args) {
		System.out.println("true && true: " + (true && true));
		System.out.println("true && false: " + (true && false));
		System.out.println("false && true: " + (false && true));
		System.out.println("false && false: " + (false && false));

	}

}
