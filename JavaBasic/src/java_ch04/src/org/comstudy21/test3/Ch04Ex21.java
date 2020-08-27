package org.comstudy21.test3;

class Dao {
	String name = "DAD";
		
	private static Dao instance; 
	private Dao() {}
	
	public static Dao getInstance() { // static�̶� ���� ����?
		if(instance == null) {
			instance = new Dao();
		}
		return instance;
	}	
}


public class Ch04Ex21 {

	public static void main(String[] args) {
		
		//�����ڸ� private���� �����߱� ������ Dao Ŭ���� �ܺο��� ���� �Ұ���
//		Dao dao = new Dao();
//		Dao dao2 = new Dao();

//		�̱��� - ���� �ϳ����� ��ü
		Dao dao = Dao.getInstance();
		System.out.println(dao.name);
	}

}
