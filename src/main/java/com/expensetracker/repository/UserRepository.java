package com.expensetracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import com.expensetracker.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
}