package ballon.com.demo.controller;

import ballon.com.demo.model.Ride;
import ballon.com.demo.service.RideService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/rides")
public class RideController {

    private final RideService rideService;

    public RideController(RideService rideService) {
        this.rideService = rideService;
    }

    @GetMapping("/available")
    public ResponseEntity<List<Ride>> getAvailableRides(
            @RequestParam LocalDate date, @RequestParam String timeSlot) {
        return ResponseEntity.ok(rideService.getAvailableRides(date, timeSlot));
    }
}
