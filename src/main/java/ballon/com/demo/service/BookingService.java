package ballon.com.demo.service ;

import ballon.com.demo.model.Booking;
import ballon.com.demo.model.Ride;
import ballon.com.demo.repository.BookingRepository;
import ballon.com.demo.repository.RideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private RideRepository rideRepository;

    public Booking createBooking(Long userId, Long rideId) {
        Ride ride = rideRepository.findById(rideId).orElseThrow();
        // Additional logic (capacity checks, etc.)
        Booking booking = new Booking();
        booking.setRide(ride);
        booking.setStatus("CONFIRMED");
        return bookingRepository.save(booking);
    }
}
