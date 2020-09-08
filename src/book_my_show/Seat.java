package book_my_show;

enum SeatType {
    PREMIUM,
    NORMAL
}

public class Seat {
    SeatType type;
    int price;
    boolean isBooked;

    Seat(SeatType type, int price) {
        this.type = type;
        this.price = price;
    }
}
