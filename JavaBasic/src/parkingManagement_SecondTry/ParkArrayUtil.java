package parkingManagement_SecondTry;

public class ParkArrayUtil {
	public static int indexOf(ParkVO s, ParkVO[] parkArray) {
		for (int i = 0; i < parkArray.length; i++) {
			if(s.equals(parkArray[i])) {
				return i; //return 하는 순간 메소드 전체가 바로 종료됨
			} //if end			
		} //for end		
		return -1; // 암 것도 못 찾을 때
	} // indexOf end
	
	
	
	
	public static ParkVO [] set(ParkVO[] array, ParkVO s) {
		int index = indexOf(s, array);
		array[index] = s;
		return array;
	} //set end
}
