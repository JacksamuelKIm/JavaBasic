package org.comstudy21.examples;

public class CircleVO {
	
	int radius;
	String name;
		
	public CircleVO () {
		
	}
	
	public double getArea() {
		
		double area;
		area = radius*radius*Math.PI; 
		
		return area;
	}
	
	
	
}
