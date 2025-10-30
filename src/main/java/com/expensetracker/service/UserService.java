package com.expensetracker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.expensetracker.model.User;
import com.expensetracker.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private PasswordEncoder passwordEncoder;
    
    public boolean registerUser(User user) {
        // Check if username or email already exists
        if (userRepository.existsByUsername(user.getUsername()) || 
            userRepository.existsByEmail(user.getEmail())) {
            return false;
        }
        
        // Encode password
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        
        // Save user
        userRepository.save(user);
        return true;
    }
}