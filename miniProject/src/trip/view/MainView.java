package trip.view;

import java.util.Scanner;
import trip.controller.TripController;

public class MainView {

	private Scanner sc = new Scanner(System.in);
	private TripController tc = new TripController();

	public void mainMenu() {

		while (true) {

			System.out.print("\n ---------------------------------- ✈ ------------------------------------ \n");
			System.out.println("  1. 회원가입 | 2. 내 여정 조회 | 3. 항공편 조회 | 4. 항공편 예약 | 5. 예약 취소 | 6. 종료 ");
			System.out.print("  >>> ");
			int menu = sc.nextInt();
			sc.nextLine();
			System.out.println(" ---------------------------------- ✈ ------------------------------------ ");

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
				System.out.println("   없는 메뉴입니다. 다시 입력해 주세요!");
			}
		}
	}

	public void signIn() {
		tc.signInNew();
		System.out.println(tc.signInfo());
	}

	public void myFlight() {
		tc.myFlights();
		System.out.println(tc.myFlights());
	}

	public void showFlights() {
		tc.showFlights();

	}

	public void reserveFlight() {
		tc.reserveFlight();
	}

	public void cancelFlight() {
		tc.cancelFlight();
	}
}
