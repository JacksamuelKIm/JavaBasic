package parKParking_SampleAnswerByTeacher;

public class ParkDTO {
	private String carNumber;
	private int inTime;

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public int getInTime() {
		return inTime;
	}

	public void setInTime(int inTime) {
		this.inTime = inTime;
	}

	public boolean equals(Object obj) {
		if (obj instanceof ParkDTO) {
			ParkDTO p = (ParkDTO) obj;
			if (carNumber.equals(p.carNumber)) {
				return true;
			}

		}
		return false;
	} // equals end

}
