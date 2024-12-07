package ballon.com.demo.service;

import ballon.com.demo.model.Ride;
import ballon.com.demo.repository.RideRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class RideService {

    private final RideRepository rideRepository;

    public RideService(RideRepository rideRepository) {
        this.rideRepository = rideRepository;
    }

    public List<Ride> getAvailableRides(LocalDate date, String timeSlot) {
        return rideRepository.findByDateAndTimeSlot(date, timeSlot);
    }
}
