package Ch04.Practices;

class TV {
	String maker;
	int year;
	int tvSize;
	
	
	public TV (String maker, int year, int tvSize) { //void���� ����Ÿ���� �����ڿ� ������ �ȵ���
		this.maker = maker;
		this.year = year;
		this.tvSize = tvSize;		
	}	
	
	public void show() {
		System.out.printf("%s���� ���� %d���� %d��ġ TV\n", maker, year, tvSize);
	}	
}


public class Practice1 {
	
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32); //LG���� ���� 2017�� 32��ġ
		myTV.show();
	}	
}
