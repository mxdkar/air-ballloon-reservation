package ballon.com.demo.service;

import ballon.com.demo.model.Ride;
import ballon.com.demo.service.RideService;
import ballon.com.demo.repository.RideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class RideService {
    @Autowired
    private RideRepository rideRepository;

    public List<Ride> getAvailableRides(LocalDate date, String timeSlot) {
        return rideRepository.findByDateAndTimeSlot(date, timeSlot);
    }
}
