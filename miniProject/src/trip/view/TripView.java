package trip.view;

import java.util.Scanner;

import trip.controller.ReservationController;
import trip.controller.SignIn;
import trip.model.vo.*;

public class TripView {

	private Scanner sc = new Scanner(System.in);
	private SignIn si = new SignIn();
	private FlightInfo fi = new FlightInfo();
	private Reservation r = new Reservation();
	private ReservationController rc = new ReservationController();

	public void mainMenu() {

		while (true) {

			System.out.println(" ---------------------------------- ✈ ----------------------------------- ");
			System.out.println("  1. 회원가입 | 2. 내 여정 조회 | 3. 항공편 조회 | 4. 항공편 예약 | 5. 예약 취소 | 6. 종료 ");
			System.out.print("  >>> ");
			int menu = sc.nextInt();
			System.out.println(" ---------------------------------- ✈ ----------------------------------- ");

			switch (menu) {
			case 1:
				signIn();
				break;
			case 2:
				myFlight();
				break;
			case 3:
				showFlights();
				break;
			case 4:
				reserveFlight();
				break;
			case 5:
				cancelFlight();
				break;
			case 6:
				System.out.println("  프로그램이 종료됩니다. 이용해주셔서 감사합니다.");
				return;
			default:
				System.out.print("   없는 메뉴입니다. 다시 입력해 주세요! \n\n");
			}
		}
	}

	public void signIn() {
		si.signInNew();
		System.out.println(si.signInfo());
	}

	public void myFlight() {
		rc.myFlightInfo();
	}

	public void showFlights() {
		FlightInfo[] fList = new ReservationController().showFlights();
		System.out.println();
		System.out.println("  ✈ 항공편 정보");
		System.out.println("       출발         도착          출발 시간       도착 시간         가격       잔여 좌석    ");
//		for(FlightInfo f : fList) {
//			System.out.println(f);
//		}
		for(int i=0; i<fList.length; i++) {
			System.out.print(" " + (i+1) + " ");
			System.out.println(fList[i]);
		}
		System.out.println();
	}

	public void reserveFlight() {
		rc.reserveFlight();
	}

	public void cancelFlight() {
		rc.cancelFlight();
	}
}
