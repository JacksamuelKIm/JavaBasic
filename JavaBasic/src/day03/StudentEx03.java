package day03;
//여러 학생을 관리할 수 있는 프로그램
import java.util.Scanner;

public class StudentEx03 {
	private static final int SIZE = 5;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student[] studentArray = new Student[SIZE];
		
		while(true) {
			System.out.println("======================");
			System.out.println("비트고등학교 성적관리 프로그램");
			System.out.println("======================");
			System.out.println("1. 입력  2. 출력  3. 종료  ");
			int choice = scanner.nextInt();
			if(choice == 1) {
				// 자 우리가 이번엔 최대 5명씩만 관리하게 되었다.
				// 그렇다면 어떻게 해야 빈 칸을 찾을 수 있을까?
				// null인 곳이 빈 칸이다.
				// 우리는 입력할 때 객체를 하나 만들어서
				// 입력된 객체를 배열의 null인 곳에 넣어주면 된다.
				// 만약 어떤 칸도 null이 아니라면
				// 이럴 때는 2가지 방법으로 해결할 수 있다.
				// 1. 학생목록이 꽉 찼습니다. 메세지 출력
				// 2. 제일 오래된 학생을 제거하고, 한 칸씩 땡기고
				//    가장 마지막 칸에 새로운 학생 입력
				// 3. 만약 꽉 차면 자동으로 늘려준다.
				// 1- > 2 -> 3을 오늘 한 번 만들어보자.
				int index = -1; 
				// 인덱스가 -1인 이유: 불가능한게 100프로인 위치번호 중에서 가장 큰 수이다.
				// 				
				for(int i = 0; i <studentArray.length; i++) {
					if(studentArray[i] == null ) {
						index = i;
						break; // for든 if이든 index에 i값을 부여해주고 끝. 바로 break.
					}					
				} // for end
				if(index != -1) {
					//빈 칸이 존재하므로
					//입력을 받아서  studentArray[index]에 할당
					Student s = new Student();
					System.out.print("이름: ");
					scanner.nextLine();
					s.setName(scanner.nextLine());
					
					System.out.print("나이: ");
					s.setAge(scanner.nextInt());
					
					System.out.print("국어: ");
					s.setKorean(scanner.nextInt());
					
					System.out.print("영어: ");
					s.setEnglish(scanner.nextInt());
					
					System.out.print("수학: ");
					s.setMath(scanner.nextInt());
					
					studentArray[index] = s;
					
				} else {
						System.out.println("배열이 꽉 찼습니다");
				}				
			}else if(choice == 2) {
				for(int i = 0; i < studentArray.length; i++) {
					if(studentArray[i] != null) {
						System.out.println(studentArray[i]);
					} 					
				}//for end
				
			}else if(choice == 3) {
				System.out.println("사용해 주셔서 감사합니다");
				break;				
			}
				
				
				
		} //while end
		
		
		scanner.close();

	} // main end

} //class end
