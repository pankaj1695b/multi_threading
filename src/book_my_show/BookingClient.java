package book_my_show;

import book_my_show.models.Booking;
import book_my_show.services.BookingService;
import book_my_show.services.Scheduler;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class BookingClient {

    public static Booking createBooking(String theatre, int seatNumber) throws ExecutionException, InterruptedException {
            return BookingService.createBookingApi(theatre, seatNumber).get();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ArrayList<Future<Booking>> bookings = new ArrayList<>();
        for (int i=0; i<20; i++) {
            System.out.println("Sending request to book seat: " + i/2);
            bookings.add(
                    BookingService.createBookingApi("inox", i/2)
            );
        }
        System.out.println("all booking request sent");
        int count = 0;
        boolean[] printed = new boolean[bookings.size()];
        while(count < bookings.size()) {
            for(int i=0; i<bookings.size(); i++) {
                if (bookings.get(i).isDone() && !printed[i]) {
                    System.out.println(bookings.get(i).get());
                    count++;
                    printed[i] = true;
                }
            }
        }

        System.out.println("All bookings done");
        Scheduler.killScheduler();
    }
}
