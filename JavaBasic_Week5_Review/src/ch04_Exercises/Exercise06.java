package ch04_Exercises;

public class Exercise06 {
	
}
/*  (1) this()를 이용하여 생성자를 수정하라
 *  (2) new TV();와 new TV("삼성");를 실행하면 실행결과는 각각 무엇인가?
 *  	=> "32인치 LG" 출력 / "32인치 삼성" 출력 
 *  (3) 65인치 "삼성" TV객체를 생성하는 코드를 적어라
 *  	=> new TV(65, "삼성");
 *  (4) this()를 이용하는 장점은 무엇인가?
 *  	=> ??
 */


class TV {
	private int size;
	private String manufacturer;
	
	public TV() {
		this("LG");
		size = 32;
		manufacturer = "LG";
		System.out.println(size + "인치" + manufacturer);
	}
	
	public TV(String manufacturer) {
		this(32, "");		
		this.manufacturer = manufacturer;
		System.out.println(size + "인치" + manufacturer);
	}
	
	public TV(int size, String manufacturer) {
		this.size = size;
		this.manufacturer = manufacturer;
		System.out.println(size + "인치" + manufacturer);
	}
}