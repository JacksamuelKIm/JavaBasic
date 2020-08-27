package Ch04.Practices;

import java.util.Scanner;

class Circle2 {
	private double x, y, area;
	private int radius;
	
	public double getArea() {
		return area;	}
	
	public Circle2(double x, double y, int radius, double area) {
		this.x = x; this.y = y; this.radius = radius; this.area = area;
	}			
	public void show() {
		System.out.printf("���� ��ǥ: (%.1f, %.1f)  ������ : %d \n"  , x, y, radius);
	}	
	public void show2() {
		System.out.printf("���� ������ ū ����: (%.1f, %.1f)  ������ : %d \n"  , x, y, radius);
	}
}

public class CircleManager_Practice6 {
	
	public static double max(double i, double j) {
		if(i>j) {
			return i;
		} else if(i<j) {
			return j;
		} else {
			return i;
		}		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle2[] c = new Circle2[3];
		for (int i =0; i<c.length ; i++) {
			System.out.print((i+1)+"��° ���� x, y, radius >>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			double area = radius*radius*Math.PI; 
			c[i] = new Circle2(x, y, radius, area);			
		}				
		
		for (int i =0; i<c.length ; i++) { 
			if(c[i].getArea() == max(c[0].getArea(), max(c[1].getArea(), c[2].getArea())))  { // �� �̰� ���� ���� �ȵ��
				c[i].show2();
			}
		}		
		scanner.close();		
	}	
}
