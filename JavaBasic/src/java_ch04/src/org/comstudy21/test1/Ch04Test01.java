package org.comstudy21.test1;

public class Ch04Test01 {
	
	
	public static void main(String[] args) {
		Washer samsungWasher = new Washer("�Ｚ", "�뵹��");
		samsungWasher.setKg(100);
		samsungWasher.setPrice(120);		
		
		samsungWasher.play();
		
		System.out.println();
		
		
		Washer lgWasher = new Washer("LG", "Ʈ��", 80, 120);
		lgWasher.����();		
		lgWasher.play();
		
		lgWasher.showInfo();
		
	}

}
