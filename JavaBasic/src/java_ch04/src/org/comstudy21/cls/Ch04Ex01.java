package org.comstudy21.cls;

// Ŭ���� = �ʵ� + �޼ҵ�
// Ŭ������ ����� ���� ������ Ÿ��
// ���������ڰ� �����Ǹ� ����Ʈ ����������(��Ű�����)
// ���� ��Ű���������� ���� �̸��� Ŭ������ ������ �� ����


class Point01{
	private int x;
	private int y;
	
	
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	
	//Lombok.jar�� �̿��ؼ� �ڵ����� ����. (���߿� ��)
	
}

public class Ch04Ex01 {

	public static void main(String[] args) {
		//��ü�� ����� ���ؼ��� Ŭ������ �ʿ��ϴ�
		// Ÿ��(Ŭ����) ����(����) = new ��������
		// ������ �����ϸ�  ponin 
		Point01 pt = new Point01();
		//�ع��ʵ忡 �� �ֱ�: ��(.) �����ڸ� �̿��ؼ� ����� ����
//		pt.x = 120; 
//		pt.y = 150;		
//		System.out.printf("x:%d, y:%d\n", pt.x, pt.y);
		
		// ���� ������ �Ǹ� Ŭ���� �ܺο��� ������ �Ұ���������.
		// setters/getters�� �̿��ؼ� ������ �ʵ� ����
		// �Ϲ������� �ʵ�� private, �޼ҵ�� public
		
		
		pt.setX(300);
		pt.setY(300);
		
		System.out.printf("x:%d, y:%d", pt.getX(), pt.getY());
		
	}

}
