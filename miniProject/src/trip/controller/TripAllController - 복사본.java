package trip.controller;

import java.util.Scanner;

import trip.model.vo.CustomerInfo;
import trip.model.vo.FlightInfo;
import trip.model.vo.Reservation;

public class TripAllController {

	// 필드
	private Scanner sc = new Scanner(System.in);
	private CustomerInfo ci = new CustomerInfo();
	private Reservation r = new Reservation();
	private ReservationController rc = new ReservationController();
	private SignIn si = new SignIn();
	
	private FlightInfo[] flights = new FlightInfo[5];

	
	{	// 항공편 정보
		flights[0] = new FlightInfo("인천", "삿포로", "07:50", "10:50", 446000, 9);
		flights[1] = new FlightInfo("인천", "오사카", "13:20", "15:30", 250000, 2);
		flights[2] = new FlightInfo("인천", "시애틀", "09:40", "09:20", 1495000, 12);
		flights[3] = new FlightInfo("인천", "멜버른", "10:50", "17:40", 1380000, 5);
		flights[4] = new FlightInfo("인천", "두바이", "07:50", "10:50", 916000, 7);
	}
	
	// 회원가입
	public void signInNew() {
		System.out.print("\n   이름을 입력하세요 : ");
		String name = sc.next();
		ci.setName(name);
		
		System.out.print("   아이디를 입력하세요 : ");
		String id = sc.next();
		ci.setId(id);

		System.out.print("   비밀번호를 입력하세요 : ");
		String pwd = sc.next();
		ci.setPwd(pwd);

		System.out.print("   이메일을 입력하세요 : ");
		String email = sc.next();
		ci.setEmail(email);

		System.out.print("   전화번호를 입력하세요 : ");
		String tel = sc.next();
		ci.setTel(tel);
		
		// 회원 객체 배열 만들기
//		CustomerInfo[] customers = new CustomerInfo[5];
		
		System.out.println("\n  " + ci.getName() + "님 회원가입을 환영합니다!");
	}
	
	public String signInfo() {
		String signInfo = String.format("  [회원 가입 정보] \n  이름 : %s | 아이디 : %s | 이메일 : %s | 전화번호 : %s \n",
				ci.getName(), ci.getId(), ci.getEmail(), ci.getTel());
		return signInfo;
	}
	
	
	// 예약, 취소, 조회 등
	
	public void reserveFlight() {
		System.out.println();
		System.out.print("  예약하실 항공편 번호를 선택해 주세요.\n  >>> ");
		int index = sc.nextInt();
		sc.nextLine();

		System.out.print("\n  출발 날짜를 입력해 주세요.\n  >>> ");
		String depDate = sc.nextLine();
		r.setDepDate(depDate);

		System.out.print("\n  귀국 날짜를 입력해 주세요.\n  >>> ");
		String arrDate = sc.nextLine();
		r.setArrDate(arrDate);

		System.out.print("\n  탑승객 수를 입력해 주세요.\n  >>> ");
		int passengerNum = sc.nextInt();
		r.setPassengerNum(passengerNum);

		if (index >= 0 && index < flights.length) {
			FlightInfo f = flights[index];

			System.out.println("\n  [예약 항공편 정보]");
			System.out.printf("  출발 %4s | 귀국 %4s |  %3s행  |  탑승객 %d명의 예약이 확정되었습니다.\n\n", 
					r.getDepDate(), r.getArrDate(), f.getArrival(), r.getPassengerNum());

			// TODO 예약 정보를 배열에 저장(취소할 수 있게끔)
			
			// TODO 예약하면 좌석 수 감소하게끔
			flights[index].setRemainSeats(flights[index].getRemainSeats() - passengerNum);
			
			}
		
	}
	
	public String myFlights() {
		String my = String.format("\n  [%3s님의 예약 정보✈]   출발 : %3s   귀국 : %3s   탑승객 : %d명\n",
				r.getPassengerName(), r.getDepDate(), r.getArrDate(), r.getPassengerNum());
		return my;
	}
	
	public void cancelFlight() {
		rc.cancelFlight();
	}

}
