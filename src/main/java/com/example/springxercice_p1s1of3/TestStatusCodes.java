package com.example.springxercice_p1s1of3;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.*;

@RestController
public class TestStatusCodes {


    @GetMapping("/teststatuscodes/{status}")
    public String testStatusCodes(@PathVariable int status) {

        switch(status) {
            case 200:
                throw new ResponseStatusException(HttpStatus.OK);
            case 300:
                throw new ResponseStatusException(HttpStatus.MULTIPLE_CHOICES);
            case 400:
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
            case 500:
                throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
            default:
                throw new ResponseStatusException(HttpStatus.I_AM_A_TEAPOT);
        }
    }
}


//    @GetMapping("/teststatuscodes/{id}")
//    public String testStatusCodes(@PathVariable int id) {
//        if (id >= 200 && id <= 299) {
//            throw new ResponseStatusException(HttpStatus.OK);
//        } else if (id >= 300 && id <= 399) {
//            throw new ResponseStatusException(HttpStatus.MULTIPLE_CHOICES);
//        } else if (id >= 400 && id <= 499) {
//            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
//        } else if (id >= 500 && id <= 599) {
//            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
//        } else {
//            throw new ResponseStatusException(HttpStatus.I_AM_A_TEAPOT);
//        }
//    }
}
