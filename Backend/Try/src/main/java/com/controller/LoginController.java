package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import com.controller.*;
//import com.Entity.*;
//import com.interfaces.*;

@RestController
public class LoginController {
	
	private final UserRepository userRepository;

    @Autowired
    public LoginController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) {
        User user = userRepository.findByUsernameAndPassword(loginRequest.getUsername(), loginRequest.getPassword());

        if (user != null) {
            String role = user.getRole();
            if ("business head".equalsIgnoreCase(role)) {
                return ResponseEntity.ok("Hello Business head, welcome!");
            } else if ("developer".equalsIgnoreCase(role)) {
                return ResponseEntity.ok("Welcome developer!");
            } else {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid role");
            }
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    }

    static class LoginRequest {
        private String username;
        private String password;
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
        
        

    }

}
