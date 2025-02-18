package trip.controller;

import trip.model.vo.*;
import java.util.Scanner;

public class ReservationController {
	protected Reservation r = new Reservation();
	protected CustomerInfo ci = new CustomerInfo();
	protected FlightInfo fi = new FlightInfo();
	private Scanner sc = new Scanner(System.in);

	private FlightInfo[] flights = new FlightInfo[5];
	
	{
		flights[0] = new FlightInfo("인천", "삿포로", "07:50", "10:50", 446000, 9);
		flights[1] = new FlightInfo("인천", "오사카", "13:20", "15:30", 250000, 2);
		flights[2] = new FlightInfo("인천", "시애틀", "09:40", "09:20", 1495000, 12);
		flights[3] = new FlightInfo("인천", "멜버른", "10:50", "17:40", 1380000, 5);
		flights[4] = new FlightInfo("인천", "두바이", "07:50", "10:50", 916000, 7);
	}

	public FlightInfo[] showFlights() {
		return flights;
	}

	public String myFlightInfo() {
		String myFlight = fi.toString();
		return myFlight;
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
			int seatsUpdate = f.getRemainSeats() - r.getPassengerNum();
			
			if(seatsUpdate < 0) {
				System.out.println("\n  [예약 실패] 좌석이 부족합니다.");
				return;
			}
			
			f.setRemainSeats(seatsUpdate);
			
			System.out.println("\n  [예약 항공편 정보]");
			System.out.printf("  %5s 님 | 출발 %5s | 도착 %5s |  %3s행  |  탑승객 %d명의 예약이 확정되었습니다.\n",
					ci.getName(), r.getDepDate(), r.getArrDate(),
					flights[index].getArrival(), r.getPassengerNum());
			
			fi.setRemainSeats(flights[index].getRemainSeats() - r.getPassengerNum());
		}
	}

	// TODO
	public void cancelFlight() {

	}

}
