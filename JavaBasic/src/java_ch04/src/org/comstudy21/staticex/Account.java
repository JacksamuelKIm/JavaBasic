package org.comstudy21.staticex;

public class Account {
	int money;
	static int total; //얘는 공유되는거지!!!!!!! 고시원 공용 냉장고!
	
	public Account(int money) {
		this.money = money;
		total += money;
	}
	
	public void showMoney(){
		System.out.println("money : " + money);
		System.out.println("total : " + total);
	}

}
