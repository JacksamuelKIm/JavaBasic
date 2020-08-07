package parkingLotSystem_Too_Grandiose;
import java.util.Scanner;

import java.time.format.DateTimeFormatter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParkVO {
	
//	// 주차칸 번호
//	int lotNumber;      // 주차 공간 번호 array랑 헷갈릴 수 있으니 0 1 2 3 4 그대로 갑시다. 맘에 안 들면 나중에 바꾸면 되니     // 이게 꼭 필요하려나???
//	
//	public int getLotNumber() {
//		return lotNumber;
//	}
//
//	public void setLotNumber(int lotNumber) {
//		this.lotNumber = lotNumber;
//	}
	
	//차량 번호	
	String plateNumber; // 차량번호(Let's take this as a name on an ID) ex) 67가 0815 // 이 양식대로 하도록. 또 나눌까.... 아니면
	
	public String getPlateNumber() {
		return plateNumber;
	}
	
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	
	
//	// 들어오는 시간		

	String enteringHM;
	
	public String getEnteringHM() {
		return enteringHM;
	}

	public void setEnteringHM(String enteringHM) {
		this.enteringHM = enteringHM;
	}

//	// 나가는 시간		

	String leavingHM;

	public String getLeavingHM() {
		return leavingHM;
	}

	public void setLeavingHM(String leavingHM) {
		this.leavingHM = leavingHM;
	}
	
	
	 
	
	
	
	
	

	// 요금 (10분당 천원)	
	int parkingFee;
	
	public int getParkingFee() {
		return parkingFee;
	}




	public void setParkingFee(int parkingFee) {
		this.parkingFee = parkingFee;
	}
	
	
//==================================================================================
		
	
	// 생성자
	public ParkVO() throws ParseException{
	
		
	
	 
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
