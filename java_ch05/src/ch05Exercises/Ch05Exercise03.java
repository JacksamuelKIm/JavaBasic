package ch05Exercises;
public class Ch05Exercise03 {
	
	public static void main(String[] args) {
		SharpPencil s = new SharpPencil();  
		s.setAmount(10);
		System.out.println("amount"+s.getAmount());
		
		BallPen b = new BallPen();
		b.setAmount(17);
		System.out.println("amount"+b.getAmount());
		
		FountainPen f = new FountainPen();
		f.setAmount(54);
		System.out.println("amount"+f.getAmount());
	}
	
	
}
class SharpPencil {
	private int width;
	private int amount;
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}	
}

class BallPen extends SharpPencil{	
	private String color;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}		
}

class FountainPen extends BallPen {		
	
	public void refil (int n) {
		setAmount(n);}
}



