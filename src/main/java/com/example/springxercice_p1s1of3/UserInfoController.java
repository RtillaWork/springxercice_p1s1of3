package com.example.springxercice_p1s1of3;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {

    @PostMapping("/user")
    public String userStatus(@RequestBody UserInfo user) {
        if (user.isEnabled()) {
            return String.format("Hello %s, account enabled", user.getName());
        } else {
            return String.format("Hello %s, account disabled", user.getName());
        }

    }
}
