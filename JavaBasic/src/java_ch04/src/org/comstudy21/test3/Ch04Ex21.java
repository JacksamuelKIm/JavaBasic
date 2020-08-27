package org.comstudy21.test3;

class Dao {
	String name = "DAD";
		
	private static Dao instance; 
	private Dao() {}
	
	public static Dao getInstance() { // static이라서 접근 가능?
		if(instance == null) {
			instance = new Dao();
		}
		return instance;
	}	
}


public class Ch04Ex21 {

	public static void main(String[] args) {
		
		//생성자를 private으로 선언했기 때문에 Dao 클래스 외부에서 생성 불가능
//		Dao dao = new Dao();
//		Dao dao2 = new Dao();

//		싱글톤 - 오직 하나뿐인 객체
		Dao dao = Dao.getInstance();
		System.out.println(dao.name);
	}

}
