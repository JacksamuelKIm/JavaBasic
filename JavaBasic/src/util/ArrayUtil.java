package util;

import day03.Student;
import gradebook.StudentVO;

// 배열에 관련한 편의성을 주는 메소드를 정의해 놓은 ArrayUtil 클래스
// 별다른 객체선언 없이 사용하기 위해
// 모든 메소드를 스태틱 설정한다.

public class ArrayUtil {
	//1. 파라미터로 Student 배열과 Student 객체를 받아서
	//   Student 배열의 Student 객체의 index를 찾는 indexOf 메소드   // 배열의 번호를 찾기 위해서 
	public static int indexOf(StudentVO s, StudentVO[] studentArray) {
		for (int i = 0; i < studentArray.length; i++) {
			if(s.equals(studentArray[i])) {
				return i; //return 하는 순간 메소드 전체가 바로 종료됨
			} //if end			
		} //for end		
		return -1; // 암 것도 못 찾을 때
	} // indexOf end
	
	
	//2. 배열의 크기를 1만큼 늘려주는 sizeUp 메소드
	//   크기를 늘리고 나서 늘려진 배열을 리턴해서 받는 쪽에서 원본을 덮어쓰게 한다.
	private static StudentVO[] sizeUp(StudentVO[] studentArray) {
		int size = studentArray.length;
		StudentVO[] temp = new StudentVO[size]; // temp는 배열을 저장할 임시 저장소
		for(int i = 0; i < studentArray.length; i++) {
			temp[i] = studentArray[i];
		} //for end
		studentArray = new StudentVO[size+1]; // 단 이렇게 되면 원본에 있던 원 데이터들은 다 날아가게 됨 그래서~
		for(int i = 0; i < temp.length; i++) {
			studentArray[i] = temp[i]; // 임시 저장소에 있던 것을 꺼내어 다시 넣어줌!!!
		}
		return studentArray;
	} // sizeUp end
	
	// 배열에 새로운 요소를 추가하는 add 메소드
	public static StudentVO[] add(StudentVO[] studentArray, StudentVO s) {
		studentArray = sizeUp(studentArray);
		int index = studentArray.length - 1;
		studentArray[index] = s;
		return studentArray;
		
	}// add end
	
	// 배열에서 요소를 삭제하는 메소드
	public static StudentVO[] remove(StudentVO[] studentArray, StudentVO s) {
		// 1. 삭제할 s의 index를 찾는다
		// 2. index를 기준으로 해서 앞 부분과 뒷 부분 2개로 나눈다.
		// 3. 기존 배열보다 크기가  1 작은 배열을 만들어서 2에서 만든 앞 배열과 뒷 배열을 연결한다.
		// 4. 새 배열을 리턴한다
		
		int index = indexOf (s, studentArray);
		if(index != -1) {
			//배열을 만들기 시작한다			
			if(index == 0) {
				//가장 앞에 것을 지울 때 
				int size = studentArray.length -1;
				StudentVO[] temp = new StudentVO[size];
				for(int i = 1 ; i < studentArray.length; i++) {
					temp[i-1] = studentArray[i]; 
				}
				studentArray = new StudentVO[size];
				for(int i = 0; i <temp.length; i++) {
					studentArray[i] = temp[i];
				}
			}else if(index == studentArray.length -1) {
				//가장 뒤에 것을 지울 때				
				int size = studentArray.length -1;
				StudentVO[] temp = new StudentVO[size];
				for(int i = 0 ; i < studentArray.length - 1; i++) {
					temp[i] = studentArray[i]; 
				}
				studentArray = new StudentVO[size];
				for(int i = 0; i <temp.length; i++) {
					studentArray[i] = temp[i];				
			    }
			}else {
				//중간 것을 지울 때
				
				//앞의 배열의 size는 우리가 제거하고자 하는 요소의 index와 같다.
				//즉 이렇게 선언 가능하다
				StudentVO[] prev = new StudentVO[index];
				for(int i = 0; i< index; i++) {
					prev[i] = studentArray[i];
			}
			//6칸 짜리고 제거해야할 요소의 인덱스가 3이면?
			//4 5 (이렇게) 2칸이겠져
			//8칸 짜리고 제거해야할 요소의 인덱스가 2면
			//3 4 5 6 7
			//5칸
			//즉 뒷부분의 크기는
			//총 크기 (-) 1 (-) 인덱스가 된다.
			int size = studentArray.length;
			StudentVO[] next = new StudentVO[size - 1 - index];
			for(int i = 0; i <next.length; i++) {
				// next[0] = studentArray[index+1]				
				// next[1] = studentArray[index+2]
				// next[2] = studentArray[index+3]
				next[i] = studentArray[index+1+i];				
			} //for end
			studentArray = new StudentVO[size -1];	
			
			//앞 부분 복사하기
			for(int i = 0 ; i < prev.length; i++) {
				studentArray[i] = prev[i];				
			} 
			
			//뒷 부분 복사하기
			for(int i = 0 ; i < next.length; i++) {
//				studentArray[i] = next[i];  복사 실수 인듯
				studentArray[prev.length+i] = next[i];							
			} 
			
			} //else end		
				
		} // if !=-1 ~  end 
		
		return studentArray;
		
	} // remove end
	
	


} // class end
