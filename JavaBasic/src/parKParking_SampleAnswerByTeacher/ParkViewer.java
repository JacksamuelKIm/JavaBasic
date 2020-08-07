package parKParking_SampleAnswerByTeacher;

import java.util.Scanner;

public class ParkViewer {
	private Scanner scanner;
	private ParkController controller;
	private final int SIZE = 5;
	private final int UNIT_MINUTE = 10;
	private final int UNIT_PRICE = 1000;

	public ParkViewer() {
		scanner = new Scanner(System.in);
		controller = new ParkController();

	}

	public void showMenu() {
		while (true) {
			System.out.println("===================");
			System.out.println("||비트 주차장 관리 프로그램||");
			System.out.println("===================");
			System.out.println("1. 입차  2. 출차  3. 종료");
			int choice = scanner.nextInt();
			if (choice == 1) {
				// 입차하는 메소드를 호출한다.
				insert();
			} else if (choice == 2) {
				// 출차하는 메소드를 호출한다.
				delete();
			} else if (choice == 3) {
				System.out.println("사용해 주셔서 감사합니다.");
				scanner.close();
				break;
			}

		}

	}

	private void delete() {
		// 출차의 경우 제일 먼저 주차장에 주차된 차량이 존재하는 지 체크한다.
		if (controller.size() == 0) {
			// 주차된 차량이 존재하지 않으므로 경고 메세지만 출력
			System.out.println("==============");
			System.out.println("입차된 차령이 없습니다");
			System.out.println("==============");
		} else {
			// 출차할 차량의 정보를 담음 ParkDTO 객체를 만든다.
			ParkDTO parkDTO = new ParkDTO();
			parkDTO.setCarNumber(deleteCarNumber());

			// 아직 이 parkDTO 객체에는 inTime이 없다
			// 왜냐하면 해당 객체는 이 메소드에서 만들어졌기 때문.
			// 따라서 우리는 이 객체를 이용해서
			// 컨트롤러 내부에 존재하는 list안에
			// 해당 객체와 똑같은 객체를 불러와야 한다

			parkDTO = controller.get(parkDTO);

			// 출차 시간을 입력 받는다.
			// 출차 시간의 경우 시간의 형식이 올바른 것 뿐만 아니라
			// 입차시간보다 커야한다.

			int outTime = deleteTime(parkDTO);

			// 올바른 출차번호 + 올바른 출차시간 = 요금 계산 가능

			calculateRate(parkDTO, outTime);

			// 요금 계산 후에 해당 객체를 리스트에서 사제
			controller.remove(parkDTO);

		}
	} // delete end

	private void calculateRate(ParkDTO p, int outTime) {
		// 시간의 차이 * 60 + 분의 차이 = 총 분의 차이
		int hourDifference = outTime / 100 - p.getInTime() / 100;
		int minuteDifference = outTime % 100 - p.getInTime() % 100;
		int totalDifference = hourDifference * 60 + minuteDifference;

		int rate = totalDifference / UNIT_MINUTE * UNIT_PRICE;
		System.out.println(p.getCarNumber() + " 차량의 요금은 " + rate + "원입니다.");

	}

	private int deleteTime(ParkDTO p) {
		System.out.print("출차시간을 입력해주세요: ");
		int outTime = scanner.nextInt();
		while (!controller.validateTime(outTime) || p.getInTime() > outTime) {
			System.out.println("잘못된 시간 형식입니다");
			System.out.print("출차시간을 입력해주세요");
			outTime = scanner.nextInt();
		}
		return outTime;
	}

	private String deleteCarNumber() {
		// 이번에는 반대로 리스트에 존재하지 않으면 에러
		System.out.print("출차할 차량의 번호를 입력해주세요: ");
		scanner.nextLine();
		String plateNumber = scanner.nextLine();
		ParkDTO p = new ParkDTO();
		p.setCarNumber(plateNumber);
		while (!controller.contains(p)) {
			System.out.println("입차된 기록이 없는 번호입니다.");
			System.out.println("입차할 차량의 번호를 입력해주세요: ");
			plateNumber = scanner.nextLine();
			p.setCarNumber(plateNumber);
		}

		return plateNumber;

	} // deleteCarNumber end

	private void insert() {
		// 주차의 경우 제일 먼저 주차장에 빈 칸이 있는지 체크한다.
		if (controller.size() < SIZE) {
			// 주차장에 빈 칸이 존재함
			// 먼저 list에 추가할 때 사용할 ParkDTO 객체를 하나 만들어주자.
			ParkDTO parkDTO = new ParkDTO();

			// 1. 차량 번호를 입력 받는다.
			// 단 차량 번호 입력은 다른 메소드를 통해서 결과값만 받아오자.
			// 이런 식으로 분리하면 UI 업데이트나 유지 보수할 때 쉽다.
			parkDTO.setCarNumber(addCarNumber());

			// 2. 시간을 입력 받는다.
			// 시간 입력도 메소드를 통해서 합시다.
			parkDTO.setInTime(addInTime());
			System.out.println(parkDTO.getCarNumber() + "차량이 정상적으로 주차되었습니다.");
			controller.add(parkDTO);

		} else {
			// 주차장에 빈 칸이 존재하지 않으므로 경고 메세지만 출력
			System.out.println("-----------------");
			System.out.println("\t빈 칸이 없습니다");
			System.out.println("-----------------");
		}

	} // insert end

	private int addInTime() {
		System.out.print("입차할 차량의 시간을 입력하세요: ");
		int inTime = scanner.nextInt();
		while (!controller.validateTime(inTime)) {
			System.out.println("잘못된 시간형식입니다.");
			System.out.print("입차 시간을 입력해주세요: ");
			inTime = scanner.nextInt();
		}

		return inTime;
	}

	private String addCarNumber() {
		System.out.print("입차할 차량의 차량번호를 입력하세요: ");
		scanner.nextLine();
		String plateNumber = scanner.nextLine();
		ParkDTO p = new ParkDTO(); // 얘가 왜 갑자기 나올까?
		p.setCarNumber(plateNumber);
		while (controller.contains(p)) {
			System.out.println("이미 입고된 기록이 존재합니다.");
			System.out.print("입차할 차량의 차량번호를 입력하세요:  ");
			plateNumber = scanner.nextLine();
			p.setCarNumber(plateNumber);

		}
		return plateNumber;
	}

}// class end
