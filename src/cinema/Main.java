package cinema;

public class Main {

	public static void main(String[] args) {
		Reserve_Cinema reserve_cinema = new Reserve_Cinema("CGV", 6, 13);
		reserve_cinema.printCinemaSeats();
		if (reserve_cinema.reserveSeat("F03")) {
			System.out.println("Trả tiền cho việc đặt ghế");
		} else {
			System.out.println("Ghế không tồn tại");
		}
	}

}
