package ballon.com.demo.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "rides")
public class Ride {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String rideName;
    private LocalDate date;
    private String timeSlot;
    private int capacity;
    private BigDecimal price;

    // Getters and Setters
}
