package com.reddit.redditdemo.controller;

import com.reddit.redditdemo.model.User;
import com.reddit.redditdemo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Field;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping(path="/api/users", produces="application/json")
@CrossOrigin(origins={"http://redditcloud:8080", "http://redditcloud.com"})
public class UserController {

    private final UserService service;

    @GetMapping("/{userId}")
    public ResponseEntity<User> userById(@PathVariable("userId") Long userId) {

        Optional<User> optionalUser = service.findById(userId);

        if (optionalUser.isPresent()) {
            return new ResponseEntity<>(optionalUser.get(), HttpStatus.OK);
        }

        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @GetMapping(params="recent")
    public Iterable<User> recentUsers(){

        PageRequest page = PageRequest.of(0, 12, Sort.by("createdAt").descending());

        Iterable<User> users = service.findAll(page).getContent();

        return users;
    }

    @PostMapping(consumes="application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public User postUser(@RequestBody User user) {
        return service.save(user);
    }

    @PutMapping(path="/{userId}", consumes="application/json")
    public User putUSer(@PathVariable("userId") Long userId,
                        @RequestBody User user) {

        user.setUserId(userId);

        return service.save(user);
    }

    @PatchMapping(path="/{userId}", consumes="application/json")
    public User patchUser(@PathVariable("userId") Long userId,
                          @RequestBody User patch) {

        User user = service.findById(userId).get();

        setUserAttributes(patch, user);

        return service.save(user);
    }

    private void setUserAttributes(User patch, User user) {
        Field[] fields = patch.getClass().getDeclaredFields();

        for(Field field: fields){
            field.setAccessible(true);

            try {

                Object attribute = field.get(patch);

                if(attribute!=null){
                    field.set(user, attribute);
                }

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        }
    }

    @DeleteMapping(path = "/{userId}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable("userId") Long userId){

        try{
            service.deleteById(userId);
        } catch (EmptyResultDataAccessException e) {}

    }

}
