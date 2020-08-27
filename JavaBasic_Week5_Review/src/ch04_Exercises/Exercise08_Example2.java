package ch04_Exercises;

class Power2 {
	private int kick;
	private int punch;
	
	public void setKick(int kick) {
		this.kick = kick;
	}
	
	public void setPunch(int punch) {
		this.punch = punch;
	}
	
}

public class Exercise08_Example2 {
	public static void main(String[] args) {
		Power2 robot = new Power2();
		robot.setKick(10);
		robot.setPunch(20);
	}
}
