package com.example.springbootservice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserProfileService {

    private List<User> users = new ArrayList<>();

    public UserProfileService() {
        this.users.add(new User(1, "Imtiyaz"));
        this.users.add(new User(2, "Moghal"));

    }

    @RequestMapping("/user/{account_number}")
    public User getUser(@PathVariable String account_number) {
        return users.get(1);
    }

}
