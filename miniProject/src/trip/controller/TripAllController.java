package trip.controller;

import trip.model.vo.Reservation;

public class TripAllController {

	private ReservationController rc = new ReservationController();
	private SignIn si = new SignIn();
	
	// 회원가입
	public void signInNew() {
		si.signInNew();
	}
	
	public String signInfo() {
		return si.signInfo();
	}
	
	
	// 예약
	public String myFlights() {
		return rc.myFlights();
	}

	
	public void reserveFlight() {
		rc.reserveFlight();
		
	}
	
	public void cancelFlight() {
		rc.cancelFlight();
	}

}
