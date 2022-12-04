package ru.mirea.gradebook.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.mirea.gradebook.dto.UserRegistrationDTO;
import ru.mirea.gradebook.services.UserService;

@RestController
public class UserRestController {
    private final UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("registration")
    public UserRegistrationDTO registerUser(@RequestBody UserRegistrationDTO userRegistrationDTO) {
        userService.save(userRegistrationDTO);
        return userRegistrationDTO;
    }
}
