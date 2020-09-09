package book_my_show.models;

public class Seat {
    private SeatType type;
    private int price;
    private boolean isBooked;
    private int seatNumber;

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "type=" + type +
                ", price=" + price +
                ", seatNumber=" + seatNumber +
                '}';
    }

    public SeatType getType() {
        return type;
    }

    public void setType(SeatType type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public Seat(SeatType type, int price, int seatNumber) {
        this.type = type;
        this.price = price;
        this.seatNumber = seatNumber;
        this.isBooked = false;
    }
}
