package book_my_show;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TheatreFactory {
    private static HashMap<String, Theatre> theatreMap;
    static {
        Theatre inox = new Theatre();
        inox.capacity = 10;
        inox.name = "inox";
        inox.movieName = "batman";
        List<Seat> seats = new ArrayList<>();
        for (int i=0; i<inox.capacity; i++) {
            if (i<inox.capacity/2) {
                seats.add(new Seat(SeatType.NORMAL, 50));
            } else {
                seats.add(new Seat(SeatType.PREMIUM, 100));
            }
        }
        inox.seats = seats;
        theatreMap.put("inox", inox);
    }

    public static Theatre getTheatre(String theatreName) {
        return theatreMap.get(theatreName);
    }
}
