package com.ecomerce.userservice.controller;

import com.ecomerce.userservice.controller.request.RequestUser;
import com.ecomerce.userservice.service.UserService;
import com.ecomerce.userservice.vo.Greeting;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class UserController {

    private final Greeting greeting;
    private final UserService userService;

    @GetMapping("/health-check")
    public String staus() {
        return "[UserService] It is OK";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return greeting.getMessage();
    }

    @PostMapping("/users")
    public String creatUser(@RequestBody RequestUser request) {

        userService.createUser(request);

        return "User is created";
    }
}
