package org.comstudy21.cls;

public class Point {

	int x;
	int y;
	
	public Point() {
		// ����Ʈ ������ - �����ڰ� ������ ������ �����Ϸ��� �ڵ� �߰���Ŵ
		System.out.println("����Ʈ ������ ȣ��!");
	}

	public Point(int _x, int _y) {
		// ������ �����ε� - ����Ʈ �����ڴ� �� �̻� �����Ϸ��� ���� �ڵ� �߰����� �ʴ´�.
		// ������ �����ε��� ���� ��쿡 ����Ʈ �����ڵ� �� ��������! �����ε��� �ϸ� ����Ʈ�� �ڵ����� ��������� �����Ƿ�
		x = _x;
		y = _y;
		
	}
	
	
	public void showPoint() {
		System.out.println("(" + x + ", " +y + ")");
		
	}
	
	
}
