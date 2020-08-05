package day03;

public class Ipad {
	private String serial;
	private String owner;
	private int version;
	private int memorySize;
	private double iOSVersion;
	
	public void showInfo() {
		System.out.println("이 아이패드의 주인은 "+owner+"이고 기기의 시리얼 번호는 "+serial+"입니다.");
	}
	
	
	//setter
	
	public void setSerial(String serial ) {
		if(serial.equals("00가0000")) {
			System.out.println("잘못된 값입니다");
			this.serial = "초기화 안 된 상태 ";
		} else {
			this.serial = serial;			
		}	
		this.serial = serial;
	}
	
	public void setOwner(String owner ) {
		this.owner = owner;
	}
	
	public void setVersion(int version ) {
		this.version = version;
	}
	
	public void setMemorySize(int memorySize ) {
		this.memorySize = memorySize;
	}
	
	public void setIOSVersion(double iOSVersion ) {
		this.iOSVersion = iOSVersion;
	}
	
	//getter
	
	public String getSerial() {
		return serial;		
	}
	
	public String getOwner() {
		return owner;		
	}
	
	public int getVersion() {
		return version;
	}
	
	public int getMemorySize() {
		return memorySize;
	}
	
	public Double getIOSVersion() {
		return iOSVersion;
	}
	
	
	
}