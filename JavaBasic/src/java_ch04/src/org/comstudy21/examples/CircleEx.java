package org.comstudy21.examples;

public class CircleEx {

	public static void main(String[] args) {
		
		CircleVO pizza = new CircleVO();
		
		pizza.name = "자바피짜";
		pizza.radius = 10;
		
		pizza.getArea();
		
		double area1 = Math.floor(pizza.getArea()*100)/100;
		System.out.println(pizza.name + "의 크기는 "+area1);
		
		
		
		
		CircleVO donut = new CircleVO();
		
		donut.name = "자바도우넛";
		pizza.radius = 3;
		
		pizza.getArea();
		
		double area2 = Math.floor(pizza.getArea()*100)/100;
		System.out.println(donut.name + "의 크기는 "+area2);
				

	}

}
