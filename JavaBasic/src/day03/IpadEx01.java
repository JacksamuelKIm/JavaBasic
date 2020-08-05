package day03;

public class IpadEx01 {

	public static void main(String[] args) {
	
		Ipad myIpad1 = new Ipad();
		myIpad1.setSerial("00가 0000"); //Ipad.java의 this는 이 myIpad1 가리킴
		// myIpad1.setSerial() = "00가 0000"; // 자주 하는 실수. 불가능. setSerial()필드 값도 아니구 존재도 안함 myIpad1 상에. 
		System.out.println(myIpad1.getSerial());
		
		myIpad1.setOwner("Jack");
		System.out.println(myIpad1.getOwner());
		
		myIpad1.setMemorySize(64);
		System.out.println(myIpad1.getMemorySize());
		
		myIpad1.setVersion(2);
		System.out.println(myIpad1.getVersion());
		
		myIpad1.setIOSVersion(20.0);
		System.out.println(myIpad1.getIOSVersion());
		
		
//		myIpad1.owner = "Jack";
//		myIpad1.memorySize = 64;
//		myIpad1.version = 2;
//		myIpad1.iOSVersion = 20.0;
				
		Ipad myIpad2 = new Ipad();
		myIpad2.setSerial("11나 1111"); //Ipad.java의 this는 이 myIpad2 가리킴
//		myIpad2.serial = ;
//		myIpad2.owner = "Jack";
//		myIpad2.memorySize = 128;
//		myIpad2.version = 3;
//		myIpad2.iOSVersion = 20.0;
		System.out.println(myIpad2.getSerial());
		
		myIpad2.setOwner("Jack");
		System.out.println(myIpad2.getOwner());
		
		myIpad2.setMemorySize(128);
		System.out.println(myIpad2.getMemorySize());
		
		myIpad2.setVersion(3);
		System.out.println(myIpad2.getVersion());
		
		myIpad2.setIOSVersion(20.0);
		System.out.println(myIpad2.getIOSVersion());
//		myIpad1.showInfo();
//		myIpad2.showInfo();
	} // main end

}
