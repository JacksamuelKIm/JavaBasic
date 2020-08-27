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
	public Washer (){ //null값 뛰면 귀찮으니까
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
		System.out.println(brand + " " +  product + " 세탁기가  " + kg + "kg의 빨래를 한다");
	}
	
	public void 세제() {
		System.out.println("세탁기에 세제 투입");
	}
	
	
	
	@Override
	public String toString() {
		return "Washer [brand=" + brand + ", product=" + product + ", kg=" + kg + ", price=" + price + "]";
	}

	public void showInfo() {
//		System.out.printf("\n::::상품정보 ::::\nbrand: %s \nproduct: %s \nkg: %dkg \nprice: %d만원 \n",brand, product, kg, price );
		System.out.println(this);
	}
	
	

}
