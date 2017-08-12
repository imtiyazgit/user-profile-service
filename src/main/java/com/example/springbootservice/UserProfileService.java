package com.example.springbootservice;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/sayHello", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String sayHello() {
        return "Hello";
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public String addUser(@RequestBody User user) {
        return "User "+user.getName() +" with account "+user.getAccountNumber() +" is added successfully.";
    }



}
