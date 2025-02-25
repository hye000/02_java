package trip.controller;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import trip.model.vo.*;

public class TripController {

	// 필드
	private Scanner sc = new Scanner(System.in);
	private CustomerInfo ci = new CustomerInfo();
	private Reservation r = new Reservation();
	private FlightInfo fi = new FlightInfo();
	private List<Reservation> rList = new ArrayList<>();

	// 회원가입
	public void signInNew() {
		System.out.print("\n  이름을 입력하세요 : ");
		String name = sc.next();

		System.out.print("  아이디를 입력하세요 : ");
		String id = sc.next();

		System.out.print("  비밀번호를 입력하세요 : ");
		String pwd = sc.next();

		System.out.print("  이메일을 입력하세요 : ");
		String email = sc.next();

		System.out.print("  전화번호를 입력하세요 : ");
		String tel = sc.next();

		ci = new CustomerInfo(name, id, pwd, email, tel);

		System.out.println("\n  " + ci.getName() + "님 회원가입을 환영합니다!");
	}

	// 회원가입 정보
	public String signInfo() {
		return ci.toString();
	}

	// 내 항공편(여정) 조회
	public String myFlights() {
		String my = "";
		if (rList.isEmpty()) {
			my = String.format("\n  [%s님의 예약 정보가 존재하지 않습니다.]", ci.getName());
		} else {
			my = String.format("\n  [%s님의 예약 정보✈]   출발 : %3s   귀국 : %3s   %s행   탑승객 : %d명", ci.getName(),
					r.getDepDate(), r.getArrDate(), fi.getArrival(), r.getPassengerNum());
		}
		return my;
	}

	// 항공편 정보
	private List<FlightInfo> flights = new ArrayList<>();

	{
		flights.add(new FlightInfo("인천", "삿포로", "07:50", "10:50", 446000, 9));
		flights.add(new FlightInfo("인천", "오사카", "13:20", "15:30", 271600, 2));
		flights.add(new FlightInfo("인천", "시애틀", "09:40", "09:20", 1495000, 12));
		flights.add(new FlightInfo("인천", "멜버른", "10:50", "17:40", 1380000, 5));
		flights.add(new FlightInfo("인천", "프라하", "07:50", "10:50", 1079900, 7));
	}

	// 항공편 조회
	public void showFlights() {
		System.out.print("\n ✈ 항공편 정보 ✈");
		System.out.print("\n       출발         도착          출발 시간       도착 시간         가격       잔여 좌석    \n");
		for (int i = 0; i < flights.size(); i++) {
			System.out.println(" " + (i + 1) + flights.get(i));
		}
	}

	// 항공편 예약
	public void reserveFlight() {
		try {

			System.out.print("\n  예약하실 항공편 번호를 선택해 주세요.\n  >>> ");
			int index = sc.nextInt() - 1;
			sc.nextLine();
			FlightInfo f = flights.get(index);

			System.out.print("\n  출발 날짜를 입력해 주세요.(YYYY-MM-DD)\n  >>> ");
			String depDate = sc.nextLine();

			System.out.print("\n  귀국 날짜를 입력해 주세요.(YYYY-MM-DD)\n  >>> ");
			String arrDate = sc.nextLine();

			// 좌석 수보다 탑승객 수가 많을 때 예약 불가
			int passengerNum;
			while (true) {
				System.out.print("\n  탑승객 수를 입력해 주세요.\n  >>> ");
				passengerNum = sc.nextInt();
				sc.nextLine();

				if (f.getRemainSeats() == 0) {
					System.out.println("  ❗ 매진되어 예약할 수 없는 항공편입니다. 다른 항공편을 선택해 주세요.");
					return;
				} else if (f.getRemainSeats() < passengerNum) {
					System.out.println("  ❗ 잔여 좌석 수가 부족합니다. 탑승객 수를 다시 입력해 주세요.");
				} else {
					break;
				}
			}
			// 예약 정보 저장
			r = new Reservation(depDate, arrDate, passengerNum);
			rList.add(r);

			if (index >= 0 && index < flights.size()) {
				System.out.print("\n  [예약 항공편 정보]");
				System.out.printf("  출발 %4s | 귀국 %4s |  %3s행  |  탑승객 %d명의 예약이 확정되었습니다.\n\n", r.getDepDate(),
						r.getArrDate(), f.getArrival(), r.getPassengerNum());

				// 예약하면 좌석 수 감소
				f.setRemainSeats(f.getRemainSeats() - passengerNum);
			}
		} catch (InputMismatchException e) {

		} catch (IndexOutOfBoundsException e) {
			System.out.println("  ❗ 올바른 항공편 번호가 아닙니다.");
		}
	}

	// 항공편 취소
	public void cancelFlight() {
		System.out.println("  본인 확인을 위해 ID/PWD를 입력해 주세요.");
		System.out.print("  ID >>> ");
		String id = sc.nextLine();
		System.out.print("  PWD >>> ");
		String pwd = sc.nextLine();

		if (ci.getId().equals(id) && ci.getPwd().equals(pwd)) {
			System.out.print("  정말 예약을 취소하시겠습니까? (Y/N) >>> ");
			char answer = sc.next().charAt(0);

			if (answer == 'y' || answer == 'Y') {
				if (rList.isEmpty()) {
					System.out.println("  ❗ 취소하실 예약 건이 존재하지 않습니다.");
				} else {
					rList.remove(0);
					System.out.println("  예약이 취소되었습니다. 이용해 주셔서 감사합니다.");
				}
			} else {
				return;
			}
		} else {
			System.out.println("  ❗ 아이디 또는 비밀번호가 일치하지 않습니다. 다시 입력해 주세요.");
		}
	}
}
