package com.reddit.redditdemo.config.user;


import com.reddit.redditdemo.controller.UserController;
import com.reddit.redditdemo.repository.UserRepository;
import com.reddit.redditdemo.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {UserRepository.class, UserService.class, UserController.class})
public class UserApplicationConfig {


    @Bean
    public UserService userService(UserRepository userRepository) {
        return new UserService(userRepository);
    }

    @Bean
    public UserController userController(UserService userService) {
        return new UserController(userService);
    }


}
