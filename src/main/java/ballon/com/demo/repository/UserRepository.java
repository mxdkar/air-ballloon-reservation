package ballon.com.demo.repository;

import ballon.com.demo.model.User;
import ballon.com.demo.repository.UserRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}

