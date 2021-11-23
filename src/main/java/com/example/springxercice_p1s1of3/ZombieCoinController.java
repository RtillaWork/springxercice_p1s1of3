package com.example.springxercice_p1s1of3;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Min;

@RestController
@Validated
public class ZombieCoinController {
        @GetMapping("/bitcoins")
        ResponseEntity<String> validateBitcoin(
                @RequestParam("rate") @Min(9000) int rate) {
            return ResponseEntity.ok("Bitcoin rate is valid.");
        }
    }

