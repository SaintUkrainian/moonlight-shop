package com.github.saintukrainian.userservice.api;

import com.github.saintukrainian.userservice.model.User;
import com.github.saintukrainian.userservice.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("/users")
    public ResponseEntity<List<User>> fetchUsers() {
        return ResponseEntity.ok(userRepository.findAll());
    }
}
