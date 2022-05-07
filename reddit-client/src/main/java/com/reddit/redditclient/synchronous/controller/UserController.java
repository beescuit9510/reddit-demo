package com.reddit.redditclient.synchronous.controller;

import com.reddit.redditclient.model.User;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Log4j2
public class UserController {

    private final RestTemplate rest;

    public User getUserById(String userId) {
        return rest.getForObject("http://localhost:8080/users/{id}",
                User.class, userId);
    }

    public User getUserAndResponseById(String userId) {

        Map<String, String> urlVariables = new HashMap<>();

        urlVariables.put("id", userId);

        URI url = UriComponentsBuilder
                .fromHttpUrl("http://localhost:8080/users/{id}")
                .build(urlVariables);

        ResponseEntity<User> responseEntity = rest.getForEntity(url, User.class);

        log.info("Fetched time: {}", responseEntity.getHeaders().getDate());

        return responseEntity.getBody();
    }

    public void putUserById(User user){

        rest.put("http://localhost:8080/users/{id}", user, user.getUserId());

    }

    public void deleteUserById(String userId){

        rest.delete("http://localhost:8080/users/{id}", userId);

    }

    public User createUserAndGetUser(User user) {
        return rest.postForObject("http://localhost:8080/users",
                user, User.class);
    }

    public java.net.URI createUserAndGetUri(User user) {
        return rest.postForLocation("http://localhost:8080/users",
                user);
    }


    public User createUserAndGetUserUriForUser(User user) {
        ResponseEntity<User> responseEntity =
                rest.postForEntity("http://localhost:8080/users",
                        user,
                        User.class);
        log.info("New resource created at {}",
                responseEntity.getHeaders().getLocation());
        return responseEntity.getBody();
    }

}
