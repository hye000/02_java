package trip.view;

import java.util.Scanner;

import trip.movel.vo.*;
import trip.signin.SignIn;

public class TripView {

	private Scanner sc = new Scanner(System.in);
	private SignIn si = new SignIn();
	private FlightInfo fi = new FlightInfo();
	private Reservation r = new Reservation();

	public void mainMenu() {

		while (true) {

			System.out.println(" ------------------------------ ✈ ------------------------------- ");
			System.out.println("  1. 회원가입 | 2. 내 정보 조회 | 3. 항공편 조회 | 4. 항공편 예약 | 5. 종료");
			System.out.print("  >>> ");
			int menu = sc.nextInt();
			System.out.println(" ------------------------------ ✈ ------------------------------- ");

			switch (menu) {
			case 1:
				signIn();
				break;
			case 2:
				myInfo();
				break;
			case 3:
				showFlights();
				break;
			case 4:
				reserveFlight();
				break;
			case 5:
				return;
			default:
				System.out.print("   없는 메뉴입니다. 다시 입력해 주세요! \n\n");
			}
		}
	}

	public void signIn() {
		si.signin();
	}

	public void myInfo() {
		System.out.println(si.toString());
	}

	public void showFlights() {
		FlightInfo[] fList = new Reservation().getFlights();
		System.out.println();
		System.out.println("  ✈ 항공편 정보");
		System.out.println("    출발         도착          출발 시간       도착 시간       가격       잔여 좌석    ");
		for(FlightInfo f : fList) {
			System.out.println(f);
		}
		System.out.println();
	}

	public void reserveFlight() {
		r.reserveFlight();
	}

	public void cancelFlight() {
		r.cancelFlight();
	}
}
