package org.comstudy21.staticex;

public class Ch04Ex12 {

	public static void main(String[] args) {
		Account c1 = new Account(2000);
		c1.showMoney();
		Account c2 = new Account(500);
		c2.showMoney();
		Account c3 = new Account(1000);
		c3.showMoney();
		
		c1.total = 10;
		System.out.println("total => " + Account.total);
		
		

	}

}
