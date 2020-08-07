package day05;

import java.util.ArrayList;

import gradebook.StudentVO;

/* 배열은 클래스가 아니다.
 * 그저 한 개의 자료형이 여러 개가 모여있는 형태이다.
 * 그렇기 때문에 우리가 필요로 하는 몇 개의 메소드를 직접 우리가 구현을 해야 했다.
 * 거기다가 만약 우리가 필요로 하는 배열의 자료형이 여러개면 다 만들어주어야 한다.
 * 귀찮다.
 * 
 * 자바에서는 배열을 일종의 클래스처럼 만들어놓은
 * ArrayList라는 클래스가 있다.
 * 해당 클래스를 사용하면 훨씬 더 간단하다.
 * 어레이 리스트는 자체적으로 동적 할당을 지원해준다.
 * 또한 내부적으로 equals() 메소드를 활용해서
 * 여러가지 기능을 구현해 놓았다.
 * 
 */

public class Ex01ArrayList {
	public static void main(String[] args) {
		// ArrayList는 어떤 클래스든 간에 배열 클래스처럼 사용할 수 있게 만들어준다.
		// ArrayList를 선언할 때(는) < >안에 어떤 클래스의 모음인지를 적는다.
		
		
		ArrayList<StudentVO> list = new ArrayList<>();
		
		//list의 현재 크기를 확인할 때에는
		//size()메소드를 실행하면 된다.
		System.out.printf("list의 현재 크기: %d\n", list.size());
		
		StudentVO s = new StudentVO();
		s.setName("1");
		s.setJumin("1");
		
		StudentVO s2 = new StudentVO();
		s2.setName("2");
		s2.setJumin("2");
		
		StudentVO s3 = new StudentVO();
		s3.setName("3");
		s3.setJumin("3");
		
		StudentVO s4 = new StudentVO();
		s4.setName("4");
		s4.setJumin("4");
		
		StudentVO s5 = new StudentVO();
		s5.setName("5");
		s5.setJumin("5");
		
		
		
		list.add(s);
		System.out.printf("list의 현재 크기: %d\n", list.size());
		
		list.add(s2);
		System.out.printf("list의 현재 크기: %d\n", list.size());
		
		list.add(s3);
		System.out.printf("list의 현재 크기: %d\n", list.size());
		
		list.add(s4);
		System.out.printf("list의 현재 크기: %d\n", list.size());
		
		list.add(s5);
		System.out.printf("list의 현재 크기: %d\n", list.size());
		
//		System.out.println(list);  // 이렇게 하면 heap memory에 저장된 위치를 가리키는 stack상에 적힌 주소밖에 없네.....
		
		//ArrayList의 메소드들은 내부적으로 객체의 equals() 메소드를 적극 활용한다.
		//그래서 다음과 같이
		/*리스트에 객체가 존재하는지
		 * 객체의 인덱스가 몇인지
		 * 이런 것들을 우리가 알 수 있다
		 */
		
		// 1. 이미 추가되어있는 객체를 이용해서 찾아보기
		// 만약 리스트에 해당 객체가 존재하는지 확인할 때에는
		// contains(객체)를 실행하면 된다. 
		 
		
		System.out.println("list.contains(s): " + list.contains(s));
		//만약 리스트에 있는 해당 객체의 index를 확인할 때에는
		//indexOf(객체)를 실행하면 된다.
		System.out.println("list.indexOf(s): " + list.indexOf(s));
		
		// 2. 이미(아직?) 추가되지 않는 객체를 이용해서 찾아보기
		StudentVO s50 = new StudentVO();
		s50.setName("5");
		s50.setJumin("5");
		
		StudentVO s6 = new StudentVO();
		s6.setName("6");
		s6.setJumin("6");
		
		System.out.println("list.contains(s50): " + list.contains(s50));
		System.out.println("list.contains(s6)): " + list.contains(s6));
		
		System.out.println("list.indexOf(s50): " + list.indexOf(s50));
		System.out.println("list.indexOf(s6): " + list.indexOf(s6));
		
		
		//리스트에서 특정 인덱스의 요소를 가지고 올 떄에는
		//list.get(인덱스)를 실행하면 된다.
		System.out.println("list.get(0).getName(): " + list.get(0).getName());
		
		//전체 출력을 할 때에는
		//for Each구조를 사용할 수 있다.
		for(StudentVO temps : list) {
			System.out.println(temps);
		}
		
		//리스트에서 삭제를 할 때에는 2가지 방법이 가능하다.
		//1. 인덱스로 삭제하기
		System.out.println("list.get(0).getName(): " + list.get(0).getName()); //getName() 이 안들어가면 메모리주소값이 나와버린다.
		list.remove(0);
		System.out.println("list.get(0).getName(): " + list.get(0).getName()); //앞에 있던 s가 삭제됐으니 당연히 s2의 name값 2가 출력되지
		
		
		//2. 격체로 삭제하기
		//만약 리스트에 해당 객체가 존재하면 삭제된다
		System.out.println("list.contains(s5): " + list.contains(s5));
		list.remove(s50);
		System.out.println("list.contains(s5): " + list.contains(s5));
		
		
		
		

	} // main end

} // class end
