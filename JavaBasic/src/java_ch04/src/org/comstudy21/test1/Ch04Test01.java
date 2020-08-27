package org.comstudy21.test1;

public class Ch04Test01 {
	
	
	public static void main(String[] args) {
		Washer samsungWasher = new Washer("삼성", "통돌이");
		samsungWasher.setKg(100);
		samsungWasher.setPrice(120);		
		
		samsungWasher.play();
		
		System.out.println();
		
		
		Washer lgWasher = new Washer("LG", "트롬", 80, 120);
		lgWasher.세제();		
		lgWasher.play();
		
		lgWasher.showInfo();
		
	}

}
