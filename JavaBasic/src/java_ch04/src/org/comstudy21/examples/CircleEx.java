package org.comstudy21.examples;

public class CircleEx {

	public static void main(String[] args) {
		
		CircleVO pizza = new CircleVO();
		
		pizza.name = "�ڹ���¥";
		pizza.radius = 10;
		
		pizza.getArea();
		
		double area1 = Math.floor(pizza.getArea()*100)/100;
		System.out.println(pizza.name + "�� ũ��� "+area1);
		
		
		
		
		CircleVO donut = new CircleVO();
		
		donut.name = "�ڹٵ����";
		pizza.radius = 3;
		
		pizza.getArea();
		
		double area2 = Math.floor(pizza.getArea()*100)/100;
		System.out.println(donut.name + "�� ũ��� "+area2);
				

	}

}
