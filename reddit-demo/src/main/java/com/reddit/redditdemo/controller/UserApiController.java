package com.reddit.redditdemo.controller;

import com.reddit.redditdemo.asynchronous.UserMessagingService;
import com.reddit.redditdemo.model.User;
import com.reddit.redditdemo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api/users",
        produces="application/json")
@CrossOrigin(origins="http://localhost:8080")
@AllArgsConstructor
public class UserApiController {

    private final UserService service;
    private final UserMessagingService messageService;


    @PostMapping(consumes="application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public User postUser(@RequestBody User user) {
        messageService.sendUser(user);
        return service.save(user);
    }

}