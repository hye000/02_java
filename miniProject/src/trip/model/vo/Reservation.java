package trip.model.vo;

public class Reservation{
//	------------
//	예약
//	------------
//	예약자명
//	항공편
//	출발날짜
//	도착날짜
//	탑승객수
//	-----------
	FlightInfo fi = new FlightInfo();
	
	// 필드
	private String passengerName;
	private String depDate;
	private String arrDate;
	private int passengerNum;
	
//	생성자
    public Reservation() { }
    
	public Reservation(String passengerName, String depDate, String arrDate, int passengerNum) {
		this.passengerName = passengerName;
		this.depDate = depDate;
		this.arrDate = arrDate;
		this.passengerNum = passengerNum;
	}

	public String getDepDate() {
		return depDate;
	}

	public void setDepDate(String depDate) {
		this.depDate = depDate;
	}

	public String getArrDate() {
		return arrDate;
	}

	public void setArrDate(String arrDate) {
		this.arrDate = arrDate;
	}

	public int getPassengerNum() {
		return passengerNum;
	}

	public void setPassengerNum(int passengerNum) {
		this.passengerNum = passengerNum;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	
}
