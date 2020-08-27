package Ch04.Practices;
class Rectangle {	
	int x, y, width, height;	
	
	@Override
	public String toString() {
		return "(" + x + ", " + y + ") ���� ũ�Ⱑ " + width + "x" + height + "�� �簢��";
	}

	public Rectangle (int x, int y, int width, int height) {
		this.x = x; this.y = y; this.width = width; this.height = height;
	}	
	
	public int square() {
		int area = width*height;		 
		return area;
	}
	
	public void show() {
		System.out.println(toString());
	}	
	 	 
	public boolean contains(Rectangle r){					
		boolean bool = false;		
		Rectangle t = new Rectangle(1, 1, 10, 10);		
		if (t.x < r.x && t.x + t.width > (r.x + r.width)) {
			if(t.y <= r.y && t.y + t.height >= r.y + r.height) {
				bool = true;
			}			
		}				
		return bool;
	}	 
}

public class Practice4 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		
		r.show();
		System.out.println("s�� ������ " + s.square());
		if(t.contains(r)) System.out.println("t�� r�� �����մϴ�.");
		if(t.contains(s)) System.out.println("t�� s�� �����մϴ�.");
	}
}
