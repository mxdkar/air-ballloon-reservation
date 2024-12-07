package ballon.com.demo.repository;

import ballon.com.demo.model.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface RideRepository extends JpaRepository<Ride, Long> {
    List<Ride> findByDateAndTimeSlot(LocalDate date, String timeSlot);
}