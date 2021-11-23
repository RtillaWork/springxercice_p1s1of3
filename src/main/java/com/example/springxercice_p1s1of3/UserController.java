package com.example.springxercice_p1s1of3;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.*;

import java.util.*;
import java.util.concurrent.*;

@RestController
public class UserController {
    final Map<Long, String> users = new ConcurrentHashMap<>(Map.of(
            2234L, "Kate",
            234234234L, "Alice",
            2134L, "Jessica",
            3456L, "Olivia",
            98684L, "Emma",
            85L, "Liam",
            8495L, "James",
            48438L, "Henry"
    ));

    // add your code below this line
    @DeleteMapping("/api/users/{id}")
    public ResponseEntity<String> removeUserbyId(@PathVariable long id) {
        if (!users.containsKey(id)) {
            throw new  ResponseStatusException(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<String>(users.remove(id), HttpStatus.NO_CONTENT);
        }
    }
}

