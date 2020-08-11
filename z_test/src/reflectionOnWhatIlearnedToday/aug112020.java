package reflectionOnWhatIlearnedToday;

public class aug112020 {

	/**
	 * 
	 * ================= Ch01Ex01Homework01 ===================
	 * 1. 다른 클래스 쓰지 않고 System.in만으로 String을 받는 방법
	 * read()method는 기본적으로 (1)byte단위로 저장하므로 글자 하나만 나옴
	 * 따라서 Array를 이용해 해결해봐야 한다.
	 * 
	 * byte [] temp = new byte [255]  -> byte가 가능한 전체 길이군
	 * in.read();in.read(); 위에 다른 입력들이 있을 경우 엔터가 버퍼남아있을 수 있으니 비워주기
	 * in.read(temp); 콘솔 창에서 입력받아서 temp에 넣어줌(??)
	 * String address = new String(temp).trim(); -> adress에 배열 옮기기
	 * ** trim()은 빈 칸 지워주는 역할/
	 * 
	 * 
	 * 2. \n \r 이란?  
	 * \n : Line Feed  => 다음 줄로 이동
	 * \r : Carriage Return => 커서를 그 줄의 맨 앞으로
	 * 
	 * 
	 * 
	 * 3. 기본형(primitive type) 중 char 의 특징  
	 * 다른 기본형 들처럼 char타입도 역시 숫자이다.
	 * 화면에 글자로 표시될 뿐, 컴퓨터에게는 숫자로 나타남
	 * 'A' -> 65 'a' -> 97  '0' -> 48 
	 * ' ' 이거 잊지말자. " " 아님
	 * 
	 * 
	 * ==================== Ch01Homework02 ======================
	 * 
	 * 4. static의 개념
	 * 
	 * static이란 프로그램이 처음 시작할 때 메모리에 할당됨
	 * 그 프로그램이 끝날 때까지 그 이름을 같은 static은 오직 하나밖에 존재하지 못함.
	 * static -> static / non-static ->  static 이렇게 접근 가능하지만
	 * static은 non-static에 접근 불가.
	 * 마치 고손자가 100년전에 돌아가신 고조할아버지의 존재는 인식해도. 
	 * 고조할아버지는 그 손자가 누구인지 알 수 없는것과 같음
	 * 
	 * static이 없다면 일반적으로는 클래스의 생성자를 통해 객체룰 만들고 그 뒤에 '.'을 붙여서
	 * 그 객체 안(에도 담겨져 있는 클래스의 함수 및 객체, 변수등)의 멤버들을 꺼내어 쓴다 
	 * 			Ch01Homework02() object = new Ch01omework02(); 객체 형성
	 * 			object.test(); 그 안의 메서드(함수) 불러다 쓰기
	 * main도 static 붙어 있으니 메소드들 바로 불러다 씀 
	 * 
	 * ==================== Ch01Homework03 ======================
	 * 5. Scanner의 buffer 문제
	 * 인간의 타이핑 속도는 한정되어 있고. CPU는 여러가지 일을 하기 때문에 입력이 초고속으로
	 * 바로 들어오지 않는 이상 이런 저런 다른 일을 하고 있다. 
	 * buffer에 넣어놓고(??) 입력이 다 끝나면 쫙 보여줌.
	 * 
	 * Scanner를 객체 하나로만 만들어 놓고 쓰다보면 종종 충돌이 일어나므로
	 * 이왕이면 따로따로 만들자
	 * 
	 * 
	 * 6. txt파일 불러읽는 법 - getResourceAsStream("파일명")
	 * 
	 * InputStream is(<-객체명임) -->> txt파일을 불러들이고 is라는 객체에 할당.
	 *      = new Ch01Homework03(지금 현 클래스명의 생성자)().getClass().getResourceAsStream("파일명")
	 * 	 * String을 따로 만들고 그 스트링에 파일명을 할당해도 물론 된다.*
	 * 
	 * Scanner fileScan = new Scanner (is); ---->> txt 파일에서 불러들인 것을 입력!
	 * Scanner scan = newScanner(System.in); ----> 콘솔창 통해 입력
	 * 
	 * ArrayList<String> dataList = new ArrayList<>();
	 * 
	 * while(fileScan.hasNextLine()) {
	 *	   out.print(fileScan.nextLine()); --->> txt파일 상에서 한 줄 읽고 다음 줄로 이동
	 * 	   dataList.add(scan.nextLine()); ---> 콘솔창에서 내가 입력한 한 줄 읽고 
	 *                                         dataList에 넣어주고 다음 줄로 이동
	 * }
	 * 
	 * 
	 * 
	 * 7. 굳이 while(fileScan.hasNextLine())을 통해서 출력하는 이유
	 *  hasNextLine() 메소드는 말 그래도 다음(줄)에 뭐 있나(token)확인만 해주는 것임
	 *  while(fileScan.hasNextLine()) 루프가 없다면 한 번씩 읽고 종료임.
	 *  while(true)해버리면 영원히 반복되는 것이고.
	 * 
	 * 
	 * 
	 * ==================== Ch02Ex01======================
	 * 
	 * 한 클래스 내에서의 함수(메소드)는 반드시 호출해야만 실행된다
	 * 매개변수를 넣어주지 않으면 Constructor는 그냥 디폴트로 작동됨
	 * 생성자(Constructor)는 리턴형 없고 함수명과 이름이 동일. 한 번만 생성가능
	 * 
	 * 객체는 new 연산자를 통해 생성된다
	 * 클래스는 사용자가 정의하는 타입인데 결국 참조형(reference)임.
	 * 객체를 참조하여서 그 개게안에 데이터들 담는다.
	 * 
	 * Ch02Ex01 ex01; //참조형 변수가 선언됨. stack memory에 그 이름이 담김
	 * ex01 = new Ch02Ex01(); 객체가 heap memory에 생성됨(동적 할당)
	 * 
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
