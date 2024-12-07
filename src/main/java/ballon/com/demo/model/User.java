package ballon.com.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // Specifies that the class is an entity
@Table(name = "users") // Maps the entity to the users table in the database
@Data // Generates getters, setters, equals, hashCode, and toString methods
@NoArgsConstructor // Generates a no-argument constructor
@AllArgsConstructor // Generates an all-argument constructor
@Builder // Allows the use of the builder pattern for object creation
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private String role;

    // Getters and Setters
}
