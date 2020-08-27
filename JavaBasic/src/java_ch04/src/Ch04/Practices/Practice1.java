package Ch04.Practices;

class TV {
	String maker;
	int year;
	int tvSize;
	
	
	public TV (String maker, int year, int tvSize) { //void같은 리턴타입이 생성자에 있으면 안되지
		this.maker = maker;
		this.year = year;
		this.tvSize = tvSize;		
	}	
	
	public void show() {
		System.out.printf("%s에서 만든 %d년형 %d인치 TV\n", maker, year, tvSize);
	}	
}


public class Practice1 {
	
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32); //LG에서 만든 2017년 32인치
		myTV.show();
	}	
}
