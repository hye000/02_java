package trip.model.vo;

public class FlightInfo {

	// 필드
	private String departure;
	private String arrival;
	private String depTime;
	private String arrTime;
	private int price;
	private int remainSeats;

	
	// 생성자
	public FlightInfo() {

	}
	
	public FlightInfo(String departure, String arrival, String depTime, String arrTime, int price, int remainSeats) {
		this.departure = departure;
		this.arrival = arrival;
		this.depTime = depTime;
		this.arrTime = arrTime;
		this.price = price;
		this.remainSeats = remainSeats;
	}

	// getter, setter
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	
	public String getDepTime() {
		return depTime;
	}
	public void setDepTime(String depTime) {
		this.depTime = depTime;
	}
	
	public String getArrTime() {
		return arrTime;
	}
	public void setArrTime(String arrTime) {
		this.arrTime = arrTime;
	}
	
	public int getRemainSeats() {
		return remainSeats;
	}
	public void setRemainSeats(int remainSeats) {
		this.remainSeats = remainSeats;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		String fInfo = String.format("|   %s   |    %3s     |    %5s    |    %5s    | %8d | %8d  |", departure, arrival, depTime, arrTime, price, remainSeats);
		return  fInfo;
	}
	
	
	
	
}
