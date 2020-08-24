package gradeManagement;

import java.io.IOException;
import java.util.Scanner;

class Student {

	int no;
	String name;

	int kor;
	int eng;
	int mat;

	int total;
	double avg;
	String grade;

	int rank;

	@Override
	public String toString() {
		return "[" + no + ", " + name + ", " + kor + ", " + eng + ", " + mat + ", " + total + ", "
				+ Math.floor(avg * 10) / 10 + ", " + grade + ", " + rank + "]";
	}
}// class Student

public class SungManager_SampleAnswer {
	Scanner scan = new Scanner(System.in);

	Student[] stdArr = new Student[100];
	int top = 0;
	int seq = 1; // no를 만들기 위한 변수로서 증가만 하는 역할

	public SungManager_SampleAnswer() {

		input("kim", 98, 98, 98);
		input("lee", 75, 75, 75);
		input("park", 80, 82, 80);
		input("kim", 50, 55, 50);
		input("kang", 60, 65, 66);

		System.out.println("::: 성적 출력 프로그램 :::");
		while (true) {
			play();
			System.out.println("----------------------------------------------");
		}
	}

	int menu() {
		System.out.println("1.input 2.output 3.search 4.modify 5.delete 6.end");
		System.out.print("Choice>>> ");
		int no = getNum();
		
		return no;
	}

	// 다형성
	// 메소드 오버로딩 - 매개변수의 타입과 갯수가 다르면 메소드명은 동일하게 사용가능.
	Student makeStudent(String name, int kor, int eng, int mat){

		Student s = new Student();

		s.no = seq++;
		s.name = name;
		s.kor = kor;
		s.eng = eng;
		s.mat = mat;
		// 총점, 평균, 평균기준학점은 직접 구현...

		s.total = s.kor + s.eng + s.mat;
		s.avg = s.total / 3.0;
		setGrade(s);

		return s;
	}



	Student makeStudent() {
		Student s = new Student();
		
		s.no = seq++;
		System.out.print("성명입력>>> ");s.name = scan.next();
		System.out.print("국어점수>>> ");s.kor = getNum();
		System.out.print("영어점수>>> ");s.eng = getNum();
		System.out.print("수학점수>>> ");s.mat = getNum();
		
		s.total = s.kor + s.eng + s.mat;
		s.avg = s.total / 3.0;
		setGrade(s);
		
		return s;
	}


	private int getNum() {

		int num = 0;
		int ch = 0;

		try {
			while ((ch = System.in.read()) != '\n') {
				if (ch >= '0' && ch <= '9') {
					num = num * 10 + ch - '0';
				}
			}
		} catch (IOException e) {
			return 0;
		}
		return num;
	}	

	
	private void setGrade(Student s) {

		s.grade = "F";
		if (s.avg >= 90) {
			s.grade = "A";
		} else if (s.avg >= 80) {
			s.grade = "B";
		} else if (s.avg >= 70) {
			s.grade = "C";
		} else if (s.avg >= 60) {
			s.grade = "D";
		}

		
		if (s.avg == 100 || s.avg % 10 >= 7) {
			s.grade += "+";
		} else if (s.avg % 10 < 3) {
			s.grade += "-";
		}
	}

	

	// 메서드 오버로딩 구현
	void input(String name, int kor, int eng, int mat) {
		stdArr[top++] = makeStudent(name, kor, eng, mat);
		setRank();
		sort();
	}	

	void input() {
		System.out.println("::: 입력 기능 :::");
		stdArr[top++] = makeStudent();
		setRank();
		sort();

		System.out.println("++++ 입력 완료 ++++");
	}



	private void sort() {

		for (int i = 0; i < top - 1; i++) {
			for (int j = i + 1; j < top; j++) {
				if (stdArr[i].total < stdArr[j].total) {
					Student t = stdArr[i];
					stdArr[i] = stdArr[j];
					stdArr[j] = t;
				}
			}
		}		
		
	}	

	private void setRank() {
		// 비교할 요소의 등수를 1등으로 초기화 하고 모두 비교한다.
		// 더 큰 점수를 가진 요소가 있다면 1등에서 2등으로 변경한다.

		for (int i = 0; i < top; i++) {
			stdArr[i].rank = 1;
			for (int j = 0; j < top; j++) {
				if (stdArr[i].total < stdArr[j].total) {
					stdArr[i].rank += 1;
				}
			}
		}
		
	}

	

	void output() {

		System.out.println("::: 출력 기능 :::");
		for (int i = 0; i < top; i++) {
			System.out.println(stdArr[i]);
		}

	}



	int search(String title) {

		System.out.print(title.equals("검색") ? "::: 검색 기능 :::\n" : "");
		// 검색 할 이름 입력 : kim
		// 동명2인일 경우 모두 출력한다.
		System.out.print(title + " 할 이름 입력: ");
		String sName = scan.next();

		int cnt = 0;
		for (int i = 0; i < top; i++) {
			if (sName.equals(stdArr[i].name)) {
				cnt++;
				System.out.println(stdArr[i]);
			}
		}

		return cnt; // 값도 리턴해 주면서 void 처럼 그냥 작업수행도 가능한건가? return타입 메소드들은?
	}
	
	
	void modify() {
		System.out.println("::: 수정 기능 :::");
		search("수정");
		System.out.print("수정 할 no를 입력하세요: ");
		int modifyNo = getNum();
		int idx = findIndex(modifyNo);

		Student s = stdArr[idx];
		System.out.println("수정 할 학생을 찾았습니다. 다음을 메뉴를 선택하세요.");
		System.out.println("1.이름 수정 2.성적수정");
		System.out.print("선택: ");
		int no = getNum();

		if (no == 1) {
			System.out.print("새 이름 입력: ");
			s.name = scan.next();
		} else if (no == 2) {
			System.out.print("국어점수>>> ");
			s.kor = getNum();

			System.out.print("영어점수>>> ");
			s.eng = getNum();

			System.out.print("수학점수>>> ");
			s.mat = getNum();

			// 총점, 평균, 평균기준학점은 직접 구현...

			s.total = s.kor + s.eng + s.mat;
			s.avg = s.total / 3.0;
			setGrade(s);
			setRank();
			sort();

		} else {
			System.out.println("해당 선택의 메뉴는 준비되지 않았습니다.");
			return;
		}
		System.out.print("수정 완료!");
	}

	

	private int findIndex(int modifyNo) {

		// modifyNo를 찾으면 해당 요소의 index를 반환하고
		// 없다면 -1을 반환한다.

		for (int i = 0; i < top; i++) {
			if (stdArr[i].no == modifyNo) {
				return i;
			}
		}		
		return -1;
	}

	

	void delete() {
		System.out.println("::: 삭제 기능 :::");
		int cnt = search("삭제");

		if (cnt == 0) {
			System.out.println("내용을 찾지 못했습니다!");
			return;
		}

		System.out.print("삭제 할 no를 입력하세요: ");
		int delNo = getNum();
		int idx = findIndex(delNo);

		for (int i = idx; i < top - 1; i++) {
			stdArr[i] = stdArr[i + 1];
		}
		
		stdArr[top - 1] = null;
		top--;
	}

	void end() {

		System.out.println("::: 시스템 종료 :::");
		System.exit(0);
	}

	private void play() {

		switch (menu()) {
		case 1: 
			input();
			break;
		case 2:
			output();
			break;
		case 3:
			search("검색");
			break;
		case 4:
			modify();
			break;
		case 5:
			delete();
			break;
		case 6:
			end();
			break;
		default:
			System.out.println("해당 사항 없습니다!");
		}
		// 재귀호출
		// play();
	}

	public static void main(String[] args) {
		new SungManager_SampleAnswer();
	}
}
