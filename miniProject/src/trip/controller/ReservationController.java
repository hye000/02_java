package trip.controller;

import trip.model.vo.*;
import java.util.Scanner;

public class ReservationController {

	private Scanner sc = new Scanner(System.in);
	private Reservation r = new Reservation();
	private CustomerInfo ci = new CustomerInfo();
	private FlightInfo fi = new FlightInfo();
	private FlightInfo[] flights = new FlightInfo[5];
//	private Reservation[] myFlights = new Reservation[10];

	{
		flights[0] = new FlightInfo("인천", "삿포로", "07:50", "10:50", 446000, 9);
		flights[1] = new FlightInfo("인천", "오사카", "13:20", "15:30", 250000, 2);
		flights[2] = new FlightInfo("인천", "시애틀", "09:40", "09:20", 1495000, 12);
		flights[3] = new FlightInfo("인천", "멜버른", "10:50", "17:40", 1380000, 5);
		flights[4] = new FlightInfo("인천", "두바이", "07:50", "10:50", 916000, 7);
	}

	public String myFlights() {
		// TODO 선택한 항공편을 회원 이름과 함께 저장
//		Reservation my = new Reservation(r.getPassengerName(), r.getDepDate(), r.getArrDate(), r.getPassengerNum());
//		for (int i = 0; i < myFlights.length; i++) {
//			if (myFlights[i] == null) {
//				myFlights[i] = my;
//				break;
//			}
		return r.toString();
	}

	public FlightInfo[] showFlights() {
		return flights;
	}

	// TODO
	public void reserveFlight() {
		System.out.println();
		System.out.print("  예약하실 항공편 번호를 선택해 주세요.\n  >>> ");
		int index = sc.nextInt();
		sc.nextLine();

		System.out.print("\n  출발 날짜를 입력해 주세요.\n  >>> ");
		String depDate = sc.nextLine();
		r.setDepDate(depDate);

		System.out.print("\n  도착 날짜를 입력해 주세요.\n  >>> ");
		String arrDate = sc.nextLine();
		r.setArrDate(arrDate);

		System.out.print("\n  탑승객 수를 입력해 주세요.\n  >>> ");
		int passengerNum = sc.nextInt();
		r.setPassengerNum(passengerNum);

		if (index >= 0 && index < flights.length) {
			FlightInfo f = flights[index];

			System.out.println("\n  [예약 항공편 정보]");
			System.out.printf("  %5s 님 | 출발 %4s | 귀국 %4s |  %3s행  |  탑승객 %d명의 예약이 확정되었습니다.\n", r.getPassengerName(),
					r.getDepDate(), r.getArrDate(), f.getArrival(), r.getPassengerNum());

			// TODO 예약하면 좌석 수 감소하게끔
			}
		}

	// TODO
	public void cancelFlight() {

	}

}
