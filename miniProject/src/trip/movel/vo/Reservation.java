package trip.movel.vo;

public class Reservation{
	FlightInfo fi = new FlightInfo();
	
	// 필드
	private String depDate;
	private String arrDate;
	private int passengerNum;
	
	private FlightInfo[] flights;
	
    public Reservation() {
        // ✅ FlightInfo 배열 생성 및 초기화
        flights = new FlightInfo[5];
        flights[0] = new FlightInfo("김포", "삿포로", "07:50", "10:50", 446000, 9);
        flights[1] = new FlightInfo("인천", "오사카", "13:20", "15:30", 250000, 2);
        flights[2] = new FlightInfo("인천", "시애틀", "09:40", "09:20", 1495000, 32);
        flights[3] = new FlightInfo("인천", "멜버른", "10:50", "17:40", 1380000, 16);
        flights[4] = new FlightInfo("인천", "두바이", "07:50", "10:50", 916000, 7);
    }
	// 생성자
	
//	public Reservation() {}

	public Reservation(String depDate, String arrDate, int passengerNum) {
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

	public FlightInfo[] getFlights() {
		return flights;
	}
	// TODO
	public void reserveFlight() {
		
	}
	
	//TODO
	public void cancelFlight() {
		
	}
	
	
	@Override
	public String toString() {
		return "";
	}
	
	
}
