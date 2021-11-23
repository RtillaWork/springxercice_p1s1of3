package com.example.springxercice_p1s1of3;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Size;

@RestController
@Validated
public class UserProfileController {

    @GetMapping("/users/{login}")
    ResponseEntity<String> getUserByLogin(
            @PathVariable("login") @Size(min = 3) String login) {
        return ResponseEntity.ok("User id is valid.");
    }

    @PostMapping("/users")
    public ResponseEntity<String> addNewUserProfile(@RequestBody @Valid UserProfile user) {
        return ResponseEntity.ok("User info is valid.");
    }
}
