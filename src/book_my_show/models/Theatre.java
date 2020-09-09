package book_my_show.models;

import java.util.List;

public class Theatre {
    private String name;
    private List<Seat> seats;
    private int capacity;
    private String movieName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public boolean bookSeat(int seatNumber) {
        if (seatNumber > capacity){
            return false;
        }
        synchronized (this) {
            if (seats.get(seatNumber).isBooked()) {
                return false;
            }
            seats.get(seatNumber).setBooked(true);
            return true;
        }
    }
}
