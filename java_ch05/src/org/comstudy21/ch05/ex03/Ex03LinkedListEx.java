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
	static Shape start = null, last=null, cur; //지역 변수 이므로 null 안 주면 암것도 안됨
	
	public Ex03LinkedListEx() {
		test01();
	}
	
	public static void main(String[] args) {
		new Ex03LinkedListEx();
	}
	
	private static void appendList(Shape p) {
		// 최초 노드 생성
		cur = p;
		if (start == null) {
			start = cur;
			last = start;
			return ; // 첫번째 노드 삽입 후 바로 종료
		}
		// 다음 노드 생성
//		cur = new Rect();  필요 없데. why?
		last.next = cur;
		last = cur;

		// 다음 노드 생성
		cur = new Circle();
		last.next = cur;
		last = cur;

		// 다음 노드 생성
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
		
		//최초 노드 생성
		cur = new Line();
		if (start == null) {
			start =  cur;
			last = start;
		}
		// 다음 노드 생성
		cur = new Rect();
		last.next = cur;
		last = cur;
		
		// 다음 노드 생성
		cur = new Circle();
		last.next = cur;
		last = cur;
		
		// 다음 노드 생성
		cur = new Shape();
		last.next = cur;
		last = cur;
		
		cur = new Rect();
		last.next = cur;
		last = cur;
		
		// 출력
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
