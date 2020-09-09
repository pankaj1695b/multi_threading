package book_my_show.services;

import book_my_show.models.Booking;
import book_my_show.models.Theatre;

import java.awt.print.Book;
import java.sql.Statement;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public class BookingService {

    private static Booking createBooking(String theatreName, int seatNumber){
        Theatre theatre = TheatreManager.getTheatre(theatreName);

        boolean seatbooked = theatre.bookSeat(seatNumber);
        Booking b = new Booking();
        int id = (int)(Math.random()*10000);
        b.setId(id);
        if (!seatbooked) {
            b.setStatus("Seat not available");
            return b;
        }
        b.setStatus("Booked");
        b.setTheatreName(theatreName);
        b.setSeat(theatre.getSeats().get(seatNumber));
        return b;
    }

    public static Future<Booking> createBookingApi (String theatreName, int seatNumber){
        return Scheduler.submitTask(() -> createBooking(theatreName, seatNumber));
    }
}
