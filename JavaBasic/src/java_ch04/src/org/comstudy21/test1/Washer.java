package org.comstudy21.test1;

public class Washer {
	private String brand;
	private String product;	
	private int kg;
	private int price;
	
	public int getKg() {
		return kg;
	}

	public void setKg(int kg) {
		this.kg = kg;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
//------------ constructor -------------
	public Washer (){ //null�� �ٸ� �������ϱ�
		this("","",0,0);
	}	
	
	public Washer(String brand, String product) {
		this.brand = brand;
		this.product = product;
	}
	
	public Washer(String brand, String product, int kg, int price) {
		this.brand = brand;
		this.product = product;
		this.kg = kg;
		this.price = price;
	}
	
	
//------------ methods ---------------	
	public void play() {
		System.out.println(brand + " " +  product + " ��Ź�Ⱑ  " + kg + "kg�� ������ �Ѵ�");
	}
	
	public void ����() {
		System.out.println("��Ź�⿡ ���� ����");
	}
	
	
	
	@Override
	public String toString() {
		return "Washer [brand=" + brand + ", product=" + product + ", kg=" + kg + ", price=" + price + "]";
	}

	public void showInfo() {
//		System.out.printf("\n::::��ǰ���� ::::\nbrand: %s \nproduct: %s \nkg: %dkg \nprice: %d���� \n",brand, product, kg, price );
		System.out.println(this);
	}
	
	

}
