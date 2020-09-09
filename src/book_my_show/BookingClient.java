package book_my_show;

import book_my_show.models.Booking;
import book_my_show.services.BookingService;

import java.util.concurrent.ExecutionException;

public class BookingClient {

    public static Booking createBooking(String theatre, int seatNumber) throws ExecutionException, InterruptedException {
            return BookingService.createBookingApi(theatre, seatNumber).get();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(createBooking("inox", 1));
        System.out.println(createBooking("inox", 1));
    }
}
