package org.comstudy21.staticex;

public class Account {
	int money;
	static int total; //��� �����Ǵ°���!!!!!!! ��ÿ� ���� �����!
	
	public Account(int money) {
		this.money = money;
		total += money;
	}
	
	public void showMoney(){
		System.out.println("money : " + money);
		System.out.println("total : " + total);
	}

}
