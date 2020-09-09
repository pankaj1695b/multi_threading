package book_my_show.models;

import java.util.List;

public class Booking {
    int id;
    String theatreName;
    Seat seat;
    String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", theatreName='" + theatreName + '\'' +
                ", seat=" + seat +
                ", status='" + status + '\'' +
                '}';
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }
}
