package ballon.com.demo.controller;

import ballon.com.demo.model.Booking;
import ballon.com.demo.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @PostMapping("/create")
    public ResponseEntity<Booking> createBooking(
            @RequestParam Long userId, @RequestParam Long rideId) {
        return ResponseEntity.ok(bookingService.createBooking(userId, rideId));
    }
}
