package day04;

import day03.Student;
import util.ArrayUtil;
// 동적할당과 정적할당
// 우리가 지금 사용하는 배열은
// 크기가 고정되어있다.
// 그렇기 때문에 만약 우리가 원하는 크기 이상을 쓸 수 없는 형태이
// 따라서 5명을 초과한 학생을 입력하려고 하면
//  1. 입력 거부
//  2. 오래된 정보부터 삭제
//  하는 형식으로 우리가 프로그램을 작성했다

// 하지만 이 방법은 결국 데이터 손실을 가져오게 된다
// 그렇다면 우리가 사용할 수 있는 방법은
// 배열의 크기를 가변적으로 가져갈 수 있게 하는 방법을 사용해야 한다.
// 이렇게 배열의 크기를 가변적으로 바꾸는 방법을 동적할당이라고 한다.

// 동적할당을 하는 방법
// 배열이 꽉 차면 현재 배열을 임시 배열에 복사하고
// 현재 배열을 한 칸 늘려서 다시 초기화 한 후에
// 임시 배열의 값을 복사해온다.

// 동적 할당을 완벽하게 했을 때의 결과:
// 배열에서 특정 개체를 삭제하면 배열의 크기도 줄어든다.
// 배열을 맨 처음 생성할 때 크기를 0으로 해서 생성한다.


public class StudentEx5변경전 {
	
	public static void main(String[] args) {
		Student[] arr = new Student[0];
		Student s = new Student();
		System.out.println("arr의 현재크기: " +arr.length);
		arr = ArrayUtil.add(arr,s);
		System.out.println("arr의 현재크기: " +arr.length);
		//System.out.println("arr[0]에 뭐가 들었나 보자: " + arr[0]); // 이미 Student 클래스의 객체인 s가 
														      //크기 1자리 arr의 0번에 들어갔네. 당연히 기본값이고 입력된거 없으니
	}

}
