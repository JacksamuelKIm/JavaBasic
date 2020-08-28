package org.comstudy21.ch05.ex03;

class Shape {
	protected String name = "Shape";
	public Shape next;
	public void draw() {
		System.out.println(name);
	}
}

class Line extends Shape {
	Line() {
		name = "Line";
	}
}
class Rect extends Shape {
	Rect() {
		name = "Rect";
	}
}
class Circle extends Shape {
	Circle() {
		name = "Circle";
	}
}

public class Ex03LinkedListEx {
	static void paint(Shape p) {
		p.draw();
	}
	static Shape start = null, last=null, cur; //���� ���� �̹Ƿ� null �� �ָ� �ϰ͵� �ȵ�
	
	public Ex03LinkedListEx() {
		test01();
	}
	
	public static void main(String[] args) {
		new Ex03LinkedListEx();
	}
	
	private static void appendList(Shape p) {
		// ���� ��� ����
		cur = p;
		if (start == null) {
			start = cur;
			last = start;
			return ; // ù��° ��� ���� �� �ٷ� ����
		}
		// ���� ��� ����
//		cur = new Rect();  �ʿ� ����. why?
		last.next = cur;
		last = cur;

		// ���� ��� ����
		cur = new Circle();
		last.next = cur;
		last = cur;

		// ���� ��� ����
		cur = new Shape();
		last.next = cur;
		last = cur;

		cur = new Rect();
		last.next = cur;
		last = cur;
		
	}

	private static void showList() {
		cur = start;
		while(cur != null) {
			paint(cur);
			cur = cur.next;
		}
		
	}
	
	public static void test03(String[] args) {
		appendList(new Line());
		appendList(new Rect());
		appendList(new Circle());
		appendList(new Line());
		appendList(new Shape());
		showList();
	}
	
	
	


	public static void test02(String[] args) {
		
		//���� ��� ����
		cur = new Line();
		if (start == null) {
			start =  cur;
			last = start;
		}
		// ���� ��� ����
		cur = new Rect();
		last.next = cur;
		last = cur;
		
		// ���� ��� ����
		cur = new Circle();
		last.next = cur;
		last = cur;
		
		// ���� ��� ����
		cur = new Shape();
		last.next = cur;
		last = cur;
		
		cur = new Rect();
		last.next = cur;
		last = cur;
		
		// ���
		cur = start;
		while(cur != null) {
			paint(cur);
			cur = cur.next;
		}
	}
	
	public static void test01() {		
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
		paint(new Shape());
	}
}
