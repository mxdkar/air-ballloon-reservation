package ballon.com.demo.controller;

import ballon.com.demo.model.Booking;
import ballon.com.demo.service.BookingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping("/create")
    public ResponseEntity<Booking> createBooking(
            @RequestParam Long userId, @RequestParam Long rideId) {
        return ResponseEntity.ok(bookingService.createBooking(userId, rideId));
    }
}
