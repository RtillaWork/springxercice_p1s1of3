package com.example.springxercice_p1s1of3;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserInfoController {

    @PostMapping("/user")
    public String userStatus(@RequestBody UserInfo userInfo) {
        if (userInfo.isEnabled()) {
            return String.format("Hello %s, account enabled", userInfo.getName());
        } else {
            return String.format("Hello %s, account disabled", userInfo.getName());
        }

    }


    @PostMapping(value = "/user", consumes = MediaType.APPLICATION_XML_VALUE)
    public  String userStatusXML(@RequestBody UserInfo userInfoList) {

        return String.format("This just consumed XML");
    }

    @PostMapping("/user/deactivated")
    public List<UserInfo> userStatus(@RequestBody List<UserInfo> userInfoList) {
        var enabledUserList = userInfoList.stream()
                .filter(u -> !u.isEnabled())
                .collect(Collectors.toUnmodifiableList());

        return enabledUserList;
    }

}
