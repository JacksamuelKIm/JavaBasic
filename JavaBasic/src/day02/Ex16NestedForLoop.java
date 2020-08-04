package day02;
/* 중첩 for loop
 * 안쪽 for loop이 모두 반복해야
 * 바깥쪽 for loop은 한 번 반복한 모양이 된다
 */

public class Ex16NestedForLoop {
	public static void main(String[] args) {
		for(int i = 0; i < 3; i++) {
			for (int j=10; j<14; j++) {
				System.out.printf("i: %d, j: %d\n", i, j);
			} // for j end
			System.out.println("-------------------");
		}// for i end
		
	}

}
