package cinema;

public class Seat {
	private String seatNumber;
	private boolean reserved;

	public boolean reserve() {
		if (!this.reserved) {
			this.reserved = true;
			System.out.println("Ghế: " + seatNumber + " đã được đặt");
			return true;
		} else {
			return false;
		}
	}

	public Seat(String seatNumber) {
		this.seatNumber = seatNumber;
		this.reserved = false;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public boolean isReserved() {
		return reserved;
	}

	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}

}
