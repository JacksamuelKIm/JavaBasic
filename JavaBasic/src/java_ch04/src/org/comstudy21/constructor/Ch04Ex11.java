package org.comstudy21.constructor;


class Point {
	int x;
	int y;
	
	public Point() {
		this(10,10);  // �Ű������� 2�� �ִ� ������ ȣ��
	}
	
	public Point(int x) { // �����ڰ� ������ ȣ��
		this(x, 10);  
	}
	
	public Point(int x, int y) { // �����ڰ� ������ ȣ��
		this.x = x;
		this.y = y;
	}
	
	
	public void showPoint() {
		System.out.println("(" + x + ", " +y + ")");
		
	}
	
}


public class Ch04Ex11 {
	public static void main(String[] args) {
		Point pt1 = new Point();
		pt1.showPoint();
		
		Point pt2 = new Point(300);
		pt2.showPoint();
		

	}

}
