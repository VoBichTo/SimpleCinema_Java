package cinema;

import java.util.ArrayList;

public class Reserve_Cinema {
	private String cinemaName;
	private ArrayList<Seat> seats = new ArrayList<Seat>();

	public Reserve_Cinema(String cinemaName, int numRow, int seatPerRow) {
		this.cinemaName = cinemaName;
		int lastRow = 'A' + numRow - 1;
		for (char row = 'A'; row <= lastRow; row++) {
			for (int seatNum = 1; seatNum <= seatPerRow; seatNum++) {
				Seat seat = new Seat(row + String.format("%02d", seatNum));
				seats.add(seat);
			}
		}
	}

	public boolean reserveSeat(String seatNumber) {
		Seat requestSeat = null;
		for (Seat seat : seats) {
			if (seat.getSeatNumber().equals(seatNumber)) {
				requestSeat = seat;
				break;
			}
		}
		if (requestSeat == null) {
			System.out.println("Ghế bạn đặt không tồn tại");
			return true;
		} else {
			return requestSeat.reserve();
		}
	}
	public void printCinemaSeats(){
		for (Seat seat : seats) {
			System.out.println(seat.getSeatNumber());
		}
	}
	public String getCinemaName() {
		return cinemaName;
	}

	public void setCinemaName(String cinemaName) {
		this.cinemaName = cinemaName;
	}

	public ArrayList<Seat> getSeats() {
		return seats;
	}

	public void setSeats(ArrayList<Seat> seats) {
		this.seats = seats;
	}

}
