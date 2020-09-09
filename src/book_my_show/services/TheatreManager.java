package book_my_show.services;

import book_my_show.models.Seat;
import book_my_show.models.SeatType;
import book_my_show.models.Theatre;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TheatreManager {
    private static HashMap<String, Theatre> theatreMap = new HashMap<>();
    static {
        Theatre inox = new Theatre();
        inox.setCapacity(10);
        inox.setName("inox");
        inox.setMovieName("batman");
        List<Seat> seats = new ArrayList<>();
        for (int i=0; i<inox.getCapacity(); i++) {
            if (i<inox.getCapacity()/2) {
                seats.add(new Seat(SeatType.NORMAL, 50));
            } else {
                seats.add(new Seat(SeatType.PREMIUM, 100));
            }
        }
        inox.setSeats(seats);
        theatreMap.put("inox", inox);
    }

    public static Theatre getTheatre(String theatreName) {
        return theatreMap.get(theatreName);
    }

    public static void addTheatre(String name, Theatre theatre) {
        theatreMap.put(name, theatre);
    }
}
