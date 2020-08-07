package parKParking_SampleAnswerByTeacher;

import java.util.ArrayList;

public class ParkController {
	private ArrayList<ParkDTO> list; // 상세한 내용은 보여주기 싫어서?

	// 생성자를 이용해서 list를 초기화
	public ParkController() {
		list = new ArrayList<>();
	}

	// ParkDTO 객체가 넘어오면 list에 추가하는 메소드
	public void add(ParkDTO p) {
		list.add(p);
	}

	// ParkDTO 객체가 넘어오면 list에 존재하는 지 체크하는 메소드
	public boolean contains(ParkDTO p) {
		return list.contains(p);
	}

	// list에 존재하는 객체의 갯수를 확인하는 메소드
	public int size() {
		return list.size();
	}

	// ParkDTO 객체가 넘어오면 리스트 안에서 해당 객체와 같은 객체를 찾아서
	// 리턴해주는 메소드
	public ParkDTO get(ParkDTO p) {
		int index = list.indexOf(p);
		return list.get(index);
	}

	// ParkDTO 객체가 넘어오면 리스트에서 삭제하는 메소드
	public void remove(ParkDTO p) {
		list.remove(p);
	}

	// 입력된 int를 파악해서 유효한 시간인지 체크하는 메소드
	public boolean validateTime(int time) {
		int hour = time / 100;
		int minute = time % 100;
		return ((hour >= 0 && hour <= 23) && (minute >= 0 && minute <= 59));
	}

} // class end
