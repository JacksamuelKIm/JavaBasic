package day04;

import java.util.Scanner;
import day03.Student;
//배열이 꽉 찼을 때 한 칸씩 당겨서 맨 뒷칸에 공간을 만들어주는 학생 관리 프로그램
public class StudentEx04 {
	private static final int SIZE = 5;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Student[] studentArray = new Student[SIZE];
		while(true) {
			System.out.println("1. 입력  2. 출력.  3.종료  ");
			int choice = scanner.nextInt();
			if(choice == 1) {
				//차례대로 넣다가 만약 전체가 꽉 찾는지 알아보기 위해,
				//index를 만들어 -1로 초기화하고
				//null인 곳의 i를 index에 할당하자;
				int index = -1;
				for(int i = 0; i < studentArray.length; i++) {
					if(studentArray[i] == null) {
						//이 if의 조건식이 true가 나왔다는 것은
						//student의 i의 첫번째 칸이 비었다는 의미이므로
						//index = i로 초기화
						//그리고 break를 실행하여 for loop를 종료시킨다.
						index = i;
						break;
					}					
				} // for end
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
						
				
				if (index != -1 ) {
					studentArray[index] = s;
				}else {
					//배열에 빈칸이 존재하지 않을 때
					//각 요소를 한 칸씩 땡긴다.
					//1번째 -> 0번째로
					//2번째 -> 1번째로
					//3번째 -> 2번째로
					//4번째 -> 3번째로
					//그리고 4번째에 s를 넣어준다.					
					for(int i = 1; i < studentArray.length; i++) {
						studentArray[i - 1] = studentArray[i];		//i가 0이라서 에러/왜 2번째 부터가 아니라 6번째입력부터 에러가 떴을까?
						
					}
					studentArray[SIZE-1] = s;
				}
								
			}else if(choice == 2) {
				for (int i = 0; i < studentArray.length ; i++) {
					if (studentArray[i] != null) {
						System.out.println(studentArray[i]);
					}					
				}
			}else if(choice == 3) {
				System.out.println("사용해주셔서 감사합니다");
				break;				
			}
			
				
		} // while end
		
			
		
		
		scanner.close();

	}// main end

}// class end
