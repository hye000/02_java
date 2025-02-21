package trip.model.vo;

public class Reservation{
	
	// 필드
	private String depDate;
	private String arrDate;
	private int passengerNum;
	
//	생성자
    public Reservation() { }
    
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



	@Override
	public String toString() {
		String result = String.format("\n  [예약 정보✈]   출발 : %3s   귀국 : %3s   탑승객 : %d명\n",
												depDate, arrDate, passengerNum);
		return result;
	}

}
