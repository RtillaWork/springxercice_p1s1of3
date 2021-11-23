package com.example.springxercice_p1s1of3;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.*;

import java.util.*;
import java.util.concurrent.*;

@RestController
public class ItemController {
        final ConcurrentMap<Long, String> items = new ConcurrentHashMap<>(Map.of(
                535L, "Chair",
                99534533L, "Table",
                343455L, "Vase"
        ));

        @GetMapping("/items/{id}")
        String getItem(@PathVariable long id) {
        // REMOVE return items.getOrDefault(id, "Item wasn't found");

            if (!items.containsKey(id)) {
                throw new ResponseStatusException(HttpStatus.NOT_FOUND);
            } else {
                return items.get(id);
            }
        }
}


